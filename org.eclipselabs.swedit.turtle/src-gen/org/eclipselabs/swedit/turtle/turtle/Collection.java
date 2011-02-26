/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.Collection#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends Blank
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.swedit.turtle.turtle.ObjectList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getCollection_Items()
   * @model containment="true"
   * @generated
   */
  EList<ObjectList> getItems();

} // Collection
