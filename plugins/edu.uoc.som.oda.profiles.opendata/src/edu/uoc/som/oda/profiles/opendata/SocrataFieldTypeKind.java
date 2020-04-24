/**
 */
package edu.uoc.som.oda.profiles.opendata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Socrata Field Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.oda.profiles.opendata.OpenDataProfilePackage#getSocrataFieldTypeKind()
 * @model
 * @generated
 */
public enum SocrataFieldTypeKind implements Enumerator {
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
	 * The '<em><b>Checkbox</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKBOX(1, "Checkbox", "Checkbox"),

	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(2, "Text", "Text"),

	/**
	 * The '<em><b>Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(3, "Number", "Number"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(4, "Date", "Date"),

	/**
	 * The '<em><b>Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINT_VALUE
	 * @generated
	 * @ordered
	 */
	POINT(5, "Point", "Point"),

	/**
	 * The '<em><b>Multi Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_LINE(6, "MultiLine", "MultiLine"),

	/**
	 * The '<em><b>Multi Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_POINT(7, "MultiPoint", "MultiPoint"),

	/**
	 * The '<em><b>Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	POLYGON(8, "Polygon", "Polygon"),

	/**
	 * The '<em><b>Multi Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_POLYGON(9, "MultiPolygon", "MultiPolygon"),

	/**
	 * The '<em><b>Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(10, "Location", "Location");

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
	 * The '<em><b>Checkbox</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX
	 * @model name="Checkbox"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKBOX_VALUE = 1;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model name="Text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 2;

	/**
	 * The '<em><b>Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER
	 * @model name="Number"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 3;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model name="Date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 4;

	/**
	 * The '<em><b>Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINT
	 * @model name="Point"
	 * @generated
	 * @ordered
	 */
	public static final int POINT_VALUE = 5;

	/**
	 * The '<em><b>Multi Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_LINE
	 * @model name="MultiLine"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_LINE_VALUE = 6;

	/**
	 * The '<em><b>Multi Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_POINT
	 * @model name="MultiPoint"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_POINT_VALUE = 7;

	/**
	 * The '<em><b>Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLYGON
	 * @model name="Polygon"
	 * @generated
	 * @ordered
	 */
	public static final int POLYGON_VALUE = 8;

	/**
	 * The '<em><b>Multi Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_POLYGON
	 * @model name="MultiPolygon"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_POLYGON_VALUE = 9;

	/**
	 * The '<em><b>Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION
	 * @model name="Location"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 10;

	/**
	 * An array of all the '<em><b>Socrata Field Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SocrataFieldTypeKind[] VALUES_ARRAY =
		new SocrataFieldTypeKind[] {
			UNDEFINED,
			CHECKBOX,
			TEXT,
			NUMBER,
			DATE,
			POINT,
			MULTI_LINE,
			MULTI_POINT,
			POLYGON,
			MULTI_POLYGON,
			LOCATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Socrata Field Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SocrataFieldTypeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Socrata Field Type Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SocrataFieldTypeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SocrataFieldTypeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Socrata Field Type Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SocrataFieldTypeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SocrataFieldTypeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Socrata Field Type Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SocrataFieldTypeKind get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case CHECKBOX_VALUE: return CHECKBOX;
			case TEXT_VALUE: return TEXT;
			case NUMBER_VALUE: return NUMBER;
			case DATE_VALUE: return DATE;
			case POINT_VALUE: return POINT;
			case MULTI_LINE_VALUE: return MULTI_LINE;
			case MULTI_POINT_VALUE: return MULTI_POINT;
			case POLYGON_VALUE: return POLYGON;
			case MULTI_POLYGON_VALUE: return MULTI_POLYGON;
			case LOCATION_VALUE: return LOCATION;
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
	private SocrataFieldTypeKind(int value, String name, String literal) {
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
	
} //SocrataFieldTypeKind
