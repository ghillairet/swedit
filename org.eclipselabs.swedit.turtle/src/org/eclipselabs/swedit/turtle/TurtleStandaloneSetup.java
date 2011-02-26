
package org.eclipselabs.swedit.turtle;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TurtleStandaloneSetup extends TurtleStandaloneSetupGenerated{

	public static void doSetup() {
		new TurtleStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

