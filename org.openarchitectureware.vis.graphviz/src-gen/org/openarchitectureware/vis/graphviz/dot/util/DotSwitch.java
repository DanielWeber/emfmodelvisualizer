/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.vis.graphviz.dot.*;

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
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage
 * @generated
 */
public class DotSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DotPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DotPackage.eINSTANCE;
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
      case DotPackage.GRAPHVIZMODEL:
      {
        graphvizmodel graphvizmodel = (graphvizmodel)theEObject;
        T result = casegraphvizmodel(graphvizmodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.GRAPH:
      {
        graph graph = (graph)theEObject;
        T result = casegraph(graph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.STMT:
      {
        stmt stmt = (stmt)theEObject;
        T result = casestmt(stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.EDGE_STMT_NODE:
      {
        edge_stmt_node edge_stmt_node = (edge_stmt_node)theEObject;
        T result = caseedge_stmt_node(edge_stmt_node);
        if (result == null) result = casestmt(edge_stmt_node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.EDGE_STMT_SUBGRAPH:
      {
        edge_stmt_subgraph edge_stmt_subgraph = (edge_stmt_subgraph)theEObject;
        T result = caseedge_stmt_subgraph(edge_stmt_subgraph);
        if (result == null) result = casestmt(edge_stmt_subgraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.NODE_STMT:
      {
        node_stmt node_stmt = (node_stmt)theEObject;
        T result = casenode_stmt(node_stmt);
        if (result == null) result = casestmt(node_stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.ATTRIBUTE:
      {
        attribute attribute = (attribute)theEObject;
        T result = caseattribute(attribute);
        if (result == null) result = casestmt(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.ATTR_STMT:
      {
        attr_stmt attr_stmt = (attr_stmt)theEObject;
        T result = caseattr_stmt(attr_stmt);
        if (result == null) result = casestmt(attr_stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.ATTR_LIST:
      {
        attr_list attr_list = (attr_list)theEObject;
        T result = caseattr_list(attr_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.ALIST:
      {
        a_list a_list = (a_list)theEObject;
        T result = casea_list(a_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.SUBGRAPH:
      {
        subgraph subgraph = (subgraph)theEObject;
        T result = casesubgraph(subgraph);
        if (result == null) result = casestmt(subgraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.EDGE_RHS:
      {
        edgeRHS edgeRHS = (edgeRHS)theEObject;
        T result = caseedgeRHS(edgeRHS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.EDGE_RHS_NODE:
      {
        edgeRHS_node edgeRHS_node = (edgeRHS_node)theEObject;
        T result = caseedgeRHS_node(edgeRHS_node);
        if (result == null) result = caseedgeRHS(edgeRHS_node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.EDGE_RHS_SUBGRAPH:
      {
        edgeRHS_subgraph edgeRHS_subgraph = (edgeRHS_subgraph)theEObject;
        T result = caseedgeRHS_subgraph(edgeRHS_subgraph);
        if (result == null) result = caseedgeRHS(edgeRHS_subgraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DotPackage.NODE_ID:
      {
        node_id node_id = (node_id)theEObject;
        T result = casenode_id(node_id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>graphvizmodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>graphvizmodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegraphvizmodel(graphvizmodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>graph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>graph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegraph(graph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestmt(stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>edge stmt node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>edge stmt node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseedge_stmt_node(edge_stmt_node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>edge stmt subgraph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>edge stmt subgraph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseedge_stmt_subgraph(edge_stmt_subgraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>node stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>node stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenode_stmt(node_stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseattribute(attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>attr stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>attr stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseattr_stmt(attr_stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>attr list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>attr list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseattr_list(attr_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>alist</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>alist</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casea_list(a_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>subgraph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>subgraph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesubgraph(subgraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>edge RHS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>edge RHS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseedgeRHS(edgeRHS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>edge RHS node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>edge RHS node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseedgeRHS_node(edgeRHS_node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>edge RHS subgraph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>edge RHS subgraph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseedgeRHS_subgraph(edgeRHS_subgraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>node id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>node id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenode_id(node_id object)
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

} //DotSwitch
