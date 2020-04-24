/**
 */
package edu.uoc.som.oda.profiles.opendata;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adhoc Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.AdhocField#getOperation <em>Operation</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.AdhocField#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getAdhocField()
 * @model
 * @generated
 */
public interface AdhocField extends OpenDataField {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getAdhocField_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.AdhocField#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getAdhocField_Parameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.AdhocField#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // AdhocField
