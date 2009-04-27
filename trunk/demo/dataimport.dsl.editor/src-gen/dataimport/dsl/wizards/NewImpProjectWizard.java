package dataimport.dsl.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewProjectWizard;

import dataimport.dsl.ImpEditorPlugin;

public class NewImpProjectWizard extends AbstractNewProjectWizard {

	public NewImpProjectWizard() {
		super();
		setLangName("imp");
		setGeneratorProjectName("dataimport.dsl.generator");
		setDslProjectName("dataimport.dsl");
		setFileExtension("imp");
		setPackageName("dataimport/dsl/");
	}
	
	@Override
	protected LanguageUtilities getUtilities() {
		return ImpEditorPlugin.getDefault().getUtilities();
	}
}

