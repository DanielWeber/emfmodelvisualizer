package org.openarchitectureware.vis;



public class ExtensionHelper {

	private static int uuid = 0;
	
	public static String uuid( Object o ) {
		uuid++;
		return String.valueOf(uuid);
	}
	
//	public static String location431( EObject o ) {
//		String file = o.eResource().getURI().toString();
//		try {
//			String u = FileLocator.resolve(new URL(file)).toString();
//			String rt = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toOSString();
//			Node n = NodeUtil.getNode(o);
//			String result = u+","+n.getStart()+","+n.getEnd();
//			System.err.println(result);
//			return result;
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
	
}
