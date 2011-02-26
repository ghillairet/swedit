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

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.swedit.turtle.turtle.ObjectList;
import org.eclipselabs.swedit.turtle.turtle.TurtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.impl.ObjectListImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectListImpl extends MinimalEObjectImpl.Container implements ObjectList
{
  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected EList<org.eclipselabs.swedit.turtle.turtle.Object> object;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectListImpl()
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
    return TurtlePackage.Literals.OBJECT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.eclipselabs.swedit.turtle.turtle.Object> getObject()
  {
    if (object == null)
    {
      object = new EObjectContainmentEList<org.eclipselabs.swedit.turtle.turtle.Object>(org.eclipselabs.swedit.turtle.turtle.Object.class, this, TurtlePackage.OBJECT_LIST__OBJECT);
    }
    return object;
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
      case TurtlePackage.OBJECT_LIST__OBJECT:
        return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
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
      case TurtlePackage.OBJECT_LIST__OBJECT:
        return getObject();
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
      case TurtlePackage.OBJECT_LIST__OBJECT:
        getObject().clear();
        getObject().addAll((Collection<? extends org.eclipselabs.swedit.turtle.turtle.Object>)newValue);
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
      case TurtlePackage.OBJECT_LIST__OBJECT:
        getObject().clear();
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
      case TurtlePackage.OBJECT_LIST__OBJECT:
        return object != null && !object.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ObjectListImpl
