/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.jenarules.jenaRules.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.swedit.jenarules.jenaRules.JenaRuleDocument;
import org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage;
import org.eclipselabs.swedit.jenarules.jenaRules.Prefix;
import org.eclipselabs.swedit.jenarules.jenaRules.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jena Rule Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRuleDocumentImpl#getPrefixes <em>Prefixes</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRuleDocumentImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JenaRuleDocumentImpl extends MinimalEObjectImpl.Container implements JenaRuleDocument
{
  /**
   * The cached value of the '{@link #getPrefixes() <em>Prefixes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixes()
   * @generated
   * @ordered
   */
  protected EList<Prefix> prefixes;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JenaRuleDocumentImpl()
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
    return JenaRulesPackage.Literals.JENA_RULE_DOCUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Prefix> getPrefixes()
  {
    if (prefixes == null)
    {
      prefixes = new EObjectContainmentEList<Prefix>(Prefix.class, this, JenaRulesPackage.JENA_RULE_DOCUMENT__PREFIXES);
    }
    return prefixes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, JenaRulesPackage.JENA_RULE_DOCUMENT__RULES);
    }
    return rules;
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
      case JenaRulesPackage.JENA_RULE_DOCUMENT__PREFIXES:
        return ((InternalEList<?>)getPrefixes()).basicRemove(otherEnd, msgs);
      case JenaRulesPackage.JENA_RULE_DOCUMENT__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
      case JenaRulesPackage.JENA_RULE_DOCUMENT__PREFIXES:
        return getPrefixes();
      case JenaRulesPackage.JENA_RULE_DOCUMENT__RULES:
        return getRules();
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
      case JenaRulesPackage.JENA_RULE_DOCUMENT__PREFIXES:
        getPrefixes().clear();
        getPrefixes().addAll((Collection<? extends Prefix>)newValue);
        return;
      case JenaRulesPackage.JENA_RULE_DOCUMENT__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
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
      case JenaRulesPackage.JENA_RULE_DOCUMENT__PREFIXES:
        getPrefixes().clear();
        return;
      case JenaRulesPackage.JENA_RULE_DOCUMENT__RULES:
        getRules().clear();
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
      case JenaRulesPackage.JENA_RULE_DOCUMENT__PREFIXES:
        return prefixes != null && !prefixes.isEmpty();
      case JenaRulesPackage.JENA_RULE_DOCUMENT__RULES:
        return rules != null && !rules.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JenaRuleDocumentImpl
