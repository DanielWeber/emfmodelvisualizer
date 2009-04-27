package dataimport.dsl.parser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.NodeUtil;
import org.openarchitectureware.xtext.parser.parsetree.Node;

public class Reader2 {

	protected ResourceSet resourceSet = new ResourceSetImpl();

	public EObject read(String fileURI) throws IOException {
		XtextParser p = new XtextParser(new FileInputStream(fileURI));
		// The parseTree Root Node
		Node rootNode = p.getRootNode();
		p.preLinking();
		p.doLinking();
		p.postLinking();
		List<ErrorMsg> parseErrors = p.getParseErrors();
		if (p.getParseErrors().size()== 0) {
			Issues listOfViolatedConstraints = p.doCheck();
		}
		return NodeUtil.getModelElement(rootNode);
	}

}