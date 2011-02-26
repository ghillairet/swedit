
package org.eclipselabs.swedit.jenarules;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
@SuppressWarnings("all")
public class JenaRulesStandaloneSetupGenerated implements ISetup {

	public Injector createInjectorAndDoEMFRegistration() {
		// register default ePackages
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("ecore"))
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore", new org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl());
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("xmi"))
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"xmi", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());
		if (!EPackage.Registry.INSTANCE.containsKey(org.eclipse.xtext.XtextPackage.eNS_URI))
			EPackage.Registry.INSTANCE.put(org.eclipse.xtext.XtextPackage.eNS_URI, org.eclipse.xtext.XtextPackage.eINSTANCE);

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new org.eclipselabs.swedit.jenarules.JenaRulesRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipselabs.org/swedit/jenarules/JenaRules")) {
		EPackage.Registry.INSTANCE.put("http://www.eclipselabs.org/swedit/jenarules/JenaRules", org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("rl", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("rl", serviceProvider);
		




	}
}
