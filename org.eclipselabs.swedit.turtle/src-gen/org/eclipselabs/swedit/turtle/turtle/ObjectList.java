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
 * A representation of the model object '<em><b>Object List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.ObjectList#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getObjectList()
 * @model
 * @generated
 */
public interface ObjectList extends EObject
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.swedit.turtle.turtle.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' containment reference list.
   * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getObjectList_Object()
   * @model containment="true"
   * @generated
   */
  EList<org.eclipselabs.swedit.turtle.turtle.Object> getObject();

} // ObjectList
