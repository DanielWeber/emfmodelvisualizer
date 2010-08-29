/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.attribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getattribute()
 * @model
 * @generated
 */
public interface attribute extends stmt
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
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getattribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getattribute_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.openarchitectureware.vis.graphviz.dot.attribute#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // attribute
