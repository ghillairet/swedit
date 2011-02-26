/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtlePackageImpl extends EPackageImpl implements TurtlePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass turtleDocumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tripleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateObjectListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aVerbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rdfTagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeTagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass langTagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uriRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blankEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass voidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blankNodeContentEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TurtlePackageImpl()
  {
    super(eNS_URI, TurtleFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TurtlePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TurtlePackage init()
  {
    if (isInited) return (TurtlePackage)EPackage.Registry.INSTANCE.getEPackage(TurtlePackage.eNS_URI);

    // Obtain or create and register package
    TurtlePackageImpl theTurtlePackage = (TurtlePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TurtlePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TurtlePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTurtlePackage.createPackageContents();

    // Initialize created meta-data
    theTurtlePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTurtlePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TurtlePackage.eNS_URI, theTurtlePackage);
    return theTurtlePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTurtleDocument()
  {
    return turtleDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTurtleDocument_Statements()
  {
    return (EReference)turtleDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirective()
  {
    return directiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirective_Uri()
  {
    return (EAttribute)directiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefix()
  {
    return prefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefix_Name()
  {
    return (EAttribute)prefixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBase()
  {
    return baseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTriple()
  {
    return tripleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTriple_Subject()
  {
    return (EReference)tripleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTriple_PredicateObjectList()
  {
    return (EReference)tripleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubject()
  {
    return subjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateObjectList()
  {
    return predicateObjectListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateObjectList_Predicate()
  {
    return (EReference)predicateObjectListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateObjectList_ObjectList()
  {
    return (EReference)predicateObjectListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerb()
  {
    return verbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAVerb()
  {
    return aVerbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAVerb_Name()
  {
    return (EAttribute)aVerbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResource()
  {
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectList()
  {
    return objectListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectList_Object()
  {
    return (EReference)objectListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObject()
  {
    return objectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollection()
  {
    return collectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollection_Items()
  {
    return (EReference)collectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteral_Tag()
  {
    return (EReference)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringValue()
  {
    return stringValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringValue_Value()
  {
    return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerValue()
  {
    return integerValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerValue_Value()
  {
    return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRDFTag()
  {
    return rdfTagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeTag()
  {
    return typeTagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeTag_Type()
  {
    return (EReference)typeTagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLangTag()
  {
    return langTagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLangTag_Lang()
  {
    return (EAttribute)langTagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getURIRef()
  {
    return uriRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURIRef_Uri()
  {
    return (EAttribute)uriRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQName()
  {
    return qNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQName_Prefix()
  {
    return (EReference)qNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQName_Name()
  {
    return (EAttribute)qNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlank()
  {
    return blankEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeID()
  {
    return nodeIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeID_NodeID()
  {
    return (EAttribute)nodeIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVoid()
  {
    return voidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVoid_NodeID()
  {
    return (EAttribute)voidEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlankNodeContent()
  {
    return blankNodeContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlankNodeContent_PredicateObjectList()
  {
    return (EReference)blankNodeContentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurtleFactory getTurtleFactory()
  {
    return (TurtleFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    turtleDocumentEClass = createEClass(TURTLE_DOCUMENT);
    createEReference(turtleDocumentEClass, TURTLE_DOCUMENT__STATEMENTS);

    statementEClass = createEClass(STATEMENT);

    directiveEClass = createEClass(DIRECTIVE);
    createEAttribute(directiveEClass, DIRECTIVE__URI);

    prefixEClass = createEClass(PREFIX);
    createEAttribute(prefixEClass, PREFIX__NAME);

    baseEClass = createEClass(BASE);

    tripleEClass = createEClass(TRIPLE);
    createEReference(tripleEClass, TRIPLE__SUBJECT);
    createEReference(tripleEClass, TRIPLE__PREDICATE_OBJECT_LIST);

    subjectEClass = createEClass(SUBJECT);

    predicateObjectListEClass = createEClass(PREDICATE_OBJECT_LIST);
    createEReference(predicateObjectListEClass, PREDICATE_OBJECT_LIST__PREDICATE);
    createEReference(predicateObjectListEClass, PREDICATE_OBJECT_LIST__OBJECT_LIST);

    verbEClass = createEClass(VERB);

    aVerbEClass = createEClass(AVERB);
    createEAttribute(aVerbEClass, AVERB__NAME);

    resourceEClass = createEClass(RESOURCE);

    objectListEClass = createEClass(OBJECT_LIST);
    createEReference(objectListEClass, OBJECT_LIST__OBJECT);

    objectEClass = createEClass(OBJECT);

    collectionEClass = createEClass(COLLECTION);
    createEReference(collectionEClass, COLLECTION__ITEMS);

    literalEClass = createEClass(LITERAL);
    createEReference(literalEClass, LITERAL__TAG);

    stringValueEClass = createEClass(STRING_VALUE);
    createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

    integerValueEClass = createEClass(INTEGER_VALUE);
    createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

    rdfTagEClass = createEClass(RDF_TAG);

    typeTagEClass = createEClass(TYPE_TAG);
    createEReference(typeTagEClass, TYPE_TAG__TYPE);

    langTagEClass = createEClass(LANG_TAG);
    createEAttribute(langTagEClass, LANG_TAG__LANG);

    uriRefEClass = createEClass(URI_REF);
    createEAttribute(uriRefEClass, URI_REF__URI);

    qNameEClass = createEClass(QNAME);
    createEReference(qNameEClass, QNAME__PREFIX);
    createEAttribute(qNameEClass, QNAME__NAME);

    blankEClass = createEClass(BLANK);

    nodeIDEClass = createEClass(NODE_ID);
    createEAttribute(nodeIDEClass, NODE_ID__NODE_ID);

    voidEClass = createEClass(VOID);
    createEAttribute(voidEClass, VOID__NODE_ID);

    blankNodeContentEClass = createEClass(BLANK_NODE_CONTENT);
    createEReference(blankNodeContentEClass, BLANK_NODE_CONTENT__PREDICATE_OBJECT_LIST);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    directiveEClass.getESuperTypes().add(this.getStatement());
    prefixEClass.getESuperTypes().add(this.getDirective());
    baseEClass.getESuperTypes().add(this.getDirective());
    tripleEClass.getESuperTypes().add(this.getStatement());
    aVerbEClass.getESuperTypes().add(this.getVerb());
    resourceEClass.getESuperTypes().add(this.getSubject());
    resourceEClass.getESuperTypes().add(this.getVerb());
    resourceEClass.getESuperTypes().add(this.getObject());
    collectionEClass.getESuperTypes().add(this.getBlank());
    literalEClass.getESuperTypes().add(this.getObject());
    stringValueEClass.getESuperTypes().add(this.getLiteral());
    integerValueEClass.getESuperTypes().add(this.getLiteral());
    typeTagEClass.getESuperTypes().add(this.getRDFTag());
    langTagEClass.getESuperTypes().add(this.getRDFTag());
    uriRefEClass.getESuperTypes().add(this.getResource());
    qNameEClass.getESuperTypes().add(this.getResource());
    blankEClass.getESuperTypes().add(this.getSubject());
    blankEClass.getESuperTypes().add(this.getObject());
    nodeIDEClass.getESuperTypes().add(this.getBlank());
    voidEClass.getESuperTypes().add(this.getBlank());
    blankNodeContentEClass.getESuperTypes().add(this.getBlank());

    // Initialize classes and features; add operations and parameters
    initEClass(turtleDocumentEClass, TurtleDocument.class, "TurtleDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTurtleDocument_Statements(), this.getStatement(), null, "statements", null, 0, -1, TurtleDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(directiveEClass, Directive.class, "Directive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDirective_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prefixEClass, Prefix.class, "Prefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrefix_Name(), ecorePackage.getEString(), "name", null, 0, 1, Prefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(baseEClass, Base.class, "Base", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tripleEClass, Triple.class, "Triple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTriple_Subject(), this.getSubject(), null, "subject", null, 0, 1, Triple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTriple_PredicateObjectList(), this.getPredicateObjectList(), null, "predicateObjectList", null, 0, -1, Triple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subjectEClass, Subject.class, "Subject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(predicateObjectListEClass, PredicateObjectList.class, "PredicateObjectList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicateObjectList_Predicate(), this.getVerb(), null, "predicate", null, 0, 1, PredicateObjectList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicateObjectList_ObjectList(), this.getObjectList(), null, "objectList", null, 0, -1, PredicateObjectList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verbEClass, Verb.class, "Verb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(aVerbEClass, AVerb.class, "AVerb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAVerb_Name(), ecorePackage.getEString(), "name", null, 0, 1, AVerb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectListEClass, ObjectList.class, "ObjectList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectList_Object(), this.getObject(), null, "object", null, 0, -1, ObjectList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectEClass, org.eclipselabs.swedit.turtle.turtle.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionEClass, Collection.class, "Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCollection_Items(), this.getObjectList(), null, "items", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteral_Tag(), this.getRDFTag(), null, "tag", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rdfTagEClass, RDFTag.class, "RDFTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeTagEClass, TypeTag.class, "TypeTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeTag_Type(), this.getQName(), null, "type", null, 0, 1, TypeTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(langTagEClass, LangTag.class, "LangTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLangTag_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, LangTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uriRefEClass, URIRef.class, "URIRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getURIRef_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, URIRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qNameEClass, QName.class, "QName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQName_Prefix(), this.getPrefix(), null, "prefix", null, 0, 1, QName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQName_Name(), ecorePackage.getEString(), "name", null, 0, 1, QName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blankEClass, Blank.class, "Blank", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeIDEClass, NodeID.class, "NodeID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeID_NodeID(), ecorePackage.getEString(), "nodeID", null, 0, 1, NodeID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(voidEClass, org.eclipselabs.swedit.turtle.turtle.Void.class, "Void", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVoid_NodeID(), ecorePackage.getEString(), "nodeID", null, 0, 1, org.eclipselabs.swedit.turtle.turtle.Void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blankNodeContentEClass, BlankNodeContent.class, "BlankNodeContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlankNodeContent_PredicateObjectList(), this.getPredicateObjectList(), null, "predicateObjectList", null, 0, -1, BlankNodeContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TurtlePackageImpl
