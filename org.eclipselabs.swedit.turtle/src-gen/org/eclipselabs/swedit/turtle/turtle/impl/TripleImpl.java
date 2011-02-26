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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.swedit.turtle.turtle.PredicateObjectList;
import org.eclipselabs.swedit.turtle.turtle.Subject;
import org.eclipselabs.swedit.turtle.turtle.Triple;
import org.eclipselabs.swedit.turtle.turtle.TurtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.impl.TripleImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.impl.TripleImpl#getPredicateObjectList <em>Predicate Object List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TripleImpl extends StatementImpl implements Triple
{
  /**
   * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
  protected Subject subject;

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
  protected TripleImpl()
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
    return TurtlePackage.Literals.TRIPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subject getSubject()
  {
    return subject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubject(Subject newSubject, NotificationChain msgs)
  {
    Subject oldSubject = subject;
    subject = newSubject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurtlePackage.TRIPLE__SUBJECT, oldSubject, newSubject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubject(Subject newSubject)
  {
    if (newSubject != subject)
    {
      NotificationChain msgs = null;
      if (subject != null)
        msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurtlePackage.TRIPLE__SUBJECT, null, msgs);
      if (newSubject != null)
        msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurtlePackage.TRIPLE__SUBJECT, null, msgs);
      msgs = basicSetSubject(newSubject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurtlePackage.TRIPLE__SUBJECT, newSubject, newSubject));
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
      predicateObjectList = new EObjectContainmentEList<PredicateObjectList>(PredicateObjectList.class, this, TurtlePackage.TRIPLE__PREDICATE_OBJECT_LIST);
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
      case TurtlePackage.TRIPLE__SUBJECT:
        return basicSetSubject(null, msgs);
      case TurtlePackage.TRIPLE__PREDICATE_OBJECT_LIST:
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
      case TurtlePackage.TRIPLE__SUBJECT:
        return getSubject();
      case TurtlePackage.TRIPLE__PREDICATE_OBJECT_LIST:
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
      case TurtlePackage.TRIPLE__SUBJECT:
        setSubject((Subject)newValue);
        return;
      case TurtlePackage.TRIPLE__PREDICATE_OBJECT_LIST:
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
      case TurtlePackage.TRIPLE__SUBJECT:
        setSubject((Subject)null);
        return;
      case TurtlePackage.TRIPLE__PREDICATE_OBJECT_LIST:
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
      case TurtlePackage.TRIPLE__SUBJECT:
        return subject != null;
      case TurtlePackage.TRIPLE__PREDICATE_OBJECT_LIST:
        return predicateObjectList != null && !predicateObjectList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TripleImpl
