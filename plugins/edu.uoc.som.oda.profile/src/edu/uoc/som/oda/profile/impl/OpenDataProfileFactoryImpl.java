/**
 */
package edu.uoc.som.oda.profile.impl;

import edu.uoc.som.oda.profile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenDataProfileFactoryImpl extends EFactoryImpl implements OpenDataProfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenDataProfileFactory init() {
		try {
			OpenDataProfileFactory theOpenDataProfileFactory = (OpenDataProfileFactory)EPackage.Registry.INSTANCE.getEFactory(OpenDataProfilePackage.eNS_URI);
			if (theOpenDataProfileFactory != null) {
				return theOpenDataProfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenDataProfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDataProfileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS: return createOpenDataAPIDetails();
			case OpenDataProfilePackage.SOCRATA_FIELD: return createSocrataField();
			case OpenDataProfilePackage.ADHOC_FIELD: return createAdhocField();
			case OpenDataProfilePackage.CKAN_FIELD: return createCKanField();
			case OpenDataProfilePackage.ODATA_FIELD: return createODataField();
			case OpenDataProfilePackage.SOCRATA_FIELD_TYPE: return createSocrataFieldType();
			case OpenDataProfilePackage.CKAN_FIELD_TYPE: return createCkanFieldType();
			case OpenDataProfilePackage.ODATA_FIELD_TYPE: return createODataFieldType();
			case OpenDataProfilePackage.ADHOC_FIELD_TYPE: return createAdhocFieldType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OpenDataProfilePackage.OPEN_DATA_API_TYPE:
				return createOpenDataAPITypeFromString(eDataType, initialValue);
			case OpenDataProfilePackage.SOCRATA_FIELD_TYPE_KIND:
				return createSocrataFieldTypeKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OpenDataProfilePackage.OPEN_DATA_API_TYPE:
				return convertOpenDataAPITypeToString(eDataType, instanceValue);
			case OpenDataProfilePackage.SOCRATA_FIELD_TYPE_KIND:
				return convertSocrataFieldTypeKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenDataAPIDetails createOpenDataAPIDetails() {
		OpenDataAPIDetailsImpl openDataAPIDetails = new OpenDataAPIDetailsImpl();
		return openDataAPIDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocrataField createSocrataField() {
		SocrataFieldImpl socrataField = new SocrataFieldImpl();
		return socrataField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdhocField createAdhocField() {
		AdhocFieldImpl adhocField = new AdhocFieldImpl();
		return adhocField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CKanField createCKanField() {
		CKanFieldImpl cKanField = new CKanFieldImpl();
		return cKanField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ODataField createODataField() {
		ODataFieldImpl oDataField = new ODataFieldImpl();
		return oDataField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocrataFieldType createSocrataFieldType() {
		SocrataFieldTypeImpl socrataFieldType = new SocrataFieldTypeImpl();
		return socrataFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CkanFieldType createCkanFieldType() {
		CkanFieldTypeImpl ckanFieldType = new CkanFieldTypeImpl();
		return ckanFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ODataFieldType createODataFieldType() {
		ODataFieldTypeImpl oDataFieldType = new ODataFieldTypeImpl();
		return oDataFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdhocFieldType createAdhocFieldType() {
		AdhocFieldTypeImpl adhocFieldType = new AdhocFieldTypeImpl();
		return adhocFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDataAPIType createOpenDataAPITypeFromString(EDataType eDataType, String initialValue) {
		OpenDataAPIType result = OpenDataAPIType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpenDataAPITypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocrataFieldTypeKind createSocrataFieldTypeKindFromString(EDataType eDataType, String initialValue) {
		SocrataFieldTypeKind result = SocrataFieldTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSocrataFieldTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenDataProfilePackage getOpenDataProfilePackage() {
		return (OpenDataProfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenDataProfilePackage getPackage() {
		return OpenDataProfilePackage.eINSTANCE;
	}

} //OpenDataProfileFactoryImpl
