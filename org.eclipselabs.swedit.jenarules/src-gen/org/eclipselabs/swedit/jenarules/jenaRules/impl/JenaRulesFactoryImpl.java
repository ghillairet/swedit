/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.jenarules.jenaRules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.swedit.jenarules.jenaRules.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JenaRulesFactoryImpl extends EFactoryImpl implements JenaRulesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JenaRulesFactory init()
  {
    try
    {
      JenaRulesFactory theJenaRulesFactory = (JenaRulesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/swedit/jenarules/JenaRules"); 
      if (theJenaRulesFactory != null)
      {
        return theJenaRulesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JenaRulesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JenaRulesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JenaRulesPackage.JENA_RULE_DOCUMENT: return createJenaRuleDocument();
      case JenaRulesPackage.RULE: return createRule();
      case JenaRulesPackage.PREFIX: return createPrefix();
      case JenaRulesPackage.BARE_RULE: return createBareRule();
      case JenaRulesPackage.FORWARD_RULE: return createForwardRule();
      case JenaRulesPackage.TERM: return createTerm();
      case JenaRulesPackage.FUNCTION: return createFunction();
      case JenaRulesPackage.BH_TERM: return createBHTerm();
      case JenaRulesPackage.NODE: return createNode();
      case JenaRulesPackage.URI_REF: return createURIRef();
      case JenaRulesPackage.QNAME: return createQName();
      case JenaRulesPackage.VARIABLE: return createVariable();
      case JenaRulesPackage.LITERAL: return createLiteral();
      case JenaRulesPackage.STRING_VALUE: return createStringValue();
      case JenaRulesPackage.INTEGER_VALUE: return createIntegerValue();
      case JenaRulesPackage.RDF_TAG: return createRDFTag();
      case JenaRulesPackage.TYPE_TAG: return createTypeTag();
      case JenaRulesPackage.LANG_TAG: return createLangTag();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JenaRuleDocument createJenaRuleDocument()
  {
    JenaRuleDocumentImpl jenaRuleDocument = new JenaRuleDocumentImpl();
    return jenaRuleDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prefix createPrefix()
  {
    PrefixImpl prefix = new PrefixImpl();
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BareRule createBareRule()
  {
    BareRuleImpl bareRule = new BareRuleImpl();
    return bareRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForwardRule createForwardRule()
  {
    ForwardRuleImpl forwardRule = new ForwardRuleImpl();
    return forwardRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BHTerm createBHTerm()
  {
    BHTermImpl bhTerm = new BHTermImpl();
    return bhTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URIRef createURIRef()
  {
    URIRefImpl uriRef = new URIRefImpl();
    return uriRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QName createQName()
  {
    QNameImpl qName = new QNameImpl();
    return qName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValue createIntegerValue()
  {
    IntegerValueImpl integerValue = new IntegerValueImpl();
    return integerValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RDFTag createRDFTag()
  {
    RDFTagImpl rdfTag = new RDFTagImpl();
    return rdfTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeTag createTypeTag()
  {
    TypeTagImpl typeTag = new TypeTagImpl();
    return typeTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LangTag createLangTag()
  {
    LangTagImpl langTag = new LangTagImpl();
    return langTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JenaRulesPackage getJenaRulesPackage()
  {
    return (JenaRulesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JenaRulesPackage getPackage()
  {
    return JenaRulesPackage.eINSTANCE;
  }

} //JenaRulesFactoryImpl
