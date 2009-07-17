package org.openarchitectureware.vis.graphviz;

public class UidUtil {

	private static int uid = 0;
	
	public static String newUid( Object o ) {
		return new Integer(uid++).toString();
	}
	
}
