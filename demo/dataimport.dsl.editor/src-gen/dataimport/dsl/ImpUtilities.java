package dataimport.dsl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.openarchitectureware.xtext.AbstractLanguageUtilities;
import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.IXtextParser;

import dataimport.dsl.parser.XtextParser;

public class ImpUtilities extends AbstractLanguageUtilities {

	// enforce eager registration of metamodel
	private static final EPackage EPACKAGE = dataimport.dsl.MetaModelRegistration.getEPackage();
	
	@Override
	protected IXtextParser internalParse(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

	public String getFileExtension() {
		return "imp";
	}

	public EPackage getEPackage() {
		return EPACKAGE;
	}

	List<String> r = new ArrayList<String>();
	{
		r.add("String");
		r.add("record");
		r.add("records");
		r.add("ext");
		r.add("next");
		r.add("int");
		r.add("range");
		r.add("boolean");
		r.add("import");
		r.add("ref");
		r.add("persistent");
		r.add("data");
		r.add("regex");
	}
	public List<String> allKeywords() {
		return r;
	}

	protected ClassLoader getClassLoader() {
		return this.getClass().getClassLoader();
	}

	public IPartitionTokenScanner getPartitionScanner() {
		return new GeneratedPartitionScanner();
	}

	@Override
	public AbstractXtextEditorPlugin getXtextEditorPlugin() {
		return ImpEditorPlugin.getDefault();
	}
	
	@Override
	public String getPackageForExtensions() {
		return "dataimport::dsl";
	}
	
	public XtextFile getXtextFile() {
		return MetaModelRegistration.getXtextFile();
	}
	

}
