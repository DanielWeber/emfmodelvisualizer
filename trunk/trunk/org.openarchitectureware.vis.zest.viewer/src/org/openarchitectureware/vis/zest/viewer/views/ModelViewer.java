package org.openarchitectureware.vis.zest.viewer.views;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.openarchitectureware.vis.zest.builder.graphmm.GraphMMBuilder;
import org.openarchitectureware.vis.zest.viewer.ImageRegistry;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;



public class ModelViewer extends ViewPart {

	private Action runWorkflowAction;
	private Composite parent = null;
	private Graph graph;
	private IMenuManager menuManager;
	private Set recentWorkflowFiles = new HashSet();


	public ModelViewer() {
	}

	public void createPartControl(Composite parent) {
		this.parent = parent;
		IActionBars bars = getViewSite().getActionBars();
		menuManager = bars.getMenuManager();
		fillLocalPullDown();
		setFilenameAndRedraw("de/voelter/zest/example/createModel.oaw");
	}

	private void fillLocalPullDown() {
		createActions();
		menuManager.add(runWorkflowAction);
		menuManager.add(new Separator());
	}

	private void setFilenameAndRedraw(String filename) {
		addRecentWorkflowFile( filename );
		if ( graph != null ) graph.dispose();
		Map properties = new HashMap();
		Map slotContents = new HashMap();
		WorkflowRunner runner = new WorkflowRunner();
		runner.run(filename, new NullProgressMonitor(), properties, slotContents);
		EObject graphmodel = (EObject)runner.getContext().get("graphmodel");
		graph = new GraphMMBuilder(graphmodel).constructGraph(parent);
		graph.setLayoutAlgorithm(new RadialLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
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
        	setFilenameAndRedraw(workflow);
		}
	}

	private void createActions() {
		runWorkflowAction = new Action() {
			public void run() {
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

		};
		runWorkflowAction.setText("Run Transformation Workflow...");
		runWorkflowAction.setToolTipText("Run a workflow that creates a GraphMM model");
		runWorkflowAction.setImageDescriptor(ImageRegistry.getImageDescriptorFromPlugin(ImageRegistry.WORKFLOWFILE));

		
	}
	

	public void setFocus() {
	}
}