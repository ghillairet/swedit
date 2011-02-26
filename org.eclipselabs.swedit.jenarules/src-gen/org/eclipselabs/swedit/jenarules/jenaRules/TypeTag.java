/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.jenarules.jenaRules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.TypeTag#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getTypeTag()
 * @model
 * @generated
 */
public interface TypeTag extends RDFTag
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(QName)
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage#getTypeTag_Type()
   * @model containment="true"
   * @generated
   */
  QName getType();

  /**
   * Sets the value of the '{@link org.eclipselabs.swedit.jenarules.jenaRules.TypeTag#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(QName value);

} // TypeTag
