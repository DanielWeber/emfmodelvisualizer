/**
 * <copyright>
 * </copyright>
 *
 */
package org.openarchitectureware.vis.graphviz.dot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openarchitectureware.vis.graphviz.dot.DotPackage;
import org.openarchitectureware.vis.graphviz.dot.graph;
import org.openarchitectureware.vis.graphviz.dot.graphvizmodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>graphvizmodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.impl.graphvizmodelImpl#getGraphs <em>Graphs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class graphvizmodelImpl extends MinimalEObjectImpl.Container implements graphvizmodel
{
  /**
   * The cached value of the '{@link #getGraphs() <em>Graphs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraphs()
   * @generated
   * @ordered
   */
  protected EList<graph> graphs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected graphvizmodelImpl()
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
    return DotPackage.Literals.GRAPHVIZMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<graph> getGraphs()
  {
    if (graphs == null)
    {
      graphs = new EObjectContainmentEList<graph>(graph.class, this, DotPackage.GRAPHVIZMODEL__GRAPHS);
    }
    return graphs;
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
      case DotPackage.GRAPHVIZMODEL__GRAPHS:
        return ((InternalEList<?>)getGraphs()).basicRemove(otherEnd, msgs);
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
      case DotPackage.GRAPHVIZMODEL__GRAPHS:
        return getGraphs();
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
      case DotPackage.GRAPHVIZMODEL__GRAPHS:
        getGraphs().clear();
        getGraphs().addAll((Collection<? extends graph>)newValue);
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
      case DotPackage.GRAPHVIZMODEL__GRAPHS:
        getGraphs().clear();
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
      case DotPackage.GRAPHVIZMODEL__GRAPHS:
        return graphs != null && !graphs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //graphvizmodelImpl
