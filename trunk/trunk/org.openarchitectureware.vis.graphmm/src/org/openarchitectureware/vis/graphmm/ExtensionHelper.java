package org.openarchitectureware.vis.graphmm;

import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.xtext.parser.model.NodeUtil;
import org.openarchitectureware.xtext.parser.parsetree.Node;


public class ExtensionHelper {

	private static int uuid = 0;
	
	public static String uuid( Object o ) {
		uuid++;
		return String.valueOf(uuid);
	}
	
	public static String location431( EObject o ) {
		String file = o.eResource().getURI().toString();
		Node n = NodeUtil.getNode(o);
		String result = file+","+n.getStart()+","+n.getEnd();
		System.err.println(result);
		return result;
	}
	
}
