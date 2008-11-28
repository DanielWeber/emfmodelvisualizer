package org.openarchitectureware.vis.zest.viewer.views;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.Filter;
import org.eclipse.zest.layouts.LayoutItem;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.AbstractLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.openarchitectureware.vis.zest.builder.EdgeData;
import org.openarchitectureware.vis.zest.builder.GraphData;
import org.openarchitectureware.vis.zest.builder.GraphMMBuilder;
import org.openarchitectureware.vis.zest.builder.NodeData;
import org.openarchitectureware.vis.zest.viewer.source.EclipseSourceLocator;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;


public class ModelViewer extends ViewPart {

	private static final int LAYOUT_TREE_HORI = 3;
	private static final int LAYOUT_TREE = 2;
	private static final int LAYOUT_SPRING = 1;
	private static final int LAYOUT_RADIAL = 0;
	private Set recentWorkflowFiles = new HashSet();
	private Action runWorkflowAction;
	private Composite topLevelComposite;
	private IMenuManager menuManager;
	private Table nameValueTable;
	private Combo layoutCombo;
	private TabFolder tabFolderForGraphs;
	private SashForm topLevelSashForm;
	private Composite rightSideComposite;
	private Table filterTable;
	private GraphMMBuilder graphbuilder;

	public ModelViewer() {
	}

	public void createPartControl(Composite parent) {
		this.topLevelComposite = parent;
		IActionBars bars = getViewSite().getActionBars();
		menuManager = bars.getMenuManager();
		fillLocalPullDown();
		//setFilenameAndRedraw("de/voelter/zest/example/createModel.oaw");
		setFilenameAndRedraw("de/voelter/zest/example/createEcore.oaw");
	}

	private void fillLocalPullDown() {
		createActions();
		menuManager.add(runWorkflowAction);
		menuManager.add(new Separator());
	}

	private void setFilenameAndRedraw(String filename) {
		addRecentWorkflowFile( filename );
		EObject graphmodel = runWorkflow(filename);
		graphbuilder = new GraphMMBuilder(graphmodel);
		deleteAllViewContent();
		topLevelSashForm = new SashForm(topLevelComposite,SWT.HORIZONTAL);
		tabFolderForGraphs = new TabFolder (topLevelSashForm, SWT.NONE);
		createRightSideComposite();
		populateTabFolderWithGraphs();
		topLevelSashForm.setWeights(new int[] {90,10});
		topLevelComposite.layout(true, true);
	}

