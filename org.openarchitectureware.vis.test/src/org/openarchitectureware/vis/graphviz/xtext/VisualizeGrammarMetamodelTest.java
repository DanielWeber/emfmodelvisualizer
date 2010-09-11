package org.openarchitectureware.vis.graphviz.xtext;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.junit.Test;
import org.openarchitectureware.vis.CleanSrcGenDirectory;
import org.openarchitectureware.vis.Mwe2Runner;

import com.google.inject.Injector;

public class VisualizeGrammarMetamodelTest extends CleanSrcGenDirectory {

	@Test
	public void ecoreEcoreVisualization() {
		Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
		Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
		Map<String, String> parameters = new HashMap<String, String>();	
		parameters.put ("targetDir", "src-gen/VisualizeGrammarMetamodel/");
		mweRunner.run("org.openarchitectureware.vis.graphviz.xtext.VisualizeGrammarMetamodel", parameters);
		
		assertTrue(new File("src-gen/VisualizeGrammarMetamodel/xtext.dot").exists());
		assertTrue(new File("src-gen/VisualizeGrammarMetamodel/xtext.gif").exists());
	}
}
