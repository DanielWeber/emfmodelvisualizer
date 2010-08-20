package org.openarchitectureware.vis.graphviz;

public class StringConverter {

	public static String makeDotString (String s) {
		String value = s;
		if (value!=null) {
			value = value.replaceAll("\\\\", "\\\\\\\\");
			value = value.replaceAll("\"", "\\\\\"");
			value = value.replaceAll("\\}", "\\\\}");
			value = value.replaceAll("\\{", "\\\\{");
			value = value.replaceAll("\\n", "\\\\\\\\n");
			value = value.replaceAll("\\t", "\\\\\\\\t");		
			value = value.replaceAll("\\r", "\\\\\\\\r");		

		}
		return value;
	}
}
