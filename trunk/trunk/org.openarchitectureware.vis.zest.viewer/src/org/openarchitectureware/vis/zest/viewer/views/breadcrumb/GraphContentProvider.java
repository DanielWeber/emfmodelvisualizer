package org.openarchitectureware.vis.zest.viewer.views.breadcrumb;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphContainer;
import org.eclipse.zest.core.widgets.GraphNode;
import org.openarchitectureware.vis.zest.builder.GraphBuilder;
import org.openarchitectureware.vis.zest.builder.GraphData;
import org.openarchitectureware.vis.zest.builder.GraphMMModelWrapper;

public class GraphContentProvider implements ITreeContentProvider {

	private final GraphMMModelWrapper model;
	private final GraphBuilder builder;
	
	public GraphContentProvider(EObject graphmmModel,GraphBuilder builder) {
		this.model = new GraphMMModelWrapper(graphmmModel);
		this.builder = builder;
	}
	public Object[] getChildren(Object parentElement) {
//		if (parentElement instanceof Graph)
//			return ((Graph)parentElement).getNodes().toArray();
//		if (parentElement instanceof GraphNode)
//		{
//			EObject obj = builder.getCorrespondingModelObject((GraphNode)parentElement);
//			EObject childGraph = builder.getChildGraph(obj);
//			if (childGraph!=null)
//			{
//				List<GraphNode> nodes = new ArrayList<GraphNode>();
//				for (EObject node : model.getNodes(childGraph))
//				{
//					nodes.add(builder.getCorrespondingGraphNode(node));
//				}
////				return nodes.toArray();
//				return model.getNodes(childGraph).toArray();
//			}
//			else
//			return new Object[]{};
//		}
//		if (parentElement instanceof GraphContainer)
//			return ((GraphContainer)parentElement).getNodes().toArray();
//		else return null;
//		if (model.isContainerNode((EObject) parentElement))
//			return new Object[]{model.getContainedGraph((EObject) parentElement)};
		if (builder.isGraph((EObject) parentElement))
			return model.getNodes((EObject) parentElement).toArray();
		return ((EObject)parentElement).eContents().toArray();
	}

	public Object getParent(Object element) {
//		if (element instanceof Graph)
//		{
//			EObject supergraph = builder.getContainingGraph(((GraphData)((Graph)element).getData()).getModelNode());
//			return supergraph;
//		}
//		if (element instanceof GraphNode)
//		{
//			EObject obj = model.getContainingGraphForNode(builder.getCorrespondingModelObject((GraphNode)element));
//			return obj;//builder.getContainingGraph(obj);
//		}
//		// TODO Auto-generated method stub
//		return null;
		return ((EObject)element).eContainer();
	}

	public boolean hasChildren(Object element) {
//		if (element instanceof Graph)
//			return ((Graph)element).getNodes().size() > 0;
//		if (element instanceof GraphNode)
//		{
//			EObject obj = builder.getCorrespondingModelObject((GraphNode)element);
//			EObject childGraph = builder.getChildGraph(obj);
//			if (childGraph!=null)
//			{
//				List<GraphNode> nodes = new ArrayList<GraphNode>();
//				for (EObject node : model.getNodes(childGraph))
//				{
//					nodes.add(builder.getCorrespondingGraphNode(node));
//				}
//				return nodes.size()>0;
//			}
//			else
//			return false;
//		}
//		if (element instanceof GraphContainer)
//			return ((GraphContainer)element).getNodes().size()>0;
//		else return false;
		return getChildren(element).length>0;
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

}
