/**
 */
package edu.uoc.som.oda.profiles.opendata;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Data API Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getId <em>Id</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getCategory <em>Category</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getDataUri <em>Data Uri</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getDomain <em>Domain</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getLicense <em>License</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getWebUri <em>Web Uri</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getTags <em>Tags</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getApiType <em>Api Type</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getApiTypeVersion <em>Api Type Version</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails()
 * @model
 * @generated
 */
public interface OpenDataAPIDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails_Category()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Data Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Uri</em>' attribute.
	 * @see #setDataUri(String)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails_DataUri()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDataUri();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getDataUri <em>Data Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Uri</em>' attribute.
	 * @see #getDataUri()
	 * @generated
	 */
	void setDataUri(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails_Domain()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails_License()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Web Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Uri</em>' attribute.
	 * @see #setWebUri(String)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails_WebUri()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getWebUri();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getWebUri <em>Web Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Uri</em>' attribute.
	 * @see #getWebUri()
	 * @generated
	 */
	void setWebUri(String value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails_Tags()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getTags();

	/**
	 * Returns the value of the '<em><b>Api Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Type</em>' attribute.
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataAPIType
	 * @see #setApiType(OpenDataAPIType)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails_ApiType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OpenDataAPIType getApiType();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getApiType <em>Api Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Type</em>' attribute.
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataAPIType
	 * @see #getApiType()
	 * @generated
	 */
	void setApiType(OpenDataAPIType value);

	/**
	 * Returns the value of the '<em><b>Api Type Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Type Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Type Version</em>' attribute.
	 * @see #setApiTypeVersion(String)
	 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getOpenDataAPIDetails_ApiTypeVersion()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getApiTypeVersion();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.opendata.OpenDataAPIDetails#getApiTypeVersion <em>Api Type Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Type Version</em>' attribute.
	 * @see #getApiTypeVersion()
	 * @generated
	 */
	void setApiTypeVersion(String value);

} // OpenDataAPIDetails
