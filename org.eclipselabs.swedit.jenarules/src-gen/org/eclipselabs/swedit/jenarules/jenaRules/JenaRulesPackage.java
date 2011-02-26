/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.jenarules.jenaRules;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRulesFactory
 * @model kind="package"
 * @generated
 */
public interface JenaRulesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jenaRules";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/swedit/jenarules/JenaRules";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jenaRules";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JenaRulesPackage eINSTANCE = org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRuleDocumentImpl <em>Jena Rule Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRuleDocumentImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getJenaRuleDocument()
   * @generated
   */
  int JENA_RULE_DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Prefixes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JENA_RULE_DOCUMENT__PREFIXES = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JENA_RULE_DOCUMENT__RULES = 1;

  /**
   * The number of structural features of the '<em>Jena Rule Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JENA_RULE_DOCUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.RuleImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getRule()
   * @generated
   */
  int RULE = 1;

  /**
   * The feature id for the '<em><b>Bare Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__BARE_RULE = 0;

  /**
   * The feature id for the '<em><b>Rule Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__RULE_NAME = 1;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.PrefixImpl <em>Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.PrefixImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getPrefix()
   * @generated
   */
  int PREFIX = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__NAME = 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__URI = 1;

  /**
   * The number of structural features of the '<em>Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.BareRuleImpl <em>Bare Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.BareRuleImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getBareRule()
   * @generated
   */
  int BARE_RULE = 3;

  /**
   * The number of structural features of the '<em>Bare Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BARE_RULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.ForwardRuleImpl <em>Forward Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.ForwardRuleImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getForwardRule()
   * @generated
   */
  int FORWARD_RULE = 4;

  /**
   * The feature id for the '<em><b>Left Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_RULE__LEFT_TERMS = BARE_RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_RULE__RIGHT_TERMS = BARE_RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Forward Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_RULE_FEATURE_COUNT = BARE_RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.BHTermImpl <em>BH Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.BHTermImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getBHTerm()
   * @generated
   */
  int BH_TERM = 7;

  /**
   * The number of structural features of the '<em>BH Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BH_TERM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.TermImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getTerm()
   * @generated
   */
  int TERM = 5;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__SUBJECT = BH_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__PREDICATE = BH_TERM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__OBJECT = BH_TERM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = BH_TERM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.NodeImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getNode()
   * @generated
   */
  int NODE = 8;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.FunctionImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NODES = NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.URIRefImpl <em>URI Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.URIRefImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getURIRef()
   * @generated
   */
  int URI_REF = 9;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_REF__URI = NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>URI Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_REF_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.QNameImpl <em>QName</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.QNameImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getQName()
   * @generated
   */
  int QNAME = 10;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__PREFIX = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__NAME = NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>QName</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.VariableImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.LiteralImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 12;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__TAG = NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.StringValueImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 13;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__TAG = LITERAL__TAG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.IntegerValueImpl <em>Integer Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.IntegerValueImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getIntegerValue()
   * @generated
   */
  int INTEGER_VALUE = 14;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE__TAG = LITERAL__TAG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.RDFTagImpl <em>RDF Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.RDFTagImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getRDFTag()
   * @generated
   */
  int RDF_TAG = 15;

  /**
   * The number of structural features of the '<em>RDF Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RDF_TAG_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.TypeTagImpl <em>Type Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.TypeTagImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getTypeTag()
   * @generated
   */
  int TYPE_TAG = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TAG__TYPE = RDF_TAG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TAG_FEATURE_COUNT = RDF_TAG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.LangTagImpl <em>Lang Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.LangTagImpl
   * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getLangTag()
   * @generated
   */
  int LANG_TAG = 17;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANG_TAG__LANG = RDF_TAG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lang Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANG_TAG_FEATURE_COUNT = RDF_TAG_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.JenaRuleDocument <em>Jena Rule Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jena Rule Document</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRuleDocument
   * @generated
   */
  EClass getJenaRuleDocument();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.swedit.jenarules.jenaRules.JenaRuleDocument#getPrefixes <em>Prefixes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefixes</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRuleDocument#getPrefixes()
   * @see #getJenaRuleDocument()
   * @generated
   */
  EReference getJenaRuleDocument_Prefixes();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.swedit.jenarules.jenaRules.JenaRuleDocument#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.JenaRuleDocument#getRules()
   * @see #getJenaRuleDocument()
   * @generated
   */
  EReference getJenaRuleDocument_Rules();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.swedit.jenarules.jenaRules.Rule#getBareRule <em>Bare Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bare Rule</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Rule#getBareRule()
   * @see #getRule()
   * @generated
   */
  EReference getRule_BareRule();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.jenarules.jenaRules.Rule#getRuleName <em>Rule Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule Name</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Rule#getRuleName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_RuleName();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Prefix
   * @generated
   */
  EClass getPrefix();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.jenarules.jenaRules.Prefix#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Prefix#getName()
   * @see #getPrefix()
   * @generated
   */
  EAttribute getPrefix_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.jenarules.jenaRules.Prefix#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Prefix#getUri()
   * @see #getPrefix()
   * @generated
   */
  EAttribute getPrefix_Uri();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.BareRule <em>Bare Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bare Rule</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.BareRule
   * @generated
   */
  EClass getBareRule();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.ForwardRule <em>Forward Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Forward Rule</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.ForwardRule
   * @generated
   */
  EClass getForwardRule();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.swedit.jenarules.jenaRules.ForwardRule#getLeftTerms <em>Left Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Left Terms</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.ForwardRule#getLeftTerms()
   * @see #getForwardRule()
   * @generated
   */
  EReference getForwardRule_LeftTerms();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.swedit.jenarules.jenaRules.ForwardRule#getRightTerms <em>Right Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Right Terms</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.ForwardRule#getRightTerms()
   * @see #getForwardRule()
   * @generated
   */
  EReference getForwardRule_RightTerms();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.swedit.jenarules.jenaRules.Term#getSubject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subject</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Term#getSubject()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Subject();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.swedit.jenarules.jenaRules.Term#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Term#getPredicate()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Predicate();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.swedit.jenarules.jenaRules.Term#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Term#getObject()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Object();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.jenarules.jenaRules.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.swedit.jenarules.jenaRules.Function#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Function#getNodes()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Nodes();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.BHTerm <em>BH Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BH Term</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.BHTerm
   * @generated
   */
  EClass getBHTerm();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.URIRef <em>URI Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URI Ref</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.URIRef
   * @generated
   */
  EClass getURIRef();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.jenarules.jenaRules.URIRef#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.URIRef#getUri()
   * @see #getURIRef()
   * @generated
   */
  EAttribute getURIRef_Uri();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.QName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QName</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.QName
   * @generated
   */
  EClass getQName();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.swedit.jenarules.jenaRules.QName#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Prefix</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.QName#getPrefix()
   * @see #getQName()
   * @generated
   */
  EReference getQName_Prefix();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.jenarules.jenaRules.QName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.QName#getName()
   * @see #getQName()
   * @generated
   */
  EAttribute getQName_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.jenarules.jenaRules.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.swedit.jenarules.jenaRules.Literal#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tag</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.Literal#getTag()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_Tag();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.jenarules.jenaRules.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Value</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.IntegerValue
   * @generated
   */
  EClass getIntegerValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.jenarules.jenaRules.IntegerValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.IntegerValue#getValue()
   * @see #getIntegerValue()
   * @generated
   */
  EAttribute getIntegerValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.RDFTag <em>RDF Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RDF Tag</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.RDFTag
   * @generated
   */
  EClass getRDFTag();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.TypeTag <em>Type Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Tag</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.TypeTag
   * @generated
   */
  EClass getTypeTag();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.swedit.jenarules.jenaRules.TypeTag#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.TypeTag#getType()
   * @see #getTypeTag()
   * @generated
   */
  EReference getTypeTag_Type();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.jenarules.jenaRules.LangTag <em>Lang Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lang Tag</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.LangTag
   * @generated
   */
  EClass getLangTag();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.jenarules.jenaRules.LangTag#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see org.eclipselabs.swedit.jenarules.jenaRules.LangTag#getLang()
   * @see #getLangTag()
   * @generated
   */
  EAttribute getLangTag_Lang();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JenaRulesFactory getJenaRulesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRuleDocumentImpl <em>Jena Rule Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRuleDocumentImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getJenaRuleDocument()
     * @generated
     */
    EClass JENA_RULE_DOCUMENT = eINSTANCE.getJenaRuleDocument();

    /**
     * The meta object literal for the '<em><b>Prefixes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JENA_RULE_DOCUMENT__PREFIXES = eINSTANCE.getJenaRuleDocument_Prefixes();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JENA_RULE_DOCUMENT__RULES = eINSTANCE.getJenaRuleDocument_Rules();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.RuleImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Bare Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__BARE_RULE = eINSTANCE.getRule_BareRule();

    /**
     * The meta object literal for the '<em><b>Rule Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__RULE_NAME = eINSTANCE.getRule_RuleName();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.PrefixImpl <em>Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.PrefixImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getPrefix()
     * @generated
     */
    EClass PREFIX = eINSTANCE.getPrefix();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX__NAME = eINSTANCE.getPrefix_Name();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX__URI = eINSTANCE.getPrefix_Uri();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.BareRuleImpl <em>Bare Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.BareRuleImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getBareRule()
     * @generated
     */
    EClass BARE_RULE = eINSTANCE.getBareRule();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.ForwardRuleImpl <em>Forward Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.ForwardRuleImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getForwardRule()
     * @generated
     */
    EClass FORWARD_RULE = eINSTANCE.getForwardRule();

    /**
     * The meta object literal for the '<em><b>Left Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORWARD_RULE__LEFT_TERMS = eINSTANCE.getForwardRule_LeftTerms();

    /**
     * The meta object literal for the '<em><b>Right Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORWARD_RULE__RIGHT_TERMS = eINSTANCE.getForwardRule_RightTerms();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.TermImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__SUBJECT = eINSTANCE.getTerm_Subject();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__PREDICATE = eINSTANCE.getTerm_Predicate();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__OBJECT = eINSTANCE.getTerm_Object();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.FunctionImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__NODES = eINSTANCE.getFunction_Nodes();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.BHTermImpl <em>BH Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.BHTermImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getBHTerm()
     * @generated
     */
    EClass BH_TERM = eINSTANCE.getBHTerm();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.NodeImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.URIRefImpl <em>URI Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.URIRefImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getURIRef()
     * @generated
     */
    EClass URI_REF = eINSTANCE.getURIRef();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI_REF__URI = eINSTANCE.getURIRef_Uri();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.QNameImpl <em>QName</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.QNameImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getQName()
     * @generated
     */
    EClass QNAME = eINSTANCE.getQName();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QNAME__PREFIX = eINSTANCE.getQName_Prefix();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QNAME__NAME = eINSTANCE.getQName_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.VariableImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.LiteralImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL__TAG = eINSTANCE.getLiteral_Tag();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.StringValueImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.IntegerValueImpl <em>Integer Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.IntegerValueImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getIntegerValue()
     * @generated
     */
    EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.RDFTagImpl <em>RDF Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.RDFTagImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getRDFTag()
     * @generated
     */
    EClass RDF_TAG = eINSTANCE.getRDFTag();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.TypeTagImpl <em>Type Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.TypeTagImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getTypeTag()
     * @generated
     */
    EClass TYPE_TAG = eINSTANCE.getTypeTag();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_TAG__TYPE = eINSTANCE.getTypeTag_Type();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.jenarules.jenaRules.impl.LangTagImpl <em>Lang Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.LangTagImpl
     * @see org.eclipselabs.swedit.jenarules.jenaRules.impl.JenaRulesPackageImpl#getLangTag()
     * @generated
     */
    EClass LANG_TAG = eINSTANCE.getLangTag();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANG_TAG__LANG = eINSTANCE.getLangTag_Lang();

  }

} //JenaRulesPackage
