package org.openarchitectureware.vis.zest.builder;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public class NodeData {

	private String category;
	private String              sourceLocation;
	private Map<String, String> userData;
	private EObject modelNode;
	
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

   public String getSourceLocation()
   {
      return sourceLocation;
   }

   public void setSourceLocation(String sourceLoaction)
   {
      this.sourceLocation = sourceLoaction;
   }

	public EObject getModelNode() {
		return modelNode;
	}
	
	public void setModelNode(EObject modelNode) {
		this.modelNode = modelNode;
	}
	
}
