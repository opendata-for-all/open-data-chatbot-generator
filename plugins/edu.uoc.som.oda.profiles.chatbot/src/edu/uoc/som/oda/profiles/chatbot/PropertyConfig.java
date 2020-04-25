/**
 */
package edu.uoc.som.oda.profiles.chatbot;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.PropertyConfig#isToExpose <em>To Expose</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.PropertyConfig#isToFilterWith <em>To Filter With</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.PropertyConfig#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage#getPropertyConfig()
 * @model
 * @generated
 */
public interface PropertyConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>To Expose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Expose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Expose</em>' attribute.
	 * @see #setToExpose(boolean)
	 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage#getPropertyConfig_ToExpose()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isToExpose();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.chatbot.PropertyConfig#isToExpose <em>To Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Expose</em>' attribute.
	 * @see #isToExpose()
	 * @generated
	 */
	void setToExpose(boolean value);

	/**
	 * Returns the value of the '<em><b>To Filter With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Filter With</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Filter With</em>' attribute.
	 * @see #setToFilterWith(boolean)
	 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage#getPropertyConfig_ToFilterWith()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isToFilterWith();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.chatbot.PropertyConfig#isToFilterWith <em>To Filter With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Filter With</em>' attribute.
	 * @see #isToFilterWith()
	 * @generated
	 */
	void setToFilterWith(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage#getPropertyConfig_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.chatbot.PropertyConfig#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // PropertyConfig
