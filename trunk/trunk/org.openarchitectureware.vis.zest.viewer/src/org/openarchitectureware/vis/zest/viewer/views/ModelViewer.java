package org.openarchitectureware.vis.zest.viewer.views;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;



public class ModelViewer extends ViewPart {

	private Action runWorkflowAction;
	private Composite parent = null;
	private Graph graph;


	public ModelViewer() {
	}

	public void createPartControl(Composite parent) {
		this.parent = parent;
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		createGraph(parent);
	}

	private void createGraph(Composite parent) {
		if ( graph != null ) graph.dispose();
		graph = new Graph(parent, SWT.NONE);
		GraphNode n = new GraphNode(graph, SWT.NONE, "Paper");
		GraphNode n2 = new GraphNode(graph, SWT.NONE, "Rock");
		GraphNode n3 = new GraphNode(graph, SWT.NONE, "Scissors");
		new GraphConnection(graph, SWT.NONE, n, n2);
		new GraphConnection(graph, SWT.NONE, n2, n3);
		new GraphConnection(graph, SWT.NONE, n3, n);
		graph.setLayoutAlgorithm(new RadialLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
		
		
		
		
	}
	
	private void fillLocalPullDown(IMenuManager manager) {
		createActions();
		manager.add(runWorkflowAction);
		manager.add(new Separator());
	}

	private void createActions() {
		runWorkflowAction = new Action() {
			public void run() {
				String wfFile = "createModel.oaw";
				Map properties = new HashMap();
				Map slotContents = new HashMap();
				WorkflowRunner runner = new WorkflowRunner();
				runner.run(wfFile, new NullProgressMonitor(), properties, slotContents);
				EObject graphmodel = (EObject)runner.getContext().get("graphmodel");
				System.err.println(graphmodel);
				createGraph(parent);
			}
		};
		runWorkflowAction.setText("Run Transformation Workflow");
		runWorkflowAction.setToolTipText("Run a workflow that creates a GraphMM model");
		runWorkflowAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJ_FILE));
		
	}
	

	public void setFocus() {
	}
}