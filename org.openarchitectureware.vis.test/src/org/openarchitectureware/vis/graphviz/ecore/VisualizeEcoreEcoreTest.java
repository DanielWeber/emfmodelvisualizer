package org.openarchitectureware.vis.graphviz.ecore;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.junit.Test;

import com.google.inject.Injector;

public class VisualizeEcoreEcoreTest {

	@Test
	public void ecoreEcoreVisualization() {
		Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
		Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
		Map<String, String> parameters = new HashMap<String, String>();	
		parameters.put ("targetDir", "src-gen/VisualizeEcoreEcore/");
		mweRunner.run("org.openarchitectureware.vis.graphviz.ecore.VisualizeEcoreEcore", parameters);
		
		assertTrue(new File("src-gen/VisualizeEcoreEcore/ecore.dot").exists());
		assertTrue(new File("src-gen/VisualizeEcoreEcore/ecore.gif").exists());
	}
}
