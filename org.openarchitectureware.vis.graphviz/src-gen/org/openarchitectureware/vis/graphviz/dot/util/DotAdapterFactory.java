/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.vis.graphviz.dot.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage
 * @generated
 */
public class DotAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DotPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DotPackage.eINSTANCE;
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
  protected DotSwitch<Adapter> modelSwitch =
    new DotSwitch<Adapter>()
    {
      @Override
      public Adapter casegraphvizmodel(graphvizmodel object)
      {
        return creategraphvizmodelAdapter();
      }
      @Override
      public Adapter casegraph(graph object)
      {
        return creategraphAdapter();
      }
      @Override
      public Adapter casestmt(stmt object)
      {
        return createstmtAdapter();
      }
      @Override
      public Adapter caseedge_stmt_node(edge_stmt_node object)
      {
        return createedge_stmt_nodeAdapter();
      }
      @Override
      public Adapter caseedge_stmt_subgraph(edge_stmt_subgraph object)
      {
        return createedge_stmt_subgraphAdapter();
      }
      @Override
      public Adapter casenode_stmt(node_stmt object)
      {
        return createnode_stmtAdapter();
      }
      @Override
      public Adapter caseattribute(attribute object)
      {
        return createattributeAdapter();
      }
      @Override
      public Adapter caseattr_stmt(attr_stmt object)
      {
        return createattr_stmtAdapter();
      }
      @Override
      public Adapter caseattr_list(attr_list object)
      {
        return createattr_listAdapter();
      }
      @Override
      public Adapter casea_list(a_list object)
      {
        return createa_listAdapter();
      }
      @Override
      public Adapter casesubgraph(subgraph object)
      {
        return createsubgraphAdapter();
      }
      @Override
      public Adapter caseedgeRHS(edgeRHS object)
      {
        return createedgeRHSAdapter();
      }
      @Override
      public Adapter caseedgeRHS_node(edgeRHS_node object)
      {
        return createedgeRHS_nodeAdapter();
      }
      @Override
      public Adapter caseedgeRHS_subgraph(edgeRHS_subgraph object)
      {
        return createedgeRHS_subgraphAdapter();
      }
      @Override
      public Adapter casenode_id(node_id object)
      {
        return createnode_idAdapter();
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
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.graphvizmodel <em>graphvizmodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.graphvizmodel
   * @generated
   */
  public Adapter creategraphvizmodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.graph <em>graph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.graph
   * @generated
   */
  public Adapter creategraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.stmt <em>stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.stmt
   * @generated
   */
  public Adapter createstmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_node <em>edge stmt node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.edge_stmt_node
   * @generated
   */
  public Adapter createedge_stmt_nodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph <em>edge stmt subgraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph
   * @generated
   */
  public Adapter createedge_stmt_subgraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.node_stmt <em>node stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.node_stmt
   * @generated
   */
  public Adapter createnode_stmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.attribute <em>attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.attribute
   * @generated
   */
  public Adapter createattributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.attr_stmt <em>attr stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.attr_stmt
   * @generated
   */
  public Adapter createattr_stmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.attr_list <em>attr list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.attr_list
   * @generated
   */
  public Adapter createattr_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.a_list <em>alist</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.a_list
   * @generated
   */
  public Adapter createa_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.subgraph <em>subgraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.subgraph
   * @generated
   */
  public Adapter createsubgraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS <em>edge RHS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.edgeRHS
   * @generated
   */
  public Adapter createedgeRHSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS_node <em>edge RHS node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.edgeRHS_node
   * @generated
   */
  public Adapter createedgeRHS_nodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS_subgraph <em>edge RHS subgraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.edgeRHS_subgraph
   * @generated
   */
  public Adapter createedgeRHS_subgraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openarchitectureware.vis.graphviz.dot.node_id <em>node id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openarchitectureware.vis.graphviz.dot.node_id
   * @generated
   */
  public Adapter createnode_idAdapter()
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

} //DotAdapterFactory
