/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage
 * @generated
 */
public interface DotFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DotFactory eINSTANCE = org.openarchitectureware.vis.graphviz.dot.impl.DotFactoryImpl.init();

  /**
   * Returns a new object of class '<em>graphvizmodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>graphvizmodel</em>'.
   * @generated
   */
  graphvizmodel creategraphvizmodel();

  /**
   * Returns a new object of class '<em>graph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>graph</em>'.
   * @generated
   */
  graph creategraph();

  /**
   * Returns a new object of class '<em>stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>stmt</em>'.
   * @generated
   */
  stmt createstmt();

  /**
   * Returns a new object of class '<em>edge stmt node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>edge stmt node</em>'.
   * @generated
   */
  edge_stmt_node createedge_stmt_node();

  /**
   * Returns a new object of class '<em>edge stmt subgraph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>edge stmt subgraph</em>'.
   * @generated
   */
  edge_stmt_subgraph createedge_stmt_subgraph();

  /**
   * Returns a new object of class '<em>node stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>node stmt</em>'.
   * @generated
   */
  node_stmt createnode_stmt();

  /**
   * Returns a new object of class '<em>attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>attribute</em>'.
   * @generated
   */
  attribute createattribute();

  /**
   * Returns a new object of class '<em>attr stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>attr stmt</em>'.
   * @generated
   */
  attr_stmt createattr_stmt();

  /**
   * Returns a new object of class '<em>attr list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>attr list</em>'.
   * @generated
   */
  attr_list createattr_list();

  /**
   * Returns a new object of class '<em>alist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>alist</em>'.
   * @generated
   */
  a_list createa_list();

  /**
   * Returns a new object of class '<em>subgraph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>subgraph</em>'.
   * @generated
   */
  subgraph createsubgraph();

  /**
   * Returns a new object of class '<em>edge RHS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>edge RHS</em>'.
   * @generated
   */
  edgeRHS createedgeRHS();

  /**
   * Returns a new object of class '<em>edge RHS node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>edge RHS node</em>'.
   * @generated
   */
  edgeRHS_node createedgeRHS_node();

  /**
   * Returns a new object of class '<em>edge RHS subgraph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>edge RHS subgraph</em>'.
   * @generated
   */
  edgeRHS_subgraph createedgeRHS_subgraph();

  /**
   * Returns a new object of class '<em>node id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>node id</em>'.
   * @generated
   */
  node_id createnode_id();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DotPackage getDotPackage();

} //DotFactory
