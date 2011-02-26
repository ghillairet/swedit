/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.jenarules.jenaRules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesPackage
 * @generated
 */
public interface JenaRulesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JenaRulesFactory eINSTANCE = org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Jena Rule Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jena Rule Document</em>'.
   * @generated
   */
  JenaRuleDocument createJenaRuleDocument();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix</em>'.
   * @generated
   */
  Prefix createPrefix();

  /**
   * Returns a new object of class '<em>Bare Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bare Rule</em>'.
   * @generated
   */
  BareRule createBareRule();

  /**
   * Returns a new object of class '<em>Forward Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Forward Rule</em>'.
   * @generated
   */
  ForwardRule createForwardRule();

  /**
   * Returns a new object of class '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term</em>'.
   * @generated
   */
  Term createTerm();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>BH Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BH Term</em>'.
   * @generated
   */
  BHTerm createBHTerm();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>URI Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>URI Ref</em>'.
   * @generated
   */
  URIRef createURIRef();

  /**
   * Returns a new object of class '<em>QName</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QName</em>'.
   * @generated
   */
  QName createQName();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>Integer Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Value</em>'.
   * @generated
   */
  IntegerValue createIntegerValue();

  /**
   * Returns a new object of class '<em>RDF Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RDF Tag</em>'.
   * @generated
   */
  RDFTag createRDFTag();

  /**
   * Returns a new object of class '<em>Type Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Tag</em>'.
   * @generated
   */
  TypeTag createTypeTag();

  /**
   * Returns a new object of class '<em>Lang Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lang Tag</em>'.
   * @generated
   */
  LangTag createLangTag();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JenaRulesPackage getJenaRulesPackage();

} //JenaRulesFactory
