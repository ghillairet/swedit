/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.jenarules.jenaRules;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.ForwardRule#getLeftTerms <em>Left Terms</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.ForwardRule#getRightTerms <em>Right Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getForwardRule()
 * @model
 * @generated
 */
public interface ForwardRule extends BareRule
{
  /**
   * Returns the value of the '<em><b>Left Terms</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.swedit.jenarules.jenaRules.Term}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Terms</em>' containment reference list.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getForwardRule_LeftTerms()
   * @model containment="true"
   * @generated
   */
  EList<Term> getLeftTerms();

  /**
   * Returns the value of the '<em><b>Right Terms</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.swedit.jenarules.jenaRules.Term}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Terms</em>' containment reference list.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getForwardRule_RightTerms()
   * @model containment="true"
   * @generated
   */
  EList<Term> getRightTerms();

} // ForwardRule
