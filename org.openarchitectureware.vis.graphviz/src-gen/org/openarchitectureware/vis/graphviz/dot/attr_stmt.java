/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>attr stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.attr_stmt#getType <em>Type</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.attr_stmt#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getattr_stmt()
 * @model
 * @generated
 */
public interface attr_stmt extends stmt
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.openarchitectureware.vis.graphviz.dot.attributetype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.openarchitectureware.vis.graphviz.dot.attributetype
   * @see #setType(attributetype)
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getattr_stmt_Type()
   * @model
   * @generated
   */
  attributetype getType();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.attr_stmt#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.openarchitectureware.vis.graphviz.dot.attributetype
   * @see #getType()
   * @generated
   */
  void setType(attributetype value);

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
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getattr_stmt_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<attr_list> getAttributes();

} // attr_stmt
