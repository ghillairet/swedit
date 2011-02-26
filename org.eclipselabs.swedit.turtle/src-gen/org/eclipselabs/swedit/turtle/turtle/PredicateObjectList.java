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
 * A representation of the model object '<em><b>Predicate Object List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.PredicateObjectList#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.PredicateObjectList#getObjectList <em>Object List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getPredicateObjectList()
 * @model
 * @generated
 */
public interface PredicateObjectList extends EObject
{
  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(Verb)
   * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getPredicateObjectList_Predicate()
   * @model containment="true"
   * @generated
   */
  Verb getPredicate();

  /**
   * Sets the value of the '{@link org.eclipselabs.swedit.turtle.turtle.PredicateObjectList#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(Verb value);

  /**
   * Returns the value of the '<em><b>Object List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.swedit.turtle.turtle.ObjectList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object List</em>' containment reference list.
   * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getPredicateObjectList_ObjectList()
   * @model containment="true"
   * @generated
   */
  EList<ObjectList> getObjectList();

} // PredicateObjectList
