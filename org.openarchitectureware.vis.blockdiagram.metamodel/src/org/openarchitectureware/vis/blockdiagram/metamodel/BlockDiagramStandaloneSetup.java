
package org.openarchitectureware.vis.blockdiagram.metamodel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BlockDiagramStandaloneSetup extends BlockDiagramStandaloneSetupGenerated{

	public static void doSetup() {
		new BlockDiagramStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

