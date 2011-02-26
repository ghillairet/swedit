/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.swedit.turtle.turtle.ObjectList;
import org.eclipselabs.swedit.turtle.turtle.PredicateObjectList;
import org.eclipselabs.swedit.turtle.turtle.TurtlePackage;
import org.eclipselabs.swedit.turtle.turtle.Verb;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Object List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.impl.PredicateObjectListImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.impl.PredicateObjectListImpl#getObjectList <em>Object List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PredicateObjectListImpl extends MinimalEObjectImpl.Container implements PredicateObjectList
{
  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected Verb predicate;

  /**
   * The cached value of the '{@link #getObjectList() <em>Object List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectList()
   * @generated
   * @ordered
   */
  protected EList<ObjectList> objectList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredicateObjectListImpl()
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
    return TurtlePackage.Literals.PREDICATE_OBJECT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verb getPredicate()
  {
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredicate(Verb newPredicate, NotificationChain msgs)
  {
    Verb oldPredicate = predicate;
    predicate = newPredicate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE, oldPredicate, newPredicate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredicate(Verb newPredicate)
  {
    if (newPredicate != predicate)
    {
      NotificationChain msgs = null;
      if (predicate != null)
        msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE, null, msgs);
      if (newPredicate != null)
        msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE, null, msgs);
      msgs = basicSetPredicate(newPredicate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE, newPredicate, newPredicate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ObjectList> getObjectList()
  {
    if (objectList == null)
    {
      objectList = new EObjectContainmentEList<ObjectList>(ObjectList.class, this, TurtlePackage.PREDICATE_OBJECT_LIST__OBJECT_LIST);
    }
    return objectList;
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
      case TurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE:
        return basicSetPredicate(null, msgs);
      case TurtlePackage.PREDICATE_OBJECT_LIST__OBJECT_LIST:
        return ((InternalEList<?>)getObjectList()).basicRemove(otherEnd, msgs);
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
      case TurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE:
        return getPredicate();
      case TurtlePackage.PREDICATE_OBJECT_LIST__OBJECT_LIST:
        return getObjectList();
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
      case TurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE:
        setPredicate((Verb)newValue);
        return;
      case TurtlePackage.PREDICATE_OBJECT_LIST__OBJECT_LIST:
        getObjectList().clear();
        getObjectList().addAll((Collection<? extends ObjectList>)newValue);
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
      case TurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE:
        setPredicate((Verb)null);
        return;
      case TurtlePackage.PREDICATE_OBJECT_LIST__OBJECT_LIST:
        getObjectList().clear();
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
      case TurtlePackage.PREDICATE_OBJECT_LIST__PREDICATE:
        return predicate != null;
      case TurtlePackage.PREDICATE_OBJECT_LIST__OBJECT_LIST:
        return objectList != null && !objectList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PredicateObjectListImpl
