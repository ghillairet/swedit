/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.Literal#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends org.eclipselabs.swedit.turtle.turtle.Object
{
  /**
   * Returns the value of the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' containment reference.
   * @see #setTag(RDFTag)
   * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getLiteral_Tag()
   * @model containment="true"
   * @generated
   */
  RDFTag getTag();

  /**
   * Sets the value of the '{@link org.eclipselabs.swedit.turtle.turtle.Literal#getTag <em>Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' containment reference.
   * @see #getTag()
   * @generated
   */
  void setTag(RDFTag value);

} // Literal
