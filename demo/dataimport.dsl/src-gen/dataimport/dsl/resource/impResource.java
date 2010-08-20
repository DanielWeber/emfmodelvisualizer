package dataimport.dsl.resource;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;
import org.openarchitectureware.xtext.parser.IXtextParser;
import org.openarchitectureware.xtext.resource.AbstractXtextResource;

import dataimport.dsl.parser.XtextParser;

public class impResource extends AbstractXtextResource {
	public impResource(URI uri) {
		super(uri);
		setFormattingExtension("dataimport::dsl::Formatting");
		setResourceLoader(new ResourceLoaderImpl(XtextParser.class.getClassLoader()));
	}

	@Override
	protected IXtextParser createParser(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

}

