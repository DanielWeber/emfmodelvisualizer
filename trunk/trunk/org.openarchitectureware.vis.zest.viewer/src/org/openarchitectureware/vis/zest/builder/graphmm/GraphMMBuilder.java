package org.openarchitectureware.vis.zest.builder.graphmm;



import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.openarchitectureware.vis.zest.builder.ZestModelBuiler;

public class GraphMMBuilder implements ZestModelBuiler {
	
	private GraphMMModelWrapper model = null;
	private Graph graph = null;
	private Map<EObject, GraphNode> nodeMap = null;

	public GraphMMBuilder(EObject graphmmModel) {
		this.model = new GraphMMModelWrapper(graphmmModel);
	}
	
	@Override
	public Graph constructGraph( Composite parent ) {
		nodeMap = new HashMap<EObject, GraphNode>();
		EObject firstgraph = model.getFirstGraph();
		this.graph = new Graph(parent, SWT.NONE);
		for (EObject node : model.getNodes(firstgraph)) {
			System.err.println(model.getLabel( node ));
			GraphNode n = new GraphNode(graph, SWT.NONE, model.getLabel( node ));
			nodeMap.put( node , n);
		}
		for (EObject edge : model.getEdges(firstgraph)) {
			EObject sourceNode = model.getEdgeSource( edge );
			EObject targetNode = model.getEdgeTarget( edge );
			new GraphConnection( graph, SWT.NONE, nodeMap.get(sourceNode), nodeMap.get(targetNode));
		}
		return graph;
	}

	
	
}
