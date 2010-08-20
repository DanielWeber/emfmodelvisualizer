package dataimport.dsl;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class ImpEditorPlugin extends AbstractXtextEditorPlugin {
   private static ImpEditorPlugin plugin;
   public static ImpEditorPlugin getDefault() {
      return plugin;
   }

   private ImpUtilities utilities = new ImpUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public ImpEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
}
