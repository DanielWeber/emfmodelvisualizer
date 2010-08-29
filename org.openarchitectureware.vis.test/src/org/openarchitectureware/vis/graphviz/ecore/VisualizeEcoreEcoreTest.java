package org.openarchitectureware.vis.graphviz.ecore;

import java.util.HashMap;

import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.junit.Test;

import com.google.inject.Injector;

public class VisualizeEcoreEcoreTest {

	@Test
	public void ecoreEcoreVisualization() {
		Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
		Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
		mweRunner.run("org.openarchitectureware.vis.graphviz.ecore.VisualizeEcoreEcore", new HashMap<String, String>());
	}
}
