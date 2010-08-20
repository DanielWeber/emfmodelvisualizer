package org.openarchitectureware.vis.zest.builder;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public class EdgeData {
	
	private String category;
	private Map<String, String> userData;
	private EObject modelEdge;
	
	/**
	 * @return Returns the modelEdge.
	 */
	public EObject getModelEdge() {
		return modelEdge;
	}

	/**
	 * @param modelEdge
	 *            The modelEdge to set.
	 */
	public void setModelEdge(EObject modelEdge) {
		this.modelEdge = modelEdge;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public Map<String, String> getUserData() {
		if ( userData == null ) userData = new HashMap<String, String>();
		return userData;
	}
	
}
