package org.openarchitectureware.vis.blockdiagram.model.view;

import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.ShapeAttributes;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;

public class SourceLocation {

		public final static String CLASSPATH_RESOURCE = "classpath:/";

		
	public static String getLocation( EObject o ) {
		String file = o.eResource().getURI().toString();
		NodeAdapter n = NodeUtil.getNodeAdapter(o);
		String result = file+","+n.getParserNode().getOffset()+","+(n.getParserNode().getOffset()+n.getParserNode().getLength());
		return result;
	}

	public static String getLocation( EObject o, String projectResource ) {
		String file = o.eResource().getURI().toString();
		if ( file.toLowerCase().startsWith(CLASSPATH_RESOURCE)) {
			file = projectResource + file.substring(CLASSPATH_RESOURCE.length());			
		}
		NodeAdapter n = NodeUtil.getNodeAdapter(o);
		String result = file+","+n.getParserNode().getOffset()+","+(n.getParserNode().getOffset()+n.getParserNode().getLength());
		return result;
	}	
	
	// this method is required as calling sa.setDataObject(component) from xtend directly gives an error. 
	public static ShapeAttributes setDataObject (ShapeAttributes sa, EObject o) {
		sa.setDataObject(o);	
		return sa;
	}
}