package dataimport.dsl.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.openarchitectureware.xtext.resource.IXtextResourceFactory;

public class impResourceFactory extends ResourceFactoryImpl implements IXtextResourceFactory {
	@Override
	public Resource createResource(URI uri) {
		return new impResource(uri);
	}
	
	public static void register() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("imp", new impResourceFactory());
	}
}

