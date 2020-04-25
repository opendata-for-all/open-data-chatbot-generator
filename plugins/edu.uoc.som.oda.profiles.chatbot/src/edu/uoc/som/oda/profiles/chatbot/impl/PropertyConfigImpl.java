/**
 */
package edu.uoc.som.oda.profiles.chatbot.impl;

import edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage;
import edu.uoc.som.oda.profiles.chatbot.PropertyConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.impl.PropertyConfigImpl#isToExpose <em>To Expose</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.impl.PropertyConfigImpl#isToFilterWith <em>To Filter With</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.impl.PropertyConfigImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyConfigImpl extends MinimalEObjectImpl.Container implements PropertyConfig {
	/**
	 * The default value of the '{@link #isToExpose() <em>To Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToExpose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_EXPOSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isToExpose() <em>To Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToExpose()
	 * @generated
	 * @ordered
	 */
	protected boolean toExpose = TO_EXPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #isToFilterWith() <em>To Filter With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToFilterWith()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_FILTER_WITH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isToFilterWith() <em>To Filter With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToFilterWith()
	 * @generated
	 * @ordered
	 */
	protected boolean toFilterWith = TO_FILTER_WITH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChatbotProfilePackage.Literals.PROPERTY_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isToExpose() {
		return toExpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToExpose(boolean newToExpose) {
		boolean oldToExpose = toExpose;
		toExpose = newToExpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChatbotProfilePackage.PROPERTY_CONFIG__TO_EXPOSE, oldToExpose, toExpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isToFilterWith() {
		return toFilterWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToFilterWith(boolean newToFilterWith) {
		boolean oldToFilterWith = toFilterWith;
		toFilterWith = newToFilterWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChatbotProfilePackage.PROPERTY_CONFIG__TO_FILTER_WITH, oldToFilterWith, toFilterWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChatbotProfilePackage.PROPERTY_CONFIG__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChatbotProfilePackage.PROPERTY_CONFIG__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChatbotProfilePackage.PROPERTY_CONFIG__TO_EXPOSE:
				return isToExpose();
			case ChatbotProfilePackage.PROPERTY_CONFIG__TO_FILTER_WITH:
				return isToFilterWith();
			case ChatbotProfilePackage.PROPERTY_CONFIG__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
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
			case ChatbotProfilePackage.PROPERTY_CONFIG__TO_EXPOSE:
				setToExpose((Boolean)newValue);
				return;
			case ChatbotProfilePackage.PROPERTY_CONFIG__TO_FILTER_WITH:
				setToFilterWith((Boolean)newValue);
				return;
			case ChatbotProfilePackage.PROPERTY_CONFIG__BASE_PROPERTY:
				setBase_Property((Property)newValue);
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
			case ChatbotProfilePackage.PROPERTY_CONFIG__TO_EXPOSE:
				setToExpose(TO_EXPOSE_EDEFAULT);
				return;
			case ChatbotProfilePackage.PROPERTY_CONFIG__TO_FILTER_WITH:
				setToFilterWith(TO_FILTER_WITH_EDEFAULT);
				return;
			case ChatbotProfilePackage.PROPERTY_CONFIG__BASE_PROPERTY:
				setBase_Property((Property)null);
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
			case ChatbotProfilePackage.PROPERTY_CONFIG__TO_EXPOSE:
				return toExpose != TO_EXPOSE_EDEFAULT;
			case ChatbotProfilePackage.PROPERTY_CONFIG__TO_FILTER_WITH:
				return toFilterWith != TO_FILTER_WITH_EDEFAULT;
			case ChatbotProfilePackage.PROPERTY_CONFIG__BASE_PROPERTY:
				return base_Property != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (toExpose: ");
		result.append(toExpose);
		result.append(", toFilterWith: ");
		result.append(toFilterWith);
		result.append(')');
		return result.toString();
	}

} //PropertyConfigImpl
