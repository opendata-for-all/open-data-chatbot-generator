/**
 */
package edu.uoc.som.oda.profile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Socrata Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.oda.profile.SocrataFieldType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.oda.profile.OpenDataProfilePackage#getSocrataFieldType()
 * @model
 * @generated
 */
public interface SocrataFieldType extends OpenDataFieldType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.oda.profile.SocrataFieldTypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.uoc.som.oda.profile.SocrataFieldTypeKind
	 * @see #setType(SocrataFieldTypeKind)
	 * @see edu.uoc.som.oda.profile.OpenDataProfilePackage#getSocrataFieldType_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SocrataFieldTypeKind getType();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profile.SocrataFieldType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.uoc.som.oda.profile.SocrataFieldTypeKind
	 * @see #getType()
	 * @generated
	 */
	void setType(SocrataFieldTypeKind value);

} // SocrataFieldType
