package org.openarchitectureware.vis.zest.viewer.views.breadcrumb;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.openarchitectureware.vis.zest.builder.GraphMMModelWrapper;

public class GraphLabelProvider extends ColumnLabelProvider{

	private final GraphMMModelWrapper model;
	
	public GraphLabelProvider(EObject graphmmModel)
	{
		this.model = new GraphMMModelWrapper(graphmmModel);
	}
	@Override
	public String getText(final Object element) {
		EObject nodeElement = (EObject)element;
		
		if (model.isGraphCollection(nodeElement))
			return "TopNode";
		
		if (model.isProlog(nodeElement))
			return "Prolog";
		
		if(GraphMMModelWrapper.isContainerNode(nodeElement))
			return model.getNodeOrEdgeLabel(nodeElement);

		if (model.isNode(nodeElement))
			return model.getNodeOrEdgeLabel(nodeElement);
		
		if (model.isGraph(nodeElement))
			return model.getGraphName(nodeElement);
		
		return nodeElement.toString();
	}
}
