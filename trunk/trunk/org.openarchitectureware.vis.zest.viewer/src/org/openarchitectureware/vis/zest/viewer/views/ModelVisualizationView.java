package org.openarchitectureware.vis.zest.viewer.views;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.openarchitectureware.vis.zest.viewer.source.EclipseSourceLocator;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.issues.IssuesImpl;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;


/**
 * This class represents an Eclipse view that renders graphmm 
 * instances using ZEST.
 * 
 * @author MarkusVoelter
 * @author DanielWeber
 */
public class ModelVisualizationView extends ViewPart {

	private Set<String> recentWorkflowFiles = new HashSet<String>();
	
	private Action runWorkflowAction;
	private IMenuManager menuManager;
	private IToolBarManager toolBarManager;
	private Action refreshCurrentWorkflowAction;
	private String currentWorkflowFileName;
    private ModelViewer          modelViewer;

	/**
	 * constructor - do nothing
	 */
	public ModelVisualizationView() {
	}
	
	/**
	 * callback when the focus is set
	 * do nothing
	 */
	public void setFocus() {
		if (null != modelViewer)
			modelViewer.setFocus();
	}
	

	/**
	 * called by Eclipse to initiate construction of 
	 * the view. Here we just create the menus. All
	 * the rest of the view content is created after
	 * a workflow has been run to create a graph. 
	 */
	public void createPartControl(Composite parent) {
	  FormToolkit toolkit = new FormToolkit(parent.getDisplay());
	  Form form = toolkit.createForm(parent);
      FillLayout layout = new FillLayout();
      layout.marginHeight = 10;
      layout.marginWidth = 4;
      form.getBody().setLayout(layout);
      toolkit.decorateFormHeading(form);
		
      IActionBars bars = getViewSite().getActionBars();

      modelViewer = new ModelViewer(form.getBody(), toolkit,
				new EclipseSourceLocator(), bars.getStatusLineManager());
      
		menuManager = bars.getMenuManager();
		toolBarManager = bars.getToolBarManager();
		createActions();
		fillLocalPullDown();
		fillLocalToolBar();
		// the following is for testing purposes.
		setFilenameAndRedraw("de/voelter/zest/example/createMinimal.oaw"); 
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
		
		modelViewer.setInput(graphmodel);
	}
	
	/**
	 * runs an oAW workflow to get hold of a graph model
	 * @param workflowFileName the workflow to be run
	 * @return the graphmodel built by the workflow
	 */
	private EObject runWorkflow(String workflowFileName) {
		Map<String, String> properties = new HashMap<String, String>();
		Map<?, ?> slotContents = new HashMap<String, Object>();
		WorkflowRunner runner = new WorkflowRunner();
		final boolean configOK = runner.prepare(workflowFileName, new NullProgressMonitor(), properties);
		final Issues issues = new IssuesImpl();
		if (configOK) {
			runner.executeWorkflow(slotContents, issues);
			EObject graphmodel = (EObject)runner.getContext().get("graphmodel");
			return graphmodel;
		} else {
			return null;
		}
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
}