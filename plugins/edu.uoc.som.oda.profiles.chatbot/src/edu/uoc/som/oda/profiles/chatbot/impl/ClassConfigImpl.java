/**
 */
package edu.uoc.som.oda.profiles.chatbot.impl;

import edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage;
import edu.uoc.som.oda.profiles.chatbot.ClassConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.impl.ClassConfigImpl#isToExpose <em>To Expose</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.impl.ClassConfigImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassConfigImpl extends MinimalEObjectImpl.Container implements ClassConfig {
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
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChatbotProfilePackage.Literals.CLASS_CONFIG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChatbotProfilePackage.CLASS_CONFIG__TO_EXPOSE, oldToExpose, toExpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChatbotProfilePackage.CLASS_CONFIG__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChatbotProfilePackage.CLASS_CONFIG__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChatbotProfilePackage.CLASS_CONFIG__TO_EXPOSE:
				return isToExpose();
			case ChatbotProfilePackage.CLASS_CONFIG__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
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
			case ChatbotProfilePackage.CLASS_CONFIG__TO_EXPOSE:
				setToExpose((Boolean)newValue);
				return;
			case ChatbotProfilePackage.CLASS_CONFIG__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
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
			case ChatbotProfilePackage.CLASS_CONFIG__TO_EXPOSE:
				setToExpose(TO_EXPOSE_EDEFAULT);
				return;
			case ChatbotProfilePackage.CLASS_CONFIG__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
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
			case ChatbotProfilePackage.CLASS_CONFIG__TO_EXPOSE:
				return toExpose != TO_EXPOSE_EDEFAULT;
			case ChatbotProfilePackage.CLASS_CONFIG__BASE_CLASS:
				return base_Class != null;
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
		result.append(')');
		return result.toString();
	}

} //ClassConfigImpl
