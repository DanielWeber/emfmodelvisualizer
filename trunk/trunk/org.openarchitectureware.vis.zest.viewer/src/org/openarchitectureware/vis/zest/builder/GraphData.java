package org.openarchitectureware.vis.zest.builder;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;

public class GraphData {

	private String name;
	private EObject modelNode;
	private Set<String> categories;
	private String suggestedLayout;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public EObject getModelNode() {
		return modelNode;
	}
	
	public void setModelNode(EObject modelNode) {
		this.modelNode = modelNode;
	}
	
	public Collection<String> getCategories() {
		if ( categories == null ) categories = new TreeSet<String>();
		return categories;
	}
	
	public String getSuggestedLayout() {
		if ( suggestedLayout == null ) suggestedLayout = "radial";
		return suggestedLayout;
	}
	
	public void setSuggestedLayout(String suggestedLayout) {
		this.suggestedLayout = suggestedLayout;
	}
	

	
}
