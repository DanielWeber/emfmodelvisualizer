package org.openarchitectureware.vis.graphmm.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import org.openarchitectureware.vis.graphmm.GraphmmEditorPlugin;

public class GraphmmEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return GraphmmEditorPlugin.getDefault();
   }
}
