package org.openarchitectureware.vis.zest.builder;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;

public class GraphMMBuilder {
	
	private GraphMMModelWrapper model = null;
	private Map<EObject, GraphNode> nodeMap = null;

	public GraphMMBuilder(EObject graphmmModel) {
		this.model = new GraphMMModelWrapper(graphmmModel);
	}
	
	public Graph constructGraph( Composite parent, EObject graphNode, Collection<String> checkedCategories ) {
		nodeMap = new HashMap<EObject, GraphNode>();
		Graph graph = new Graph(parent, SWT.NONE);
		GraphData graphData = new GraphData();
		graph.setData( graphData );
		graphData.setName( model.getGraphName( graphNode ) );
		graphData.setModelNode( graphNode );
		String suggestedLayout = model.getLayoutHint( graphNode );
		if ( suggestedLayout != null ) {
			graphData.setSuggestedLayout( suggestedLayout );
		}
		for (EObject node : model.getNodes(graphNode)) {
			String cat = model.getNodeOrEdgeCategory(node);
			if ( isInGraph( node, checkedCategories, cat )) {
				GraphNode n = null;
				String icon = model.getNodeIcon( node );
				if ( icon != null ) {
					try {
						ImageDescriptor desc = ImageDescriptor.createFromURL(new URL(icon));
						Image i = desc.createImage();				
						n = new GraphNode(graph, SWT.NONE, model.getNodeOrEdgeLabel( node ), i);
					} catch (MalformedURLException e) {
						e.printStackTrace();
						n = new GraphNode(graph, SWT.NONE, model.getNodeOrEdgeLabel( node ));
					}
				} else {
					n = new GraphNode(graph, SWT.NONE, model.getNodeOrEdgeLabel( node ));
				}
				NodeData nodeData = new NodeData();
				n.setData( nodeData );
				String sourceLocation = model.getNodeSourceLocation( node );
				if ( sourceLocation != null) {
					n.setData( sourceLocation );
				}
				String tooltip = model.getTooltip( node );
				if ( tooltip != null ) {
					IFigure label = new Label(tooltip);
					n.setTooltip( label );
				}
				n.setBorderColor(model.getNodeLineColor( node ));
				n.setForegroundColor(model.getNodeTextColor( node ));
				n.setBackgroundColor( model.getNodeFillColor( node ) );
				Map userDataMap = model.getUserDataMap( node );
				nodeData.getUserData().putAll(userDataMap);
				nodeMap.put( node , n);
				nodeData.setCategory( cat );
			}
			if ( cat != null ) {
				graphData.getCategories().add( cat );
			}
		}
		for (EObject edge : model.getEdges(graphNode)) {
			EObject sourceNode = model.getEdgeSource( edge );
			EObject targetNode = model.getEdgeTarget( edge );
			String cat = model.getNodeOrEdgeCategory(edge);
			if ( isInGraph(edge, checkedCategories, cat)) {
				GraphConnection c = new GraphConnection( graph, SWT.NONE, nodeMap.get(sourceNode), nodeMap.get(targetNode));
				EdgeData edgeData = new EdgeData();
				c.setData( edgeData );
				String tooltip = model.getTooltip( edge );
				if ( tooltip != null ) {
					IFigure label = new Label(tooltip);
					c.setTooltip( label );
				}
				String text = model.getNodeOrEdgeLabel( edge );
				if ( text != null ) c.setText(text); 
				String icon = model.getEdgeIcon( edge );
				if ( icon != null ) {
					try {
						ImageDescriptor desc = ImageDescriptor.createFromURL(new URL(icon));
						Image i = desc.createImage();				
						c.setImage(i);
					} catch (MalformedURLException e) {
						e.printStackTrace();
					}
				}
				c.setLineColor(model.getEdgeLineColor( edge ));
				c.setLineWidth( model.getEdgeLineWidth(edge) );
				c.setWeight( model.getEdgeLineWeight(edge) ); 
				c.setLineStyle(model.getEdgeStyle( edge ));
				if ( model.isEdgeDirected( edge ) ) {
					c.setConnectionStyle(ZestStyles.CONNECTIONS_DIRECTED);
				}
				edgeData.setCategory(cat);
				Map userDataMap = model.getUserDataMap( edge );
				edgeData.getUserData().putAll( userDataMap );
			}
			if ( cat != null ) {
				graphData.getCategories().add( cat );
			}
		}
		return graph;
	}

	private boolean isInGraph(EObject node, Collection<String> checkedCategories, String cat) {
		if ( checkedCategories == null ) return true;
		if ( cat == null ) return true;
		if ( checkedCategories.contains(cat)) return true;
		return false;
	}

	public Collection<EObject> getGraphs() {
		return model.getGraphs();
	}

	
	
}
