/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>edge stmt node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_node#getNode_id <em>Node id</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_node#getEdgeRHS <em>Edge RHS</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_node#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedge_stmt_node()
 * @model
 * @generated
 */
public interface edge_stmt_node extends stmt
{
  /**
   * Returns the value of the '<em><b>Node id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node id</em>' containment reference.
   * @see #setNode_id(node_id)
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedge_stmt_node_Node_id()
   * @model containment="true"
   * @generated
   */
  node_id getNode_id();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_node#getNode_id <em>Node id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node id</em>' containment reference.
   * @see #getNode_id()
   * @generated
   */
  void setNode_id(node_id value);

  /**
   * Returns the value of the '<em><b>Edge RHS</b></em>' containment reference list.
   * The list contents are of type {@link org.openarchitectureware.vis.graphviz.dot.edgeRHS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge RHS</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edge RHS</em>' containment reference list.
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedge_stmt_node_EdgeRHS()
   * @model containment="true"
   * @generated
   */
  EList<edgeRHS> getEdgeRHS();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.openarchitectureware.vis.graphviz.dot.attr_list}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedge_stmt_node_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<attr_list> getAttributes();

} // edge_stmt_node
