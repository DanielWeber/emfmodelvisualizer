package org.openarchitectureware.graphviz;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class DotEditorPlugin extends AbstractXtextEditorPlugin {
   private static DotEditorPlugin plugin;
   public static DotEditorPlugin getDefault() {
      return plugin;
   }

   private DotUtilities utilities = new DotUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public DotEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
}
