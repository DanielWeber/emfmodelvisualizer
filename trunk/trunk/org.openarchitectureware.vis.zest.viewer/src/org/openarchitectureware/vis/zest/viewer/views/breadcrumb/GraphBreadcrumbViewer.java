package org.openarchitectureware.vis.zest.viewer.views.breadcrumb;

import nu.bibi.breadcrumb.BreadcrumbViewer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
/***
 * shows the model of a graph in a breadcrumb like in the JDT
 * 
 * @author bollbach
 *
 */
public class GraphBreadcrumbViewer extends BreadcrumbViewer {

	/***
	 * shows the model of a graph in a breadcrumb like in the JDT
	 * @param graphmmModel the model that is used for the graph
	 * @param builder the GraphBuilder that was used to build up the graph
	 */
	public GraphBreadcrumbViewer(Composite parent, int style, EObject graphmmModel) {
		super(parent, style);
		
		setContentProvider(new GraphContentProvider(graphmmModel));
		setLabelProvider(new GraphLabelProvider(graphmmModel));
//		setToolTipLabelProvider(new GraphTooltipLabelProvider(graphmmModel));
	}

	@Override
	protected void configureDropDownViewer(TreeViewer viewer, Object input) {
		// copy values from the instance to the viewer
		viewer.setContentProvider(getContentProvider());
		viewer.setLabelProvider(getLabelProvider());

		// set initial selection
		viewer.setSelection(getSelection());
	}

}
