/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.jenarules.jenaRules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage;
import org.eclipselabs.swedit.jenarules.jenaRules.Node;
import org.eclipselabs.swedit.jenarules.jenaRules.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.TermImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.TermImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.TermImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermImpl extends BHTermImpl implements Term
{
  /**
   * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
  protected Node subject;

  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected Node predicate;

  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected Node object;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermImpl()
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
    return JenaRulesPackage.Literals.TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getSubject()
  {
    return subject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubject(Node newSubject, NotificationChain msgs)
  {
    Node oldSubject = subject;
    subject = newSubject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JenaRulesPackage.TERM__SUBJECT, oldSubject, newSubject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubject(Node newSubject)
  {
    if (newSubject != subject)
    {
      NotificationChain msgs = null;
      if (subject != null)
        msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JenaRulesPackage.TERM__SUBJECT, null, msgs);
      if (newSubject != null)
        msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JenaRulesPackage.TERM__SUBJECT, null, msgs);
      msgs = basicSetSubject(newSubject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JenaRulesPackage.TERM__SUBJECT, newSubject, newSubject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getPredicate()
  {
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredicate(Node newPredicate, NotificationChain msgs)
  {
    Node oldPredicate = predicate;
    predicate = newPredicate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JenaRulesPackage.TERM__PREDICATE, oldPredicate, newPredicate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredicate(Node newPredicate)
  {
    if (newPredicate != predicate)
    {
      NotificationChain msgs = null;
      if (predicate != null)
        msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JenaRulesPackage.TERM__PREDICATE, null, msgs);
      if (newPredicate != null)
        msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JenaRulesPackage.TERM__PREDICATE, null, msgs);
      msgs = basicSetPredicate(newPredicate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JenaRulesPackage.TERM__PREDICATE, newPredicate, newPredicate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObject(Node newObject, NotificationChain msgs)
  {
    Node oldObject = object;
    object = newObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JenaRulesPackage.TERM__OBJECT, oldObject, newObject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(Node newObject)
  {
    if (newObject != object)
    {
      NotificationChain msgs = null;
      if (object != null)
        msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JenaRulesPackage.TERM__OBJECT, null, msgs);
      if (newObject != null)
        msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JenaRulesPackage.TERM__OBJECT, null, msgs);
      msgs = basicSetObject(newObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JenaRulesPackage.TERM__OBJECT, newObject, newObject));
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
      case JenaRulesPackage.TERM__SUBJECT:
        return basicSetSubject(null, msgs);
      case JenaRulesPackage.TERM__PREDICATE:
        return basicSetPredicate(null, msgs);
      case JenaRulesPackage.TERM__OBJECT:
        return basicSetObject(null, msgs);
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
      case JenaRulesPackage.TERM__SUBJECT:
        return getSubject();
      case JenaRulesPackage.TERM__PREDICATE:
        return getPredicate();
      case JenaRulesPackage.TERM__OBJECT:
        return getObject();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JenaRulesPackage.TERM__SUBJECT:
        setSubject((Node)newValue);
        return;
      case JenaRulesPackage.TERM__PREDICATE:
        setPredicate((Node)newValue);
        return;
      case JenaRulesPackage.TERM__OBJECT:
        setObject((Node)newValue);
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
      case JenaRulesPackage.TERM__SUBJECT:
        setSubject((Node)null);
        return;
      case JenaRulesPackage.TERM__PREDICATE:
        setPredicate((Node)null);
        return;
      case JenaRulesPackage.TERM__OBJECT:
        setObject((Node)null);
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
      case JenaRulesPackage.TERM__SUBJECT:
        return subject != null;
      case JenaRulesPackage.TERM__PREDICATE:
        return predicate != null;
      case JenaRulesPackage.TERM__OBJECT:
        return object != null;
    }
    return super.eIsSet(featureID);
  }

} //TermImpl
