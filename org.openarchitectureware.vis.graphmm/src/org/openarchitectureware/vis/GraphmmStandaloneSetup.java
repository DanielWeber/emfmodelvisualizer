
package org.openarchitectureware.vis;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GraphmmStandaloneSetup extends GraphmmStandaloneSetupGenerated{

	public static void doSetup() {
		new GraphmmStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

