/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>edge RHS node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS_node#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedgeRHS_node()
 * @model
 * @generated
 */
public interface edgeRHS_node extends edgeRHS
{
  /**
   * Returns the value of the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' containment reference.
   * @see #setNode(node_id)
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedgeRHS_node_Node()
   * @model containment="true"
   * @generated
   */
  node_id getNode();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS_node#getNode <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' containment reference.
   * @see #getNode()
   * @generated
   */
  void setNode(node_id value);

} // edgeRHS_node
