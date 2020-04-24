/**
 */
package edu.uoc.som.oda.profiles.opendata.impl;

import edu.uoc.som.oda.profiles.opendata.OpenDataFieldType;
import edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Data Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.impl.OpenDataFieldTypeImpl#getBase_Type <em>Base Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OpenDataFieldTypeImpl extends MinimalEObjectImpl.Container implements OpenDataFieldType {
	/**
	 * The cached value of the '{@link #getBase_Type() <em>Base Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Type()
	 * @generated
	 * @ordered
	 */
	protected Type base_Type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenDataFieldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenDataProfilePackage.Literals.OPEN_DATA_FIELD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getBase_Type() {
		if (base_Type != null && base_Type.eIsProxy()) {
			InternalEObject oldBase_Type = (InternalEObject)base_Type;
			base_Type = (Type)eResolveProxy(oldBase_Type);
			if (base_Type != oldBase_Type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenDataProfilePackage.OPEN_DATA_FIELD_TYPE__BASE_TYPE, oldBase_Type, base_Type));
			}
		}
		return base_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetBase_Type() {
		return base_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Type(Type newBase_Type) {
		Type oldBase_Type = base_Type;
		base_Type = newBase_Type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDataProfilePackage.OPEN_DATA_FIELD_TYPE__BASE_TYPE, oldBase_Type, base_Type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenDataProfilePackage.OPEN_DATA_FIELD_TYPE__BASE_TYPE:
				if (resolve) return getBase_Type();
				return basicGetBase_Type();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenDataProfilePackage.OPEN_DATA_FIELD_TYPE__BASE_TYPE:
				setBase_Type((Type)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpenDataProfilePackage.OPEN_DATA_FIELD_TYPE__BASE_TYPE:
				setBase_Type((Type)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpenDataProfilePackage.OPEN_DATA_FIELD_TYPE__BASE_TYPE:
				return base_Type != null;
		}
		return super.eIsSet(featureID);
	}

} //OpenDataFieldTypeImpl
