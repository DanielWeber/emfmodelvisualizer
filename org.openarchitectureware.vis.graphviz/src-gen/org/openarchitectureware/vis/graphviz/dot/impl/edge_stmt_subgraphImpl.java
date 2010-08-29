/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openarchitectureware.vis.graphviz.dot.DotPackage;
import org.openarchitectureware.vis.graphviz.dot.attr_list;
import org.openarchitectureware.vis.graphviz.dot.edgeRHS;
import org.openarchitectureware.vis.graphviz.dot.edge_stmt_subgraph;
import org.openarchitectureware.vis.graphviz.dot.subgraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>edge stmt subgraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_subgraphImpl#getSubgraph <em>Subgraph</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_subgraphImpl#getEdgeRHS <em>Edge RHS</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_subgraphImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class edge_stmt_subgraphImpl extends stmtImpl implements edge_stmt_subgraph
{
  /**
   * The cached value of the '{@link #getSubgraph() <em>Subgraph</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubgraph()
   * @generated
   * @ordered
   */
  protected subgraph subgraph;

  /**
   * The cached value of the '{@link #getEdgeRHS() <em>Edge RHS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdgeRHS()
   * @generated
   * @ordered
   */
  protected edgeRHS edgeRHS;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<attr_list> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected edge_stmt_subgraphImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DotPackage.Literals.EDGE_STMT_SUBGRAPH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public subgraph getSubgraph()
  {
    return subgraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubgraph(subgraph newSubgraph, NotificationChain msgs)
  {
    subgraph oldSubgraph = subgraph;
    subgraph = newSubgraph;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH, oldSubgraph, newSubgraph);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubgraph(subgraph newSubgraph)
  {
    if (newSubgraph != subgraph)
    {
      NotificationChain msgs = null;
      if (subgraph != null)
        msgs = ((InternalEObject)subgraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH, null, msgs);
      if (newSubgraph != null)
        msgs = ((InternalEObject)newSubgraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH, null, msgs);
      msgs = basicSetSubgraph(newSubgraph, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH, newSubgraph, newSubgraph));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edgeRHS getEdgeRHS()
  {
    return edgeRHS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEdgeRHS(edgeRHS newEdgeRHS, NotificationChain msgs)
  {
    edgeRHS oldEdgeRHS = edgeRHS;
    edgeRHS = newEdgeRHS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS, oldEdgeRHS, newEdgeRHS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEdgeRHS(edgeRHS newEdgeRHS)
  {
    if (newEdgeRHS != edgeRHS)
    {
      NotificationChain msgs = null;
      if (edgeRHS != null)
        msgs = ((InternalEObject)edgeRHS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS, null, msgs);
      if (newEdgeRHS != null)
        msgs = ((InternalEObject)newEdgeRHS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS, null, msgs);
      msgs = basicSetEdgeRHS(newEdgeRHS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS, newEdgeRHS, newEdgeRHS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<attr_list> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<attr_list>(attr_list.class, this, DotPackage.EDGE_STMT_SUBGRAPH__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH:
        return basicSetSubgraph(null, msgs);
      case DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS:
        return basicSetEdgeRHS(null, msgs);
      case DotPackage.EDGE_STMT_SUBGRAPH__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH:
        return getSubgraph();
      case DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS:
        return getEdgeRHS();
      case DotPackage.EDGE_STMT_SUBGRAPH__ATTRIBUTES:
        return getAttributes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH:
        setSubgraph((subgraph)newValue);
        return;
      case DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS:
        setEdgeRHS((edgeRHS)newValue);
        return;
      case DotPackage.EDGE_STMT_SUBGRAPH__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends attr_list>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH:
        setSubgraph((subgraph)null);
        return;
      case DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS:
        setEdgeRHS((edgeRHS)null);
        return;
      case DotPackage.EDGE_STMT_SUBGRAPH__ATTRIBUTES:
        getAttributes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH:
        return subgraph != null;
      case DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS:
        return edgeRHS != null;
      case DotPackage.EDGE_STMT_SUBGRAPH__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //edge_stmt_subgraphImpl
