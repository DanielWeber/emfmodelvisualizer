package org.openarchitectureware.vis.zest.builder;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphContainer;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.IContainer;
import org.eclipse.zest.core.widgets.ZestStyles;

public class GraphBuilder {
	
	private GraphMMModelWrapper model = null;
	private Map<EObject, GraphNode> nodeMap = null;
	private GraphData graphData;
	private Graph graph;

	public GraphBuilder(EObject graphmmModel) {
		this.model = new GraphMMModelWrapper(graphmmModel);
	}
	
	public Graph constructGraph( Composite parent, EObject graphNode, Collection<String> checkedCategories ) {
		nodeMap = new HashMap<EObject, GraphNode>();
		graph = new Graph(parent, SWT.NONE);
		graphData = new GraphData();
		graph.setData( graphData );
		graphData.setName( model.getGraphName( graphNode ) );
		graphData.setModelNode( graphNode );
		String suggestedLayout = model.getLayoutHint( graphNode );
		if ( suggestedLayout != null ) {
			graphData.setSuggestedLayout( suggestedLayout );
		}
		try {
			populateContainer( graph, graphNode, checkedCategories);
		} catch ( Throwable t ) {
			t.printStackTrace();
			return null;
		}
		return graph;
	}
	
	private void populateContainer( IContainer container, EObject graphNode, Collection<String> checkedCategories ) {
		for (EObject node : model.getNodes(graphNode)) {
			boolean isContainerNode = model.isContainerNode(node);
			String cat = model.getNodeOrEdgeCategory(node);
			if ( isInGraph( node, checkedCategories, cat )) {
				GraphNode zestNode = null;
				String icon = model.getNodeIcon( node );
				if ( icon != null ) {
					try {
						ImageDescriptor desc = ImageDescriptor.createFromURL(new URL(icon));
						Image i = desc.createImage();	
						zestNode = createGraphNode(container, node, isContainerNode, i);
					} catch (MalformedURLException e) {
						e.printStackTrace();
						zestNode = createGraphNode(container, node, isContainerNode, null);
					}
				} else {
					zestNode = createGraphNode(container, node, isContainerNode, null);
				}
				NodeData nodeData = new NodeData();
				zestNode.setData( nodeData );
				String sourceLocation = model.getNodeSourceLocation( node );
				if ( sourceLocation != null) {
				   nodeData.setSourceLocation(sourceLocation);
				}
				String tooltip = model.getTooltip( node );
				if ( tooltip != null ) {
					IFigure label = new Label(tooltip);
					zestNode.setTooltip( label );
				}
				zestNode.setBorderColor(model.getNodeLineColor( node ));
				zestNode.setForegroundColor(model.getNodeTextColor( node ));
				zestNode.setBackgroundColor( model.getNodeFillColor( node ) );
				Map userDataMap = model.getUserDataMap( node );
				nodeData.getUserData().putAll(userDataMap);
				nodeMap.put( node , zestNode);
				nodeData.setCategory( cat );
				if ( isContainerNode ) {
					EObject childgraph = model.getContainedGraph(node);
					if ( childgraph != null ) populateContainer( (GraphContainer)zestNode, childgraph, checkedCategories);
				}
			}
			if ( cat != null ) {
				graphData.getCategories().add( cat );
			}
		}
		for (EObject edge : model.getEdges(graphNode)) {
			EObject sourceNode = model.getEdgeSource( edge );
			EObject targetNode = model.getEdgeTarget( edge );
			String cat = model.getNodeOrEdgeCategory(edge);
			if(isEdgeInGraph(edge, checkedCategories, cat))
         {
			   int style = SWT.NONE;
            if(model.isEdgeDirected(edge))
            {
               style = ZestStyles.CONNECTIONS_DIRECTED;
            }
            GraphConnection zestConnection = new GraphConnection(graph, style, nodeMap
                  .get(sourceNode), nodeMap.get(targetNode));
            zestConnection.setHighlightColor(ColorConstants.red);
				EdgeData edgeData = new EdgeData();
				zestConnection.setData( edgeData );
				String tooltip = model.getTooltip( edge );
				if ( tooltip != null ) {
					IFigure label = new Label(tooltip);
					zestConnection.setTooltip( label );
				}
				String text = model.getNodeOrEdgeLabel( edge );
				if ( text != null ) zestConnection.setText(text); 
				String icon = model.getEdgeIcon( edge );
				if ( icon != null ) {
					try {
						ImageDescriptor desc = ImageDescriptor.createFromURL(new URL(icon));
						Image i = desc.createImage();				
						zestConnection.setImage(i);
					} catch (MalformedURLException e) {
						e.printStackTrace();
					}
				}
				zestConnection.setLineColor(model.getEdgeLineColor( edge ));
				zestConnection.setLineWidth( model.getEdgeLineWidth(edge) );
				zestConnection.setWeight( model.getEdgeLineWeight(edge) ); 
				zestConnection.setLineStyle(model.getEdgeStyle( edge ));
				edgeData.setCategory(cat);
				Map userDataMap = model.getUserDataMap( edge );
				edgeData.getUserData().putAll( userDataMap );
			}
			if ( cat != null ) {
				graphData.getCategories().add( cat );
			}
		}
	}

	/**
    * @param edge
    * @param checkedCategories
    * @param cat
    * @return
    */
   private boolean isEdgeInGraph(EObject edge, Collection<String> checkedCategories,
         String cat)
   {
      EObject source = model.getEdgeSource(edge);
      String sourceCat = model.getNodeOrEdgeCategory(source);
      if(!isInGraph(source, checkedCategories, sourceCat))
      {
         return false;
      }
      EObject target = model.getEdgeTarget(edge);
      String targetCat = model.getNodeOrEdgeCategory(target);
      if(!isInGraph(target, checkedCategories, targetCat))
      {
         return false;
      }
      if(!isInGraph(edge, checkedCategories, cat))
      {
         return false;
      }
      return true;
   }

   private GraphNode createGraphNode(IContainer container, EObject node,
         boolean isContainerNode, Image icon)
   {
		GraphNode n;
		if ( isContainerNode ) {
			n = new GraphContainer(container, SWT.NONE, model.getNodeOrEdgeLabel( node ), icon);
		} else {
			n = new GraphNode(container, SWT.NONE, model.getNodeOrEdgeLabel( node ), icon);
		}
		return n;
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
