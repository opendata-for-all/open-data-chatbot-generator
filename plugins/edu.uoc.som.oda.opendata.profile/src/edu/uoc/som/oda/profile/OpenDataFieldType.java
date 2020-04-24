/**
 */
package edu.uoc.som.oda.profile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Data Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.oda.profile.OpenDataFieldType#getBase_Type <em>Base Type</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.oda.profile.OpenDataProfilePackage#getOpenDataFieldType()
 * @model abstract="true"
 * @generated
 */
public interface OpenDataFieldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' reference.
	 * @see #setBase_Type(Type)
	 * @see edu.uoc.som.oda.profile.OpenDataProfilePackage#getOpenDataFieldType_Base_Type()
	 * @model ordered="false"
	 * @generated
	 */
	Type getBase_Type();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profile.OpenDataFieldType#getBase_Type <em>Base Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' reference.
	 * @see #getBase_Type()
	 * @generated
	 */
	void setBase_Type(Type value);

} // OpenDataFieldType
