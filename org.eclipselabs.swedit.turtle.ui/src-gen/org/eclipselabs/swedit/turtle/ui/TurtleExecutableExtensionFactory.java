
/*
 * generated by Xtext
 */
 
package org.eclipselabs.swedit.turtle.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class TurtleExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.eclipselabs.swedit.turtle.ui.internal.TurtleActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.eclipselabs.swedit.turtle.ui.internal.TurtleActivator.getInstance().getInjector("org.eclipselabs.swedit.turtle.Turtle");
	}
	
}
