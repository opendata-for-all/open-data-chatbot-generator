/**
 */
package edu.uoc.som.oda.profile.util;

import edu.uoc.som.oda.profile.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.oda.profile.OpenDataProfilePackage
 * @generated
 */
public class OpenDataProfileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenDataProfilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDataProfileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OpenDataProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenDataProfileSwitch<Adapter> modelSwitch =
		new OpenDataProfileSwitch<Adapter>() {
			@Override
			public Adapter caseOpenDataAPIDetails(OpenDataAPIDetails object) {
				return createOpenDataAPIDetailsAdapter();
			}
			@Override
			public Adapter caseOpenDataField(OpenDataField object) {
				return createOpenDataFieldAdapter();
			}
			@Override
			public Adapter caseSocrataField(SocrataField object) {
				return createSocrataFieldAdapter();
			}
			@Override
			public Adapter caseAdhocField(AdhocField object) {
				return createAdhocFieldAdapter();
			}
			@Override
			public Adapter caseCKanField(CKanField object) {
				return createCKanFieldAdapter();
			}
			@Override
			public Adapter caseODataField(ODataField object) {
				return createODataFieldAdapter();
			}
			@Override
			public Adapter caseOpenDataFieldType(OpenDataFieldType object) {
				return createOpenDataFieldTypeAdapter();
			}
			@Override
			public Adapter caseSocrataFieldType(SocrataFieldType object) {
				return createSocrataFieldTypeAdapter();
			}
			@Override
			public Adapter caseCkanFieldType(CkanFieldType object) {
				return createCkanFieldTypeAdapter();
			}
			@Override
			public Adapter caseODataFieldType(ODataFieldType object) {
				return createODataFieldTypeAdapter();
			}
			@Override
			public Adapter caseAdhocFieldType(AdhocFieldType object) {
				return createAdhocFieldTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.oda.profile.OpenDataAPIDetails <em>Open Data API Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.oda.profile.OpenDataAPIDetails
	 * @generated
	 */
	public Adapter createOpenDataAPIDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.oda.profile.OpenDataField <em>Open Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.oda.profile.OpenDataField
	 * @generated
	 */
	public Adapter createOpenDataFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.oda.profile.SocrataField <em>Socrata Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.oda.profile.SocrataField
	 * @generated
	 */
	public Adapter createSocrataFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.oda.profile.AdhocField <em>Adhoc Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.oda.profile.AdhocField
	 * @generated
	 */
	public Adapter createAdhocFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.oda.profile.CKanField <em>CKan Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.oda.profile.CKanField
	 * @generated
	 */
	public Adapter createCKanFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.oda.profile.ODataField <em>OData Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.oda.profile.ODataField
	 * @generated
	 */
	public Adapter createODataFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.oda.profile.OpenDataFieldType <em>Open Data Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.oda.profile.OpenDataFieldType
	 * @generated
	 */
	public Adapter createOpenDataFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.oda.profile.SocrataFieldType <em>Socrata Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.oda.profile.SocrataFieldType
	 * @generated
	 */
	public Adapter createSocrataFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.oda.profile.CkanFieldType <em>Ckan Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.oda.profile.CkanFieldType
	 * @generated
	 */
	public Adapter createCkanFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.oda.profile.ODataFieldType <em>OData Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.oda.profile.ODataFieldType
	 * @generated
	 */
	public Adapter createODataFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.uoc.som.oda.profile.AdhocFieldType <em>Adhoc Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.uoc.som.oda.profile.AdhocFieldType
	 * @generated
	 */
	public Adapter createAdhocFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OpenDataProfileAdapterFactory
