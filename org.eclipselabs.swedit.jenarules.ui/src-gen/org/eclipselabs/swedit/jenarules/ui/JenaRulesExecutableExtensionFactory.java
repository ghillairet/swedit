
/*
 * generated by Xtext
 */
 
package org.eclipselabs.swedit.jenarules.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class JenaRulesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.eclipselabs.swedit.jenarules.ui.internal.JenaRulesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.eclipselabs.swedit.jenarules.ui.internal.JenaRulesActivator.getInstance().getInjector("org.eclipselabs.swedit.jenarules.JenaRules");
	}
	
}
