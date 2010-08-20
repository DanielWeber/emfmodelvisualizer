package dataimport.dsl.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import dataimport.dsl.ImpEditorPlugin;

public class ImpEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return ImpEditorPlugin.getDefault();
   }
}
