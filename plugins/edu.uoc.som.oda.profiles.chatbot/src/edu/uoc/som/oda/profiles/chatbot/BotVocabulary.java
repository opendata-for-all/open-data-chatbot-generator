/**
 */
package edu.uoc.som.oda.profiles.chatbot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bot Vocabulary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.BotVocabulary#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.BotVocabulary#getSynonyms <em>Synonyms</em>}</li>
 *   <li>{@link edu.uoc.som.oda.profiles.chatbot.BotVocabulary#getBase_NamedElement <em>Base Named Element</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage#getBotVocabulary()
 * @model
 * @generated
 */
public interface BotVocabulary extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Name</em>' attribute.
	 * @see #setOutputName(String)
	 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage#getBotVocabulary_OutputName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getOutputName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.chatbot.BotVocabulary#getOutputName <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Name</em>' attribute.
	 * @see #getOutputName()
	 * @generated
	 */
	void setOutputName(String value);

	/**
	 * Returns the value of the '<em><b>Synonyms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synonyms</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonyms</em>' attribute list.
	 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage#getBotVocabulary_Synonyms()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getSynonyms();

	/**
	 * Returns the value of the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Named Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Named Element</em>' reference.
	 * @see #setBase_NamedElement(NamedElement)
	 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage#getBotVocabulary_Base_NamedElement()
	 * @model ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link edu.uoc.som.oda.profiles.chatbot.BotVocabulary#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

} // BotVocabulary
