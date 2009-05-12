package org.openarchitectureware.vis.zest.viewer.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import nu.bibi.breadcrumb.IMenuSelectionListener;
import nu.bibi.breadcrumb.MenuSelectionEvent;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IOpenListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.OpenEvent;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphItem;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.AbstractLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.openarchitectureware.vis.zest.builder.EdgeData;
import org.openarchitectureware.vis.zest.builder.GraphBuilder;
import org.openarchitectureware.vis.zest.builder.GraphData;
import org.openarchitectureware.vis.zest.builder.GraphMMModelWrapper;
import org.openarchitectureware.vis.zest.builder.NodeData;
import org.openarchitectureware.vis.zest.viewer.source.SourceLocator;
import org.openarchitectureware.vis.zest.viewer.views.breadcrumb.GraphBreadcrumbViewer;

/**
 * This class provides a viewer that renders graphmm instances using ZEST. The
 * graphmm model instance must be handed in using #setInput. The viewer does not
 * care where this instance is coming from.
 * 
 * @author MarkusVoelter
 * @author DanielWeber
 */
public class ModelViewer implements ISelectionProvider {

	private static final int LAYOUT_RADIAL = 0;
	private static final int LAYOUT_SPRING = 1;
	private static final int LAYOUT_TREE = 2;
	private static final int LAYOUT_TREE_HORI = 3;
	private static final int ENTER = 13;
	private static final int BACKSPACE = 8;
	
	private final SourceLocator sourceLocator;
	private final Composite topLevelComposite;
	private Table nodePropertiesTable;
	private CCombo layoutCombo;
	private CTabFolder tabFolderForGraphs;
	private SashForm topLevelSashForm;
	private Composite rightSideComposite;
	private Table filterTable;
	private GraphBuilder graphbuilder;
    private final FormToolkit toolkit;
    private Button cboxDrillDown;
    private final StringBuffer typedKeys = new StringBuffer();
	private final IStatusLineManager statusLineManager;
	private ListenerList listeners;

	/**
	 * Constructor. Does not create any widgets.
	 * 
	 * @param topLevelComposite
	 *            The composite this viewer should embed its widgets in
	 * @param toolkit
	 *            To be used for forms stuff
	 * @param sourceLocator
	 *            Used to open the source for a specific node if a source
	 *            location has been specified.
	 * @param statusLineManager
	 *            Well, used to display status updates
	 */
	public ModelViewer(Composite topLevelComposite, FormToolkit toolkit,
			SourceLocator sourceLocator, IStatusLineManager statusLineManager) {
		this.topLevelComposite = topLevelComposite;
		this.toolkit = toolkit;
		this.sourceLocator = sourceLocator;
		this.statusLineManager = statusLineManager;
		this.listeners = new ListenerList();
	}
	
	/**
	 * callback when the focus is set
	 */
	public void setFocus() {
		if ( currGraph() != null ) currGraph().setFocus();
	}
	
