package org.openarchitectureware.vis.zest.viewer.views;

import java.util.Set;

import org.eclipse.zest.core.widgets.Graph;
import org.openarchitectureware.vis.zest.builder.GraphMMModelWrapper;
import org.openarchitectureware.vis.zest.viewer.views.breadcrumb.GraphBreadcrumbViewer;
/***
 * Holds the state of the tab and it's items.
 * 
 * @author bollbach
 *
 */
public class TabItemData {

	private int layoutIndex;
	private Graph graph;
	private GraphMMModelWrapper wrappedGraphModel;
	private Set<String> checkedFilters;
	private GraphBreadcrumbViewer breadCrumb;
    private boolean drilldownEnabled = true;


	public int getLayoutIndex() {
		return layoutIndex;
	}
	public void setLayoutId(int layoutIndex) {
		this.layoutIndex = layoutIndex;
	}
	
	public Graph getGraph() {
		return graph;
	}
	public void setGraph(Graph graph) {
		this.graph = graph;
	}
	
	public Set<String> getCheckedFilters() {
		return checkedFilters;
	}
	
	public void setCheckedFilters( Set<String> filters) {
		checkedFilters = filters;
	}
	public GraphMMModelWrapper getWrappedGraphModel() {
		return wrappedGraphModel;
	}
	public void setWrappedGraphModel(GraphMMModelWrapper wrappedGraphModel) {
		this.wrappedGraphModel = wrappedGraphModel;
	}
	public GraphBreadcrumbViewer getBreadCrumb() {
		return breadCrumb;
	}
	public void setBreadCrumb(GraphBreadcrumbViewer breadCrumb) {
		this.breadCrumb = breadCrumb;
	}
	public boolean isDrilldownEnabled() {
		return drilldownEnabled;
	}
	public void setDrilldownEnabled(boolean drilldownEnabled) {
		this.drilldownEnabled = drilldownEnabled;
	}	

}
