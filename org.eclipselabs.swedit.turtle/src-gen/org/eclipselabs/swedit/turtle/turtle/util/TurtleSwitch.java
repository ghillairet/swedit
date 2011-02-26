/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
import org.eclipselabs.swedit.turtle.turtle.TurtlePackage;
import org.eclipselabs.swedit.turtle.turtle.TypeTag;
import org.eclipselabs.swedit.turtle.turtle.URIRef;
import org.eclipselabs.swedit.turtle.turtle.Verb;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage
 * @generated
 */
public class TurtleSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TurtlePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurtleSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TurtlePackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TurtlePackage.TURTLE_DOCUMENT:
      {
        TurtleDocument turtleDocument = (TurtleDocument)theEObject;
        T result = caseTurtleDocument(turtleDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.DIRECTIVE:
      {
        Directive directive = (Directive)theEObject;
        T result = caseDirective(directive);
        if (result == null) result = caseStatement(directive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.PREFIX:
      {
        Prefix prefix = (Prefix)theEObject;
        T result = casePrefix(prefix);
        if (result == null) result = caseDirective(prefix);
        if (result == null) result = caseStatement(prefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.BASE:
      {
        Base base = (Base)theEObject;
        T result = caseBase(base);
        if (result == null) result = caseDirective(base);
        if (result == null) result = caseStatement(base);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.TRIPLE:
      {
        Triple triple = (Triple)theEObject;
        T result = caseTriple(triple);
        if (result == null) result = caseStatement(triple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.SUBJECT:
      {
        Subject subject = (Subject)theEObject;
        T result = caseSubject(subject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.PREDICATE_OBJECT_LIST:
      {
        PredicateObjectList predicateObjectList = (PredicateObjectList)theEObject;
        T result = casePredicateObjectList(predicateObjectList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.VERB:
      {
        Verb verb = (Verb)theEObject;
        T result = caseVerb(verb);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.AVERB:
      {
        AVerb aVerb = (AVerb)theEObject;
        T result = caseAVerb(aVerb);
        if (result == null) result = caseVerb(aVerb);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.RESOURCE:
      {
        Resource resource = (Resource)theEObject;
        T result = caseResource(resource);
        if (result == null) result = caseSubject(resource);
        if (result == null) result = caseVerb(resource);
        if (result == null) result = caseObject(resource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.OBJECT_LIST:
      {
        ObjectList objectList = (ObjectList)theEObject;
        T result = caseObjectList(objectList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.OBJECT:
      {
        org.eclipselabs.swedit.turtle.turtle.Object object = (org.eclipselabs.swedit.turtle.turtle.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.COLLECTION:
      {
        Collection collection = (Collection)theEObject;
        T result = caseCollection(collection);
        if (result == null) result = caseBlank(collection);
        if (result == null) result = caseSubject(collection);
        if (result == null) result = caseObject(collection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = caseObject(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseLiteral(stringValue);
        if (result == null) result = caseObject(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.INTEGER_VALUE:
      {
        IntegerValue integerValue = (IntegerValue)theEObject;
        T result = caseIntegerValue(integerValue);
        if (result == null) result = caseLiteral(integerValue);
        if (result == null) result = caseObject(integerValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.RDF_TAG:
      {
        RDFTag rdfTag = (RDFTag)theEObject;
        T result = caseRDFTag(rdfTag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.TYPE_TAG:
      {
        TypeTag typeTag = (TypeTag)theEObject;
        T result = caseTypeTag(typeTag);
        if (result == null) result = caseRDFTag(typeTag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.LANG_TAG:
      {
        LangTag langTag = (LangTag)theEObject;
        T result = caseLangTag(langTag);
        if (result == null) result = caseRDFTag(langTag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.URI_REF:
      {
        URIRef uriRef = (URIRef)theEObject;
        T result = caseURIRef(uriRef);
        if (result == null) result = caseResource(uriRef);
        if (result == null) result = caseSubject(uriRef);
        if (result == null) result = caseVerb(uriRef);
        if (result == null) result = caseObject(uriRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.QNAME:
      {
        QName qName = (QName)theEObject;
        T result = caseQName(qName);
        if (result == null) result = caseResource(qName);
        if (result == null) result = caseSubject(qName);
        if (result == null) result = caseVerb(qName);
        if (result == null) result = caseObject(qName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.BLANK:
      {
        Blank blank = (Blank)theEObject;
        T result = caseBlank(blank);
        if (result == null) result = caseSubject(blank);
        if (result == null) result = caseObject(blank);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.NODE_ID:
      {
        NodeID nodeID = (NodeID)theEObject;
        T result = caseNodeID(nodeID);
        if (result == null) result = caseBlank(nodeID);
        if (result == null) result = caseSubject(nodeID);
        if (result == null) result = caseObject(nodeID);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.VOID:
      {
        org.eclipselabs.swedit.turtle.turtle.Void void_ = (org.eclipselabs.swedit.turtle.turtle.Void)theEObject;
        T result = caseVoid(void_);
        if (result == null) result = caseBlank(void_);
        if (result == null) result = caseSubject(void_);
        if (result == null) result = caseObject(void_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TurtlePackage.BLANK_NODE_CONTENT:
      {
        BlankNodeContent blankNodeContent = (BlankNodeContent)theEObject;
        T result = caseBlankNodeContent(blankNodeContent);
        if (result == null) result = caseBlank(blankNodeContent);
        if (result == null) result = caseSubject(blankNodeContent);
        if (result == null) result = caseObject(blankNodeContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTurtleDocument(TurtleDocument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirective(Directive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefix(Prefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBase(Base object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Triple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Triple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriple(Triple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubject(Subject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Object List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Object List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateObjectList(PredicateObjectList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verb</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verb</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerb(Verb object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AVerb</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AVerb</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAVerb(AVerb object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResource(Resource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectList(ObjectList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(org.eclipselabs.swedit.turtle.turtle.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollection(Collection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerValue(IntegerValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RDF Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RDF Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRDFTag(RDFTag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeTag(TypeTag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lang Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lang Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLangTag(LangTag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>URI Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URI Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURIRef(URIRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QName</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QName</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQName(QName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Blank</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blank</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlank(Blank object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeID(NodeID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Void</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVoid(org.eclipselabs.swedit.turtle.turtle.Void object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Blank Node Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blank Node Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlankNodeContent(BlankNodeContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TurtleSwitch
