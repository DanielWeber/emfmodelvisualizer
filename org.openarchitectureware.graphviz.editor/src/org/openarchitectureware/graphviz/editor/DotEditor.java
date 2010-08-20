package org.openarchitectureware.graphviz.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import org.openarchitectureware.graphviz.DotEditorPlugin;

public class DotEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return DotEditorPlugin.getDefault();
   }
}
