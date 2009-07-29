package org.openarchitectureware.vis.zest.viewer.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.ViewPart;
import org.openarchitectureware.vis.zest.util.OawEclipseProjectResourceAndClassesLoader;
import org.openarchitectureware.vis.zest.viewer.source.EclipseSourceLocator;

/**
 * This class represents an Eclipse view that renders graphmm instances using
 * ZEST.
 * 
 * @author MarkusVoelter
 * @author DanielWeber
 */
public class ModelVisualizationView extends ViewPart {

	private Set<IFile> recentWorkflowIFiles = new HashSet<IFile>();

	private Action runWorkflowAction;
	private IMenuManager menuManager;
	private IToolBarManager toolBarManager;
	private Action refreshCurrentWorkflowAction;
	private IFile currentWorkflowFile;
	private ModelViewer modelViewer;

	/**
	 * constructor - do nothing
	 */
	public ModelVisualizationView() {
	}

	/**
	 * callback when the focus is set do nothing
	 */
	public void setFocus() {
		if (null != modelViewer)
			modelViewer.setFocus();
	}

	/**
	 * called by Eclipse to initiate construction of the view. Here we just
	 * create the menus. All the rest of the view content is created after a
	 * workflow has been run to create a graph.
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
		
		// Drag and drop support
		// limited to the initial label and the section over the tabs
		final Label label = new Label(form.getBody(), SWT.CENTER);
		label.setText("drop Workflow-file (*.mwe) here");
		    
		int operations = DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_DEFAULT;
		DropTarget dt = new DropTarget(label, operations);
		final TextTransfer textTransfer = TextTransfer.getInstance();
		final FileTransfer fileTransfer = FileTransfer.getInstance();
		Transfer[]	types = new Transfer[] {fileTransfer, textTransfer};
		dt.setTransfer(types);
		WorkflowDropTargetListener dropTargetListener = new WorkflowDropTargetListener(this);
		dt.addDropListener(dropTargetListener);
		
		DropTarget dtForm = new DropTarget(form.getBody(), operations);
		dtForm.setTransfer(types);
		dtForm.addDropListener(dropTargetListener);

		modelViewer = new ModelViewer(form.getBody(), toolkit,
				new EclipseSourceLocator(), bars.getStatusLineManager());

		menuManager = bars.getMenuManager();
		toolBarManager = bars.getToolBarManager();
		createActions();
		fillLocalPullDown();
		fillLocalToolBar();
		// getSite().setSelectionProvider(modelViewer);

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
		toolBarManager.add(runWorkflowAction);
		// the action to rerun the current workflow
		toolBarManager.add(refreshCurrentWorkflowAction);
	}

	/**
	 * main method that runs a workflow and renders the graph created by that
	 * workflow. The workflow must put an instance of the graphmm metamodel into
	 * the graphmodel workflow slot
	 * 
	 * @param workflowFile
	 *            the workflow file in the workspace
	 */
	public void setFilenameAndRedraw(IFile workflowFile) {
		// remember current workflow
		currentWorkflowFile = workflowFile;
		// // add workflow to the drop down menu
		addRecentWorkflowFile(workflowFile);
		// // actually run workflow and get the resulting graphmm instance
		EObject graphmodel = null;
		graphmodel = runWorkflow(workflowFile);

		if (graphmodel == null) {
			MessageDialog.openInformation(new Shell(Display.getCurrent()), "",
					"there is no model to interpet after workflow execution");
		} else {
			String graphmodelClassName = graphmodel.eClass().getName();
			if ( !graphmodelClassName.endsWith("GraphCollection")) {
				MessageDialog.openInformation(new Shell(Display.getCurrent()), "",
					"Top level element of graphmodel workflow slot is of type "+graphmodelClassName+", should be GraphCollection");
			} else {
				modelViewer.setInput(graphmodel);
			}
		}
	}

