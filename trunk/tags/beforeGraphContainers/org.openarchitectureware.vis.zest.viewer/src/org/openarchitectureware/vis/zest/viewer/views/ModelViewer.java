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
import org.eclipse.jface.action.IToolBarManager;
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
import org.openarchitectureware.vis.zest.builder.GraphBuilder;
import org.openarchitectureware.vis.zest.builder.NodeData;
import org.openarchitectureware.vis.zest.viewer.source.EclipseSourceLocator;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;

/**
 * This class represents an Eclipse view that renders graphmm 
 * instances using ZEST.
 * 
 * @author MarkusVoelter
 */
public class ModelViewer extends ViewPart {

	private static final int LAYOUT_RADIAL = 0;
	private static final int LAYOUT_SPRING = 1;
	private static final int LAYOUT_TREE = 2;
	private static final int LAYOUT_TREE_HORI = 3;

	private Set recentWorkflowFiles = new HashSet();
	private EclipseSourceLocator eclipseSourceLocator = new EclipseSourceLocator();
	
	private Action runWorkflowAction;
	private Composite topLevelComposite;
	private IMenuManager menuManager;
	private Table nodePropertiesTable;
	private Combo layoutCombo;
	private TabFolder tabFolderForGraphs;
	private SashForm topLevelSashForm;
	private Composite rightSideComposite;
	private Table filterTable;
	private GraphBuilder graphbuilder;
	private IToolBarManager toolBarManager;
	private Action refreshCurrentWorkflowAction;
	private String currentWorkflowFileName;

	/**
	 * constructor - do nothing
	 */
	public ModelViewer() {
	}
	
	/**
	 * callback when the focus is set
	 * do nothing
	 */
	public void setFocus() {
	}
	

	/**
	 * called by Eclipse to initiate construction of 
	 * the view. Here we just create the menus. All
	 * the rest of the view content is created after
	 * a workflow has been run to create a graph. 
	 */
	public void createPartControl(Composite parent) {
		this.topLevelComposite = parent;
		IActionBars bars = getViewSite().getActionBars();
		menuManager = bars.getMenuManager();
		toolBarManager = bars.getToolBarManager();
		createActions();
		fillLocalPullDown();
		fillLocalToolBar();
		// the following is for testing purposes.
		//setFilenameAndRedraw("de/voelter/zest/example/createModel.oaw");
		//setFilenameAndRedraw("de/voelter/zest/example/createEcore.oaw");
	}

	/**
	 * creates the pull down menu on the view
	 */
	private void fillLocalPullDown() {
		// this one allows the selection of workflows to be run
		menuManager.add(runWorkflowAction);
		// we add a separator, because for each run workflow we
		// add an action that re-runs it below this separator
		menuManager.add(new Separator());
	}

	/**
	 * creates the pull down menu on the view
	 */
	private void fillLocalToolBar() {
		// select and run a workflow
		toolBarManager.add( runWorkflowAction );
		// the action to rerun the current workflow
		toolBarManager.add( refreshCurrentWorkflowAction );
	}

	/** 
	 * main method that runs a workflow and renders the graph
	 * created by that workflow. The workflow must put an instance
	 * of the graphmm metamodel into the graphmodel workflow slot 
	 * @param workflowFileName name and path to workflow
	 */
	private void setFilenameAndRedraw(String workflowFileName) {
		// remember current workflow
		currentWorkflowFileName = workflowFileName;
		// add workflow to the drop down menu
		addRecentWorkflowFile( workflowFileName );
		// actually run workflow and get the resulting graphmm instance
		EObject graphmodel = runWorkflow(workflowFileName);
		// use the GraphBuilder to create an actual ZEST graph
		// from the EObject that describes the graph
		graphbuilder = new GraphBuilder(graphmodel);
		// delete all the content in the view from possible previous
		// workflows and graphs
		int childcount = topLevelComposite.getChildren().length; 
		for (int i = childcount-1; i >= 0; i--) {
			topLevelComposite.getChildren()[i].dispose();
		}
		topLevelSashForm = new SashForm(topLevelComposite,SWT.HORIZONTAL);
		tabFolderForGraphs = new TabFolder (topLevelSashForm, SWT.NONE);
		createRightSideComposite();
		populateTabFolderWithGraphs();
		topLevelSashForm.setWeights(new int[] {90,10});
		topLevelComposite.layout(true, true);
	}

