package org.openarchitectureware.vis.graphviz.ecore;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

public class Util {

	public static String getLiteralsString (EEnum e) {
		String rv = "";
		for (EEnumLiteral l: e.getELiterals()) {
			rv += l.getName()+"\\n";
		}
		return rv;
	}
}
