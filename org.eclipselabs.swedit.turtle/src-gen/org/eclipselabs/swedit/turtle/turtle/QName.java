/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QName</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.QName#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.QName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getQName()
 * @model
 * @generated
 */
public interface QName extends Resource
{
  /**
   * Returns the value of the '<em><b>Prefix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' reference.
   * @see #setPrefix(Prefix)
   * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getQName_Prefix()
   * @model
   * @generated
   */
  Prefix getPrefix();

  /**
   * Sets the value of the '{@link org.eclipselabs.swedit.turtle.turtle.QName#getPrefix <em>Prefix</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' reference.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(Prefix value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getQName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipselabs.swedit.turtle.turtle.QName#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // QName
