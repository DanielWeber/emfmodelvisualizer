/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.openarchitectureware.vis.graphviz.dot.DotFactory
 * @model kind="package"
 * @generated
 */
public interface DotPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dot";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.openarchitectureware.org/vis/graphviz/Dot";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dot";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DotPackage eINSTANCE = org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl.init();

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.graphvizmodelImpl <em>graphvizmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.graphvizmodelImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getgraphvizmodel()
   * @generated
   */
  int GRAPHVIZMODEL = 0;

  /**
   * The feature id for the '<em><b>Graphs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHVIZMODEL__GRAPHS = 0;

  /**
   * The number of structural features of the '<em>graphvizmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPHVIZMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.graphImpl <em>graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.graphImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getgraph()
   * @generated
   */
  int GRAPH = 1;

  /**
   * The feature id for the '<em><b>Strict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH__STRICT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH__NAME = 2;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH__STMTS = 3;

  /**
   * The number of structural features of the '<em>graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.stmtImpl <em>stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.stmtImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getstmt()
   * @generated
   */
  int STMT = 2;

  /**
   * The number of structural features of the '<em>stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_nodeImpl <em>edge stmt node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_nodeImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getedge_stmt_node()
   * @generated
   */
  int EDGE_STMT_NODE = 3;

  /**
   * The feature id for the '<em><b>Node id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_NODE__NODE_ID = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Edge RHS</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_NODE__EDGE_RHS = STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_NODE__ATTRIBUTES = STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>edge stmt node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_NODE_FEATURE_COUNT = STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_subgraphImpl <em>edge stmt subgraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_subgraphImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getedge_stmt_subgraph()
   * @generated
   */
  int EDGE_STMT_SUBGRAPH = 4;

  /**
   * The feature id for the '<em><b>Subgraph</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_SUBGRAPH__SUBGRAPH = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Edge RHS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_SUBGRAPH__EDGE_RHS = STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_SUBGRAPH__ATTRIBUTES = STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>edge stmt subgraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_SUBGRAPH_FEATURE_COUNT = STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.node_stmtImpl <em>node stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.node_stmtImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getnode_stmt()
   * @generated
   */
  int NODE_STMT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_STMT__NAME = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_STMT__ATTRIBUTES = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>node stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.attributeImpl <em>attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.attributeImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getattribute()
   * @generated
   */
  int ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.attr_stmtImpl <em>attr stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.attr_stmtImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getattr_stmt()
   * @generated
   */
  int ATTR_STMT = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_STMT__TYPE = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_STMT__ATTRIBUTES = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>attr stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.attr_listImpl <em>attr list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.attr_listImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getattr_list()
   * @generated
   */
  int ATTR_LIST = 8;

  /**
   * The feature id for the '<em><b>Alist</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_LIST__ALIST = 0;

  /**
   * The number of structural features of the '<em>attr list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.a_listImpl <em>alist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.a_listImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#geta_list()
   * @generated
   */
  int ALIST = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIST__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIST__VALUE = 1;

  /**
   * The number of structural features of the '<em>alist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.subgraphImpl <em>subgraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.subgraphImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getsubgraph()
   * @generated
   */
  int SUBGRAPH = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBGRAPH__NAME = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBGRAPH__STMTS = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>subgraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBGRAPH_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.edgeRHSImpl <em>edge RHS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.edgeRHSImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getedgeRHS()
   * @generated
   */
  int EDGE_RHS = 11;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS__OP = 0;

  /**
   * The number of structural features of the '<em>edge RHS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.edgeRHS_nodeImpl <em>edge RHS node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.edgeRHS_nodeImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getedgeRHS_node()
   * @generated
   */
  int EDGE_RHS_NODE = 12;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_NODE__OP = EDGE_RHS__OP;

  /**
   * The feature id for the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_NODE__NODE = EDGE_RHS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>edge RHS node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_NODE_FEATURE_COUNT = EDGE_RHS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.edgeRHS_subgraphImpl <em>edge RHS subgraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.edgeRHS_subgraphImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getedgeRHS_subgraph()
   * @generated
   */
  int EDGE_RHS_SUBGRAPH = 13;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_SUBGRAPH__OP = EDGE_RHS__OP;

  /**
   * The feature id for the '<em><b>Subgraph</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_SUBGRAPH__SUBGRAPH = EDGE_RHS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>edge RHS subgraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_SUBGRAPH_FEATURE_COUNT = EDGE_RHS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.node_idImpl <em>node id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.impl.node_idImpl
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getnode_id()
   * @generated
   */
  int NODE_ID = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>node id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.edgeop <em>edgeop</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.edgeop
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getedgeop()
   * @generated
   */
  int EDGEOP = 15;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.graphtype <em>graphtype</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.graphtype
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getgraphtype()
   * @generated
   */
  int GRAPHTYPE = 16;

  /**
   * The meta object id for the '{@link org.openarchitectureware.vis.graphviz.dot.attributetype <em>attributetype</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openarchitectureware.vis.graphviz.dot.attributetype
   * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getattributetype()
   * @generated
   */
  int ATTRIBUTETYPE = 17;


  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.graphvizmodel <em>graphvizmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>graphvizmodel</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.graphvizmodel
   * @generated
   */
  EClass getgraphvizmodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.openarchitectureware.vis.graphviz.dot.graphvizmodel#getGraphs <em>Graphs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Graphs</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.graphvizmodel#getGraphs()
   * @see #getgraphvizmodel()
   * @generated
   */
  EReference getgraphvizmodel_Graphs();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.graph <em>graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>graph</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.graph
   * @generated
   */
  EClass getgraph();

  /**
   * Returns the meta object for the attribute '{@link org.openarchitectureware.vis.graphviz.dot.graph#isStrict <em>Strict</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Strict</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.graph#isStrict()
   * @see #getgraph()
   * @generated
   */
  EAttribute getgraph_Strict();

  /**
   * Returns the meta object for the attribute '{@link org.openarchitectureware.vis.graphviz.dot.graph#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.graph#getType()
   * @see #getgraph()
   * @generated
   */
  EAttribute getgraph_Type();

  /**
   * Returns the meta object for the attribute '{@link org.openarchitectureware.vis.graphviz.dot.graph#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.graph#getName()
   * @see #getgraph()
   * @generated
   */
  EAttribute getgraph_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.openarchitectureware.vis.graphviz.dot.graph#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.graph#getStmts()
   * @see #getgraph()
   * @generated
   */
  EReference getgraph_Stmts();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.stmt <em>stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>stmt</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.stmt
   * @generated
   */
  EClass getstmt();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_node <em>edge stmt node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>edge stmt node</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edge_stmt_node
   * @generated
   */
  EClass getedge_stmt_node();

  /**
   * Returns the meta object for the containment reference '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_node#getNode_id <em>Node id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node id</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edge_stmt_node#getNode_id()
   * @see #getedge_stmt_node()
   * @generated
   */
  EReference getedge_stmt_node_Node_id();

  /**
   * Returns the meta object for the containment reference list '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_node#getEdgeRHS <em>Edge RHS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edge RHS</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edge_stmt_node#getEdgeRHS()
   * @see #getedge_stmt_node()
   * @generated
   */
  EReference getedge_stmt_node_EdgeRHS();

  /**
   * Returns the meta object for the containment reference list '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_node#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edge_stmt_node#getAttributes()
   * @see #getedge_stmt_node()
   * @generated
   */
  EReference getedge_stmt_node_Attributes();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph <em>edge stmt subgraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>edge stmt subgraph</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph
   * @generated
   */
  EClass getedge_stmt_subgraph();

  /**
   * Returns the meta object for the containment reference '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph#getSubgraph <em>Subgraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subgraph</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph#getSubgraph()
   * @see #getedge_stmt_subgraph()
   * @generated
   */
  EReference getedge_stmt_subgraph_Subgraph();

  /**
   * Returns the meta object for the containment reference '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph#getEdgeRHS <em>Edge RHS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Edge RHS</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph#getEdgeRHS()
   * @see #getedge_stmt_subgraph()
   * @generated
   */
  EReference getedge_stmt_subgraph_EdgeRHS();

  /**
   * Returns the meta object for the containment reference list '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph#getAttributes()
   * @see #getedge_stmt_subgraph()
   * @generated
   */
  EReference getedge_stmt_subgraph_Attributes();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.node_stmt <em>node stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>node stmt</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.node_stmt
   * @generated
   */
  EClass getnode_stmt();

  /**
   * Returns the meta object for the attribute '{@link org.openarchitectureware.vis.graphviz.dot.node_stmt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.node_stmt#getName()
   * @see #getnode_stmt()
   * @generated
   */
  EAttribute getnode_stmt_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.openarchitectureware.vis.graphviz.dot.node_stmt#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.node_stmt#getAttributes()
   * @see #getnode_stmt()
   * @generated
   */
  EReference getnode_stmt_Attributes();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.attribute <em>attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>attribute</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.attribute
   * @generated
   */
  EClass getattribute();

  /**
   * Returns the meta object for the attribute '{@link org.openarchitectureware.vis.graphviz.dot.attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.attribute#getName()
   * @see #getattribute()
   * @generated
   */
  EAttribute getattribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.openarchitectureware.vis.graphviz.dot.attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.attribute#getValue()
   * @see #getattribute()
   * @generated
   */
  EAttribute getattribute_Value();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.attr_stmt <em>attr stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>attr stmt</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.attr_stmt
   * @generated
   */
  EClass getattr_stmt();

  /**
   * Returns the meta object for the attribute '{@link org.openarchitectureware.vis.graphviz.dot.attr_stmt#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.attr_stmt#getType()
   * @see #getattr_stmt()
   * @generated
   */
  EAttribute getattr_stmt_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.openarchitectureware.vis.graphviz.dot.attr_stmt#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.attr_stmt#getAttributes()
   * @see #getattr_stmt()
   * @generated
   */
  EReference getattr_stmt_Attributes();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.attr_list <em>attr list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>attr list</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.attr_list
   * @generated
   */
  EClass getattr_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.openarchitectureware.vis.graphviz.dot.attr_list#getA_list <em>Alist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alist</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.attr_list#getA_list()
   * @see #getattr_list()
   * @generated
   */
  EReference getattr_list_A_list();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.a_list <em>alist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>alist</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.a_list
   * @generated
   */
  EClass geta_list();

  /**
   * Returns the meta object for the attribute '{@link org.openarchitectureware.vis.graphviz.dot.a_list#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.a_list#getName()
   * @see #geta_list()
   * @generated
   */
  EAttribute geta_list_Name();

  /**
   * Returns the meta object for the attribute '{@link org.openarchitectureware.vis.graphviz.dot.a_list#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.a_list#getValue()
   * @see #geta_list()
   * @generated
   */
  EAttribute geta_list_Value();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.subgraph <em>subgraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>subgraph</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.subgraph
   * @generated
   */
  EClass getsubgraph();

  /**
   * Returns the meta object for the attribute '{@link org.openarchitectureware.vis.graphviz.dot.subgraph#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.subgraph#getName()
   * @see #getsubgraph()
   * @generated
   */
  EAttribute getsubgraph_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.openarchitectureware.vis.graphviz.dot.subgraph#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.subgraph#getStmts()
   * @see #getsubgraph()
   * @generated
   */
  EReference getsubgraph_Stmts();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS <em>edge RHS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>edge RHS</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edgeRHS
   * @generated
   */
  EClass getedgeRHS();

  /**
   * Returns the meta object for the attribute '{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edgeRHS#getOp()
   * @see #getedgeRHS()
   * @generated
   */
  EAttribute getedgeRHS_Op();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS_node <em>edge RHS node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>edge RHS node</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edgeRHS_node
   * @generated
   */
  EClass getedgeRHS_node();

  /**
   * Returns the meta object for the containment reference '{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS_node#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edgeRHS_node#getNode()
   * @see #getedgeRHS_node()
   * @generated
   */
  EReference getedgeRHS_node_Node();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS_subgraph <em>edge RHS subgraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>edge RHS subgraph</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edgeRHS_subgraph
   * @generated
   */
  EClass getedgeRHS_subgraph();

  /**
   * Returns the meta object for the containment reference '{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS_subgraph#getSubgraph <em>Subgraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subgraph</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edgeRHS_subgraph#getSubgraph()
   * @see #getedgeRHS_subgraph()
   * @generated
   */
  EReference getedgeRHS_subgraph_Subgraph();

  /**
   * Returns the meta object for class '{@link org.openarchitectureware.vis.graphviz.dot.node_id <em>node id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>node id</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.node_id
   * @generated
   */
  EClass getnode_id();

  /**
   * Returns the meta object for the attribute '{@link org.openarchitectureware.vis.graphviz.dot.node_id#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.node_id#getName()
   * @see #getnode_id()
   * @generated
   */
  EAttribute getnode_id_Name();

  /**
   * Returns the meta object for enum '{@link org.openarchitectureware.vis.graphviz.dot.edgeop <em>edgeop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>edgeop</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.edgeop
   * @generated
   */
  EEnum getedgeop();

  /**
   * Returns the meta object for enum '{@link org.openarchitectureware.vis.graphviz.dot.graphtype <em>graphtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>graphtype</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.graphtype
   * @generated
   */
  EEnum getgraphtype();

  /**
   * Returns the meta object for enum '{@link org.openarchitectureware.vis.graphviz.dot.attributetype <em>attributetype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>attributetype</em>'.
   * @see org.openarchitectureware.vis.graphviz.dot.attributetype
   * @generated
   */
  EEnum getattributetype();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DotFactory getDotFactory();

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
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.graphvizmodelImpl <em>graphvizmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.graphvizmodelImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getgraphvizmodel()
     * @generated
     */
    EClass GRAPHVIZMODEL = eINSTANCE.getgraphvizmodel();

    /**
     * The meta object literal for the '<em><b>Graphs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPHVIZMODEL__GRAPHS = eINSTANCE.getgraphvizmodel_Graphs();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.graphImpl <em>graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.graphImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getgraph()
     * @generated
     */
    EClass GRAPH = eINSTANCE.getgraph();

    /**
     * The meta object literal for the '<em><b>Strict</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAPH__STRICT = eINSTANCE.getgraph_Strict();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAPH__TYPE = eINSTANCE.getgraph_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAPH__NAME = eINSTANCE.getgraph_Name();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH__STMTS = eINSTANCE.getgraph_Stmts();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.stmtImpl <em>stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.stmtImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getstmt()
     * @generated
     */
    EClass STMT = eINSTANCE.getstmt();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_nodeImpl <em>edge stmt node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_nodeImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getedge_stmt_node()
     * @generated
     */
    EClass EDGE_STMT_NODE = eINSTANCE.getedge_stmt_node();

    /**
     * The meta object literal for the '<em><b>Node id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STMT_NODE__NODE_ID = eINSTANCE.getedge_stmt_node_Node_id();

    /**
     * The meta object literal for the '<em><b>Edge RHS</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STMT_NODE__EDGE_RHS = eINSTANCE.getedge_stmt_node_EdgeRHS();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STMT_NODE__ATTRIBUTES = eINSTANCE.getedge_stmt_node_Attributes();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_subgraphImpl <em>edge stmt subgraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_subgraphImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getedge_stmt_subgraph()
     * @generated
     */
    EClass EDGE_STMT_SUBGRAPH = eINSTANCE.getedge_stmt_subgraph();

    /**
     * The meta object literal for the '<em><b>Subgraph</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STMT_SUBGRAPH__SUBGRAPH = eINSTANCE.getedge_stmt_subgraph_Subgraph();

    /**
     * The meta object literal for the '<em><b>Edge RHS</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STMT_SUBGRAPH__EDGE_RHS = eINSTANCE.getedge_stmt_subgraph_EdgeRHS();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STMT_SUBGRAPH__ATTRIBUTES = eINSTANCE.getedge_stmt_subgraph_Attributes();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.node_stmtImpl <em>node stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.node_stmtImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getnode_stmt()
     * @generated
     */
    EClass NODE_STMT = eINSTANCE.getnode_stmt();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_STMT__NAME = eINSTANCE.getnode_stmt_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_STMT__ATTRIBUTES = eINSTANCE.getnode_stmt_Attributes();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.attributeImpl <em>attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.attributeImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getattribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getattribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getattribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VALUE = eINSTANCE.getattribute_Value();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.attr_stmtImpl <em>attr stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.attr_stmtImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getattr_stmt()
     * @generated
     */
    EClass ATTR_STMT = eINSTANCE.getattr_stmt();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_STMT__TYPE = eINSTANCE.getattr_stmt_Type();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR_STMT__ATTRIBUTES = eINSTANCE.getattr_stmt_Attributes();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.attr_listImpl <em>attr list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.attr_listImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getattr_list()
     * @generated
     */
    EClass ATTR_LIST = eINSTANCE.getattr_list();

    /**
     * The meta object literal for the '<em><b>Alist</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR_LIST__ALIST = eINSTANCE.getattr_list_A_list();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.a_listImpl <em>alist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.a_listImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#geta_list()
     * @generated
     */
    EClass ALIST = eINSTANCE.geta_list();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIST__NAME = eINSTANCE.geta_list_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIST__VALUE = eINSTANCE.geta_list_Value();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.subgraphImpl <em>subgraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.subgraphImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getsubgraph()
     * @generated
     */
    EClass SUBGRAPH = eINSTANCE.getsubgraph();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBGRAPH__NAME = eINSTANCE.getsubgraph_Name();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBGRAPH__STMTS = eINSTANCE.getsubgraph_Stmts();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.edgeRHSImpl <em>edge RHS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.edgeRHSImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getedgeRHS()
     * @generated
     */
    EClass EDGE_RHS = eINSTANCE.getedgeRHS();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_RHS__OP = eINSTANCE.getedgeRHS_Op();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.edgeRHS_nodeImpl <em>edge RHS node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.edgeRHS_nodeImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getedgeRHS_node()
     * @generated
     */
    EClass EDGE_RHS_NODE = eINSTANCE.getedgeRHS_node();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_RHS_NODE__NODE = eINSTANCE.getedgeRHS_node_Node();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.edgeRHS_subgraphImpl <em>edge RHS subgraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.edgeRHS_subgraphImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getedgeRHS_subgraph()
     * @generated
     */
    EClass EDGE_RHS_SUBGRAPH = eINSTANCE.getedgeRHS_subgraph();

    /**
     * The meta object literal for the '<em><b>Subgraph</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_RHS_SUBGRAPH__SUBGRAPH = eINSTANCE.getedgeRHS_subgraph_Subgraph();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.impl.node_idImpl <em>node id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.impl.node_idImpl
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getnode_id()
     * @generated
     */
    EClass NODE_ID = eINSTANCE.getnode_id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ID__NAME = eINSTANCE.getnode_id_Name();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.edgeop <em>edgeop</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.edgeop
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getedgeop()
     * @generated
     */
    EEnum EDGEOP = eINSTANCE.getedgeop();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.graphtype <em>graphtype</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.graphtype
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getgraphtype()
     * @generated
     */
    EEnum GRAPHTYPE = eINSTANCE.getgraphtype();

    /**
     * The meta object literal for the '{@link org.openarchitectureware.vis.graphviz.dot.attributetype <em>attributetype</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openarchitectureware.vis.graphviz.dot.attributetype
     * @see org.openarchitectureware.vis.graphviz.dot.impl.DotPackageImpl#getattributetype()
     * @generated
     */
    EEnum ATTRIBUTETYPE = eINSTANCE.getattributetype();

  }

} //DotPackage
