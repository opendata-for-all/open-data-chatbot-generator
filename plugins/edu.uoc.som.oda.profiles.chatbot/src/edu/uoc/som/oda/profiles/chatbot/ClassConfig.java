/**
 */
package edu.uoc.som.oda.profiles.chatbot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.ClassConfig#isToExpose <em>To Expose</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.ClassConfig#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage#getClassConfig()
 * @model
 * @generated
 */
public interface ClassConfig extends EObject {
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
	 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage#getClassConfig_ToExpose()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isToExpose();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.chatbot.ClassConfig#isToExpose <em>To Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Expose</em>' attribute.
	 * @see #isToExpose()
	 * @generated
	 */
	void setToExpose(boolean value);

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
	 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage#getClassConfig_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.chatbot.ClassConfig#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // ClassConfig
