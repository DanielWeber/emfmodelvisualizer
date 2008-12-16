package org.openarchitectureware.vis.zest.builder;

import java.util.HashMap;
import java.util.Map;

public class EdgeData {
	
	private String category;
	private Map<String, String> userData;
	
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
