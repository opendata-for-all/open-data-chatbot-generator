/**
 */
package edu.uoc.som.oda.profile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Open Data API Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.oda.profile.OpenDataProfilePackage#getOpenDataAPIType()
 * @model
 * @generated
 */
public enum OpenDataAPIType implements Enumerator {
	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "undefined", "undefined"),

	/**
	 * The '<em><b>Socrata</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCRATA_VALUE
	 * @generated
	 * @ordered
	 */
	SOCRATA(1, "socrata", "socrata"),

	/**
	 * The '<em><b>Ckan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CKAN_VALUE
	 * @generated
	 * @ordered
	 */
	CKAN(2, "ckan", "ckan"),

	/**
	 * The '<em><b>Odata</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA(3, "odata", "odata"),

	/**
	 * The '<em><b>Adhoc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADHOC_VALUE
	 * @generated
	 * @ordered
	 */
	ADHOC(4, "adhoc", "adhoc");

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>Socrata</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCRATA
	 * @model name="socrata"
	 * @generated
	 * @ordered
	 */
	public static final int SOCRATA_VALUE = 1;

	/**
	 * The '<em><b>Ckan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CKAN
	 * @model name="ckan"
	 * @generated
	 * @ordered
	 */
	public static final int CKAN_VALUE = 2;

	/**
	 * The '<em><b>Odata</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA
	 * @model name="odata"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_VALUE = 3;

	/**
	 * The '<em><b>Adhoc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADHOC
	 * @model name="adhoc"
	 * @generated
	 * @ordered
	 */
	public static final int ADHOC_VALUE = 4;

	/**
	 * An array of all the '<em><b>Open Data API Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OpenDataAPIType[] VALUES_ARRAY =
		new OpenDataAPIType[] {
			UNDEFINED,
			SOCRATA,
			CKAN,
			ODATA,
			ADHOC,
		};

	/**
	 * A public read-only list of all the '<em><b>Open Data API Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OpenDataAPIType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Open Data API Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OpenDataAPIType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OpenDataAPIType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Open Data API Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OpenDataAPIType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OpenDataAPIType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Open Data API Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OpenDataAPIType get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case SOCRATA_VALUE: return SOCRATA;
			case CKAN_VALUE: return CKAN;
			case ODATA_VALUE: return ODATA;
			case ADHOC_VALUE: return ADHOC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OpenDataAPIType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OpenDataAPIType
