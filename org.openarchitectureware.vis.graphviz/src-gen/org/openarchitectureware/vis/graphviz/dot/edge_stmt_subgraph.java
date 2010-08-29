/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>edge stmt subgraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph#getSubgraph <em>Subgraph</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph#getEdgeRHS <em>Edge RHS</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedge_stmt_subgraph()
 * @model
 * @generated
 */
public interface edge_stmt_subgraph extends stmt
{
  /**
   * Returns the value of the '<em><b>Subgraph</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subgraph</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subgraph</em>' containment reference.
   * @see #setSubgraph(subgraph)
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedge_stmt_subgraph_Subgraph()
   * @model containment="true"
   * @generated
   */
  subgraph getSubgraph();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph#getSubgraph <em>Subgraph</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subgraph</em>' containment reference.
   * @see #getSubgraph()
   * @generated
   */
  void setSubgraph(subgraph value);

  /**
   * Returns the value of the '<em><b>Edge RHS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge RHS</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edge RHS</em>' containment reference.
   * @see #setEdgeRHS(edgeRHS)
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedge_stmt_subgraph_EdgeRHS()
   * @model containment="true"
   * @generated
   */
  edgeRHS getEdgeRHS();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph#getEdgeRHS <em>Edge RHS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Edge RHS</em>' containment reference.
   * @see #getEdgeRHS()
   * @generated
   */
  void setEdgeRHS(edgeRHS value);

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
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedge_stmt_subgraph_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<attr_list> getAttributes();

} // edge_stmt_subgraph
