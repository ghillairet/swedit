/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.Triple#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.Triple#getPredicateObjectList <em>Predicate Object List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getTriple()
 * @model
 * @generated
 */
public interface Triple extends Statement
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
   * @see #setSubject(Subject)
   * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getTriple_Subject()
   * @model containment="true"
   * @generated
   */
  Subject getSubject();

  /**
   * Sets the value of the '{@link org.eclipselabs.swedit.turtle.turtle.Triple#getSubject <em>Subject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject</em>' containment reference.
   * @see #getSubject()
   * @generated
   */
  void setSubject(Subject value);

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
   * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#getTriple_PredicateObjectList()
   * @model containment="true"
   * @generated
   */
  EList<PredicateObjectList> getPredicateObjectList();

} // Triple
