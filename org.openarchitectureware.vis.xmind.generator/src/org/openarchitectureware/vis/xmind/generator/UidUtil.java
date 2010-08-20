package org.openarchitectureware.vis.xmind.generator;

public class UidUtil {

	private static int uid = 0;
	
	public static String newUid( Object obj, Object ctx ) {
		return new Integer(uid++).toString();
	}
	
	public static String newUid( Object obj ) {
		return new Integer(uid++).toString();
	}
	
}
