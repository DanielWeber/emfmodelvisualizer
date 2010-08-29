
package org.openarchitectureware.vis.graphviz;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DotStandaloneSetup extends DotStandaloneSetupGenerated{

	public static void doSetup() {
		new DotStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

