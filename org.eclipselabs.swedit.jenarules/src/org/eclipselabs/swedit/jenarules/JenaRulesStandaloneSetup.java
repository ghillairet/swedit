
package org.eclipselabs.swedit.jenarules;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JenaRulesStandaloneSetup extends JenaRulesStandaloneSetupGenerated{

	public static void doSetup() {
		new JenaRulesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

