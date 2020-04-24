/**
 */
package edu.uoc.som.oda.profiles.opendata.impl;

import edu.uoc.som.oda.profiles.opendata.AdhocField;
import edu.uoc.som.oda.profiles.opendata.AdhocFieldType;
import edu.uoc.som.oda.profiles.opendata.CKanField;
import edu.uoc.som.oda.profiles.opendata.CkanFieldType;
import edu.uoc.som.oda.profiles.opendata.ODataField;
import edu.uoc.som.oda.profiles.opendata.ODataFieldType;
import edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails;
import edu.uoc.som.oda.profiles.opendata.OpenDataAPIType;
import edu.uoc.som.oda.profiles.opendata.OpenDataField;
import edu.uoc.som.oda.profiles.opendata.OpenDataFieldType;
import edu.uoc.som.oda.profiles.opendata.OpenDataProfileFactory;
import edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage;
import edu.uoc.som.oda.profiles.opendata.SocrataField;
import edu.uoc.som.oda.profiles.opendata.SocrataFieldType;
import edu.uoc.som.oda.profiles.opendata.SocrataFieldTypeKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenDataProfilePackageImpl extends EPackageImpl implements OpenDataProfilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDataAPIDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDataFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socrataFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adhocFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cKanFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oDataFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDataFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socrataFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ckanFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oDataFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adhocFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum openDataAPITypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum socrataFieldTypeKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenDataProfilePackageImpl() {
		super(eNS_URI, OpenDataProfileFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OpenDataProfilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenDataProfilePackage init() {
		if (isInited) return (OpenDataProfilePackage)EPackage.Registry.INSTANCE.getEPackage(OpenDataProfilePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenDataProfilePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenDataProfilePackageImpl theOpenDataProfilePackage = registeredOpenDataProfilePackage instanceof OpenDataProfilePackageImpl ? (OpenDataProfilePackageImpl)registeredOpenDataProfilePackage : new OpenDataProfilePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOpenDataProfilePackage.createPackageContents();

		// Initialize created meta-data
		theOpenDataProfilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenDataProfilePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenDataProfilePackage.eNS_URI, theOpenDataProfilePackage);
		return theOpenDataProfilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenDataAPIDetails() {
		return openDataAPIDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOpenDataAPIDetails_Base_Class() {
		return (EReference)openDataAPIDetailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataAPIDetails_Id() {
		return (EAttribute)openDataAPIDetailsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataAPIDetails_Name() {
		return (EAttribute)openDataAPIDetailsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataAPIDetails_Category() {
		return (EAttribute)openDataAPIDetailsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataAPIDetails_DataUri() {
		return (EAttribute)openDataAPIDetailsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataAPIDetails_Description() {
		return (EAttribute)openDataAPIDetailsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataAPIDetails_Domain() {
		return (EAttribute)openDataAPIDetailsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataAPIDetails_License() {
		return (EAttribute)openDataAPIDetailsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataAPIDetails_WebUri() {
		return (EAttribute)openDataAPIDetailsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataAPIDetails_Tags() {
		return (EAttribute)openDataAPIDetailsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataAPIDetails_ApiType() {
		return (EAttribute)openDataAPIDetailsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataAPIDetails_ApiTypeVersion() {
		return (EAttribute)openDataAPIDetailsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenDataField() {
		return openDataFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOpenDataField_Base_Property() {
		return (EReference)openDataFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataField_Name() {
		return (EAttribute)openDataFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpenDataField_Description() {
		return (EAttribute)openDataFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSocrataField() {
		return socrataFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSocrataField_FieldName() {
		return (EAttribute)socrataFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdhocField() {
		return adhocFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdhocField_Operation() {
		return (EReference)adhocFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdhocField_Parameter() {
		return (EReference)adhocFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCKanField() {
		return cKanFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getODataField() {
		return oDataFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenDataFieldType() {
		return openDataFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOpenDataFieldType_Base_Type() {
		return (EReference)openDataFieldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSocrataFieldType() {
		return socrataFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSocrataFieldType_Type() {
		return (EAttribute)socrataFieldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCkanFieldType() {
		return ckanFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getODataFieldType() {
		return oDataFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdhocFieldType() {
		return adhocFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOpenDataAPIType() {
		return openDataAPITypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSocrataFieldTypeKind() {
		return socrataFieldTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenDataProfileFactory getOpenDataProfileFactory() {
		return (OpenDataProfileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		openDataAPIDetailsEClass = createEClass(OPEN_DATA_API_DETAILS);
		createEReference(openDataAPIDetailsEClass, OPEN_DATA_API_DETAILS__BASE_CLASS);
		createEAttribute(openDataAPIDetailsEClass, OPEN_DATA_API_DETAILS__ID);
		createEAttribute(openDataAPIDetailsEClass, OPEN_DATA_API_DETAILS__NAME);
		createEAttribute(openDataAPIDetailsEClass, OPEN_DATA_API_DETAILS__CATEGORY);
		createEAttribute(openDataAPIDetailsEClass, OPEN_DATA_API_DETAILS__DATA_URI);
		createEAttribute(openDataAPIDetailsEClass, OPEN_DATA_API_DETAILS__DESCRIPTION);
		createEAttribute(openDataAPIDetailsEClass, OPEN_DATA_API_DETAILS__DOMAIN);
		createEAttribute(openDataAPIDetailsEClass, OPEN_DATA_API_DETAILS__LICENSE);
		createEAttribute(openDataAPIDetailsEClass, OPEN_DATA_API_DETAILS__WEB_URI);
		createEAttribute(openDataAPIDetailsEClass, OPEN_DATA_API_DETAILS__TAGS);
		createEAttribute(openDataAPIDetailsEClass, OPEN_DATA_API_DETAILS__API_TYPE);
		createEAttribute(openDataAPIDetailsEClass, OPEN_DATA_API_DETAILS__API_TYPE_VERSION);

		openDataFieldEClass = createEClass(OPEN_DATA_FIELD);
		createEReference(openDataFieldEClass, OPEN_DATA_FIELD__BASE_PROPERTY);
		createEAttribute(openDataFieldEClass, OPEN_DATA_FIELD__NAME);
		createEAttribute(openDataFieldEClass, OPEN_DATA_FIELD__DESCRIPTION);

		socrataFieldEClass = createEClass(SOCRATA_FIELD);
		createEAttribute(socrataFieldEClass, SOCRATA_FIELD__FIELD_NAME);

		adhocFieldEClass = createEClass(ADHOC_FIELD);
		createEReference(adhocFieldEClass, ADHOC_FIELD__OPERATION);
		createEReference(adhocFieldEClass, ADHOC_FIELD__PARAMETER);

		cKanFieldEClass = createEClass(CKAN_FIELD);

		oDataFieldEClass = createEClass(ODATA_FIELD);

		openDataFieldTypeEClass = createEClass(OPEN_DATA_FIELD_TYPE);
		createEReference(openDataFieldTypeEClass, OPEN_DATA_FIELD_TYPE__BASE_TYPE);

		socrataFieldTypeEClass = createEClass(SOCRATA_FIELD_TYPE);
		createEAttribute(socrataFieldTypeEClass, SOCRATA_FIELD_TYPE__TYPE);

		ckanFieldTypeEClass = createEClass(CKAN_FIELD_TYPE);

		oDataFieldTypeEClass = createEClass(ODATA_FIELD_TYPE);

		adhocFieldTypeEClass = createEClass(ADHOC_FIELD_TYPE);

		// Create enums
		openDataAPITypeEEnum = createEEnum(OPEN_DATA_API_TYPE);
		socrataFieldTypeKindEEnum = createEEnum(SOCRATA_FIELD_TYPE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		socrataFieldEClass.getESuperTypes().add(this.getOpenDataField());
		adhocFieldEClass.getESuperTypes().add(this.getOpenDataField());
		cKanFieldEClass.getESuperTypes().add(this.getOpenDataField());
		oDataFieldEClass.getESuperTypes().add(this.getOpenDataField());
		socrataFieldTypeEClass.getESuperTypes().add(this.getOpenDataFieldType());
		ckanFieldTypeEClass.getESuperTypes().add(this.getOpenDataFieldType());
		oDataFieldTypeEClass.getESuperTypes().add(this.getOpenDataFieldType());
		adhocFieldTypeEClass.getESuperTypes().add(this.getOpenDataFieldType());

		// Initialize classes, features, and operations; add parameters
		initEClass(openDataAPIDetailsEClass, OpenDataAPIDetails.class, "OpenDataAPIDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpenDataAPIDetails_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, OpenDataAPIDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataAPIDetails_Id(), theTypesPackage.getString(), "id", null, 1, 1, OpenDataAPIDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataAPIDetails_Name(), theTypesPackage.getString(), "name", null, 1, 1, OpenDataAPIDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataAPIDetails_Category(), theTypesPackage.getString(), "category", null, 1, 1, OpenDataAPIDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataAPIDetails_DataUri(), theTypesPackage.getString(), "dataUri", null, 1, 1, OpenDataAPIDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataAPIDetails_Description(), theTypesPackage.getString(), "description", null, 1, 1, OpenDataAPIDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataAPIDetails_Domain(), theTypesPackage.getString(), "domain", null, 1, 1, OpenDataAPIDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataAPIDetails_License(), theTypesPackage.getString(), "license", null, 1, 1, OpenDataAPIDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataAPIDetails_WebUri(), theTypesPackage.getString(), "webUri", null, 1, 1, OpenDataAPIDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataAPIDetails_Tags(), theTypesPackage.getString(), "tags", null, 0, -1, OpenDataAPIDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataAPIDetails_ApiType(), this.getOpenDataAPIType(), "apiType", null, 1, 1, OpenDataAPIDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataAPIDetails_ApiTypeVersion(), theTypesPackage.getString(), "apiTypeVersion", null, 1, 1, OpenDataAPIDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(openDataFieldEClass, OpenDataField.class, "OpenDataField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpenDataField_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, OpenDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataField_Name(), theTypesPackage.getString(), "name", null, 1, 1, OpenDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenDataField_Description(), theTypesPackage.getString(), "description", null, 1, 1, OpenDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(socrataFieldEClass, SocrataField.class, "SocrataField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSocrataField_FieldName(), theTypesPackage.getString(), "fieldName", null, 1, 1, SocrataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(adhocFieldEClass, AdhocField.class, "AdhocField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdhocField_Operation(), theUMLPackage.getOperation(), null, "operation", null, 1, 1, AdhocField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdhocField_Parameter(), theUMLPackage.getParameter(), null, "parameter", null, 1, 1, AdhocField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cKanFieldEClass, CKanField.class, "CKanField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oDataFieldEClass, ODataField.class, "ODataField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDataFieldTypeEClass, OpenDataFieldType.class, "OpenDataFieldType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpenDataFieldType_Base_Type(), theUMLPackage.getType(), null, "base_Type", null, 0, 1, OpenDataFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(socrataFieldTypeEClass, SocrataFieldType.class, "SocrataFieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSocrataFieldType_Type(), this.getSocrataFieldTypeKind(), "type", null, 1, 1, SocrataFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ckanFieldTypeEClass, CkanFieldType.class, "CkanFieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oDataFieldTypeEClass, ODataFieldType.class, "ODataFieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adhocFieldTypeEClass, AdhocFieldType.class, "AdhocFieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(openDataAPITypeEEnum, OpenDataAPIType.class, "OpenDataAPIType");
		addEEnumLiteral(openDataAPITypeEEnum, OpenDataAPIType.UNDEFINED);
		addEEnumLiteral(openDataAPITypeEEnum, OpenDataAPIType.SOCRATA);
		addEEnumLiteral(openDataAPITypeEEnum, OpenDataAPIType.CKAN);
		addEEnumLiteral(openDataAPITypeEEnum, OpenDataAPIType.ODATA);
		addEEnumLiteral(openDataAPITypeEEnum, OpenDataAPIType.ADHOC);

		initEEnum(socrataFieldTypeKindEEnum, SocrataFieldTypeKind.class, "SocrataFieldTypeKind");
		addEEnumLiteral(socrataFieldTypeKindEEnum, SocrataFieldTypeKind.UNDEFINED);
		addEEnumLiteral(socrataFieldTypeKindEEnum, SocrataFieldTypeKind.CHECKBOX);
		addEEnumLiteral(socrataFieldTypeKindEEnum, SocrataFieldTypeKind.TEXT);
		addEEnumLiteral(socrataFieldTypeKindEEnum, SocrataFieldTypeKind.NUMBER);
		addEEnumLiteral(socrataFieldTypeKindEEnum, SocrataFieldTypeKind.DATE);
		addEEnumLiteral(socrataFieldTypeKindEEnum, SocrataFieldTypeKind.POINT);
		addEEnumLiteral(socrataFieldTypeKindEEnum, SocrataFieldTypeKind.MULTI_LINE);
		addEEnumLiteral(socrataFieldTypeKindEEnum, SocrataFieldTypeKind.MULTI_POINT);
		addEEnumLiteral(socrataFieldTypeKindEEnum, SocrataFieldTypeKind.POLYGON);
		addEEnumLiteral(socrataFieldTypeKindEEnum, SocrataFieldTypeKind.MULTI_POLYGON);
		addEEnumLiteral(socrataFieldTypeKindEEnum, SocrataFieldTypeKind.LOCATION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "originalName", "OpenData"
		   });
	}

} //OpenDataProfilePackageImpl
