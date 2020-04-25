/**
 */
package edu.uoc.som.oda.profiles.chatbot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfilePackage
 * @generated
 */
public interface ChatbotProfileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChatbotProfileFactory eINSTANCE = edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bot Vocabulary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bot Vocabulary</em>'.
	 * @generated
	 */
	BotVocabulary createBotVocabulary();

	/**
	 * Returns a new object of class '<em>Property Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Config</em>'.
	 * @generated
	 */
	PropertyConfig createPropertyConfig();

	/**
	 * Returns a new object of class '<em>Class Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Config</em>'.
	 * @generated
	 */
	ClassConfig createClassConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChatbotProfilePackage getChatbotProfilePackage();

} //ChatbotProfileFactory
