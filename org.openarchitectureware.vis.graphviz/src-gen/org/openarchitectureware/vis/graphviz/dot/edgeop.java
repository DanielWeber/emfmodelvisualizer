/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>edgeop</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getedgeop()
 * @model
 * @generated
 */
public enum edgeop implements Enumerator
{
  /**
   * The '<em><b>Directed</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIRECTED_VALUE
   * @generated
   * @ordered
   */
  DIRECTED(0, "directed", "->"),

  /**
   * The '<em><b>Undirected</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDIRECTED_VALUE
   * @generated
   * @ordered
   */
  UNDIRECTED(1, "undirected", "--");

  /**
   * The '<em><b>Directed</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Directed</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIRECTED
   * @model name="directed" literal="->"
   * @generated
   * @ordered
   */
  public static final int DIRECTED_VALUE = 0;

  /**
   * The '<em><b>Undirected</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Undirected</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNDIRECTED
   * @model name="undirected" literal="--"
   * @generated
   * @ordered
   */
  public static final int UNDIRECTED_VALUE = 1;

  /**
   * An array of all the '<em><b>edgeop</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final edgeop[] VALUES_ARRAY =
    new edgeop[]
    {
      DIRECTED,
      UNDIRECTED,
    };

  /**
   * A public read-only list of all the '<em><b>edgeop</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<edgeop> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>edgeop</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static edgeop get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      edgeop result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>edgeop</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static edgeop getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      edgeop result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>edgeop</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static edgeop get(int value)
  {
    switch (value)
    {
      case DIRECTED_VALUE: return DIRECTED;
      case UNDIRECTED_VALUE: return UNDIRECTED;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private edgeop(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //edgeop
