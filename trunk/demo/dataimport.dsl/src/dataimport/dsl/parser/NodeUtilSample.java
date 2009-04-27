package dataimport.dsl.parser;

import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.xtext.parser.model.NodeUtil;
import org.openarchitectureware.xtext.parser.parsetree.Node;

public class NodeUtilSample {

	public String getLocInfo(EObject modelElement) {
		Node node = NodeUtil.getNode(modelElement);
		return "Line " + node.getLine() + 
			" [" + node.getStart() +":" +node.getEnd()+"]" ;
	}
	
}