	/**
	 * Method that updates the model view to display the given graph model
	 * 
	 * @param graphmodel
	 *            the model to be displayed by this viewer
	 */
	public void setInput(EObject graphmodel) {
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
		toolkit.adapt(topLevelSashForm,true,true);
		Section graphSection = toolkit.createSection(topLevelSashForm, Section.TITLE_BAR);
		graphSection.setText("Graphs");
		tabFolderForGraphs = new CTabFolder (graphSection, SWT.NONE);
		graphSection.setClient(tabFolderForGraphs);
		
		// Highlight the selected tab using a color gradient
		toolkit.getColors().initializeSectionToolBarColors();
		Color selectedColor = toolkit.getColors().getColor(IFormColors.TB_BG);
		tabFolderForGraphs.setSelectionBackground(new Color[] { selectedColor,
        toolkit.getColors().getBackground() }, new int[] { 100 }, true);
		
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
	   Section section = toolkit.createSection(topLevelSashForm, Section.TITLE_BAR);
		rightSideComposite = toolkit.createComposite(section, SWT.NONE);
		section.setClient(rightSideComposite);
		section.setText("Layout, Categories and Properties");   
		rightSideComposite.setLayout( new GridLayout(1, true) );
		
		// the layout combo box provides ZEST's four different
		// layout alternatives to choose from.
		layoutCombo = new CCombo(rightSideComposite, comboStyle());
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
		
		// ComboBox to enable/disable the drill down feature for the current graph
		cboxDrillDown = new Button(rightSideComposite,SWT.CHECK | SWT.FLAT);
		cboxDrillDown.setText("Subgraphs as Drill Down");
		//get drilldown info from tab if present
		cboxDrillDown.setSelection((currTabItem()!=null)?getData(currTabItem()).isDrilldownEnabled():true);
		cboxDrillDown.addSelectionListener(new SelectionListener(){
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}

			public void widgetSelected(SelectionEvent e) {
				rerenderGraph(cboxDrillDown.getSelection());
			}
		});
		//still buggy with GraphContainer and the zestrootlayer association
		cboxDrillDown.setEnabled(false);
		
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
		filterTable = toolkit.createTable(rightSash, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL );
		filterTable.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				onFilterTableSelectionChanged();
			}
		});
		
		// this table is used to show a node's properties in a table
		// two columns: name and value
		nodePropertiesTable = toolkit.createTable( rightSash, SWT.BORDER | SWT.FULL_SELECTION);
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
	 * "Calculates" a style for our CCombo so that a border is used if the
	 * toolkit currently uses borders.
	 * 
	 * @return SWT style bits according to the {@link #toolkit}'s current
	 *         settings.
	 */
	private int comboStyle() {
		int style = SWT.DROP_DOWN | SWT.READ_ONLY;
		if (toolkit.getBorderStyle() == SWT.BORDER) {
			style |= SWT.BORDER;
		}
		else {
			style |= SWT.FLAT;
		}
		return style;
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
	private void setGraphLayout(CTabItem tabItem, final int layoutId) {
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
			CTabItem item = new CTabItem (tabFolderForGraphs, SWT.NONE);
			tabFolderForGraphs.setSelection(item);
			createGraphIntoTabItem(gm, item);
		}
		if (!graphs.isEmpty()) {
		   // switch to the first tab (i.e. graph)
		   tabFolderForGraphs.setSelection(0);
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
		cboxDrillDown.setSelection(getData(currTabItem()).isDrilldownEnabled());
		clearStatusBar();
	}
	
	/**
	 * Actually populates the graph into the tab item
	 * @param graphModel the EObject model of the graph
	 * @param item the item into which it should be rendered
	 */
	private void createGraphIntoTabItem(final EObject graphModel, final CTabItem item) {
		// if there's already a graph in that item,
		// delete it
		Graph old = getData(item).getGraph();
		boolean init=true;
		if ( old != null ) {
			init = false;
			old.dispose();
		}

		Composite composite = null;
		if (init == true)
		{
			//create composite for the breadcrumb and the graph
			composite =toolkit.createComposite(tabFolderForGraphs, SWT.NONE);
			GridLayout layout = new GridLayout();
			layout.numColumns = 1;
			layout.marginWidth = 2;
			layout.marginHeight = 2;
			composite.setLayout(layout);
			item.setControl(composite);
			
			//configure the breadcrumb
			GraphBreadcrumbViewer viewer = new GraphBreadcrumbViewer(composite,SWT.NONE,graphModel);
			viewer.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			//the model to navigate on
			viewer.setInput(graphModel);
			viewer.setSelection(new StructuredSelection(graphModel));
			//the GraphCollection should not be visible
			viewer.setRootVisible(false);			
			addListeners(viewer);
			getData(item).setBreadCrumb(viewer);
		}
		else composite = (Composite)item.getControl();
		
		// get the filter configuration from the current tab
		Set<String> checkedFilters = getData(item).getCheckedFilters();
		// and create the new graph. Note how the "old" filter configuration
		// is used -- if no filter configuration is available (checkedFilters == null)
		// all nodes are added (i.e. nothing is filtered out)
		final Graph newGraph = constructGraph(graphModel, checkedFilters, getData(item).isDrilldownEnabled());
		
		addGraphListeners(newGraph);
		newGraph.setLayoutData(new GridData(GridData.FILL_BOTH));
		newGraph.setParent(composite);
		
		//set tabtext with topgraph-name
		if (GraphMMModelWrapper.isOneOfTopGraphs(graphModel)||item.getText()==null)
			item.setText( getData(newGraph).getName() );
		//it may be a new graph
		composite.layout();
		// remember graph and model with the item
		getData(item).setGraph(newGraph);
		getData(item).setWrappedGraphModel(new GraphMMModelWrapper(graphModel));
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
		//graph has to be fully constructed
		Menu menu = constructMenuManager().createContextMenu(newGraph);
		newGraph.setMenu(menu);
		newGraph.setFocus();
		
		clearStatusBar();
	}
	
	/**
	 * adds a set of listeners to the graph
	 */
	private void addGraphListeners(final Graph graph)
	{
		graph.addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent e )
			{
				boolean complete = false;
				if (e.keyCode == BACKSPACE){
					if (typedKeys.length() > 0 )
						typedKeys.deleteCharAt(typedKeys.length()-1);
					if (typedKeys.length() == 0 )
						clearStatusBar();
				}else if (e.keyCode == ENTER){
					complete = true;
				}else if ((e.character >= 'a' && e.character <= 'z') || (e.character >= 'A' && e.character <= 'Z') || (e.character == '.') || (e.character >= '0' && e.character <= '9')) {
					typedKeys.append(e.character);
				}
				List<GraphNode> selectedNodes = new ArrayList<GraphNode>();
				if (typedKeys.length() > 0){
					for (Object obj : graph.getNodes())
					{
						if (((GraphNode)obj).getText().toLowerCase().indexOf(typedKeys.toString().toLowerCase())>=0){
							selectedNodes.add((GraphNode)obj);
						}
					}
				}
				
				if (complete && typedKeys.length()>0){
					clearStatusBar();
					selectedNodes = Collections.emptyList();
				}
				if (typedKeys.length()>0)
				{
					updateStatusBar("Searched for \""+typedKeys.toString()+"\". Press Enter to complete search");
				}
				graph.setSelection((GraphItem[])selectedNodes.toArray(new GraphItem[selectedNodes.size()]));
				graph.redraw();
			}
		});
		graph.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				setSelection(getSelection());
			}
		});
	}
	/**
	 * update statusbar and delete buffer of typedkeys
	 */
	private void clearStatusBar()
	{
		typedKeys.delete(0, typedKeys.length());
		updateStatusBar("");
	}

	private void updateStatusBar(String status)
	{
		if (null != statusLineManager)
			statusLineManager.setMessage(status);
	}
	/**
	 * adds some listeners to the GraphBreadcrumbViewer
	 * @param viewer GraphBreadcrumbViewer to add listeners to
	 */
	private void addListeners(final GraphBreadcrumbViewer viewer)
	{
		viewer.addMenuSelectionListener(new IMenuSelectionListener() {
			public void menuSelect(final MenuSelectionEvent event) {
				handleSelection((IStructuredSelection) event.getSelection(), viewer);
			}
		});
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(final DoubleClickEvent event) {
				handleSelection((IStructuredSelection) event.getSelection(), viewer);
			}
		});

		viewer.addOpenListener(new IOpenListener() {
			public void open(final OpenEvent event) {
				final Object element = ((IStructuredSelection) event
						.getSelection()).getFirstElement();
				if (element != null) {
					viewer.setInput(element);
				}
			}
		});
	}
	
	private void setCurrentBreadCrumbViewer(EObject node){
		getData(currTabItem()).getBreadCrumb().setSelection(new StructuredSelection(node));
		getData(currTabItem()).getBreadCrumb().setInput(node);
	}
	/**
	 * Sets the breadcrumb to the selected item and inits a new graph rendering if a subgraphnode is selected.
	 * @param selection to react on
	 * @param viewer the viewer that reflects the selection
	 */
	private void handleSelection(IStructuredSelection selection, final  GraphBreadcrumbViewer viewer)
	{
		if (selection.isEmpty()) {
			viewer.setFocus();
			return;
		}
		viewer.setInput(selection.getFirstElement());
		viewer.setSelection(selection);
//		viewer.setFocus();
		if (getData(currTabItem()).getWrappedGraphModel().isGraph((EObject) selection.getFirstElement()))
		{
			EObject eo = ((EObject) selection.getFirstElement());
			createGraphIntoTabItem(eo, currTabItem());
		}
		getData(currTabItem()).getWrappedGraphModel();
		if (GraphMMModelWrapper.isContainerNode((EObject) selection.getFirstElement()))
		{
			EObject eo = ((EObject) selection.getFirstElement());
			createGraphIntoTabItem(getData(currTabItem()).getWrappedGraphModel().getContainedGraph(eo), currTabItem());
			return;
		}
		if (getData(currTabItem()).getWrappedGraphModel().isNode((EObject) selection.getFirstElement()))
		{
			if(true)throw new NullPointerException("sollte nicht passieren");
			GraphNode no = ((GraphData)currGraph().getData()).getCorrespondingGraphNode((EObject) selection.getFirstElement());
			if (no == null)
			{
				//if a node in the breadcrumb is selected that is not in the present graph render the graph that contains the node
				EObject eo = (EObject) selection.getFirstElement();
				GraphMMModelWrapper mm = new GraphMMModelWrapper(eo);
				EObject graph = mm.getContainingGraphForNode(eo);
				createGraphIntoTabItem(graph, currTabItem());

			}
				currGraph().setSelection(new GraphItem[]{((GraphData)currGraph().getData()).getCorrespondingGraphNode((EObject) selection.getFirstElement())});
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
	private CTabItem currTabItem() {
		return tabFolderForGraphs.getSelection();
	}
	
	/**
	 * returns the currently selected graph by 
	 * using the GraphData of the currently selected
	 * tab item 
	 * @return the currently selected graph
	 */
	private Graph currGraph() {
		if ( graphbuilder == null ) return null; 
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
		final EObject graphmodel = getData(currTabItem()).getWrappedGraphModel().getModel();
		createGraphIntoTabItem(graphmodel, currTabItem());
	}

	
	/**
	 * constructs the actual graph
	 * @param graphModel the model from which to build the graph
	 * @param checkedCategories the set of categories that are checked in the filter table
	 * @return the actual created graph
	 */
	private Graph constructGraph(EObject graphModel, Collection<String> checkedCategories, boolean drilldownEnabled) {
		// construct graph
		final Graph g = graphbuilder.constructGraph(tabFolderForGraphs, graphModel, checkedCategories, drilldownEnabled);
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
		//getSite().registerContextMenu(menuMgr, viewer);		
		return g;
	}
	private MenuManager constructMenuManager()
	{
		
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		fillContextMenu(menuMgr);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				fillContextMenu(manager);
			}
		});
		return menuMgr;
	}

	
	abstract class SelectRelatedAction extends Action {
		public SelectRelatedAction(String label) {
			super( label );
		}
		@SuppressWarnings("unchecked")
		@Override
		public void run() {
			Graph g = currGraph();
			List<GraphItem> currentSelection = g.getSelection();
			Set<GraphItem> newSelection = new HashSet<GraphItem>();
			newSelection.addAll(currentSelection);
			for (Iterator<GraphItem> nodeIter = currentSelection.iterator(); nodeIter.hasNext();) {
				GraphNode n = (GraphNode) nodeIter.next();
				List<GraphItem> downstreamConnections = n.getSourceConnections();
				for (Iterator<GraphItem> connIter = downstreamConnections.iterator(); connIter.hasNext();) {
					GraphConnection c = (GraphConnection) connIter.next();
					handleDownstreamConnection( c, newSelection );
				}
				List<GraphItem> upstreamConnections = n.getTargetConnections();
				for (Iterator<GraphItem> connIter = upstreamConnections.iterator(); connIter.hasNext();) {
					GraphConnection c = (GraphConnection) connIter.next();
					handleUpstreamConnection( c, newSelection );
				}
			}
			g.setSelection( (GraphItem[])newSelection.toArray(new GraphItem[]{}) );
		}
		protected abstract void handleDownstreamConnection(GraphConnection c, Set<GraphItem> newSelection);
		protected abstract void handleUpstreamConnection(GraphConnection c, Set<GraphItem> newSelection);
	}
	
	class SelectDownstreamRelatedNodeAction extends SelectRelatedAction {
		public SelectDownstreamRelatedNodeAction() {
			super( "Select Related Nodes (downstream)");
		}
		@Override
		protected void handleUpstreamConnection(GraphConnection c, Set<GraphItem> newSelection) {
		}
		@Override
		protected void handleDownstreamConnection(GraphConnection c, Set<GraphItem> newSelection) {
			newSelection.add( c.getDestination() );
		}
	}
	
	class SelectUpstreamRelatedNodeAction extends SelectRelatedAction {
		public SelectUpstreamRelatedNodeAction() {
			super( "Select Related Nodes (upstream)");
		}
		@Override
		protected void handleUpstreamConnection(GraphConnection c, Set<GraphItem> newSelection) {
			newSelection.add( c.getSource() );
		}
		@Override
		protected void handleDownstreamConnection(GraphConnection c, Set<GraphItem> newSelection) {
		}
	}
	
	class SelectAllRelatedNodeAction extends SelectRelatedAction {
		public SelectAllRelatedNodeAction() {
			super( "Select Related Nodes");
		}
		@Override
		protected void handleUpstreamConnection(GraphConnection c, Set<GraphItem> newSelection) {
			newSelection.add( c.getSource() );
		}
		@Override
		protected void handleDownstreamConnection(GraphConnection c, Set<GraphItem> newSelection) {
			newSelection.add( c.getDestination() );
		}
	}
	
	class SelectConnectionsAction extends SelectRelatedAction {
		public SelectConnectionsAction() {
			super( "Select Connections");
		}
		@Override
		protected void handleUpstreamConnection(GraphConnection c, Set<GraphItem> newSelection) {
			newSelection.add( c );
		}
		@Override
		protected void handleDownstreamConnection(GraphConnection c, Set<GraphItem> newSelection) {
			newSelection.add( c );
		}
	}
	
	class DrillDownNode extends Action
	{
		public DrillDownNode() {
			super("Drill Down this Node");
		}
		@SuppressWarnings("unchecked")
		@Override
		public void run() {
			Graph g = currGraph();
			List<GraphNode> currentSelection = g.getSelection();
			if (currentSelection.size()==1)
			{
					GraphNode n = currentSelection.get(0);
					EObject graphModelNode = ((NodeData)n.getData()).getModelNode();

					setCurrentBreadCrumbViewer(graphModelNode);
					
					EObject subGraph = getData(currTabItem()).getWrappedGraphModel().getContainedGraph(graphModelNode);
					if (subGraph != null){
						createGraphIntoTabItem(subGraph, currTabItem());
				}
			}
		}
	}
	
	class ClimbUpNode extends Action
	{
		public ClimbUpNode() {
			super("Climb out of this Node");
		}
		@Override
		public void run() {
				EObject superGraph = getData(currTabItem()).getWrappedGraphModel().getContainingGraph(((GraphData)currGraph().getData()).getModelNode());
				if (superGraph!=null){
					if (GraphMMModelWrapper.isOneOfTopGraphs(superGraph))
						setCurrentBreadCrumbViewer(superGraph);
					else
						setCurrentBreadCrumbViewer(superGraph.eContainer());
					createGraphIntoTabItem(superGraph, currTabItem());
				}
		}
	}
	
	private void fillContextMenu(IMenuManager menuMgr) {
		menuMgr.add(new Action("Show properties view") {
			@Override
			public void run() {
				try {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage().showView(
									IPageLayout.ID_PROP_SHEET);
				} catch (PartInitException e) {
					// The property view is not available, live with it...
				}
			}
		});
		if ( (currGraph() != null) && (currGraph().getSelection().size() != 0) ) {
			menuMgr.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));		
			menuMgr.add( new SelectAllRelatedNodeAction() );
			menuMgr.add( new SelectDownstreamRelatedNodeAction() );
			menuMgr.add( new SelectUpstreamRelatedNodeAction() );
			menuMgr.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));		
			menuMgr.add( new SelectConnectionsAction() );
			if (getData(currTabItem()).isDrilldownEnabled() && (currGraph().getSelection().size() == 1)){
				if (currGraph().getSelection().get(0) instanceof GraphNode && GraphMMModelWrapper.isContainerNode(getData((GraphNode)currGraph().getSelection().get(0)).getModelNode())) {
					menuMgr.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));		
					menuMgr.add(new DrillDownNode());
				}
			}
		}
		if ( (currGraph() != null && getData(currTabItem()).isDrilldownEnabled() && !GraphMMModelWrapper.isOneOfTopGraphs(getData(currGraph()).getModelNode()))){ 
			menuMgr.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));		
			menuMgr.add(new ClimbUpNode());
		}
	}

	/**
	 * when the mouse is clicked on a node this method is called
	 * @param graph the graph on which we click
	 * @param event the event 
	 */
	@SuppressWarnings("unchecked")
	private void onGraphMouseEvent(final Graph graph, MouseEvent event) {
		List<GraphItem> selectedNodeOrEdges = graph.getSelection();
		int stateMask = event.stateMask;
		// if we have one element only...
      if(selectedNodeOrEdges.size() == 1
            && selectedNodeOrEdges.get(0) instanceof GraphNode)
      {
			GraphNode nodeClickedOn = (GraphNode)selectedNodeOrEdges.get(0);
			// and we shift-clicked on it
			if ( (stateMask & SWT.SHIFT) != 0 ) {
				// we open the source editor, if we have a source
				// location associated to the node
				locateSource(nodeClickedOn);
			}
		}
		if ( ( (stateMask & SWT.SHIFT ) != 0) && ((stateMask & SWT.CTRL) != 0) )  {
			System.err.println("HALLO");
		}
	}

	/**
	 * when the graph is selected (i.e. somebody clicked on a node or edge) we
	 * update the properties table
	 * 
	 * @param graph
	 *            the graph that was clicked on
	 */
	@SuppressWarnings("unchecked")
	private void onGraphSelectionChanged(final Graph graph) {
		List<GraphItem> selectedNodes = graph.getSelection();
		// if there's one node selected only, then 
		// update it's properties in the table
		if ( selectedNodes.size() == 1 ) {
			GraphItem n = (GraphItem)selectedNodes.get(0);
			updatePropertiesTable(n);
		}
	}
	
	/**
	 * open the editor with the source of the node on
	 * which the user had clicked
	 * @param nodeClickedOn the node on which the user had clicked
	 */
	private void locateSource(GraphNode nodeClickedOn) {
		String location = ((NodeData)nodeClickedOn.getData()).getSourceLocation();
		if ( location != null ) {
			sourceLocator.locate(location);
		}
	}
	
	/**
    * updates the table that shows a node's properties
    * 
    * @param n the node whose properties must be shown
	 */
	private void updatePropertiesTable(GraphItem n)
   {
		// delete all the existing children
		for (TableItem item : nodePropertiesTable.getItems()) {
			item.dispose();
		}
		// get all the property name-value pairs and add a
		// table item for each of them
      Map<String, String> userDataMap = getUserData(n);
		for (String name : userDataMap.keySet()) {
			TableItem i1 = new TableItem(nodePropertiesTable, SWT.NULL);
			i1.setText( new String[]{name, userDataMap.get(name)});
		}
	}

   /**
    * @param i The item to retrieve user data for
    * @return A user data map, if available. Null else.
    */
   private Map<String, String> getUserData(GraphItem item)
   {
      if(item instanceof GraphNode)
      {
         return getData((GraphNode)item).getUserData();
      }
      if(item instanceof GraphConnection)
      {
         return getData((GraphConnection)item).getUserData();
      }
      return null;
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
	private TabItemData getData( CTabItem item ) {
		TabItemData d = (TabItemData)item.getData();
		if ( d == null ) {
			d = new TabItemData();
			item.setData(d);
		}
		return d;
	}
	/**
	 * sets the current state of the tab and rerenders the graph
	 */
	private void rerenderGraph(boolean drilldown)
	{
		getData(currTabItem()).setDrilldownEnabled(drilldown);
		EObject graph = ((GraphData)currGraph().getData()).getModelNode();
		createGraphIntoTabItem(graph, currTabItem());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ISelectionProvider#addSelectionChangedListener
	 * (org.eclipse.jface.viewers.ISelectionChangedListener)
	 */
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}

	/**
	 * @return The selection of the currently active graph. An empty selection
	 *         if there is no graph. Note that the selection will be filled with
	 *         graphmm model objects (instead of zest graph items). That's
	 *         similar to what JFace viewers do.
	 * 
	 * @see org.eclipse.jface.viewers.ISelectionProvider#getSelection()
	 */
	public ISelection getSelection() {
		Object[] selectionElements = null;
		Graph currGraph = currGraph();
		if (null != currGraph) {
			@SuppressWarnings("unchecked")
			List graphSelection = currGraph.getSelection();
			List<EObject> selectedElements = new ArrayList<EObject>(
					graphSelection.size());
			// extract model objects and put them into the selectedElements list
			for (Object item : graphSelection) {
				if (item instanceof GraphNode) {
					selectedElements.add(getData((GraphNode) item)
							.getModelNode());
				} else if (item instanceof GraphConnection) {
					selectedElements.add(getData((GraphConnection) item)
							.getModelEdge());
				}
			}
			selectionElements = selectedElements.toArray();
		}
		return new StructuredSelection(selectionElements);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ISelectionProvider#removeSelectionChangedListener
	 * (org.eclipse.jface.viewers.ISelectionChangedListener)
	 */
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		listeners.remove(listener);
	}

	/**
	 * Propagates selection changes in contained graphs to registered
	 * {@link ISelectionChangedListener}s
	 * 
	 * @see org.eclipse.jface.viewers.ISelectionProvider#setSelection(org.eclipse
	 *      .jface.viewers.ISelection)
	 */
	public void setSelection(ISelection selection) {
		Object[] listenerObjects = listeners.getListeners();
		SelectionChangedEvent ev = new SelectionChangedEvent(ModelViewer.this,
				selection);
		for (int i = 0; i < listenerObjects.length; ++i) {
			((ISelectionChangedListener) listenerObjects[i])
					.selectionChanged(ev);
		}
	}
}
