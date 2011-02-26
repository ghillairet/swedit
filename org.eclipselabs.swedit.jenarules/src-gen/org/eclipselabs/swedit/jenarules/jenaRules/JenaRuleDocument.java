/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.jenarules.jenaRules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jena Rule Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.JenaRuleDocument#getPrefixes <em>Prefixes</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.JenaRuleDocument#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getJenaRuleDocument()
 * @model
 * @generated
 */
public interface JenaRuleDocument extends EObject
{
  /**
   * Returns the value of the '<em><b>Prefixes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.swedit.jenarules.jenaRules.Prefix}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefixes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefixes</em>' containment reference list.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getJenaRuleDocument_Prefixes()
   * @model containment="true"
   * @generated
   */
  EList<Prefix> getPrefixes();

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.swedit.jenarules.jenaRules.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getJenaRuleDocument_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

} // JenaRuleDocument
