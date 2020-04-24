/**
 */
package edu.uoc.som.oda.profile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Socrata Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.oda.profile.SocrataField#getFieldName <em>Field Name</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.oda.profile.OpenDataProfilePackage#getSocrataField()
 * @model
 * @generated
 */
public interface SocrataField extends OpenDataField {
	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see edu.uoc.som.oda.profile.OpenDataProfilePackage#getSocrataField_FieldName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profile.SocrataField#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

} // SocrataField
