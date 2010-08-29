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
 * A representation of the literals of the enumeration '<em><b>attributetype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openarchitectureware.vis.graphviz.dot.DotPackage#getattributetype()
 * @model
 * @generated
 */
public enum attributetype implements Enumerator
{
  /**
   * The '<em><b>Graph</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GRAPH_VALUE
   * @generated
   * @ordered
   */
  GRAPH(0, "graph", "graph"),

  /**
   * The '<em><b>Node</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NODE_VALUE
   * @generated
   * @ordered
   */
  NODE(1, "node", "node"),

  /**
   * The '<em><b>Edge</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EDGE_VALUE
   * @generated
   * @ordered
   */
  EDGE(2, "edge", "edge");

  /**
   * The '<em><b>Graph</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Graph</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GRAPH
   * @model name="graph"
   * @generated
   * @ordered
   */
  public static final int GRAPH_VALUE = 0;

  /**
   * The '<em><b>Node</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Node</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NODE
   * @model name="node"
   * @generated
   * @ordered
   */
  public static final int NODE_VALUE = 1;

  /**
   * The '<em><b>Edge</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Edge</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EDGE
   * @model name="edge"
   * @generated
   * @ordered
   */
  public static final int EDGE_VALUE = 2;

  /**
   * An array of all the '<em><b>attributetype</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final attributetype[] VALUES_ARRAY =
    new attributetype[]
    {
      GRAPH,
      NODE,
      EDGE,
    };

  /**
   * A public read-only list of all the '<em><b>attributetype</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<attributetype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>attributetype</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static attributetype get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      attributetype result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>attributetype</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static attributetype getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      attributetype result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>attributetype</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static attributetype get(int value)
  {
    switch (value)
    {
      case GRAPH_VALUE: return GRAPH;
      case NODE_VALUE: return NODE;
      case EDGE_VALUE: return EDGE;
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
  private attributetype(int value, String name, String literal)
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
  
} //attributetype
