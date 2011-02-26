/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.swedit.turtle.turtle.LangTag;
import org.eclipselabs.swedit.turtle.turtle.TurtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lang Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.swedit.turtle.turtle.impl.LangTagImpl#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LangTagImpl extends RDFTagImpl implements LangTag
{
  /**
   * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected static final String LANG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected String lang = LANG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LangTagImpl()
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
    return TurtlePackage.Literals.LANG_TAG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLang()
  {
    return lang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLang(String newLang)
  {
    String oldLang = lang;
    lang = newLang;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurtlePackage.LANG_TAG__LANG, oldLang, lang));
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
      case TurtlePackage.LANG_TAG__LANG:
        return getLang();
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
      case TurtlePackage.LANG_TAG__LANG:
        setLang((String)newValue);
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
      case TurtlePackage.LANG_TAG__LANG:
        setLang(LANG_EDEFAULT);
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
      case TurtlePackage.LANG_TAG__LANG:
        return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
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
    result.append(" (lang: ");
    result.append(lang);
    result.append(')');
    return result.toString();
  }

} //LangTagImpl
