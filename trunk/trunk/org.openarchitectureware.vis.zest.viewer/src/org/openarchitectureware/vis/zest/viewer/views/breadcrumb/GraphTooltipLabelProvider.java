package org.openarchitectureware.vis.zest.viewer.views.breadcrumb;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProvider;
import org.openarchitectureware.vis.zest.builder.GraphMMModelWrapper;

public class GraphTooltipLabelProvider extends LabelProvider {
	private final GraphMMModelWrapper model;

	public GraphTooltipLabelProvider(EObject graphmmModel) {
		this.model = new GraphMMModelWrapper(graphmmModel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		EObject nodeElement = (EObject) element;

		if (model.isGraphCollection(nodeElement))
			return "TopNode";

		if(GraphMMModelWrapper.isContainerNode(nodeElement))
			return model.getNodeOrEdgeLabel(nodeElement);

		if (model.isNode(nodeElement))
			return model.getNodeOrEdgeLabel(nodeElement);

		return model.getGraphName(nodeElement);
	}
}
