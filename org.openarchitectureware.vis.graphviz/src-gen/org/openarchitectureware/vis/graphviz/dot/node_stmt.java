/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>node stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.node_stmt#getName <em>Name</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.node_stmt#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getnode_stmt()
 * @model
 * @generated
 */
public interface node_stmt extends stmt
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
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getnode_stmt_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.node_stmt#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getnode_stmt_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<attr_list> getAttributes();

} // node_stmt
