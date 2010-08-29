package org.openarchitectureware.vis.graphviz.ecore;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.junit.Test;

import com.google.inject.Injector;

public class VisualizeEObjectTest {

	@Test
	public void eObjectVisualization() {
		Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
		Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
		EClass eclass = EcoreFactory.eINSTANCE.createEClass();
		eclass.setName ("A");
		EClass eclass2 = EcoreFactory.eINSTANCE.createEClass();
		eclass2.setName ("B");	
		EReference reference = EcoreFactory.eINSTANCE.createEReference();
		reference.setEType (eclass2);
		reference.setName ("reference");
		eclass.getEStructuralFeatures().add (reference);
		mweRunner.getWorkflowContext().put("model", eclass);
		Map<String, String> parameters = new HashMap<String, String>();	
		parameters.put ("inputSlot", "model");
		parameters.put ("targetDir", "src-gen/VisualizeEObject/");
		mweRunner.run("org.openarchitectureware.vis.graphviz.ecore.VisualizeEObject", parameters);
		
		assertTrue(new File("src-gen/VisualizeEObject/A.dot").exists());
		assertTrue(new File("src-gen/VisualizeEObject/A.gif").exists());		
	}
}
