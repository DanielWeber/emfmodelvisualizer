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
import org.openarchitectureware.vis.graphviz.dot.edge_stmt_node;
import org.openarchitectureware.vis.graphviz.dot.node_id;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>edge stmt node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_nodeImpl#getNode_id <em>Node id</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_nodeImpl#getEdgeRHS <em>Edge RHS</em>}</li>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.impl.edge_stmt_nodeImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class edge_stmt_nodeImpl extends stmtImpl implements edge_stmt_node
{
  /**
   * The cached value of the '{@link #getNode_id() <em>Node id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode_id()
   * @generated
   * @ordered
   */
  protected node_id node_id;

  /**
   * The cached value of the '{@link #getEdgeRHS() <em>Edge RHS</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdgeRHS()
   * @generated
   * @ordered
   */
  protected EList<edgeRHS> edgeRHS;

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
  protected edge_stmt_nodeImpl()
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
    return DotPackage.Literals.EDGE_STMT_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public node_id getNode_id()
  {
    return node_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNode_id(node_id newNode_id, NotificationChain msgs)
  {
    node_id oldNode_id = node_id;
    node_id = newNode_id;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DotPackage.EDGE_STMT_NODE__NODE_ID, oldNode_id, newNode_id);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNode_id(node_id newNode_id)
  {
    if (newNode_id != node_id)
    {
      NotificationChain msgs = null;
      if (node_id != null)
        msgs = ((InternalEObject)node_id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DotPackage.EDGE_STMT_NODE__NODE_ID, null, msgs);
      if (newNode_id != null)
        msgs = ((InternalEObject)newNode_id).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DotPackage.EDGE_STMT_NODE__NODE_ID, null, msgs);
      msgs = basicSetNode_id(newNode_id, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotPackage.EDGE_STMT_NODE__NODE_ID, newNode_id, newNode_id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<edgeRHS> getEdgeRHS()
  {
    if (edgeRHS == null)
    {
      edgeRHS = new EObjectContainmentEList<edgeRHS>(edgeRHS.class, this, DotPackage.EDGE_STMT_NODE__EDGE_RHS);
    }
    return edgeRHS;
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
      attributes = new EObjectContainmentEList<attr_list>(attr_list.class, this, DotPackage.EDGE_STMT_NODE__ATTRIBUTES);
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
      case DotPackage.EDGE_STMT_NODE__NODE_ID:
        return basicSetNode_id(null, msgs);
      case DotPackage.EDGE_STMT_NODE__EDGE_RHS:
        return ((InternalEList<?>)getEdgeRHS()).basicRemove(otherEnd, msgs);
      case DotPackage.EDGE_STMT_NODE__ATTRIBUTES:
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
      case DotPackage.EDGE_STMT_NODE__NODE_ID:
        return getNode_id();
      case DotPackage.EDGE_STMT_NODE__EDGE_RHS:
        return getEdgeRHS();
      case DotPackage.EDGE_STMT_NODE__ATTRIBUTES:
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
      case DotPackage.EDGE_STMT_NODE__NODE_ID:
        setNode_id((node_id)newValue);
        return;
      case DotPackage.EDGE_STMT_NODE__EDGE_RHS:
        getEdgeRHS().clear();
        getEdgeRHS().addAll((Collection<? extends edgeRHS>)newValue);
        return;
      case DotPackage.EDGE_STMT_NODE__ATTRIBUTES:
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
      case DotPackage.EDGE_STMT_NODE__NODE_ID:
        setNode_id((node_id)null);
        return;
      case DotPackage.EDGE_STMT_NODE__EDGE_RHS:
        getEdgeRHS().clear();
        return;
      case DotPackage.EDGE_STMT_NODE__ATTRIBUTES:
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
      case DotPackage.EDGE_STMT_NODE__NODE_ID:
        return node_id != null;
      case DotPackage.EDGE_STMT_NODE__EDGE_RHS:
        return edgeRHS != null && !edgeRHS.isEmpty();
      case DotPackage.EDGE_STMT_NODE__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //edge_stmt_nodeImpl
