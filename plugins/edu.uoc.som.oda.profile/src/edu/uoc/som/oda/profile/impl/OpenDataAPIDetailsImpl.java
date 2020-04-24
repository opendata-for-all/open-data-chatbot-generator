/**
 */
package edu.uoc.som.oda.profile.impl;

import edu.uoc.som.oda.profile.OpenDataAPIDetails;
import edu.uoc.som.oda.profile.OpenDataAPIType;
import edu.uoc.som.oda.profile.OpenDataProfilePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Data API Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl#getDataUri <em>Data Uri</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl#getLicense <em>License</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl#getWebUri <em>Web Uri</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl#getApiType <em>Api Type</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profile.impl.OpenDataAPIDetailsImpl#getApiTypeVersion <em>Api Type Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenDataAPIDetailsImpl extends MinimalEObjectImpl.Container implements OpenDataAPIDetails {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataUri() <em>Data Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataUri()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataUri() <em>Data Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataUri()
	 * @generated
	 * @ordered
	 */
	protected String dataUri = DATA_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebUri() <em>Web Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUri()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebUri() <em>Web Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUri()
	 * @generated
	 * @ordered
	 */
	protected String webUri = WEB_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The default value of the '{@link #getApiType() <em>Api Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiType()
	 * @generated
	 * @ordered
	 */
	protected static final OpenDataAPIType API_TYPE_EDEFAULT = OpenDataAPIType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getApiType() <em>Api Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiType()
	 * @generated
	 * @ordered
	 */
	protected OpenDataAPIType apiType = API_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiTypeVersion() <em>Api Type Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiTypeVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String API_TYPE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiTypeVersion() <em>Api Type Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiTypeVersion()
	 * @generated
	 * @ordered
	 */
	protected String apiTypeVersion = API_TYPE_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenDataAPIDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenDataProfilePackage.Literals.OPEN_DATA_API_DETAILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataUri() {
		return dataUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataUri(String newDataUri) {
		String oldDataUri = dataUri;
		dataUri = newDataUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DATA_URI, oldDataUri, dataUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebUri() {
		return webUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebUri(String newWebUri) {
		String oldWebUri = webUri;
		webUri = newWebUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__WEB_URI, oldWebUri, webUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenDataAPIType getApiType() {
		return apiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiType(OpenDataAPIType newApiType) {
		OpenDataAPIType oldApiType = apiType;
		apiType = newApiType == null ? API_TYPE_EDEFAULT : newApiType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__API_TYPE, oldApiType, apiType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiTypeVersion() {
		return apiTypeVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiTypeVersion(String newApiTypeVersion) {
		String oldApiTypeVersion = apiTypeVersion;
		apiTypeVersion = newApiTypeVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDataProfilePackage.OPEN_DATA_API_DETAILS__API_TYPE_VERSION, oldApiTypeVersion, apiTypeVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__ID:
				return getId();
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__NAME:
				return getName();
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__CATEGORY:
				return getCategory();
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DATA_URI:
				return getDataUri();
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DESCRIPTION:
				return getDescription();
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DOMAIN:
				return getDomain();
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__LICENSE:
				return getLicense();
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__WEB_URI:
				return getWebUri();
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__TAGS:
				return getTags();
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__API_TYPE:
				return getApiType();
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__API_TYPE_VERSION:
				return getApiTypeVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__ID:
				setId((String)newValue);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__NAME:
				setName((String)newValue);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__CATEGORY:
				setCategory((String)newValue);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DATA_URI:
				setDataUri((String)newValue);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DOMAIN:
				setDomain((String)newValue);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__LICENSE:
				setLicense((String)newValue);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__WEB_URI:
				setWebUri((String)newValue);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__API_TYPE:
				setApiType((OpenDataAPIType)newValue);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__API_TYPE_VERSION:
				setApiTypeVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__ID:
				setId(ID_EDEFAULT);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DATA_URI:
				setDataUri(DATA_URI_EDEFAULT);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__WEB_URI:
				setWebUri(WEB_URI_EDEFAULT);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__TAGS:
				getTags().clear();
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__API_TYPE:
				setApiType(API_TYPE_EDEFAULT);
				return;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__API_TYPE_VERSION:
				setApiTypeVersion(API_TYPE_VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__BASE_CLASS:
				return base_Class != null;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DATA_URI:
				return DATA_URI_EDEFAULT == null ? dataUri != null : !DATA_URI_EDEFAULT.equals(dataUri);
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__WEB_URI:
				return WEB_URI_EDEFAULT == null ? webUri != null : !WEB_URI_EDEFAULT.equals(webUri);
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__TAGS:
				return tags != null && !tags.isEmpty();
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__API_TYPE:
				return apiType != API_TYPE_EDEFAULT;
			case OpenDataProfilePackage.OPEN_DATA_API_DETAILS__API_TYPE_VERSION:
				return API_TYPE_VERSION_EDEFAULT == null ? apiTypeVersion != null : !API_TYPE_VERSION_EDEFAULT.equals(apiTypeVersion);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", category: ");
		result.append(category);
		result.append(", dataUri: ");
		result.append(dataUri);
		result.append(", description: ");
		result.append(description);
		result.append(", domain: ");
		result.append(domain);
		result.append(", license: ");
		result.append(license);
		result.append(", webUri: ");
		result.append(webUri);
		result.append(", tags: ");
		result.append(tags);
		result.append(", apiType: ");
		result.append(apiType);
		result.append(", apiTypeVersion: ");
		result.append(apiTypeVersion);
		result.append(')');
		return result.toString();
	}

} //OpenDataAPIDetailsImpl
