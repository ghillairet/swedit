/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.jenarules.jenaRules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.Term#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.Term#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.Term#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends BHTerm
{
  /**
   * Returns the value of the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subject</em>' containment reference.
   * @see #setSubject(Node)
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getTerm_Subject()
   * @model containment="true"
   * @generated
   */
  Node getSubject();

  /**
   * Sets the value of the '{@link org.eclipselabs.swedit.jenarules.jenaRules.Term#getSubject <em>Subject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject</em>' containment reference.
   * @see #getSubject()
   * @generated
   */
  void setSubject(Node value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(Node)
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getTerm_Predicate()
   * @model containment="true"
   * @generated
   */
  Node getPredicate();

  /**
   * Sets the value of the '{@link org.eclipselabs.swedit.jenarules.jenaRules.Term#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(Node value);

  /**
   * Returns the value of the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' containment reference.
   * @see #setObject(Node)
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getTerm_Object()
   * @model containment="true"
   * @generated
   */
  Node getObject();

  /**
   * Sets the value of the '{@link org.eclipselabs.swedit.jenarules.jenaRules.Term#getObject <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' containment reference.
   * @see #getObject()
   * @generated
   */
  void setObject(Node value);

} // Term
