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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.swedit.jenarules.jenaRules.BareRule;
import org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage;
import org.eclipselabs.swedit.jenarules.jenaRules.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.RuleImpl#getBareRule <em>Bare Rule</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.RuleImpl#getRuleName <em>Rule Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
{
  /**
   * The cached value of the '{@link #getBareRule() <em>Bare Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBareRule()
   * @generated
   * @ordered
   */
  protected BareRule bareRule;

  /**
   * The default value of the '{@link #getRuleName() <em>Rule Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleName()
   * @generated
   * @ordered
   */
  protected static final String RULE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRuleName() <em>Rule Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleName()
   * @generated
   * @ordered
   */
  protected String ruleName = RULE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return JenaRulesPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BareRule getBareRule()
  {
    return bareRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBareRule(BareRule newBareRule, NotificationChain msgs)
  {
    BareRule oldBareRule = bareRule;
    bareRule = newBareRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JenaRulesPackage.RULE__BARE_RULE, oldBareRule, newBareRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBareRule(BareRule newBareRule)
  {
    if (newBareRule != bareRule)
    {
      NotificationChain msgs = null;
      if (bareRule != null)
        msgs = ((InternalEObject)bareRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JenaRulesPackage.RULE__BARE_RULE, null, msgs);
      if (newBareRule != null)
        msgs = ((InternalEObject)newBareRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JenaRulesPackage.RULE__BARE_RULE, null, msgs);
      msgs = basicSetBareRule(newBareRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JenaRulesPackage.RULE__BARE_RULE, newBareRule, newBareRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRuleName()
  {
    return ruleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuleName(String newRuleName)
  {
    String oldRuleName = ruleName;
    ruleName = newRuleName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JenaRulesPackage.RULE__RULE_NAME, oldRuleName, ruleName));
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
      case JenaRulesPackage.RULE__BARE_RULE:
        return basicSetBareRule(null, msgs);
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
      case JenaRulesPackage.RULE__BARE_RULE:
        return getBareRule();
      case JenaRulesPackage.RULE__RULE_NAME:
        return getRuleName();
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
      case JenaRulesPackage.RULE__BARE_RULE:
        setBareRule((BareRule)newValue);
        return;
      case JenaRulesPackage.RULE__RULE_NAME:
        setRuleName((String)newValue);
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
      case JenaRulesPackage.RULE__BARE_RULE:
        setBareRule((BareRule)null);
        return;
      case JenaRulesPackage.RULE__RULE_NAME:
        setRuleName(RULE_NAME_EDEFAULT);
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
      case JenaRulesPackage.RULE__BARE_RULE:
        return bareRule != null;
      case JenaRulesPackage.RULE__RULE_NAME:
        return RULE_NAME_EDEFAULT == null ? ruleName != null : !RULE_NAME_EDEFAULT.equals(ruleName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ruleName: ");
    result.append(ruleName);
    result.append(')');
    return result.toString();
  }

} //RuleImpl
