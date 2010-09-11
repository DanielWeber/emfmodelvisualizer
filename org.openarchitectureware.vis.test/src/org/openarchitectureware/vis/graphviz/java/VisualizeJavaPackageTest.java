package org.openarchitectureware.vis.graphviz.java;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.junit.Test;
import org.openarchitectureware.vis.CleanSrcGenDirectory;
import org.openarchitectureware.vis.Mwe2Runner;
import org.openarchitectureware.vis.graphviz.dot.a_list;

import com.google.inject.Injector;

public class VisualizeJavaPackageTest extends CleanSrcGenDirectory {

	Class classUnderTest = a_list.class;

	@Test
	public void javaPackageVisualization() {
		Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
		Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
		Map<String, String> parameters = new HashMap<String, String>();	
		parameters.put ("targetDir", "src-gen/VisualizeJavaPackageTest/");
		parameters.put ("packageName", classUnderTest.getPackage().getName());
		mweRunner.run("org.openarchitectureware.vis.graphviz.java.VisualizeJavaPackage", parameters);		
		assertTrue(new File("src-gen/VisualizeJavaPackageTest/"+classUnderTest.getPackage().getName()+".dot").exists());
		assertTrue(new File("src-gen/VisualizeJavaPackageTest/"+classUnderTest.getPackage().getName()+".gif").exists());
	}
}
