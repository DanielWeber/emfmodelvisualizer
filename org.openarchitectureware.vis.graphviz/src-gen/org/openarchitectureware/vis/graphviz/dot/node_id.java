/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>node id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.node_id#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getnode_id()
 * @model
 * @generated
 */
public interface node_id extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getnode_id_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.node_id#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // node_id
