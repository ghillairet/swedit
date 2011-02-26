/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.TurtleDocument#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getTurtleDocument()
 * @model
 * @generated
 */
public interface TurtleDocument extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.swedit.turtle.turtle.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getTurtleDocument_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // TurtleDocument