	private void createRightSideComposite() {
		rightSideComposite = new Composite(topLevelSashForm, SWT.NONE);
		rightSideComposite.setLayout( new GridLayout(1, true) );

		layoutCombo = new Combo(rightSideComposite, SWT.DROP_DOWN | SWT.READ_ONLY);
		GridData gdLayoutCombo = new GridData();
		gdLayoutCombo.verticalAlignment = SWT.TOP;
		gdLayoutCombo.horizontalAlignment= SWT.FILL;
		gdLayoutCombo.grabExcessHorizontalSpace = true;
		layoutCombo.setLayoutData( gdLayoutCombo );
		layoutCombo.add("Radial");
		layoutCombo.add("Spring");
		layoutCombo.add("Tree");
		layoutCombo.add("Tree (Horizontal)");
		layoutCombo.select(0);
		layoutCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onLayoutComboSelectionChanged();
			}
		} );
		
		SashForm rightSash = new SashForm(rightSideComposite,SWT.VERTICAL);
		GridData gdRightSash = new GridData();
		gdRightSash.verticalAlignment = SWT.FILL;
		gdRightSash.horizontalAlignment = SWT.FILL;
		gdRightSash.grabExcessVerticalSpace = true;
		gdRightSash.grabExcessHorizontalSpace = true;
		rightSash.setLayoutData( gdRightSash );
		
		filterTable = new Table(rightSash, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL );

		nameValueTable = new Table( rightSash, SWT.BORDER | SWT.FULL_SELECTION);
		nameValueTable.setHeaderVisible(true);
		nameValueTable.setLinesVisible(false);
		nameValueTable.setBackground(ColorConstants.tooltipBackground);
		TableColumn col1 = new TableColumn(nameValueTable, SWT.NONE);
		col1.setText("Name");
		col1.setWidth(40);
		TableColumn col2 = new TableColumn(nameValueTable, SWT.NONE);
		col2.setText("Value");
		col2.setWidth(60);
		
		rightSash.setWeights(new int[] {60,40});
		rightSideComposite.pack();
		
	}

	private void onLayoutComboSelectionChanged() {
		final int layoutIndex = layoutCombo.getSelectionIndex();
		setLayout(currTabItem(), layoutIndex);
	}
	
	private void setLayout(TabItem tabItem, final int layoutIndex) {
		getData(tabItem).setLayoutIndex(layoutIndex);
		Graph g = getData(tabItem).getGraph();
		AbstractLayoutAlgorithm graphlayout = null;
		switch (layoutIndex) {
		case LAYOUT_RADIAL:
			graphlayout = new RadialLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
			break;
		case LAYOUT_SPRING:
			graphlayout = new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
			break;
		case LAYOUT_TREE:
			graphlayout = new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
			break;
		case LAYOUT_TREE_HORI:
			graphlayout = new HorizontalTreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
			break;
		default:
			break;
		}
		graphlayout.setFilter(new Filter() {
			@Override
			public boolean isObjectFiltered(LayoutItem item) {
				Collection<String> filteredCategories = getData(currTabItem()).getCheckedFilters();
				String itemCategory = null;
				Object object = item.getGraphData();
				if  (object instanceof GraphNode) {
					GraphNode node = (GraphNode) object;
					itemCategory = getData(node).getCategory(); 
				}
				if  (object instanceof GraphConnection ) {
					GraphConnection connection = (GraphConnection) object;
					itemCategory = getData(connection).getCategory(); 
				}
				if ( itemCategory == null ) return false;
				if ( filteredCategories.contains(itemCategory) ) return false;
				return true;
			}
		});
		g.setLayoutAlgorithm(graphlayout, true);
	} 
	
	private void populateTabFolderWithGraphs() {
		Collection<EObject> graphs = graphbuilder.getGraphs();
		for (EObject gm: graphs) {
			TabItem item = new TabItem (tabFolderForGraphs, SWT.NONE);
			createGraphIntoTabItem(gm, item);
		}
		tabFolderForGraphs.layout();
		updateFilterTable();
		updateLayoutCombo();
		setLayout( currTabItem(), LAYOUT_RADIAL);
		tabFolderForGraphs.addSelectionListener(new SelectionAdapter()  {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onTabFolderSelectionChanged();
			}
		});		
	}

	private void onTabFolderSelectionChanged() {
		updateLayoutCombo();
		updateFilterTable();
	}
	
	private void createGraphIntoTabItem(EObject gm, TabItem item) {
		Graph old = getData(item).getGraph();
		if ( old != null ) {
			item.setControl(null);
			old.dispose();
		}
		Set<String> checkedFilters = getData(item).getCheckedFilters();
		Graph newGraph = constructGraph(gm, checkedFilters);
		item.setText( getData(newGraph).getName() );
		item.setControl(newGraph);
		getData(item).setGraph(newGraph);
		getData(item).setGraphModel(gm);
		if ( checkedFilters == null ) {
			checkedFilters = new HashSet<String>();
			checkedFilters.addAll(getData(newGraph).getCategories());
			getData(item).setCheckedFilters(checkedFilters);
		}
		String layoutHint = getData(newGraph).getSuggestedLayout();
		int layoutHintAsInt = layoutHintToConstant( layoutHint );
		if ( layoutHintAsInt >= 0 ) {
			setLayout(item, layoutHintAsInt );
			updateLayoutCombo();
		} else {
			if ( layoutCombo != null ) {
				setLayout(item, layoutCombo.getSelectionIndex());
			} else {
				setLayout(item, LAYOUT_RADIAL);
			}
		}
	}

	private int layoutHintToConstant(String layoutHint) {
		if ( layoutHint == null ) return LAYOUT_RADIAL;
		if ( layoutHint.equals("radial")) return LAYOUT_RADIAL;
		if ( layoutHint.equals("spring")) return LAYOUT_SPRING;
		if ( layoutHint.equals("tree")) return LAYOUT_TREE;
		if ( layoutHint.equals("htree")) return LAYOUT_TREE_HORI;
		return LAYOUT_RADIAL;
	}

	private void deleteAllViewContent() {
		int childcount = topLevelComposite.getChildren().length; 
		for (int i = childcount-1; i >= 0; i--) {
			topLevelComposite.getChildren()[i].dispose();
		}
	}

	private void updateLayoutCombo() {
		int index = getData(currTabItem()).getLayoutIndex();
		layoutCombo.select(index);
	}

	private TabItem currTabItem() {
		return tabFolderForGraphs.getSelection()[0];
	}
	
	private Graph currGraph() {
		return getData(currTabItem()).getGraph();
	}
	
	private void updateFilterTable() {
		int itemcount = filterTable.getItems().length; 
		for (int i = itemcount-1; i >= 0; i--) {
			filterTable.getItems()[i].dispose();
		}
		if ( currTabItem() == null ) return;
		final Collection<String> categories = getData(currGraph()).getCategories();
		final Collection<String> checked = getData(currTabItem()).getCheckedFilters();
		final EObject graphmodel = getData(currTabItem()).getGraphModel();
		for (String category : categories) {
			TableItem t = new TableItem( filterTable, SWT.NONE );
			t.setText( category );
			if ( checked.contains(category)) t.setChecked(true);
		}
		filterTable.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onFilterTableSelectionChanged(currTabItem(), graphmodel);
			}

		});
	}
	
	private void onFilterTableSelectionChanged(
			final TabItem selectedTabItem, final EObject graphmodel) {
		updateFilterList();
		createGraphIntoTabItem(graphmodel, selectedTabItem);
	}

	private void updateFilterList() {
		System.err.println("");
		Collection<String> checked = getData(currTabItem()).getCheckedFilters();
		checked.clear();
		TableItem [] filterItems = filterTable.getItems();
		for (TableItem item : filterItems) {
			if ( item.getChecked() ) checked.add( item.getText() );
		}
	}
	
	private Graph constructGraph(EObject graphModel, Collection<String> checkedCategories) {
		final Graph g = graphbuilder.constructGraph(tabFolderForGraphs, graphModel, checkedCategories);
		g.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				onGraphMouseEvent(g, e);
			}
		});
		g.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onGraphSelectionChanged(g);
			}
		});
		return g;
	}

	private void onGraphMouseEvent(final Graph g, MouseEvent e) {
		List selected = g.getSelection();
		int stateMask = e.stateMask;
		if ( selected.size() == 1 ) {
			GraphNode nodeClickedOn = (GraphNode)selected.get(0);
			if ( (stateMask & SWT.SHIFT) != 0 ) {
				locateSource(nodeClickedOn);
			}
		}
	}

	private void onGraphSelectionChanged(final Graph g) {
		List selectedNodes = g.getSelection();
		if ( selectedNodes.size() == 1 ) {
			GraphNode n = (GraphNode)selectedNodes.get(0);
			updateUserDataTable(n);
		}
	}
	
	private void locateSource(GraphNode nodeClickedOn) {
		String location = (String)nodeClickedOn.getData();
		new EclipseSourceLocator().locate(location);
	}
	
	private void updateUserDataTable(GraphNode selectedNode) {
		for (TableItem item : nameValueTable.getItems()) {
			item.dispose();
		}
		Map<String, String> userDataMap = getData(selectedNode).getUserData();
		for (String name : userDataMap.keySet()) {
			TableItem i1 = new TableItem(nameValueTable, SWT.NULL);
			i1.setText( new String[]{name, userDataMap.get(name)});
		}
	}

	
	private EObject runWorkflow(String filename) {
		Map properties = new HashMap();
		Map slotContents = new HashMap();
		WorkflowRunner runner = new WorkflowRunner();
		runner.run(filename, new NullProgressMonitor(), properties, slotContents);
		EObject graphmodel = (EObject)runner.getContext().get("graphmodel");
		return graphmodel;
	}

	private void addRecentWorkflowFile(String filename) {
		if ( recentWorkflowFiles.contains(filename)) {
			return;
		}
		recentWorkflowFiles.add(filename);
		menuManager.add( new RecentWorkflowAction(filename) );
	}
	
	class RecentWorkflowAction extends Action {
		String workflow = null;
		public RecentWorkflowAction( String filename ) {
			workflow = filename;
			setText(filename);
			setToolTipText("Rerun "+filename);
			setImageDescriptor(ImageRegistry.getImageDescriptorFromPlugin(ImageRegistry.WORKFLOWFILE));
		}
		public void run() {
        	onRerunWorkflow(workflow);
		}
	}

	private void onRerunWorkflow(String workflow) {
		setFilenameAndRedraw(workflow);
	}
	
	private void createActions() {
		runWorkflowAction = new Action() {
			public void run() {
				onRunNewWorkflow();
			}
		};
		runWorkflowAction.setText("Run Transformation Workflow...");
		runWorkflowAction.setToolTipText("Run a workflow that creates a GraphMM model");
		runWorkflowAction.setImageDescriptor(ImageRegistry.getImageDescriptorFromPlugin(ImageRegistry.WORKFLOWFILE));
	}

	private void onRunNewWorkflow() {
		FileDialog fd = new FileDialog(new Shell(Display.getCurrent()), SWT.OPEN);
		fd.setText("Run Workflow");
		fd.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString());
		String[] filterExt = { "*.oaw" };
		fd.setFilterExtensions(filterExt);
		String selected = fd.open();
		if ( selected != null ) {
			setFilenameAndRedraw(selected);
		}
	}
	

	public void setFocus() {
	}
	
	
	private NodeData getData(GraphNode n) {
		return (NodeData)n.getData();
	}
	
	private EdgeData getData(GraphConnection c) {
		return (EdgeData)c.getData();
	}
	
	private GraphData getData(Graph g) {
		return (GraphData)g.getData();
	}
	
	private TabItemData getData( TabItem item ) {
		TabItemData d = (TabItemData)item.getData();
		if ( d == null ) {
			d = new TabItemData();
			item.setData(d);
		}
		return d;
	}
	
}