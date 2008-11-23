package org.openarchitectureware.vis.zest.builder.graphmm;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.openarchitectureware.vis.zest.builder.ZestModelBuiler;
import org.osgi.framework.Bundle;

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
			GraphNode n = null;
			String icon = model.getIcon( node );
			if ( icon != null ) {
				try {
					ImageDescriptor desc = ImageDescriptor.createFromURL(new URL(icon));
					Image i = desc.createImage();				
					n = new GraphNode(graph, SWT.NONE, model.getLabel( node ), i);
				} catch (MalformedURLException e) {
					e.printStackTrace();
					n = new GraphNode(graph, SWT.NONE, model.getLabel( node ));
				}
			} else {
				n = new GraphNode(graph, SWT.NONE, model.getLabel( node ));
			}
			String sourceLocation = model.getSourceLocation( node );
			if ( sourceLocation != null) {
				n.setData( sourceLocation );
			}
			String tooltip = model.getTooltip( node );
			if ( tooltip != null ) {
				IFigure label = new Label(tooltip);
				n.setTooltip( label );
			}
			n.setBorderColor(model.getNodeLineColor( node ));
			n.setForegroundColor(model.getTextColor( node ));
			n.setBackgroundColor( model.getFillColor( node ) );
			nodeMap.put( node , n);
		}
		for (EObject edge : model.getEdges(firstgraph)) {
			EObject sourceNode = model.getEdgeSource( edge );
			EObject targetNode = model.getEdgeTarget( edge );
			GraphConnection c = new GraphConnection( graph, SWT.NONE, nodeMap.get(sourceNode), nodeMap.get(targetNode));
			String tooltip = model.getTooltip( edge );
			if ( tooltip != null ) {
				IFigure label = new Label(tooltip);
				c.setTooltip( label );
			}
			c.setLineColor(model.getEdgeColor( edge ));
			
		}
		return graph;
	}

	
	
}
