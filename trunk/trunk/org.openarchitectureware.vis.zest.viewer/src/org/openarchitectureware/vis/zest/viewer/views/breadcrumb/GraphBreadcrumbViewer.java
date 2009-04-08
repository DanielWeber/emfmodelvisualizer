package org.openarchitectureware.vis.zest.viewer.views.breadcrumb;

import nu.bibi.breadcrumb.BreadcrumbViewer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.openarchitectureware.vis.zest.builder.GraphBuilder;

public class GraphBreadcrumbViewer extends BreadcrumbViewer {

	public GraphBreadcrumbViewer(Composite parent, int style, EObject graphmmModel, GraphBuilder builder) {
		super(parent, style);
		
		setContentProvider(new GraphContentProvider(graphmmModel,builder));
		setLabelProvider(new GraphLabelProvider(graphmmModel));
	}

	@Override
	protected void configureDropDownViewer(TreeViewer viewer, Object input) {
		// copy values
		viewer.setContentProvider(getContentProvider());
		viewer.setLabelProvider(getLabelProvider());
//		viewer.setComparator(getComparator());
//		viewer.setComparer(getComparer());
//		viewer.setFilters(getFilters());

		// set initial selection
		viewer.setSelection(getSelection());
	}

}
