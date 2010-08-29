/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>edge RHS subgraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS_subgraph#getSubgraph <em>Subgraph</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedgeRHS_subgraph()
 * @model
 * @generated
 */
public interface edgeRHS_subgraph extends edgeRHS
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
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedgeRHS_subgraph_Subgraph()
   * @model containment="true"
   * @generated
   */
  subgraph getSubgraph();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS_subgraph#getSubgraph <em>Subgraph</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subgraph</em>' containment reference.
   * @see #getSubgraph()
   * @generated
   */
  void setSubgraph(subgraph value);

} // edgeRHS_subgraph
