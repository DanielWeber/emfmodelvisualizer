/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openarchitectureware.vis.graphviz.dot.DotFactory;
import org.openarchitectureware.vis.graphviz.dot.DotPackage;
import org.openarchitectureware.vis.graphviz.dot.a_list;
import org.openarchitectureware.vis.graphviz.dot.attr_list;
import org.openarchitectureware.vis.graphviz.dot.attr_stmt;
import org.openarchitectureware.vis.graphviz.dot.attribute;
import org.openarchitectureware.vis.graphviz.dot.attributetype;
import org.openarchitectureware.vis.graphviz.dot.edgeRHS;
import org.openarchitectureware.vis.graphviz.dot.edgeRHS_node;
import org.openarchitectureware.vis.graphviz.dot.edgeRHS_subgraph;
import org.openarchitectureware.vis.graphviz.dot.edge_stmt_node;
import org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph;
import org.openarchitectureware.vis.graphviz.dot.edgeop;
import org.openarchitectureware.vis.graphviz.dot.graph;
import org.openarchitectureware.vis.graphviz.dot.graphtype;
import org.openarchitectureware.vis.graphviz.dot.graphvizmodel;
import org.openarchitectureware.vis.graphviz.dot.node_id;
import org.openarchitectureware.vis.graphviz.dot.node_stmt;
import org.openarchitectureware.vis.graphviz.dot.stmt;
import org.openarchitectureware.vis.graphviz.dot.subgraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DotPackageImpl extends EPackageImpl implements DotPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graphvizmodelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edge_stmt_nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edge_stmt_subgraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass node_stmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attr_stmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attr_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass a_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subgraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edgeRHSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edgeRHS_nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edgeRHS_subgraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass node_idEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum edgeopEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum graphtypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum attributetypeEEnum = null;

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
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DotPackageImpl()
  {
    super(eNS_URI, DotFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DotPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DotPackage init()
  {
    if (isInited) return (DotPackage)EPackage.Registry.INSTANCE.getEPackage(DotPackage.eNS_URI);

    // Obtain or create and register package
    DotPackageImpl theDotPackage = (DotPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DotPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DotPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDotPackage.createPackageContents();

    // Initialize created meta-data
    theDotPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDotPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DotPackage.eNS_URI, theDotPackage);
    return theDotPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgraphvizmodel()
  {
    return graphvizmodelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgraphvizmodel_Graphs()
  {
    return (EReference)graphvizmodelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgraph()
  {
    return graphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getgraph_Strict()
  {
    return (EAttribute)graphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getgraph_Type()
  {
    return (EAttribute)graphEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getgraph_Name()
  {
    return (EAttribute)graphEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgraph_Stmts()
  {
    return (EReference)graphEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstmt()
  {
    return stmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getedge_stmt_node()
  {
    return edge_stmt_nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getedge_stmt_node_Node_id()
  {
    return (EReference)edge_stmt_nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getedge_stmt_node_EdgeRHS()
  {
    return (EReference)edge_stmt_nodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getedge_stmt_node_Attributes()
  {
    return (EReference)edge_stmt_nodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getedge_stmt_subgraph()
  {
    return edge_stmt_subgraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getedge_stmt_subgraph_Subgraph()
  {
    return (EReference)edge_stmt_subgraphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getedge_stmt_subgraph_EdgeRHS()
  {
    return (EReference)edge_stmt_subgraphEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getedge_stmt_subgraph_Attributes()
  {
    return (EReference)edge_stmt_subgraphEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnode_stmt()
  {
    return node_stmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnode_stmt_Name()
  {
    return (EAttribute)node_stmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnode_stmt_Attributes()
  {
    return (EReference)node_stmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getattribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getattribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getattribute_Value()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getattr_stmt()
  {
    return attr_stmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getattr_stmt_Type()
  {
    return (EAttribute)attr_stmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getattr_stmt_Attributes()
  {
    return (EReference)attr_stmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getattr_list()
  {
    return attr_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getattr_list_A_list()
  {
    return (EReference)attr_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass geta_list()
  {
    return a_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute geta_list_Name()
  {
    return (EAttribute)a_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute geta_list_Value()
  {
    return (EAttribute)a_listEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsubgraph()
  {
    return subgraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsubgraph_Name()
  {
    return (EAttribute)subgraphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsubgraph_Stmts()
  {
    return (EReference)subgraphEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getedgeRHS()
  {
    return edgeRHSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getedgeRHS_Op()
  {
    return (EAttribute)edgeRHSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getedgeRHS_node()
  {
    return edgeRHS_nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getedgeRHS_node_Node()
  {
    return (EReference)edgeRHS_nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getedgeRHS_subgraph()
  {
    return edgeRHS_subgraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getedgeRHS_subgraph_Subgraph()
  {
    return (EReference)edgeRHS_subgraphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnode_id()
  {
    return node_idEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnode_id_Name()
  {
    return (EAttribute)node_idEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getedgeop()
  {
    return edgeopEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getgraphtype()
  {
    return graphtypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getattributetype()
  {
    return attributetypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotFactory getDotFactory()
  {
    return (DotFactory)getEFactoryInstance();
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
    graphvizmodelEClass = createEClass(GRAPHVIZMODEL);
    createEReference(graphvizmodelEClass, GRAPHVIZMODEL__GRAPHS);

    graphEClass = createEClass(GRAPH);
    createEAttribute(graphEClass, GRAPH__STRICT);
    createEAttribute(graphEClass, GRAPH__TYPE);
    createEAttribute(graphEClass, GRAPH__NAME);
    createEReference(graphEClass, GRAPH__STMTS);

    stmtEClass = createEClass(STMT);

    edge_stmt_nodeEClass = createEClass(EDGE_STMT_NODE);
    createEReference(edge_stmt_nodeEClass, EDGE_STMT_NODE__NODE_ID);
    createEReference(edge_stmt_nodeEClass, EDGE_STMT_NODE__EDGE_RHS);
    createEReference(edge_stmt_nodeEClass, EDGE_STMT_NODE__ATTRIBUTES);

    edge_stmt_subgraphEClass = createEClass(EDGE_STMT_SUBGRAPH);
    createEReference(edge_stmt_subgraphEClass, EDGE_STMT_SUBGRAPH__SUBGRAPH);
    createEReference(edge_stmt_subgraphEClass, EDGE_STMT_SUBGRAPH__EDGE_RHS);
    createEReference(edge_stmt_subgraphEClass, EDGE_STMT_SUBGRAPH__ATTRIBUTES);

    node_stmtEClass = createEClass(NODE_STMT);
    createEAttribute(node_stmtEClass, NODE_STMT__NAME);
    createEReference(node_stmtEClass, NODE_STMT__ATTRIBUTES);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

    attr_stmtEClass = createEClass(ATTR_STMT);
    createEAttribute(attr_stmtEClass, ATTR_STMT__TYPE);
    createEReference(attr_stmtEClass, ATTR_STMT__ATTRIBUTES);

    attr_listEClass = createEClass(ATTR_LIST);
    createEReference(attr_listEClass, ATTR_LIST__ALIST);

    a_listEClass = createEClass(ALIST);
    createEAttribute(a_listEClass, ALIST__NAME);
    createEAttribute(a_listEClass, ALIST__VALUE);

    subgraphEClass = createEClass(SUBGRAPH);
    createEAttribute(subgraphEClass, SUBGRAPH__NAME);
    createEReference(subgraphEClass, SUBGRAPH__STMTS);

    edgeRHSEClass = createEClass(EDGE_RHS);
    createEAttribute(edgeRHSEClass, EDGE_RHS__OP);

    edgeRHS_nodeEClass = createEClass(EDGE_RHS_NODE);
    createEReference(edgeRHS_nodeEClass, EDGE_RHS_NODE__NODE);

    edgeRHS_subgraphEClass = createEClass(EDGE_RHS_SUBGRAPH);
    createEReference(edgeRHS_subgraphEClass, EDGE_RHS_SUBGRAPH__SUBGRAPH);

    node_idEClass = createEClass(NODE_ID);
    createEAttribute(node_idEClass, NODE_ID__NAME);

    // Create enums
    edgeopEEnum = createEEnum(EDGEOP);
    graphtypeEEnum = createEEnum(GRAPHTYPE);
    attributetypeEEnum = createEEnum(ATTRIBUTETYPE);
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
    edge_stmt_nodeEClass.getESuperTypes().add(this.getstmt());
    edge_stmt_subgraphEClass.getESuperTypes().add(this.getstmt());
    node_stmtEClass.getESuperTypes().add(this.getstmt());
    attributeEClass.getESuperTypes().add(this.getstmt());
    attr_stmtEClass.getESuperTypes().add(this.getstmt());
    subgraphEClass.getESuperTypes().add(this.getstmt());
    edgeRHS_nodeEClass.getESuperTypes().add(this.getedgeRHS());
    edgeRHS_subgraphEClass.getESuperTypes().add(this.getedgeRHS());

    // Initialize classes and features; add operations and parameters
    initEClass(graphvizmodelEClass, graphvizmodel.class, "graphvizmodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getgraphvizmodel_Graphs(), this.getgraph(), null, "graphs", null, 0, -1, graphvizmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graphEClass, graph.class, "graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getgraph_Strict(), ecorePackage.getEBoolean(), "strict", null, 0, 1, graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getgraph_Type(), this.getgraphtype(), "type", null, 0, 1, graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getgraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgraph_Stmts(), this.getstmt(), null, "stmts", null, 0, -1, graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stmtEClass, stmt.class, "stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(edge_stmt_nodeEClass, edge_stmt_node.class, "edge_stmt_node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getedge_stmt_node_Node_id(), this.getnode_id(), null, "node_id", null, 0, 1, edge_stmt_node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getedge_stmt_node_EdgeRHS(), this.getedgeRHS(), null, "edgeRHS", null, 0, -1, edge_stmt_node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getedge_stmt_node_Attributes(), this.getattr_list(), null, "attributes", null, 0, -1, edge_stmt_node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edge_stmt_subgraphEClass, edge_stmt_subgraph.class, "edge_stmt_subgraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getedge_stmt_subgraph_Subgraph(), this.getsubgraph(), null, "subgraph", null, 0, 1, edge_stmt_subgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getedge_stmt_subgraph_EdgeRHS(), this.getedgeRHS(), null, "edgeRHS", null, 0, 1, edge_stmt_subgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getedge_stmt_subgraph_Attributes(), this.getattr_list(), null, "attributes", null, 0, -1, edge_stmt_subgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(node_stmtEClass, node_stmt.class, "node_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnode_stmt_Name(), ecorePackage.getEString(), "name", null, 0, 1, node_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getnode_stmt_Attributes(), this.getattr_list(), null, "attributes", null, 0, -1, node_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, attribute.class, "attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getattribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getattribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attr_stmtEClass, attr_stmt.class, "attr_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getattr_stmt_Type(), this.getattributetype(), "type", null, 0, 1, attr_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getattr_stmt_Attributes(), this.getattr_list(), null, "attributes", null, 0, -1, attr_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attr_listEClass, attr_list.class, "attr_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getattr_list_A_list(), this.geta_list(), null, "a_list", null, 0, -1, attr_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(a_listEClass, a_list.class, "a_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(geta_list_Name(), ecorePackage.getEString(), "name", null, 0, 1, a_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(geta_list_Value(), ecorePackage.getEString(), "value", null, 0, 1, a_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subgraphEClass, subgraph.class, "subgraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsubgraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, subgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsubgraph_Stmts(), this.getstmt(), null, "stmts", null, 0, -1, subgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edgeRHSEClass, edgeRHS.class, "edgeRHS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getedgeRHS_Op(), this.getedgeop(), "op", null, 0, 1, edgeRHS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edgeRHS_nodeEClass, edgeRHS_node.class, "edgeRHS_node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getedgeRHS_node_Node(), this.getnode_id(), null, "node", null, 0, 1, edgeRHS_node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edgeRHS_subgraphEClass, edgeRHS_subgraph.class, "edgeRHS_subgraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getedgeRHS_subgraph_Subgraph(), this.getsubgraph(), null, "subgraph", null, 0, 1, edgeRHS_subgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(node_idEClass, node_id.class, "node_id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnode_id_Name(), ecorePackage.getEString(), "name", null, 0, 1, node_id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(edgeopEEnum, edgeop.class, "edgeop");
    addEEnumLiteral(edgeopEEnum, edgeop.DIRECTED);
    addEEnumLiteral(edgeopEEnum, edgeop.UNDIRECTED);

    initEEnum(graphtypeEEnum, graphtype.class, "graphtype");
    addEEnumLiteral(graphtypeEEnum, graphtype.GRAPH);
    addEEnumLiteral(graphtypeEEnum, graphtype.DIGRAPH);

    initEEnum(attributetypeEEnum, attributetype.class, "attributetype");
    addEEnumLiteral(attributetypeEEnum, attributetype.GRAPH);
    addEEnumLiteral(attributetypeEEnum, attributetype.NODE);
    addEEnumLiteral(attributetypeEEnum, attributetype.EDGE);

    // Create resource
    createResource(eNS_URI);
  }

} //DotPackageImpl
