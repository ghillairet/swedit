/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage
 * @generated
 */
public interface TurtleFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TurtleFactory eINSTANCE = org.eclipselabs.swedit.turtle.turtle.impl.TurtleFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document</em>'.
   * @generated
   */
  TurtleDocument createTurtleDocument();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Directive</em>'.
   * @generated
   */
  Directive createDirective();

  /**
   * Returns a new object of class '<em>Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix</em>'.
   * @generated
   */
  Prefix createPrefix();

  /**
   * Returns a new object of class '<em>Base</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base</em>'.
   * @generated
   */
  Base createBase();

  /**
   * Returns a new object of class '<em>Triple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Triple</em>'.
   * @generated
   */
  Triple createTriple();

  /**
   * Returns a new object of class '<em>Subject</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subject</em>'.
   * @generated
   */
  Subject createSubject();

  /**
   * Returns a new object of class '<em>Predicate Object List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Object List</em>'.
   * @generated
   */
  PredicateObjectList createPredicateObjectList();

  /**
   * Returns a new object of class '<em>Verb</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verb</em>'.
   * @generated
   */
  Verb createVerb();

  /**
   * Returns a new object of class '<em>AVerb</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AVerb</em>'.
   * @generated
   */
  AVerb createAVerb();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns a new object of class '<em>Object List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object List</em>'.
   * @generated
   */
  ObjectList createObjectList();

  /**
   * Returns a new object of class '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object</em>'.
   * @generated
   */
  Object createObject();

  /**
   * Returns a new object of class '<em>Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection</em>'.
   * @generated
   */
  Collection createCollection();

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
   * Returns a new object of class '<em>Blank</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Blank</em>'.
   * @generated
   */
  Blank createBlank();

  /**
   * Returns a new object of class '<em>Node ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node ID</em>'.
   * @generated
   */
  NodeID createNodeID();

  /**
   * Returns a new object of class '<em>Void</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Void</em>'.
   * @generated
   */
  Void createVoid();

  /**
   * Returns a new object of class '<em>Blank Node Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Blank Node Content</em>'.
   * @generated
   */
  BlankNodeContent createBlankNodeContent();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TurtlePackage getTurtlePackage();

} //TurtleFactory
