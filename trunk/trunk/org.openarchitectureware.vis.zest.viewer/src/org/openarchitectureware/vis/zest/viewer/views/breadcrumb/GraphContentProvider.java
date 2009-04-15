package org.openarchitectureware.vis.zest.viewer.views.breadcrumb;

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
		if (model.isGraphCollection((EObject) parentElement))
			return model.getGraphs((EObject) parentElement).toArray();
		if (model.isGraph((EObject) parentElement))
			return model.getNodes((EObject) parentElement).toArray();
		if(GraphMMModelWrapper.isContainerNode((EObject)parentElement))
			return model.getNodes(((EObject)parentElement).eContents().get(0)).toArray();
		return ((EObject)parentElement).eContents().toArray();
	}

	public Object getParent(Object element) {
		EObject container = ((EObject)element).eContainer();
		if (container != null)
		{  //hides the graph-node of ContainerNode
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
