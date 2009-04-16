package org.openarchitectureware.vis.zest.viewer.views.breadcrumb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.openarchitectureware.vis.zest.builder.GraphMMModelWrapper;

public class GraphContentProvider implements ITreeContentProvider {

	private final GraphMMModelWrapper model;
	
	public GraphContentProvider(EObject graphmmModel) {
		this.model = new GraphMMModelWrapper(graphmmModel);
	}
	public Object[] getChildren(Object parentElement) {
		if (GraphMMModelWrapper.isGraphCollection((EObject) parentElement))
		{	
			return new Object[]{};
//			TODO: To be decided if it is possible to change the root-graph
//			containerNodes=  model.getGraphs((EObject) parentElement);
//			containerNodes.toArray();
		}
		//Collection that gets filtered later on
		Collection containerNodes = new ArrayList();
		
		if (model.isGraph((EObject) parentElement))
			containerNodes =  model.getNodes((EObject) parentElement);
		if (GraphMMModelWrapper.isContainerNode((EObject) parentElement))
			containerNodes =  model.getNodes(((EObject)parentElement).eContents().get(0));
		//the nodes that match
		List resultNodes = new ArrayList();
		for (Object node : containerNodes)
		{
			if (GraphMMModelWrapper.isContainerNode((EObject) node))
				resultNodes.add(node);
		}
		return resultNodes.toArray();
	}

	public Object getParent(Object element) {
		EObject container = ((EObject)element).eContainer();
		if (container != null)
		{  
			//	hides the graph-node of ContainerNode
			if(model.isGraph(container) && container.eContainer() != null
               && GraphMMModelWrapper.isContainerNode(container.eContainer()))
					return container.eContainer();
		}
		return container;
	}

	public boolean hasChildren(Object element) {
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
