
package dataimport.dsl.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewFileWizard;

import dataimport.dsl.ImpEditorPlugin;

public class NewImpFileWizard extends AbstractNewFileWizard {

	@Override
	protected LanguageUtilities getUtilities() {
		return ImpEditorPlugin.getDefault().getUtilities();
	}
}
