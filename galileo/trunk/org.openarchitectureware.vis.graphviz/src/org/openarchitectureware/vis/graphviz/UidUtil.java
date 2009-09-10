package org.openarchitectureware.vis.graphviz;

public class UidUtil {

	private static int uid = 1;
	
	public static String newUid( Object o ) {
		return new Integer(uid++).toString();
	}
	
	public static String newUid( Object o, Object uniqueToken ) {
		return new Integer(uid++).toString();
	}
	
	public static String currentUid () {
		return new Integer(uid-1).toString();
	}
}
