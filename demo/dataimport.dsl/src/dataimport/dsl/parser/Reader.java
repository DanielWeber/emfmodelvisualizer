package dataimport.dsl.parser;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class Reader {

	protected ResourceSet resourceSet = new ResourceSetImpl();

	public Resource read(String fileURI) throws IOException {
		Resource res = resourceSet.getResource(URI.createURI(fileURI), true);
		if (!res.isLoaded()) {
			res.load(Collections.EMPTY_MAP);
		}
		return res;
	}
}




