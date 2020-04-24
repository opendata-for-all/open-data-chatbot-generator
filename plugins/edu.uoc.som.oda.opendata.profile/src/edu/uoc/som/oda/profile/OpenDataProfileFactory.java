/**
 */
package edu.uoc.som.oda.profile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.oda.profile.OpenDataProfilePackage
 * @generated
 */
public interface OpenDataProfileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenDataProfileFactory eINSTANCE = edu.uoc.som.oda.profile.impl.OpenDataProfileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Open Data API Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Data API Details</em>'.
	 * @generated
	 */
	OpenDataAPIDetails createOpenDataAPIDetails();

	/**
	 * Returns a new object of class '<em>Socrata Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Socrata Field</em>'.
	 * @generated
	 */
	SocrataField createSocrataField();

	/**
	 * Returns a new object of class '<em>Adhoc Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adhoc Field</em>'.
	 * @generated
	 */
	AdhocField createAdhocField();

	/**
	 * Returns a new object of class '<em>CKan Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CKan Field</em>'.
	 * @generated
	 */
	CKanField createCKanField();

	/**
	 * Returns a new object of class '<em>OData Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OData Field</em>'.
	 * @generated
	 */
	ODataField createODataField();

	/**
	 * Returns a new object of class '<em>Socrata Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Socrata Field Type</em>'.
	 * @generated
	 */
	SocrataFieldType createSocrataFieldType();

	/**
	 * Returns a new object of class '<em>Ckan Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ckan Field Type</em>'.
	 * @generated
	 */
	CkanFieldType createCkanFieldType();

	/**
	 * Returns a new object of class '<em>OData Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OData Field Type</em>'.
	 * @generated
	 */
	ODataFieldType createODataFieldType();

	/**
	 * Returns a new object of class '<em>Adhoc Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adhoc Field Type</em>'.
	 * @generated
	 */
	AdhocFieldType createAdhocFieldType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpenDataProfilePackage getOpenDataProfilePackage();

} //OpenDataProfileFactory
