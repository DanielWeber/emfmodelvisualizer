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
 * A representation of the model object '<em><b>graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.graph#isStrict <em>Strict</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.graph#getType <em>Type</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.graph#getName <em>Name</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.graph#getStmts <em>Stmts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getgraph()
 * @model
 * @generated
 */
public interface graph extends EObject
{
  /**
   * Returns the value of the '<em><b>Strict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strict</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strict</em>' attribute.
   * @see #setStrict(boolean)
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getgraph_Strict()
   * @model
   * @generated
   */
  boolean isStrict();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.graph#isStrict <em>Strict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strict</em>' attribute.
   * @see #isStrict()
   * @generated
   */
  void setStrict(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.openarchitectureware.vis.graphviz.dot.graphtype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.openarchitectureware.vis.graphviz.dot.graphtype
   * @see #setType(graphtype)
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getgraph_Type()
   * @model
   * @generated
   */
  graphtype getType();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.graph#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.openarchitectureware.vis.graphviz.dot.graphtype
   * @see #getType()
   * @generated
   */
  void setType(graphtype value);

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
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getgraph_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.graph#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
   * The list contents are of type {@link org.openarchitectureware.vis.graphviz.dot.stmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmts</em>' containment reference list.
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getgraph_Stmts()
   * @model containment="true"
   * @generated
   */
  EList<stmt> getStmts();

} // graph
