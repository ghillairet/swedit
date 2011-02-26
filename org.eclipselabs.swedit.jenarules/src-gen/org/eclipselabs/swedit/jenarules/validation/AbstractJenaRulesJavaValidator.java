package org.eclipselabs.swedit.jenarules.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class})
public class AbstractJenaRulesJavaValidator extends AbstractDeclarativeValidator {

@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage.eINSTANCE);
		return result;
	}

}
