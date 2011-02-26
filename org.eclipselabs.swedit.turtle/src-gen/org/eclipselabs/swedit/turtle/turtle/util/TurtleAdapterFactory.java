/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.swedit.turtle.turtle.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.swedit.turtle.turtle.TurtlePackage
 * @generated
 */
public class TurtleAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TurtlePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurtleAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TurtlePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TurtleSwitch<Adapter> modelSwitch =
    new TurtleSwitch<Adapter>()
    {
      @Override
      public Adapter caseTurtleDocument(TurtleDocument object)
      {
        return createTurtleDocumentAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseDirective(Directive object)
      {
        return createDirectiveAdapter();
      }
      @Override
      public Adapter casePrefix(Prefix object)
      {
        return createPrefixAdapter();
      }
      @Override
      public Adapter caseBase(Base object)
      {
        return createBaseAdapter();
      }
      @Override
      public Adapter caseTriple(Triple object)
      {
        return createTripleAdapter();
      }
      @Override
      public Adapter caseSubject(Subject object)
      {
        return createSubjectAdapter();
      }
      @Override
      public Adapter casePredicateObjectList(PredicateObjectList object)
      {
        return createPredicateObjectListAdapter();
      }
      @Override
      public Adapter caseVerb(Verb object)
      {
        return createVerbAdapter();
      }
      @Override
      public Adapter caseAVerb(AVerb object)
      {
        return createAVerbAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseObjectList(ObjectList object)
      {
        return createObjectListAdapter();
      }
      @Override
      public Adapter caseObject(org.eclipselabs.swedit.turtle.turtle.Object object)
      {
        return createObjectAdapter();
      }
      @Override
      public Adapter caseCollection(Collection object)
      {
        return createCollectionAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseIntegerValue(IntegerValue object)
      {
        return createIntegerValueAdapter();
      }
      @Override
      public Adapter caseRDFTag(RDFTag object)
      {
        return createRDFTagAdapter();
      }
      @Override
      public Adapter caseTypeTag(TypeTag object)
      {
        return createTypeTagAdapter();
      }
      @Override
      public Adapter caseLangTag(LangTag object)
      {
        return createLangTagAdapter();
      }
      @Override
      public Adapter caseURIRef(URIRef object)
      {
        return createURIRefAdapter();
      }
      @Override
      public Adapter caseQName(QName object)
      {
        return createQNameAdapter();
      }
      @Override
      public Adapter caseBlank(Blank object)
      {
        return createBlankAdapter();
      }
      @Override
      public Adapter caseNodeID(NodeID object)
      {
        return createNodeIDAdapter();
      }
      @Override
      public Adapter caseVoid(org.eclipselabs.swedit.turtle.turtle.Void object)
      {
        return createVoidAdapter();
      }
      @Override
      public Adapter caseBlankNodeContent(BlankNodeContent object)
      {
        return createBlankNodeContentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.TurtleDocument <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.TurtleDocument
   * @generated
   */
  public Adapter createTurtleDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Directive <em>Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Directive
   * @generated
   */
  public Adapter createDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Prefix
   * @generated
   */
  public Adapter createPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Base <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Base
   * @generated
   */
  public Adapter createBaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Triple <em>Triple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Triple
   * @generated
   */
  public Adapter createTripleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Subject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Subject
   * @generated
   */
  public Adapter createSubjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.PredicateObjectList <em>Predicate Object List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.PredicateObjectList
   * @generated
   */
  public Adapter createPredicateObjectListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Verb <em>Verb</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Verb
   * @generated
   */
  public Adapter createVerbAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.AVerb <em>AVerb</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.AVerb
   * @generated
   */
  public Adapter createAVerbAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.ObjectList <em>Object List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.ObjectList
   * @generated
   */
  public Adapter createObjectListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Object
   * @generated
   */
  public Adapter createObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Collection
   * @generated
   */
  public Adapter createCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.IntegerValue
   * @generated
   */
  public Adapter createIntegerValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.RDFTag <em>RDF Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.RDFTag
   * @generated
   */
  public Adapter createRDFTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.TypeTag <em>Type Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.TypeTag
   * @generated
   */
  public Adapter createTypeTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.LangTag <em>Lang Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.LangTag
   * @generated
   */
  public Adapter createLangTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.URIRef <em>URI Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.URIRef
   * @generated
   */
  public Adapter createURIRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.QName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.QName
   * @generated
   */
  public Adapter createQNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Blank <em>Blank</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Blank
   * @generated
   */
  public Adapter createBlankAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.NodeID <em>Node ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.NodeID
   * @generated
   */
  public Adapter createNodeIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.Void <em>Void</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.Void
   * @generated
   */
  public Adapter createVoidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.swedit.turtle.turtle.BlankNodeContent <em>Blank Node Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.swedit.turtle.turtle.BlankNodeContent
   * @generated
   */
  public Adapter createBlankNodeContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TurtleAdapterFactory
