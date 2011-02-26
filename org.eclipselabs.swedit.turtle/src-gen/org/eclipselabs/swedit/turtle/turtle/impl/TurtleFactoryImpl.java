/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.swedit.turtle.turtle.AVerb;
import org.eclipselabs.swedit.turtle.turtle.Base;
import org.eclipselabs.swedit.turtle.turtle.Blank;
import org.eclipselabs.swedit.turtle.turtle.BlankNodeContent;
import org.eclipselabs.swedit.turtle.turtle.Collection;
import org.eclipselabs.swedit.turtle.turtle.Directive;
import org.eclipselabs.swedit.turtle.turtle.IntegerValue;
import org.eclipselabs.swedit.turtle.turtle.LangTag;
import org.eclipselabs.swedit.turtle.turtle.Literal;
import org.eclipselabs.swedit.turtle.turtle.NodeID;
import org.eclipselabs.swedit.turtle.turtle.ObjectList;
import org.eclipselabs.swedit.turtle.turtle.PredicateObjectList;
import org.eclipselabs.swedit.turtle.turtle.Prefix;
import org.eclipselabs.swedit.turtle.turtle.QName;
import org.eclipselabs.swedit.turtle.turtle.RDFTag;
import org.eclipselabs.swedit.turtle.turtle.Resource;
import org.eclipselabs.swedit.turtle.turtle.Statement;
import org.eclipselabs.swedit.turtle.turtle.StringValue;
import org.eclipselabs.swedit.turtle.turtle.Subject;
import org.eclipselabs.swedit.turtle.turtle.Triple;
import org.eclipselabs.swedit.turtle.turtle.TurtleDocument;
import org.eclipselabs.swedit.turtle.turtle.TurtleFactory;
import org.eclipselabs.swedit.turtle.turtle.TurtlePackage;
import org.eclipselabs.swedit.turtle.turtle.TypeTag;
import org.eclipselabs.swedit.turtle.turtle.URIRef;
import org.eclipselabs.swedit.turtle.turtle.Verb;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtleFactoryImpl extends EFactoryImpl implements TurtleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TurtleFactory init()
  {
    try
    {
      TurtleFactory theTurtleFactory = (TurtleFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/grammars/Turtle"); 
      if (theTurtleFactory != null)
      {
        return theTurtleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TurtleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurtleFactoryImpl()
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
      case TurtlePackage.TURTLE_DOCUMENT: return createTurtleDocument();
      case TurtlePackage.STATEMENT: return createStatement();
      case TurtlePackage.DIRECTIVE: return createDirective();
      case TurtlePackage.PREFIX: return createPrefix();
      case TurtlePackage.BASE: return createBase();
      case TurtlePackage.TRIPLE: return createTriple();
      case TurtlePackage.SUBJECT: return createSubject();
      case TurtlePackage.PREDICATE_OBJECT_LIST: return createPredicateObjectList();
      case TurtlePackage.VERB: return createVerb();
      case TurtlePackage.AVERB: return createAVerb();
      case TurtlePackage.RESOURCE: return createResource();
      case TurtlePackage.OBJECT_LIST: return createObjectList();
      case TurtlePackage.OBJECT: return createObject();
      case TurtlePackage.COLLECTION: return createCollection();
      case TurtlePackage.LITERAL: return createLiteral();
      case TurtlePackage.STRING_VALUE: return createStringValue();
      case TurtlePackage.INTEGER_VALUE: return createIntegerValue();
      case TurtlePackage.RDF_TAG: return createRDFTag();
      case TurtlePackage.TYPE_TAG: return createTypeTag();
      case TurtlePackage.LANG_TAG: return createLangTag();
      case TurtlePackage.URI_REF: return createURIRef();
      case TurtlePackage.QNAME: return createQName();
      case TurtlePackage.BLANK: return createBlank();
      case TurtlePackage.NODE_ID: return createNodeID();
      case TurtlePackage.VOID: return createVoid();
      case TurtlePackage.BLANK_NODE_CONTENT: return createBlankNodeContent();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurtleDocument createTurtleDocument()
  {
    TurtleDocumentImpl turtleDocument = new TurtleDocumentImpl();
    return turtleDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Directive createDirective()
  {
    DirectiveImpl directive = new DirectiveImpl();
    return directive;
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
  public Base createBase()
  {
    BaseImpl base = new BaseImpl();
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Triple createTriple()
  {
    TripleImpl triple = new TripleImpl();
    return triple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subject createSubject()
  {
    SubjectImpl subject = new SubjectImpl();
    return subject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateObjectList createPredicateObjectList()
  {
    PredicateObjectListImpl predicateObjectList = new PredicateObjectListImpl();
    return predicateObjectList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verb createVerb()
  {
    VerbImpl verb = new VerbImpl();
    return verb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AVerb createAVerb()
  {
    AVerbImpl aVerb = new AVerbImpl();
    return aVerb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectList createObjectList()
  {
    ObjectListImpl objectList = new ObjectListImpl();
    return objectList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipselabs.swedit.turtle.turtle.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection createCollection()
  {
    CollectionImpl collection = new CollectionImpl();
    return collection;
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
  public Blank createBlank()
  {
    BlankImpl blank = new BlankImpl();
    return blank;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeID createNodeID()
  {
    NodeIDImpl nodeID = new NodeIDImpl();
    return nodeID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipselabs.swedit.turtle.turtle.Void createVoid()
  {
    VoidImpl void_ = new VoidImpl();
    return void_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlankNodeContent createBlankNodeContent()
  {
    BlankNodeContentImpl blankNodeContent = new BlankNodeContentImpl();
    return blankNodeContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurtlePackage getTurtlePackage()
  {
    return (TurtlePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TurtlePackage getPackage()
  {
    return TurtlePackage.eINSTANCE;
  }

} //TurtleFactoryImpl
