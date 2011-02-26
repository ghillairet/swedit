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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.swedit.jenarules.jenaRules.ForwardRule;
import org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage;
import org.eclipselabs.swedit.jenarules.jenaRules.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forward Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.ForwardRuleImpl#getLeftTerms <em>Left Terms</em>}</li>
 *   <li>{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.ForwardRuleImpl#getRightTerms <em>Right Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForwardRuleImpl extends BareRuleImpl implements ForwardRule
{
  /**
   * The cached value of the '{@link #getLeftTerms() <em>Left Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftTerms()
   * @generated
   * @ordered
   */
  protected EList<Term> leftTerms;

  /**
   * The cached value of the '{@link #getRightTerms() <em>Right Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightTerms()
   * @generated
   * @ordered
   */
  protected EList<Term> rightTerms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForwardRuleImpl()
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
    return JenaRulesPackage.Literals.FORWARD_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Term> getLeftTerms()
  {
    if (leftTerms == null)
    {
      leftTerms = new EObjectContainmentEList<Term>(Term.class, this, JenaRulesPackage.FORWARD_RULE__LEFT_TERMS);
    }
    return leftTerms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Term> getRightTerms()
  {
    if (rightTerms == null)
    {
      rightTerms = new EObjectContainmentEList<Term>(Term.class, this, JenaRulesPackage.FORWARD_RULE__RIGHT_TERMS);
    }
    return rightTerms;
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
      case JenaRulesPackage.FORWARD_RULE__LEFT_TERMS:
        return ((InternalEList<?>)getLeftTerms()).basicRemove(otherEnd, msgs);
      case JenaRulesPackage.FORWARD_RULE__RIGHT_TERMS:
        return ((InternalEList<?>)getRightTerms()).basicRemove(otherEnd, msgs);
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
      case JenaRulesPackage.FORWARD_RULE__LEFT_TERMS:
        return getLeftTerms();
      case JenaRulesPackage.FORWARD_RULE__RIGHT_TERMS:
        return getRightTerms();
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
      case JenaRulesPackage.FORWARD_RULE__LEFT_TERMS:
        getLeftTerms().clear();
        getLeftTerms().addAll((Collection<? extends Term>)newValue);
        return;
      case JenaRulesPackage.FORWARD_RULE__RIGHT_TERMS:
        getRightTerms().clear();
        getRightTerms().addAll((Collection<? extends Term>)newValue);
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
      case JenaRulesPackage.FORWARD_RULE__LEFT_TERMS:
        getLeftTerms().clear();
        return;
      case JenaRulesPackage.FORWARD_RULE__RIGHT_TERMS:
        getRightTerms().clear();
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
      case JenaRulesPackage.FORWARD_RULE__LEFT_TERMS:
        return leftTerms != null && !leftTerms.isEmpty();
      case JenaRulesPackage.FORWARD_RULE__RIGHT_TERMS:
        return rightTerms != null && !rightTerms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ForwardRuleImpl