	/**
	 * builds the composite on the right side of the graphs -
	 * contains the layout selection combo, the table with the
	 * filter categories as well as the properties table
	 */
	private void createRightSideComposite() {
		rightSideComposite = new Composite(topLevelSashForm, SWT.NONE);
		rightSideComposite.setLayout( new GridLayout(1, true) );

		// the layout combo box provides ZEST's four different
		// layout alternatives to choose from. 
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
		
		// we then add another (vertical) sash that is used to change
		// the size proportions of the filter and the properties tables
		SashForm rightSash = new SashForm(rightSideComposite,SWT.VERTICAL);
		GridData gdRightSash = new GridData();
		gdRightSash.verticalAlignment = SWT.FILL;
		gdRightSash.horizontalAlignment = SWT.FILL;
		gdRightSash.grabExcessVerticalSpace = true;
		gdRightSash.grabExcessHorizontalSpace = true;
		rightSash.setLayoutData( gdRightSash );
		
		// this is the (as of yet empty) filter table
		// the items will be checkbox style - to be added later
		filterTable = new Table(rightSash, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL );
		filterTable.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onFilterTableSelectionChanged();
			}
		});
		
		// this table is used to show a node's properties in a table
		// two columns: name and value
		nodePropertiesTable = new Table( rightSash, SWT.BORDER | SWT.FULL_SELECTION);
		nodePropertiesTable.setHeaderVisible(true);
		nodePropertiesTable.setLinesVisible(false);
		nodePropertiesTable.setBackground(ColorConstants.tooltipBackground);
		TableColumn col1 = new TableColumn(nodePropertiesTable, SWT.NONE);
		col1.setText("Name");
		col1.setWidth(40);
		TableColumn col2 = new TableColumn(nodePropertiesTable, SWT.NONE);
		col2.setText("Value");
		col2.setWidth(60);
		
		rightSash.setWeights(new int[] {60,40});
		rightSideComposite.pack();
		
	}

	/**
	 * if the layout combo selection is changed, we grab 
	 * the index and call the graph re-layouting method
	 * Note that we use integer constants to refer to the
	 * layouts - the values of the constants conform to the
	 * position in the layout combo box
	 */
	private void onLayoutComboSelectionChanged() {
		final int layoutIndex = layoutCombo.getSelectionIndex();
		setGraphLayout(currTabItem(), layoutIndex);
	}
	
	/**
	 * resets the layout of a graph and redraws it.
	 * @param tabItem the tab item containing the graph
	 * @param layoutId the new layout ID
	 */
	private void setGraphLayout(TabItem tabItem, final int layoutId) {
		// we store the layout with the tab so we can 
		// readjust the combo box when the tab is (re-)selected
		getData(tabItem).setLayoutId(layoutId);
		// then we get the actual graph from the tab
		Graph g = getData(tabItem).getGraph();
		// then we create the new layout via the layoutId constant
		AbstractLayoutAlgorithm graphlayout = null;
		switch (layoutId) {
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
		// and set it on the graph
		g.setLayoutAlgorithm(graphlayout, true);
	} 
	
	/**
	 * this method populates the tabbed pane with the
	 * tab items that contain the actual graphs.
	 */
	private void populateTabFolderWithGraphs() {
		// retrieve the graphs from the builder
		Collection<EObject> graphs = graphbuilder.getGraphs();
		// create a tab item for each of them and call the
		// createGraphIntoTabItem method for each of them
		// to actually populate the tab
		for (EObject gm: graphs) {
			TabItem item = new TabItem (tabFolderForGraphs, SWT.NONE);
			createGraphIntoTabItem(gm, item);
		}
		// force layout
		tabFolderForGraphs.layout();
		// update the filter table 
		updateFilterTable();
		// update the layout combo
		updateLayoutCombo();
		// actually set the layout on the graph
		setGraphLayout( currTabItem(), LAYOUT_RADIAL);
		// add a listener for when the tab selection changes
		tabFolderForGraphs.addSelectionListener(new SelectionAdapter()  {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onTabFolderSelectionChanged();
			}
		});		
	}

	/**
	 * when the tab selection changes... we update
	 * the layout combo and the filter table
	 */
	private void onTabFolderSelectionChanged() {
		updateLayoutCombo();
		updateFilterTable();
	}
	
	/**
	 * Actually populates the graph into the tab item
	 * @param graphModel the EObject model of the graph
	 * @param item the item into which it should be rendered
	 */
	private void createGraphIntoTabItem(EObject graphModel, TabItem item) {
		// if there's already a graph in that item,
		// delete it
		Graph old = getData(item).getGraph();
		if ( old != null ) {
			item.setControl(null);
			old.dispose();
		}
		// get the filter configuration from the current tab
		Set<String> checkedFilters = getData(item).getCheckedFilters();
		// and create the new graph. Note how the "old" filter configuration
		// is used -- if no filter configuration is available (checkedFilters == null)
		// all nodes are added (i.e. nothing is filtered out)
		Graph newGraph = constructGraph(graphModel, checkedFilters);
		item.setText( getData(newGraph).getName() );
		item.setControl(newGraph);
		// remember graph and model with the item
		getData(item).setGraph(newGraph);
		getData(item).setGraphModel(graphModel);
		// if no filters had been configured into the tab item.
		// we add all the categories defined by the graph (i.e.
		// nothing is filtered)
		if ( checkedFilters == null ) {
			checkedFilters = new HashSet<String>();
			checkedFilters.addAll(getData(newGraph).getCategories());
			getData(item).setCheckedFilters(checkedFilters);
		}
		// as the graph for a layout hint. If present, use if for
		// the initial layout
		String layoutHint = getData(newGraph).getSuggestedLayout();
		int layoutHintAsInt = layoutHintToConstant( layoutHint );
		if ( layoutHintAsInt >= 0 ) {
			// if we have a hint, we use it for layout
			setGraphLayout(item, layoutHintAsInt );
			updateLayoutCombo();
		} else {
			// if not, we query the layout combo
			if ( layoutCombo != null ) {
				setGraphLayout(item, layoutCombo.getSelectionIndex());
			} else {
				setGraphLayout(item, LAYOUT_RADIAL);
			}
		}
	}

	/**
	 * translates the string used as the layout hint into
	 * the constant used internally
	 * @param layoutHint the layout hint as string
	 * @return the integer constant representing this layout
	 */
	private int layoutHintToConstant(String layoutHint) {
		if ( layoutHint == null ) return LAYOUT_RADIAL;
		if ( layoutHint.equals("radial")) return LAYOUT_RADIAL;
		if ( layoutHint.equals("spring")) return LAYOUT_SPRING;
		if ( layoutHint.equals("tree")) return LAYOUT_TREE;
		if ( layoutHint.equals("htree")) return LAYOUT_TREE_HORI;
		return LAYOUT_RADIAL;
	}

	/**
	 * updates the layout combo from the layout
	 * data stored in the tab item
	 */
	private void updateLayoutCombo() {
		int index = getData(currTabItem()).getLayoutIndex();
		layoutCombo.select(index);
	}

	/**
	 * returns the currently selected tab item
	 * @return the currently selected item
	 */
	private TabItem currTabItem() {
		return tabFolderForGraphs.getSelection()[0];
	}
	
	/**
	 * returns the curerntly selected graph by 
	 * using the GraphData of the currently selected
	 * tab item 
	 * @return the currently selected graph
	 */
	private Graph currGraph() {
		return getData(currTabItem()).getGraph();
	}

	/**
	 * updates the filter table based on the selected tab
	 */
	private void updateFilterTable() {
		// delete all the "old" items
		int itemcount = filterTable.getItems().length; 
		for (int i = itemcount-1; i >= 0; i--) {
			filterTable.getItems()[i].dispose();
		}
		// if no tab is selected, return
		if ( currTabItem() == null ) return;
		// grab the list of all categories used in the current graph
		final Collection<String> categories = getData(currGraph()).getCategories();
		// get all the categories that are checked, accoding to the data
		// stored in the tab item
		final Collection<String> checked = getData(currTabItem()).getCheckedFilters();
		// add a table item for all the categories, and set its checked
		// flag to true if it is in the filter list
		for (String category : categories) {
			TableItem t = new TableItem( filterTable, SWT.NONE );
			t.setText( category );
			if ( checked.contains(category)) t.setChecked(true);
		}
	}
	
	/** 
	 * when the selection in the filter table changes,
	 * we need to update the filter list and rebuild the
	 * graph
	 */
	private void onFilterTableSelectionChanged() {
		// get all the checked categories from the tab
		Collection<String> checked = getData(currTabItem()).getCheckedFilters();
		// delete all, and then add all the ones that are still
		// selected in the table in the UI
		checked.clear();
		TableItem [] filterItems = filterTable.getItems();
		for (TableItem item : filterItems) {
			if ( item.getChecked() ) checked.add( item.getText() );
		}
		// get the graph model from the current tab item
		// and recreate the graph into the tab item
		final EObject graphmodel = getData(currTabItem()).getGraphModel();
		createGraphIntoTabItem(graphmodel, currTabItem());
	}

	
	/**
	 * constructs the actual graph
	 * @param graphModel the model from which to build the graph
	 * @param checkedCategories the set of categories that are checked in the filter table
	 * @return the actual created graph
	 */
	private Graph constructGraph(EObject graphModel, Collection<String> checkedCategories) {
		// construct graph
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

	/**
	 * when the mouse is clicked on a node this method is called
	 * @param graph the graph on which we click
	 * @param event the event 
	 */
	private void onGraphMouseEvent(final Graph graph, MouseEvent event) {
		List selectedNodeOrEdges = graph.getSelection();
		int stateMask = event.stateMask;
		// if we have one element only...
		if ( selectedNodeOrEdges.size() == 1 ) {
			GraphNode nodeClickedOn = (GraphNode)selectedNodeOrEdges.get(0);
			// and we shift-clicked on it
			if ( (stateMask & SWT.SHIFT) != 0 ) {
				// we open the source editor, if we have a source
				// location associated to the node
				locateSource(nodeClickedOn);
			}
		}
	}

	/**
	 * when the graph is selected (i.e. somebody clicked
	 * on a node or edge) we update the propreties table
	 * @param graph the graph that was clicked on
	 */
	private void onGraphSelectionChanged(final Graph graph) {
		List selectedNodes = graph.getSelection();
		// if there's one node selected only, then 
		// update it's properties in the table
		if ( selectedNodes.size() == 1 ) {
			GraphNode n = (GraphNode)selectedNodes.get(0);
			updatePropertiesTable(n);
		}
	}
	
	/**
	 * open the editor with the source of the node on
	 * which the user had clicked
	 * @param nodeClickedOn the node on which the user had clicked
	 */
	private void locateSource(GraphNode nodeClickedOn) {
		String location = (String)nodeClickedOn.getData();
		if ( location != null ) {
			eclipseSourceLocator.locate(location);
		}
	}
	
	/**
	 * updates the table that shows a node's properties 
	 * @param selectedNode the node whose properties must be shown
	 */
	private void updatePropertiesTable(GraphNode selectedNode) {
		// delete all the existing children
		for (TableItem item : nodePropertiesTable.getItems()) {
			item.dispose();
		}
		// get all the property name-value pairs and add a
		// table item for each of them
		Map<String, String> userDataMap = getData(selectedNode).getUserData();
		for (String name : userDataMap.keySet()) {
			TableItem i1 = new TableItem(nodePropertiesTable, SWT.NULL);
			i1.setText( new String[]{name, userDataMap.get(name)});
		}
	}

	
	/**
	 * runs an oAW workflow to get hold of a graph model
	 * @param workflowFileName the workflow to be run
	 * @return the graphmodel built by the workflow
	 */
	private EObject runWorkflow(String workflowFileName) {
		Map properties = new HashMap();
		Map slotContents = new HashMap();
		WorkflowRunner runner = new WorkflowRunner();
		runner.run(workflowFileName, new NullProgressMonitor(), properties, slotContents);
		EObject graphmodel = (EObject)runner.getContext().get("graphmodel");
		return graphmodel;
	}

	/**
	 * adds a workflow file to the list of recently run workflows
	 * @param workflowFileName the workflow to be added
	 */
	private void addRecentWorkflowFile(String workflowFileName) {
		// only add it if it's not yet in the list
		if ( recentWorkflowFiles.contains(workflowFileName)) {
			return;
		}
		recentWorkflowFiles.add(workflowFileName);
		menuManager.add( new RecentWorkflowAction(workflowFileName) );
	}
	
	/**
	 * action used to re-run existing workflows
	 * @author MarkusVoelter
	 */
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

	/** 
	 * when a recent workflow is rerun, just call the 
	 * setFilenameAndRedraw method
	 * @param recentWorkflowToBeRerun
	 */
	private void onRerunWorkflow(String recentWorkflowToBeRerun) {
		setFilenameAndRedraw(recentWorkflowToBeRerun);
	}
	
	/**
	 * creates the actions for the drop down menu and the button list
	 */
	private void createActions() {
		runWorkflowAction = new Action() {
			public void run() {
				onRunNewWorkflow();
			}
		};
		runWorkflowAction.setText("Run Transformation Workflow...");
		runWorkflowAction.setToolTipText("Run a workflow that creates a GraphMM model");
		runWorkflowAction.setImageDescriptor(ImageRegistry.getImageDescriptorFromPlugin(ImageRegistry.WORKFLOWFILE));

		refreshCurrentWorkflowAction = new Action() {
			public void run() {
				onRefreshCurrentWorkflow();
			}

		};
		refreshCurrentWorkflowAction.setText("Rerun current workflow");
		refreshCurrentWorkflowAction.setToolTipText("Rerun current workflow");
		refreshCurrentWorkflowAction.setImageDescriptor(ImageRegistry.getImageDescriptorFromPlugin(ImageRegistry.REFRESH));
	}

	/**
	 * reruns the currently active workflow
	 */
	private void onRefreshCurrentWorkflow() {
		setFilenameAndRedraw( currentWorkflowFileName );
	}

	/**
	 * runs a new workflow - opens a file dialog
	 * to let the user select the file to run
	 */
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
	

	/**
	 * returns the NodeData structure for a node
	 * @param n the node for which the data structure
	 *          shall be returned
	 * @return the NodeData object
	 */
	private NodeData getData(GraphNode n) {
		return (NodeData)n.getData();
	}
	
	/**
	 * returns the EdgeData structure for a connection
	 * @param c the edge for which the data structure
	 *          shall be returned
	 * @return the EdgeData object
	 */
	private EdgeData getData(GraphConnection c) {
		return (EdgeData)c.getData();
	}
	
	/**
	 * returns the GraphData structure for a graph
	 * @param g the graph for which the data structure
	 *          shall be returned
	 * @return the GraphData object
	 */
	private GraphData getData(Graph g) {
		return (GraphData)g.getData();
	}
	
	/**
	 * returns the TabItemData structure for a tab item
	 * @param item the item for which the data structure
	 *          shall be returned
	 * @return the TabItemData object
	 */
	private TabItemData getData( TabItem item ) {
		TabItemData d = (TabItemData)item.getData();
		if ( d == null ) {
			d = new TabItemData();
			item.setData(d);
		}
		return d;
	}
	
}