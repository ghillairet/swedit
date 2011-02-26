/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blank Node Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.BlankNodeContent#getPredicateObjectList <em>Predicate Object List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getBlankNodeContent()
 * @model
 * @generated
 */
public interface BlankNodeContent extends Blank
{
  /**
   * Returns the value of the '<em><b>Predicate Object List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.swedit.turtle.turtle.PredicateObjectList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate Object List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate Object List</em>' containment reference list.
   * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getBlankNodeContent_PredicateObjectList()
   * @model containment="true"
   * @generated
   */
  EList<PredicateObjectList> getPredicateObjectList();

} // BlankNodeContent
