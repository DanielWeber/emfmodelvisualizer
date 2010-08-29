/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openarchitectureware.vis.graphviz.dot.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DotFactoryImpl extends EFactoryImpl implements DotFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DotFactory init()
  {
    try
    {
      DotFactory theDotFactory = (DotFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openarchitectureware.org/vis/graphviz/Dot"); 
      if (theDotFactory != null)
      {
        return theDotFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DotFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotFactoryImpl()
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
      case DotPackage.GRAPHVIZMODEL: return creategraphvizmodel();
      case DotPackage.GRAPH: return creategraph();
      case DotPackage.STMT: return createstmt();
      case DotPackage.EDGE_STMT_NODE: return createedge_stmt_node();
      case DotPackage.EDGE_STMT_SUBGRAPH: return createedge_stmt_subgraph();
      case DotPackage.NODE_STMT: return createnode_stmt();
      case DotPackage.ATTRIBUTE: return createattribute();
      case DotPackage.ATTR_STMT: return createattr_stmt();
      case DotPackage.ATTR_LIST: return createattr_list();
      case DotPackage.ALIST: return createa_list();
      case DotPackage.SUBGRAPH: return createsubgraph();
      case DotPackage.EDGE_RHS: return createedgeRHS();
      case DotPackage.EDGE_RHS_NODE: return createedgeRHS_node();
      case DotPackage.EDGE_RHS_SUBGRAPH: return createedgeRHS_subgraph();
      case DotPackage.NODE_ID: return createnode_id();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DotPackage.EDGEOP:
        return createedgeopFromString(eDataType, initialValue);
      case DotPackage.GRAPHTYPE:
        return creategraphtypeFromString(eDataType, initialValue);
      case DotPackage.ATTRIBUTETYPE:
        return createattributetypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DotPackage.EDGEOP:
        return convertedgeopToString(eDataType, instanceValue);
      case DotPackage.GRAPHTYPE:
        return convertgraphtypeToString(eDataType, instanceValue);
      case DotPackage.ATTRIBUTETYPE:
        return convertattributetypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graphvizmodel creategraphvizmodel()
  {
    graphvizmodelImpl graphvizmodel = new graphvizmodelImpl();
    return graphvizmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graph creategraph()
  {
    graphImpl graph = new graphImpl();
    return graph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stmt createstmt()
  {
    stmtImpl stmt = new stmtImpl();
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edge_stmt_node createedge_stmt_node()
  {
    edge_stmt_nodeImpl edge_stmt_node = new edge_stmt_nodeImpl();
    return edge_stmt_node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edge_stmt_subgraph createedge_stmt_subgraph()
  {
    edge_stmt_subgraphImpl edge_stmt_subgraph = new edge_stmt_subgraphImpl();
    return edge_stmt_subgraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public node_stmt createnode_stmt()
  {
    node_stmtImpl node_stmt = new node_stmtImpl();
    return node_stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public attribute createattribute()
  {
    attributeImpl attribute = new attributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public attr_stmt createattr_stmt()
  {
    attr_stmtImpl attr_stmt = new attr_stmtImpl();
    return attr_stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public attr_list createattr_list()
  {
    attr_listImpl attr_list = new attr_listImpl();
    return attr_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public a_list createa_list()
  {
    a_listImpl a_list = new a_listImpl();
    return a_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public subgraph createsubgraph()
  {
    subgraphImpl subgraph = new subgraphImpl();
    return subgraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edgeRHS createedgeRHS()
  {
    edgeRHSImpl edgeRHS = new edgeRHSImpl();
    return edgeRHS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edgeRHS_node createedgeRHS_node()
  {
    edgeRHS_nodeImpl edgeRHS_node = new edgeRHS_nodeImpl();
    return edgeRHS_node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edgeRHS_subgraph createedgeRHS_subgraph()
  {
    edgeRHS_subgraphImpl edgeRHS_subgraph = new edgeRHS_subgraphImpl();
    return edgeRHS_subgraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public node_id createnode_id()
  {
    node_idImpl node_id = new node_idImpl();
    return node_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edgeop createedgeopFromString(EDataType eDataType, String initialValue)
  {
    edgeop result = edgeop.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertedgeopToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public graphtype creategraphtypeFromString(EDataType eDataType, String initialValue)
  {
    graphtype result = graphtype.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertgraphtypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public attributetype createattributetypeFromString(EDataType eDataType, String initialValue)
  {
    attributetype result = attributetype.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertattributetypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotPackage getDotPackage()
  {
    return (DotPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DotPackage getPackage()
  {
    return DotPackage.eINSTANCE;
  }

} //DotFactoryImpl
