package org.openarchitectureware.vis.graphviz;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.junit.Test;
import org.openarchitectureware.vis.Mwe2Runner;

import com.google.inject.Injector;

public class VisualizeDotMetamodelTest {

	@Test
	public void dotMetaModelVisualization() {
		Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
		Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
		Map<String, String> parameters = new HashMap<String, String>();	
		parameters.put ("modelFile", "http://www.openarchitectureware.org/vis/graphviz/Dot");
		parameters.put ("targetDir", "src-gen/VisualizeDotMetamodel/");
		mweRunner.run("org.openarchitectureware.vis.graphviz.ecore.VisualizeEcore", parameters);
		
		assertTrue(new File("src-gen/VisualizeDotMetamodel/dot.dot").exists());
		assertTrue(new File("src-gen/VisualizeDotMetamodel/dot.gif").exists());
	}
}
