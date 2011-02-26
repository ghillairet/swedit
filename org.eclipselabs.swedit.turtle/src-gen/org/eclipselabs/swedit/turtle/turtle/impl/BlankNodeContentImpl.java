/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.swedit.turtle.turtle.BlankNodeContent;
import org.eclipselabs.swedit.turtle.turtle.PredicateObjectList;
import org.eclipselabs.swedit.turtle.turtle.TurtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blank Node Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.impl.BlankNodeContentImpl#getPredicateObjectList <em>Predicate Object List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlankNodeContentImpl extends BlankImpl implements BlankNodeContent
{
  /**
   * The cached value of the '{@link #getPredicateObjectList() <em>Predicate Object List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicateObjectList()
   * @generated
   * @ordered
   */
  protected EList<PredicateObjectList> predicateObjectList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlankNodeContentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TurtlePackage.Literals.BLANK_NODE_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PredicateObjectList> getPredicateObjectList()
  {
    if (predicateObjectList == null)
    {
      predicateObjectList = new EObjectContainmentEList<PredicateObjectList>(PredicateObjectList.class, this, TurtlePackage.BLANK_NODE_CONTENT__PREDICATE_OBJECT_LIST);
    }
    return predicateObjectList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TurtlePackage.BLANK_NODE_CONTENT__PREDICATE_OBJECT_LIST:
        return ((InternalEList<?>)getPredicateObjectList()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TurtlePackage.BLANK_NODE_CONTENT__PREDICATE_OBJECT_LIST:
        return getPredicateObjectList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TurtlePackage.BLANK_NODE_CONTENT__PREDICATE_OBJECT_LIST:
        getPredicateObjectList().clear();
        getPredicateObjectList().addAll((Collection<? extends PredicateObjectList>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TurtlePackage.BLANK_NODE_CONTENT__PREDICATE_OBJECT_LIST:
        getPredicateObjectList().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TurtlePackage.BLANK_NODE_CONTENT__PREDICATE_OBJECT_LIST:
        return predicateObjectList != null && !predicateObjectList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BlankNodeContentImpl
