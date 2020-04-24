/**
 */
package edu.uoc.som.oda.profiles.opendata.util;

import edu.uoc.som.oda.profiles.opendata.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage
 * @generated
 */
public class OpenDataProfileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenDataProfilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDataProfileSwitch() {
		if (modelPackage == null) {
			modelPackage = OpenDataProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS: {
				OpenDataAPIDetails openDataAPIDetails = (OpenDataAPIDetails)theEObject;
				T result = caseOpenDataAPIDetails(openDataAPIDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenDataProfilePackage.OPEN_DATA_FIELD: {
				OpenDataField openDataField = (OpenDataField)theEObject;
				T result = caseOpenDataField(openDataField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenDataProfilePackage.SOCRATA_FIELD: {
				SocrataField socrataField = (SocrataField)theEObject;
				T result = caseSocrataField(socrataField);
				if (result == null) result = caseOpenDataField(socrataField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenDataProfilePackage.ADHOC_FIELD: {
				AdhocField adhocField = (AdhocField)theEObject;
				T result = caseAdhocField(adhocField);
				if (result == null) result = caseOpenDataField(adhocField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenDataProfilePackage.CKAN_FIELD: {
				CKanField cKanField = (CKanField)theEObject;
				T result = caseCKanField(cKanField);
				if (result == null) result = caseOpenDataField(cKanField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenDataProfilePackage.ODATA_FIELD: {
				ODataField oDataField = (ODataField)theEObject;
				T result = caseODataField(oDataField);
				if (result == null) result = caseOpenDataField(oDataField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenDataProfilePackage.OPEN_DATA_FIELD_TYPE: {
				OpenDataFieldType openDataFieldType = (OpenDataFieldType)theEObject;
				T result = caseOpenDataFieldType(openDataFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenDataProfilePackage.SOCRATA_FIELD_TYPE: {
				SocrataFieldType socrataFieldType = (SocrataFieldType)theEObject;
				T result = caseSocrataFieldType(socrataFieldType);
				if (result == null) result = caseOpenDataFieldType(socrataFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenDataProfilePackage.CKAN_FIELD_TYPE: {
				CkanFieldType ckanFieldType = (CkanFieldType)theEObject;
				T result = caseCkanFieldType(ckanFieldType);
				if (result == null) result = caseOpenDataFieldType(ckanFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenDataProfilePackage.ODATA_FIELD_TYPE: {
				ODataFieldType oDataFieldType = (ODataFieldType)theEObject;
				T result = caseODataFieldType(oDataFieldType);
				if (result == null) result = caseOpenDataFieldType(oDataFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenDataProfilePackage.ADHOC_FIELD_TYPE: {
				AdhocFieldType adhocFieldType = (AdhocFieldType)theEObject;
				T result = caseAdhocFieldType(adhocFieldType);
				if (result == null) result = caseOpenDataFieldType(adhocFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Data API Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Data API Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDataAPIDetails(OpenDataAPIDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Data Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Data Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDataField(OpenDataField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Socrata Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Socrata Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocrataField(SocrataField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adhoc Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adhoc Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdhocField(AdhocField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CKan Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CKan Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCKanField(CKanField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OData Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OData Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODataField(ODataField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Data Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Data Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDataFieldType(OpenDataFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Socrata Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Socrata Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocrataFieldType(SocrataFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ckan Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ckan Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCkanFieldType(CkanFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OData Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OData Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODataFieldType(ODataFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adhoc Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adhoc Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdhocFieldType(AdhocFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OpenDataProfileSwitch
