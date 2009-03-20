package org.openarchitectureware.vis.zest.viewer.views;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.zest.core.widgets.Graph;

public class TabItemData {

	private int layoutIndex;
	private Graph graph;
	private EObject graphModel;
	private Set<String> checkedFilters;

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
	
	public EObject getGraphModel() {
		return graphModel;
	}
	public void setGraphModel(EObject graphModel) {
		this.graphModel = graphModel;
	}
	
	public Set<String> getCheckedFilters() {
		return checkedFilters;
	}
	
	public void setCheckedFilters( Set<String> filters) {
		checkedFilters = filters;
	}
	
	

}
