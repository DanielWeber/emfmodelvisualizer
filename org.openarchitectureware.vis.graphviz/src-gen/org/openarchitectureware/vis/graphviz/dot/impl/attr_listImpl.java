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
import org.openarchitectureware.vis.graphviz.dot.a_list;
import org.openarchitectureware.vis.graphviz.dot.attr_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attr list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openarchitectureware.vis.graphviz.dot.impl.attr_listImpl#getA_list <em>Alist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class attr_listImpl extends MinimalEObjectImpl.Container implements attr_list
{
  /**
   * The cached value of the '{@link #getA_list() <em>Alist</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA_list()
   * @generated
   * @ordered
   */
  protected EList<a_list> a_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected attr_listImpl()
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
    return DotPackage.Literals.ATTR_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<a_list> getA_list()
  {
    if (a_list == null)
    {
      a_list = new EObjectContainmentEList<a_list>(a_list.class, this, DotPackage.ATTR_LIST__ALIST);
    }
    return a_list;
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
      case DotPackage.ATTR_LIST__ALIST:
        return ((InternalEList<?>)getA_list()).basicRemove(otherEnd, msgs);
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
      case DotPackage.ATTR_LIST__ALIST:
        return getA_list();
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
      case DotPackage.ATTR_LIST__ALIST:
        getA_list().clear();
        getA_list().addAll((Collection<? extends a_list>)newValue);
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
      case DotPackage.ATTR_LIST__ALIST:
        getA_list().clear();
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
      case DotPackage.ATTR_LIST__ALIST:
        return a_list != null && !a_list.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //attr_listImpl
