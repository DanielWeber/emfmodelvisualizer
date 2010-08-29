/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>edge RHS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedgeRHS()
 * @model
 * @generated
 */
public interface edgeRHS extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link org.openarchitectureware.vis.graphviz.dot.edgeop}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see org.openarchitectureware.vis.graphviz.dot.edgeop
   * @see #setOp(edgeop)
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedgeRHS_Op()
   * @model
   * @generated
   */
  edgeop getOp();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.edgeRHS#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see org.openarchitectureware.vis.graphviz.dot.edgeop
   * @see #getOp()
   * @generated
   */
  void setOp(edgeop value);

} // edgeRHS