	public EObject runWorkflow(IFile workflowFile) {
		IProject project = workflowFile.getProject();
		Map<String, String> properties = new HashMap<String, String>();
		Map<?, ?> slotContents = new HashMap<String, Object>();
		EObject graphmodel = null;
		// configure properties passed to the workflow engine
		String baseDir = project.getLocation().toFile()
				.getAbsolutePath();
		properties.put("basedir", baseDir);
		// Logging disabled: ResourceLoading does not work. (Bollbach)
		 ClassLoader oldcl =  this.getClass().getClassLoader();//Thread.currentThread().getContextClassLoader();
		 Thread.currentThread().setContextClassLoader(
		 this.getClass().getClassLoader());
		// MyLog.registerToLogFactory();
		// ResourceLoader oldResourceLoader = ResourceLoaderFactory
		// .createResourceLoader();
		 Issues issues = null;
		try {
			ResourceLoader resourceLoader = new OawEclipseProjectResourceAndClassesLoader(
					project);
			ResourceLoaderFactory
					.setCurrentThreadResourceLoader(resourceLoader);

			WorkflowRunner runner = new WorkflowRunner();
			final boolean configOK = runner.prepare(workflowFile
					.getLocationURI().toString(), new NullProgressMonitor(),
					properties);
			if (configOK) {
			  issues = new IssuesImpl();
				runner.executeWorkflow(slotContents, issues);

				for (String s : runner.getContext().getSlotNames()) {
					System.err.println("slotname: "+s);
				}
				// the slot name must be "graphmodel"
				// somebody had changed it to "model". Took me two hours to debug!!
				String slotName = "graphmodel";
				List<String> slotList = Arrays.asList(runner.getContext().getSlotNames());
				//fallback solution because e.g. createMinimal example loads in a different slot
				if (!slotList.contains(slotName) && slotList.size()>0)
					slotName = slotList.get(0);
				
				graphmodel = (EObject) runner.getContext().get(slotName);
			}
		} catch (Exception
				ex) {
			ex.printStackTrace();
		} finally {
			ResourceLoaderFactory.setCurrentThreadResourceLoader(null);
			 Thread.currentThread().setContextClassLoader(oldcl);
			// MyLog.unregisterFromLogFactory();
		}
		//let the user know what went wrong
		if (issues!=null && issues.hasErrors())
		{
			String errors ="";
			for ( MWEDiagnostic error : issues.getErrors()) {
				errors += error.getMessage() + "\n";
			}
			MessageDialog.openInformation(new Shell(Display.getCurrent()), "",
					"Errors: "+errors );
		}
		
		return graphmodel;
	}

	/**
	 * adds a workflow file to the list of recently run workflows
	 * 
	 * @param workflowFile
	 *            the workflow to be added
	 */
	private void addRecentWorkflowFile(IFile workflowFile) {
		// only add it if it's not yet in the list
		if (recentWorkflowIFiles.contains(workflowFile)) {
			return;
		}
		recentWorkflowIFiles.add(workflowFile);
		menuManager.add(new RecentWorkflowAction(workflowFile));
	}

	/**
	 * action used to re-run existing workflows
	 * 
	 * @author MarkusVoelter
	 */
	class RecentWorkflowAction extends Action {
		String workflow = null;
		IFile workflowIFile = null;

		public RecentWorkflowAction(String filename) {
			workflow = filename;
			setText(filename);
			setToolTipText("Rerun " + filename);
			setImageDescriptor(ImageRegistry
					.getImageDescriptorFromPlugin(ImageRegistry.WORKFLOWFILE));
		}

		public RecentWorkflowAction(IFile workflowFile) {
			workflowIFile = workflowFile;
			setText(workflowFile.getName());
			setToolTipText("Rerun " + workflowFile.getName());
			setImageDescriptor(ImageRegistry
					.getImageDescriptorFromPlugin(ImageRegistry.WORKFLOWFILE));
		}

		public void run() {
			if (workflowIFile != null)
				onRerunWorkflow(workflowIFile);
		}
	}

	/**
	 * when a recent workflow is rerun, just call the setFilenameAndRedraw
	 * method
	 * 
	 * @param recentWorkflowToBeRerun
	 */
	private void onRerunWorkflow(IFile recentWorkflowToBeRerun) {
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
		runWorkflowAction
				.setToolTipText("Run a workflow that creates a GraphMM model");
		runWorkflowAction.setImageDescriptor(ImageRegistry
				.getImageDescriptorFromPlugin(ImageRegistry.WORKFLOWFILE));

		refreshCurrentWorkflowAction = new Action() {
			public void run() {
				onRefreshCurrentWorkflow();
			}

		};
		refreshCurrentWorkflowAction.setText("Rerun current workflow");
		refreshCurrentWorkflowAction.setToolTipText("Rerun current workflow");
		refreshCurrentWorkflowAction.setImageDescriptor(ImageRegistry
				.getImageDescriptorFromPlugin(ImageRegistry.REFRESH));
	}

	/**
	 * reruns the currently active workflow
	 */
	private void onRefreshCurrentWorkflow() {
		if (currentWorkflowFile != null)
			setFilenameAndRedraw(currentWorkflowFile);
	}

	/**
	 * runs a new workflow - opens a file dialog for the current workspace to
	 * let the user select the file to run
	 */
	private void onRunNewWorkflow() {
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
				new Shell(Display.getCurrent()), new WorkbenchLabelProvider(),
				new WorkbenchContentProvider());
		dialog.setTitle("select a workflow-file");
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				if (element instanceof IFile
						&& !((IFile) element).getFileExtension()
								.equalsIgnoreCase("mwe"))
					return false;
				return true;
			}

		});
		IFile selected = null;
		if (dialog.open() == Window.OK) {
			Object[] selection = ((ElementTreeSelectionDialog) dialog)
					.getResult();
			if (selection.length > 0)
				if (selection[0] instanceof IFile)
					selected = (IFile) selection[0];
				else {
					MessageDialog.openInformation(new Shell(Display
							.getCurrent()), "", "no MWE-Workflow selected");
				}
		}
		if (selected != null) {
			setFilenameAndRedraw(selected);
		}
	}
}