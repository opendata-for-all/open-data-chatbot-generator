/**
 */
package edu.uoc.som.oda.profile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.uoc.som.oda.profile.OpenDataProfileFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OpenData'"
 * @generated
 */
public interface OpenDataProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "profile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uoc.edu/som/oda/profile/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oda";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenDataProfilePackage eINSTANCE = edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl <em>Open Data API Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getOpenDataAPIDetails()
	 * @generated
	 */
	int OPEN_DATA_API_DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS__CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Data Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS__DATA_URI = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS__DOMAIN = 6;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS__LICENSE = 7;

	/**
	 * The feature id for the '<em><b>Web Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS__WEB_URI = 8;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS__TAGS = 9;

	/**
	 * The feature id for the '<em><b>Api Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS__API_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Api Type Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS__API_TYPE_VERSION = 11;

	/**
	 * The number of structural features of the '<em>Open Data API Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Open Data API Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_API_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.impl.OpenDataFieldImpl <em>Open Data Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.impl.OpenDataFieldImpl
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getOpenDataField()
	 * @generated
	 */
	int OPEN_DATA_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_FIELD__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_FIELD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_FIELD__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Open Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_FIELD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Open Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.impl.SocrataFieldImpl <em>Socrata Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.impl.SocrataFieldImpl
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getSocrataField()
	 * @generated
	 */
	int SOCRATA_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCRATA_FIELD__BASE_PROPERTY = OPEN_DATA_FIELD__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCRATA_FIELD__NAME = OPEN_DATA_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCRATA_FIELD__DESCRIPTION = OPEN_DATA_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCRATA_FIELD__FIELD_NAME = OPEN_DATA_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Socrata Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCRATA_FIELD_FEATURE_COUNT = OPEN_DATA_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Socrata Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCRATA_FIELD_OPERATION_COUNT = OPEN_DATA_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.impl.AdhocFieldImpl <em>Adhoc Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.impl.AdhocFieldImpl
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getAdhocField()
	 * @generated
	 */
	int ADHOC_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_FIELD__BASE_PROPERTY = OPEN_DATA_FIELD__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_FIELD__NAME = OPEN_DATA_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_FIELD__DESCRIPTION = OPEN_DATA_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_FIELD__OPERATION = OPEN_DATA_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_FIELD__PARAMETER = OPEN_DATA_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Adhoc Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_FIELD_FEATURE_COUNT = OPEN_DATA_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Adhoc Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_FIELD_OPERATION_COUNT = OPEN_DATA_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.impl.CKanFieldImpl <em>CKan Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.impl.CKanFieldImpl
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getCKanField()
	 * @generated
	 */
	int CKAN_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CKAN_FIELD__BASE_PROPERTY = OPEN_DATA_FIELD__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CKAN_FIELD__NAME = OPEN_DATA_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CKAN_FIELD__DESCRIPTION = OPEN_DATA_FIELD__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>CKan Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CKAN_FIELD_FEATURE_COUNT = OPEN_DATA_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CKan Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CKAN_FIELD_OPERATION_COUNT = OPEN_DATA_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.impl.ODataFieldImpl <em>OData Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.impl.ODataFieldImpl
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getODataField()
	 * @generated
	 */
	int ODATA_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_FIELD__BASE_PROPERTY = OPEN_DATA_FIELD__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_FIELD__NAME = OPEN_DATA_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_FIELD__DESCRIPTION = OPEN_DATA_FIELD__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>OData Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_FIELD_FEATURE_COUNT = OPEN_DATA_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OData Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_FIELD_OPERATION_COUNT = OPEN_DATA_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.impl.OpenDataFieldTypeImpl <em>Open Data Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.impl.OpenDataFieldTypeImpl
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getOpenDataFieldType()
	 * @generated
	 */
	int OPEN_DATA_FIELD_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_FIELD_TYPE__BASE_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Open Data Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_FIELD_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Open Data Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DATA_FIELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.impl.SocrataFieldTypeImpl <em>Socrata Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.impl.SocrataFieldTypeImpl
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getSocrataFieldType()
	 * @generated
	 */
	int SOCRATA_FIELD_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCRATA_FIELD_TYPE__BASE_TYPE = OPEN_DATA_FIELD_TYPE__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCRATA_FIELD_TYPE__TYPE = OPEN_DATA_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Socrata Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCRATA_FIELD_TYPE_FEATURE_COUNT = OPEN_DATA_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Socrata Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCRATA_FIELD_TYPE_OPERATION_COUNT = OPEN_DATA_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.impl.CkanFieldTypeImpl <em>Ckan Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.impl.CkanFieldTypeImpl
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getCkanFieldType()
	 * @generated
	 */
	int CKAN_FIELD_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CKAN_FIELD_TYPE__BASE_TYPE = OPEN_DATA_FIELD_TYPE__BASE_TYPE;

	/**
	 * The number of structural features of the '<em>Ckan Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CKAN_FIELD_TYPE_FEATURE_COUNT = OPEN_DATA_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ckan Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CKAN_FIELD_TYPE_OPERATION_COUNT = OPEN_DATA_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.impl.ODataFieldTypeImpl <em>OData Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.impl.ODataFieldTypeImpl
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getODataFieldType()
	 * @generated
	 */
	int ODATA_FIELD_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_FIELD_TYPE__BASE_TYPE = OPEN_DATA_FIELD_TYPE__BASE_TYPE;

	/**
	 * The number of structural features of the '<em>OData Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_FIELD_TYPE_FEATURE_COUNT = OPEN_DATA_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OData Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_FIELD_TYPE_OPERATION_COUNT = OPEN_DATA_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.impl.AdhocFieldTypeImpl <em>Adhoc Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.impl.AdhocFieldTypeImpl
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getAdhocFieldType()
	 * @generated
	 */
	int ADHOC_FIELD_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_FIELD_TYPE__BASE_TYPE = OPEN_DATA_FIELD_TYPE__BASE_TYPE;

	/**
	 * The number of structural features of the '<em>Adhoc Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_FIELD_TYPE_FEATURE_COUNT = OPEN_DATA_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Adhoc Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADHOC_FIELD_TYPE_OPERATION_COUNT = OPEN_DATA_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.OpenDataAPIType <em>Open Data API Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.OpenDataAPIType
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getOpenDataAPIType()
	 * @generated
	 */
	int OPEN_DATA_API_TYPE = 11;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profile.SocrataFieldTypeKind <em>Socrata Field Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profile.SocrataFieldTypeKind
	 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getSocrataFieldTypeKind()
	 * @generated
	 */
	int SOCRATA_FIELD_TYPE_KIND = 12;


	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails <em>Open Data API Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Data API Details</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails
	 * @generated
	 */
	EClass getOpenDataAPIDetails();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails#getBase_Class()
	 * @see #getOpenDataAPIDetails()
	 * @generated
	 */
	EReference getOpenDataAPIDetails_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails#getId()
	 * @see #getOpenDataAPIDetails()
	 * @generated
	 */
	EAttribute getOpenDataAPIDetails_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails#getName()
	 * @see #getOpenDataAPIDetails()
	 * @generated
	 */
	EAttribute getOpenDataAPIDetails_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails#getCategory()
	 * @see #getOpenDataAPIDetails()
	 * @generated
	 */
	EAttribute getOpenDataAPIDetails_Category();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails#getDataUri <em>Data Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Uri</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails#getDataUri()
	 * @see #getOpenDataAPIDetails()
	 * @generated
	 */
	EAttribute getOpenDataAPIDetails_DataUri();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails#getDescription()
	 * @see #getOpenDataAPIDetails()
	 * @generated
	 */
	EAttribute getOpenDataAPIDetails_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails#getDomain()
	 * @see #getOpenDataAPIDetails()
	 * @generated
	 */
	EAttribute getOpenDataAPIDetails_Domain();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails#getLicense()
	 * @see #getOpenDataAPIDetails()
	 * @generated
	 */
	EAttribute getOpenDataAPIDetails_License();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails#getWebUri <em>Web Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Uri</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails#getWebUri()
	 * @see #getOpenDataAPIDetails()
	 * @generated
	 */
	EAttribute getOpenDataAPIDetails_WebUri();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails#getTags()
	 * @see #getOpenDataAPIDetails()
	 * @generated
	 */
	EAttribute getOpenDataAPIDetails_Tags();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails#getApiType <em>Api Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Type</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails#getApiType()
	 * @see #getOpenDataAPIDetails()
	 * @generated
	 */
	EAttribute getOpenDataAPIDetails_ApiType();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails#getApiTypeVersion <em>Api Type Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Type Version</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails#getApiTypeVersion()
	 * @see #getOpenDataAPIDetails()
	 * @generated
	 */
	EAttribute getOpenDataAPIDetails_ApiTypeVersion();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profile.OpenDataField <em>Open Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Data Field</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataField
	 * @generated
	 */
	EClass getOpenDataField();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.oda.profile.OpenDataField#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataField#getBase_Property()
	 * @see #getOpenDataField()
	 * @generated
	 */
	EReference getOpenDataField_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.OpenDataField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataField#getName()
	 * @see #getOpenDataField()
	 * @generated
	 */
	EAttribute getOpenDataField_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.OpenDataField#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataField#getDescription()
	 * @see #getOpenDataField()
	 * @generated
	 */
	EAttribute getOpenDataField_Description();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profile.SocrataField <em>Socrata Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Socrata Field</em>'.
	 * @see edu.uoc.som.oda.profile.SocrataField
	 * @generated
	 */
	EClass getSocrataField();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.SocrataField#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see edu.uoc.som.oda.profile.SocrataField#getFieldName()
	 * @see #getSocrataField()
	 * @generated
	 */
	EAttribute getSocrataField_FieldName();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profile.AdhocField <em>Adhoc Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adhoc Field</em>'.
	 * @see edu.uoc.som.oda.profile.AdhocField
	 * @generated
	 */
	EClass getAdhocField();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.oda.profile.AdhocField#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see edu.uoc.som.oda.profile.AdhocField#getOperation()
	 * @see #getAdhocField()
	 * @generated
	 */
	EReference getAdhocField_Operation();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.oda.profile.AdhocField#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.uoc.som.oda.profile.AdhocField#getParameter()
	 * @see #getAdhocField()
	 * @generated
	 */
	EReference getAdhocField_Parameter();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profile.CKanField <em>CKan Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CKan Field</em>'.
	 * @see edu.uoc.som.oda.profile.CKanField
	 * @generated
	 */
	EClass getCKanField();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profile.ODataField <em>OData Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OData Field</em>'.
	 * @see edu.uoc.som.oda.profile.ODataField
	 * @generated
	 */
	EClass getODataField();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profile.OpenDataFieldType <em>Open Data Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Data Field Type</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataFieldType
	 * @generated
	 */
	EClass getOpenDataFieldType();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.oda.profile.OpenDataFieldType#getBase_Type <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Type</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataFieldType#getBase_Type()
	 * @see #getOpenDataFieldType()
	 * @generated
	 */
	EReference getOpenDataFieldType_Base_Type();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profile.SocrataFieldType <em>Socrata Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Socrata Field Type</em>'.
	 * @see edu.uoc.som.oda.profile.SocrataFieldType
	 * @generated
	 */
	EClass getSocrataFieldType();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profile.SocrataFieldType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.uoc.som.oda.profile.SocrataFieldType#getType()
	 * @see #getSocrataFieldType()
	 * @generated
	 */
	EAttribute getSocrataFieldType_Type();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profile.CkanFieldType <em>Ckan Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ckan Field Type</em>'.
	 * @see edu.uoc.som.oda.profile.CkanFieldType
	 * @generated
	 */
	EClass getCkanFieldType();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profile.ODataFieldType <em>OData Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OData Field Type</em>'.
	 * @see edu.uoc.som.oda.profile.ODataFieldType
	 * @generated
	 */
	EClass getODataFieldType();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profile.AdhocFieldType <em>Adhoc Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adhoc Field Type</em>'.
	 * @see edu.uoc.som.oda.profile.AdhocFieldType
	 * @generated
	 */
	EClass getAdhocFieldType();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.oda.profile.OpenDataAPIType <em>Open Data API Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Open Data API Type</em>'.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIType
	 * @generated
	 */
	EEnum getOpenDataAPIType();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.oda.profile.SocrataFieldTypeKind <em>Socrata Field Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Socrata Field Type Kind</em>'.
	 * @see edu.uoc.som.oda.profile.SocrataFieldTypeKind
	 * @generated
	 */
	EEnum getSocrataFieldTypeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenDataProfileFactory getOpenDataProfileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl <em>Open Data API Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getOpenDataAPIDetails()
		 * @generated
		 */
		EClass OPEN_DATA_API_DETAILS = eINSTANCE.getOpenDataAPIDetails();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_DATA_API_DETAILS__BASE_CLASS = eINSTANCE.getOpenDataAPIDetails_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_API_DETAILS__ID = eINSTANCE.getOpenDataAPIDetails_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_API_DETAILS__NAME = eINSTANCE.getOpenDataAPIDetails_Name();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_API_DETAILS__CATEGORY = eINSTANCE.getOpenDataAPIDetails_Category();

		/**
		 * The meta object literal for the '<em><b>Data Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_API_DETAILS__DATA_URI = eINSTANCE.getOpenDataAPIDetails_DataUri();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_API_DETAILS__DESCRIPTION = eINSTANCE.getOpenDataAPIDetails_Description();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_API_DETAILS__DOMAIN = eINSTANCE.getOpenDataAPIDetails_Domain();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_API_DETAILS__LICENSE = eINSTANCE.getOpenDataAPIDetails_License();

		/**
		 * The meta object literal for the '<em><b>Web Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_API_DETAILS__WEB_URI = eINSTANCE.getOpenDataAPIDetails_WebUri();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_API_DETAILS__TAGS = eINSTANCE.getOpenDataAPIDetails_Tags();

		/**
		 * The meta object literal for the '<em><b>Api Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_API_DETAILS__API_TYPE = eINSTANCE.getOpenDataAPIDetails_ApiType();

		/**
		 * The meta object literal for the '<em><b>Api Type Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_API_DETAILS__API_TYPE_VERSION = eINSTANCE.getOpenDataAPIDetails_ApiTypeVersion();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.impl.OpenDataFieldImpl <em>Open Data Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.impl.OpenDataFieldImpl
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getOpenDataField()
		 * @generated
		 */
		EClass OPEN_DATA_FIELD = eINSTANCE.getOpenDataField();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_DATA_FIELD__BASE_PROPERTY = eINSTANCE.getOpenDataField_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_FIELD__NAME = eINSTANCE.getOpenDataField_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DATA_FIELD__DESCRIPTION = eINSTANCE.getOpenDataField_Description();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.impl.SocrataFieldImpl <em>Socrata Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.impl.SocrataFieldImpl
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getSocrataField()
		 * @generated
		 */
		EClass SOCRATA_FIELD = eINSTANCE.getSocrataField();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCRATA_FIELD__FIELD_NAME = eINSTANCE.getSocrataField_FieldName();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.impl.AdhocFieldImpl <em>Adhoc Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.impl.AdhocFieldImpl
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getAdhocField()
		 * @generated
		 */
		EClass ADHOC_FIELD = eINSTANCE.getAdhocField();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADHOC_FIELD__OPERATION = eINSTANCE.getAdhocField_Operation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADHOC_FIELD__PARAMETER = eINSTANCE.getAdhocField_Parameter();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.impl.CKanFieldImpl <em>CKan Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.impl.CKanFieldImpl
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getCKanField()
		 * @generated
		 */
		EClass CKAN_FIELD = eINSTANCE.getCKanField();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.impl.ODataFieldImpl <em>OData Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.impl.ODataFieldImpl
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getODataField()
		 * @generated
		 */
		EClass ODATA_FIELD = eINSTANCE.getODataField();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.impl.OpenDataFieldTypeImpl <em>Open Data Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.impl.OpenDataFieldTypeImpl
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getOpenDataFieldType()
		 * @generated
		 */
		EClass OPEN_DATA_FIELD_TYPE = eINSTANCE.getOpenDataFieldType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_DATA_FIELD_TYPE__BASE_TYPE = eINSTANCE.getOpenDataFieldType_Base_Type();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.impl.SocrataFieldTypeImpl <em>Socrata Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.impl.SocrataFieldTypeImpl
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getSocrataFieldType()
		 * @generated
		 */
		EClass SOCRATA_FIELD_TYPE = eINSTANCE.getSocrataFieldType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCRATA_FIELD_TYPE__TYPE = eINSTANCE.getSocrataFieldType_Type();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.impl.CkanFieldTypeImpl <em>Ckan Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.impl.CkanFieldTypeImpl
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getCkanFieldType()
		 * @generated
		 */
		EClass CKAN_FIELD_TYPE = eINSTANCE.getCkanFieldType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.impl.ODataFieldTypeImpl <em>OData Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.impl.ODataFieldTypeImpl
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getODataFieldType()
		 * @generated
		 */
		EClass ODATA_FIELD_TYPE = eINSTANCE.getODataFieldType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.impl.AdhocFieldTypeImpl <em>Adhoc Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.impl.AdhocFieldTypeImpl
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getAdhocFieldType()
		 * @generated
		 */
		EClass ADHOC_FIELD_TYPE = eINSTANCE.getAdhocFieldType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.OpenDataAPIType <em>Open Data API Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.OpenDataAPIType
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getOpenDataAPIType()
		 * @generated
		 */
		EEnum OPEN_DATA_API_TYPE = eINSTANCE.getOpenDataAPIType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profile.SocrataFieldTypeKind <em>Socrata Field Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profile.SocrataFieldTypeKind
		 * @see edu.uoc.som.oda.profile.impl.OpenDataProfilePackageImpl#getSocrataFieldTypeKind()
		 * @generated
		 */
		EEnum SOCRATA_FIELD_TYPE_KIND = eINSTANCE.getSocrataFieldTypeKind();

	}

} //OpenDataProfilePackage
