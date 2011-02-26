/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.jenarules.jenaRules;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.Rule#getBareRule <em>Bare Rule</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.Rule#getRuleName <em>Rule Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Bare Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bare Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bare Rule</em>' containment reference.
   * @see #setBareRule(BareRule)
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getRule_BareRule()
   * @model containment="true"
   * @generated
   */
  BareRule getBareRule();

  /**
   * Sets the value of the '{@link org.eclipselabs.swedit.jenarules.jenaRules.Rule#getBareRule <em>Bare Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bare Rule</em>' containment reference.
   * @see #getBareRule()
   * @generated
   */
  void setBareRule(BareRule value);

  /**
   * Returns the value of the '<em><b>Rule Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Name</em>' attribute.
   * @see #setRuleName(String)
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getRule_RuleName()
   * @model
   * @generated
   */
  String getRuleName();

  /**
   * Sets the value of the '{@link org.eclipselabs.swedit.jenarules.jenaRules.Rule#getRuleName <em>Rule Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Name</em>' attribute.
   * @see #getRuleName()
   * @generated
   */
  void setRuleName(String value);

} // Rule
