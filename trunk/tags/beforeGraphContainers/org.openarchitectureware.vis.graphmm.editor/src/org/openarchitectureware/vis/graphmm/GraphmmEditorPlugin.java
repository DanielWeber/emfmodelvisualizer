package org.openarchitectureware.vis.graphmm;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class GraphmmEditorPlugin extends AbstractXtextEditorPlugin {
   private static GraphmmEditorPlugin plugin;
   public static GraphmmEditorPlugin getDefault() {
      return plugin;
   }

   private GraphmmUtilities utilities = new GraphmmUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public GraphmmEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
}
