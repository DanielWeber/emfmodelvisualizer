/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>attr list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.attr_list#getA_list <em>Alist</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getattr_list()
 * @model
 * @generated
 */
public interface attr_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Alist</b></em>' containment reference list.
   * The list contents are of type {@link org.openarchitectureware.vis.graphviz.dot.a_list}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alist</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alist</em>' containment reference list.
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getattr_list_A_list()
   * @model containment="true"
   * @generated
   */
  EList<a_list> getA_list();

} // attr_list
