/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle;

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
 * @see org.eclipselabs.swedit.turtle.turtle.TurtleFactory
 * @model kind="package"
 * @generated
 */
public interface TurtlePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "turtle";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/grammars/Turtle";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "turtle";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TurtlePackage eINSTANCE = org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.TurtleDocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtleDocumentImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getTurtleDocument()
   * @generated
   */
  int TURTLE_DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURTLE_DOCUMENT__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURTLE_DOCUMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.StatementImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.DirectiveImpl <em>Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.DirectiveImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getDirective()
   * @generated
   */
  int DIRECTIVE = 2;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE__URI = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTIVE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.PrefixImpl <em>Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.PrefixImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getPrefix()
   * @generated
   */
  int PREFIX = 3;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__URI = DIRECTIVE__URI;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__NAME = DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FEATURE_COUNT = DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.BaseImpl <em>Base</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.BaseImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getBase()
   * @generated
   */
  int BASE = 4;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE__URI = DIRECTIVE__URI;

  /**
   * The number of structural features of the '<em>Base</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_FEATURE_COUNT = DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.TripleImpl <em>Triple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TripleImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getTriple()
   * @generated
   */
  int TRIPLE = 5;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIPLE__SUBJECT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Predicate Object List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIPLE__PREDICATE_OBJECT_LIST = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Triple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIPLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.SubjectImpl <em>Subject</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.SubjectImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getSubject()
   * @generated
   */
  int SUBJECT = 6;

  /**
   * The number of structural features of the '<em>Subject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.PredicateObjectListImpl <em>Predicate Object List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.PredicateObjectListImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getPredicateObjectList()
   * @generated
   */
  int PREDICATE_OBJECT_LIST = 7;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_OBJECT_LIST__PREDICATE = 0;

  /**
   * The feature id for the '<em><b>Object List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_OBJECT_LIST__OBJECT_LIST = 1;

  /**
   * The number of structural features of the '<em>Predicate Object List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_OBJECT_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.VerbImpl <em>Verb</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.VerbImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getVerb()
   * @generated
   */
  int VERB = 8;

  /**
   * The number of structural features of the '<em>Verb</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERB_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.AVerbImpl <em>AVerb</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.AVerbImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getAVerb()
   * @generated
   */
  int AVERB = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERB__NAME = VERB_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>AVerb</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERB_FEATURE_COUNT = VERB_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.ResourceImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 10;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = SUBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.ObjectListImpl <em>Object List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.ObjectListImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getObjectList()
   * @generated
   */
  int OBJECT_LIST = 11;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_LIST__OBJECT = 0;

  /**
   * The number of structural features of the '<em>Object List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.ObjectImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getObject()
   * @generated
   */
  int OBJECT = 12;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.BlankImpl <em>Blank</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.BlankImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getBlank()
   * @generated
   */
  int BLANK = 22;

  /**
   * The number of structural features of the '<em>Blank</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLANK_FEATURE_COUNT = SUBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.CollectionImpl <em>Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.CollectionImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getCollection()
   * @generated
   */
  int COLLECTION = 13;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__ITEMS = BLANK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_FEATURE_COUNT = BLANK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.LiteralImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 14;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__TAG = OBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.StringValueImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 15;

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
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.IntegerValueImpl <em>Integer Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.IntegerValueImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getIntegerValue()
   * @generated
   */
  int INTEGER_VALUE = 16;

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
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.RDFTagImpl <em>RDF Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.RDFTagImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getRDFTag()
   * @generated
   */
  int RDF_TAG = 17;

  /**
   * The number of structural features of the '<em>RDF Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RDF_TAG_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.TypeTagImpl <em>Type Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TypeTagImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getTypeTag()
   * @generated
   */
  int TYPE_TAG = 18;

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
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.LangTagImpl <em>Lang Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.LangTagImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getLangTag()
   * @generated
   */
  int LANG_TAG = 19;

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
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.URIRefImpl <em>URI Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.URIRefImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getURIRef()
   * @generated
   */
  int URI_REF = 20;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_REF__URI = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>URI Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_REF_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.QNameImpl <em>QName</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.QNameImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getQName()
   * @generated
   */
  int QNAME = 21;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__PREFIX = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME__NAME = RESOURCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>QName</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNAME_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.NodeIDImpl <em>Node ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.NodeIDImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getNodeID()
   * @generated
   */
  int NODE_ID = 23;

  /**
   * The feature id for the '<em><b>Node ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ID__NODE_ID = BLANK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ID_FEATURE_COUNT = BLANK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.VoidImpl <em>Void</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.VoidImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getVoid()
   * @generated
   */
  int VOID = 24;

  /**
   * The feature id for the '<em><b>Node ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID__NODE_ID = BLANK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Void</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_FEATURE_COUNT = BLANK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.BlankNodeContentImpl <em>Blank Node Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.swedit.turtle.turtle.impl.BlankNodeContentImpl
   * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getBlankNodeContent()
   * @generated
   */
  int BLANK_NODE_CONTENT = 25;

  /**
   * The feature id for the '<em><b>Predicate Object List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLANK_NODE_CONTENT__PREDICATE_OBJECT_LIST = BLANK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Blank Node Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLANK_NODE_CONTENT_FEATURE_COUNT = BLANK_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.TurtleDocument <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.TurtleDocument
   * @generated
   */
  EClass getTurtleDocument();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.swedit.turtle.turtle.TurtleDocument#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.TurtleDocument#getStatements()
   * @see #getTurtleDocument()
   * @generated
   */
  EReference getTurtleDocument_Statements();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Directive <em>Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Directive</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Directive
   * @generated
   */
  EClass getDirective();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.turtle.turtle.Directive#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Directive#getUri()
   * @see #getDirective()
   * @generated
   */
  EAttribute getDirective_Uri();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Prefix
   * @generated
   */
  EClass getPrefix();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.turtle.turtle.Prefix#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Prefix#getName()
   * @see #getPrefix()
   * @generated
   */
  EAttribute getPrefix_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Base <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Base
   * @generated
   */
  EClass getBase();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Triple <em>Triple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Triple</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Triple
   * @generated
   */
  EClass getTriple();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.swedit.turtle.turtle.Triple#getSubject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subject</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Triple#getSubject()
   * @see #getTriple()
   * @generated
   */
  EReference getTriple_Subject();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.swedit.turtle.turtle.Triple#getPredicateObjectList <em>Predicate Object List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Predicate Object List</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Triple#getPredicateObjectList()
   * @see #getTriple()
   * @generated
   */
  EReference getTriple_PredicateObjectList();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Subject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subject</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Subject
   * @generated
   */
  EClass getSubject();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.PredicateObjectList <em>Predicate Object List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Object List</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.PredicateObjectList
   * @generated
   */
  EClass getPredicateObjectList();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.swedit.turtle.turtle.PredicateObjectList#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.PredicateObjectList#getPredicate()
   * @see #getPredicateObjectList()
   * @generated
   */
  EReference getPredicateObjectList_Predicate();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.swedit.turtle.turtle.PredicateObjectList#getObjectList <em>Object List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object List</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.PredicateObjectList#getObjectList()
   * @see #getPredicateObjectList()
   * @generated
   */
  EReference getPredicateObjectList_ObjectList();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Verb <em>Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verb</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Verb
   * @generated
   */
  EClass getVerb();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.AVerb <em>AVerb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AVerb</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.AVerb
   * @generated
   */
  EClass getAVerb();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.turtle.turtle.AVerb#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.AVerb#getName()
   * @see #getAVerb()
   * @generated
   */
  EAttribute getAVerb_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.ObjectList <em>Object List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object List</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.ObjectList
   * @generated
   */
  EClass getObjectList();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.swedit.turtle.turtle.ObjectList#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.ObjectList#getObject()
   * @see #getObjectList()
   * @generated
   */
  EReference getObjectList_Object();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Collection
   * @generated
   */
  EClass getCollection();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.swedit.turtle.turtle.Collection#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Collection#getItems()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_Items();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.swedit.turtle.turtle.Literal#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tag</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Literal#getTag()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_Tag();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.turtle.turtle.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Value</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.IntegerValue
   * @generated
   */
  EClass getIntegerValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.turtle.turtle.IntegerValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.IntegerValue#getValue()
   * @see #getIntegerValue()
   * @generated
   */
  EAttribute getIntegerValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.RDFTag <em>RDF Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RDF Tag</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.RDFTag
   * @generated
   */
  EClass getRDFTag();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.TypeTag <em>Type Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Tag</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.TypeTag
   * @generated
   */
  EClass getTypeTag();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.swedit.turtle.turtle.TypeTag#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.TypeTag#getType()
   * @see #getTypeTag()
   * @generated
   */
  EReference getTypeTag_Type();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.LangTag <em>Lang Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lang Tag</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.LangTag
   * @generated
   */
  EClass getLangTag();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.turtle.turtle.LangTag#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.LangTag#getLang()
   * @see #getLangTag()
   * @generated
   */
  EAttribute getLangTag_Lang();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.URIRef <em>URI Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URI Ref</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.URIRef
   * @generated
   */
  EClass getURIRef();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.turtle.turtle.URIRef#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.URIRef#getUri()
   * @see #getURIRef()
   * @generated
   */
  EAttribute getURIRef_Uri();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.QName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QName</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.QName
   * @generated
   */
  EClass getQName();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.swedit.turtle.turtle.QName#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Prefix</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.QName#getPrefix()
   * @see #getQName()
   * @generated
   */
  EReference getQName_Prefix();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.turtle.turtle.QName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.QName#getName()
   * @see #getQName()
   * @generated
   */
  EAttribute getQName_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Blank <em>Blank</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Blank</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Blank
   * @generated
   */
  EClass getBlank();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.NodeID <em>Node ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node ID</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.NodeID
   * @generated
   */
  EClass getNodeID();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.turtle.turtle.NodeID#getNodeID <em>Node ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node ID</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.NodeID#getNodeID()
   * @see #getNodeID()
   * @generated
   */
  EAttribute getNodeID_NodeID();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.Void <em>Void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Void</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Void
   * @generated
   */
  EClass getVoid();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.swedit.turtle.turtle.Void#getNodeID <em>Node ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node ID</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.Void#getNodeID()
   * @see #getVoid()
   * @generated
   */
  EAttribute getVoid_NodeID();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.swedit.turtle.turtle.BlankNodeContent <em>Blank Node Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Blank Node Content</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.BlankNodeContent
   * @generated
   */
  EClass getBlankNodeContent();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.swedit.turtle.turtle.BlankNodeContent#getPredicateObjectList <em>Predicate Object List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Predicate Object List</em>'.
   * @see org.eclipselabs.swedit.turtle.turtle.BlankNodeContent#getPredicateObjectList()
   * @see #getBlankNodeContent()
   * @generated
   */
  EReference getBlankNodeContent_PredicateObjectList();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TurtleFactory getTurtleFactory();

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
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.TurtleDocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtleDocumentImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getTurtleDocument()
     * @generated
     */
    EClass TURTLE_DOCUMENT = eINSTANCE.getTurtleDocument();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TURTLE_DOCUMENT__STATEMENTS = eINSTANCE.getTurtleDocument_Statements();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.StatementImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.DirectiveImpl <em>Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.DirectiveImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getDirective()
     * @generated
     */
    EClass DIRECTIVE = eINSTANCE.getDirective();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECTIVE__URI = eINSTANCE.getDirective_Uri();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.PrefixImpl <em>Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.PrefixImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getPrefix()
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
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.BaseImpl <em>Base</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.BaseImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getBase()
     * @generated
     */
    EClass BASE = eINSTANCE.getBase();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.TripleImpl <em>Triple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TripleImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getTriple()
     * @generated
     */
    EClass TRIPLE = eINSTANCE.getTriple();

    /**
     * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIPLE__SUBJECT = eINSTANCE.getTriple_Subject();

    /**
     * The meta object literal for the '<em><b>Predicate Object List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIPLE__PREDICATE_OBJECT_LIST = eINSTANCE.getTriple_PredicateObjectList();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.SubjectImpl <em>Subject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.SubjectImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getSubject()
     * @generated
     */
    EClass SUBJECT = eINSTANCE.getSubject();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.PredicateObjectListImpl <em>Predicate Object List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.PredicateObjectListImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getPredicateObjectList()
     * @generated
     */
    EClass PREDICATE_OBJECT_LIST = eINSTANCE.getPredicateObjectList();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_OBJECT_LIST__PREDICATE = eINSTANCE.getPredicateObjectList_Predicate();

    /**
     * The meta object literal for the '<em><b>Object List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_OBJECT_LIST__OBJECT_LIST = eINSTANCE.getPredicateObjectList_ObjectList();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.VerbImpl <em>Verb</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.VerbImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getVerb()
     * @generated
     */
    EClass VERB = eINSTANCE.getVerb();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.AVerbImpl <em>AVerb</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.AVerbImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getAVerb()
     * @generated
     */
    EClass AVERB = eINSTANCE.getAVerb();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AVERB__NAME = eINSTANCE.getAVerb_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.ResourceImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.ObjectListImpl <em>Object List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.ObjectListImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getObjectList()
     * @generated
     */
    EClass OBJECT_LIST = eINSTANCE.getObjectList();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_LIST__OBJECT = eINSTANCE.getObjectList_Object();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.ObjectImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.CollectionImpl <em>Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.CollectionImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getCollection()
     * @generated
     */
    EClass COLLECTION = eINSTANCE.getCollection();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__ITEMS = eINSTANCE.getCollection_Items();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.LiteralImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getLiteral()
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
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.StringValueImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getStringValue()
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
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.IntegerValueImpl <em>Integer Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.IntegerValueImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getIntegerValue()
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
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.RDFTagImpl <em>RDF Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.RDFTagImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getRDFTag()
     * @generated
     */
    EClass RDF_TAG = eINSTANCE.getRDFTag();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.TypeTagImpl <em>Type Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TypeTagImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getTypeTag()
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
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.LangTagImpl <em>Lang Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.LangTagImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getLangTag()
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

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.URIRefImpl <em>URI Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.URIRefImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getURIRef()
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
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.QNameImpl <em>QName</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.QNameImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getQName()
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
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.BlankImpl <em>Blank</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.BlankImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getBlank()
     * @generated
     */
    EClass BLANK = eINSTANCE.getBlank();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.NodeIDImpl <em>Node ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.NodeIDImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getNodeID()
     * @generated
     */
    EClass NODE_ID = eINSTANCE.getNodeID();

    /**
     * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ID__NODE_ID = eINSTANCE.getNodeID_NodeID();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.VoidImpl <em>Void</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.VoidImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getVoid()
     * @generated
     */
    EClass VOID = eINSTANCE.getVoid();

    /**
     * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOID__NODE_ID = eINSTANCE.getVoid_NodeID();

    /**
     * The meta object literal for the '{@link org.eclipselabs.swedit.turtle.turtle.impl.BlankNodeContentImpl <em>Blank Node Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.swedit.turtle.turtle.impl.BlankNodeContentImpl
     * @see org.eclipselabs.swedit.turtle.turtle.impl.TurtlePackageImpl#getBlankNodeContent()
     * @generated
     */
    EClass BLANK_NODE_CONTENT = eINSTANCE.getBlankNodeContent();

    /**
     * The meta object literal for the '<em><b>Predicate Object List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLANK_NODE_CONTENT__PREDICATE_OBJECT_LIST = eINSTANCE.getBlankNodeContent_PredicateObjectList();

  }

} //TurtlePackage
