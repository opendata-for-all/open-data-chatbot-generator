/**
 */
package edu.uoc.som.oda.profiles.chatbot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.uoc.som.oda.profiles.chatbot.ChatbotProfileFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ChatbotProfile'"
 * @generated
 */
public interface ChatbotProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chatbot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://som-research.uoc.edu/profiles/chatbot/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chatbot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChatbotProfilePackage eINSTANCE = edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profiles.chatbot.impl.BotVocabularyImpl <em>Bot Vocabulary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profiles.chatbot.impl.BotVocabularyImpl
	 * @see edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl#getBotVocabulary()
	 * @generated
	 */
	int BOT_VOCABULARY = 0;

	/**
	 * The feature id for the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOT_VOCABULARY__OUTPUT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOT_VOCABULARY__SYNONYMS = 1;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOT_VOCABULARY__BASE_NAMED_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Bot Vocabulary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOT_VOCABULARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bot Vocabulary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOT_VOCABULARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profiles.chatbot.impl.PropertyConfigImpl <em>Property Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profiles.chatbot.impl.PropertyConfigImpl
	 * @see edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl#getPropertyConfig()
	 * @generated
	 */
	int PROPERTY_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>To Expose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONFIG__TO_EXPOSE = 0;

	/**
	 * The feature id for the '<em><b>To Filter With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONFIG__TO_FILTER_WITH = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONFIG__BASE_PROPERTY = 2;

	/**
	 * The number of structural features of the '<em>Property Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.oda.profiles.chatbot.impl.ClassConfigImpl <em>Class Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.oda.profiles.chatbot.impl.ClassConfigImpl
	 * @see edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl#getClassConfig()
	 * @generated
	 */
	int CLASS_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>To Expose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONFIG__TO_EXPOSE = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONFIG__BASE_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Class Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONFIG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 3;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 4;

	/**
	 * The meta object id for the '<em>Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 5;


	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profiles.chatbot.BotVocabulary <em>Bot Vocabulary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bot Vocabulary</em>'.
	 * @see edu.uoc.som.oda.profiles.chatbot.BotVocabulary
	 * @generated
	 */
	EClass getBotVocabulary();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profiles.chatbot.BotVocabulary#getOutputName <em>Output Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Name</em>'.
	 * @see edu.uoc.som.oda.profiles.chatbot.BotVocabulary#getOutputName()
	 * @see #getBotVocabulary()
	 * @generated
	 */
	EAttribute getBotVocabulary_OutputName();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.oda.profiles.chatbot.BotVocabulary#getSynonyms <em>Synonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Synonyms</em>'.
	 * @see edu.uoc.som.oda.profiles.chatbot.BotVocabulary#getSynonyms()
	 * @see #getBotVocabulary()
	 * @generated
	 */
	EAttribute getBotVocabulary_Synonyms();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.oda.profiles.chatbot.BotVocabulary#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see edu.uoc.som.oda.profiles.chatbot.BotVocabulary#getBase_NamedElement()
	 * @see #getBotVocabulary()
	 * @generated
	 */
	EReference getBotVocabulary_Base_NamedElement();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profiles.chatbot.PropertyConfig <em>Property Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Config</em>'.
	 * @see edu.uoc.som.oda.profiles.chatbot.PropertyConfig
	 * @generated
	 */
	EClass getPropertyConfig();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profiles.chatbot.PropertyConfig#isToExpose <em>To Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Expose</em>'.
	 * @see edu.uoc.som.oda.profiles.chatbot.PropertyConfig#isToExpose()
	 * @see #getPropertyConfig()
	 * @generated
	 */
	EAttribute getPropertyConfig_ToExpose();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profiles.chatbot.PropertyConfig#isToFilterWith <em>To Filter With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Filter With</em>'.
	 * @see edu.uoc.som.oda.profiles.chatbot.PropertyConfig#isToFilterWith()
	 * @see #getPropertyConfig()
	 * @generated
	 */
	EAttribute getPropertyConfig_ToFilterWith();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.oda.profiles.chatbot.PropertyConfig#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see edu.uoc.som.oda.profiles.chatbot.PropertyConfig#getBase_Property()
	 * @see #getPropertyConfig()
	 * @generated
	 */
	EReference getPropertyConfig_Base_Property();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.oda.profiles.chatbot.ClassConfig <em>Class Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Config</em>'.
	 * @see edu.uoc.som.oda.profiles.chatbot.ClassConfig
	 * @generated
	 */
	EClass getClassConfig();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.oda.profiles.chatbot.ClassConfig#isToExpose <em>To Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Expose</em>'.
	 * @see edu.uoc.som.oda.profiles.chatbot.ClassConfig#isToExpose()
	 * @see #getClassConfig()
	 * @generated
	 */
	EAttribute getClassConfig_ToExpose();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.oda.profiles.chatbot.ClassConfig#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.uoc.som.oda.profiles.chatbot.ClassConfig#getBase_Class()
	 * @see #getClassConfig()
	 * @generated
	 */
	EReference getClassConfig_Base_Class();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Real'"
	 * @generated
	 */
	EDataType getDouble();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChatbotProfileFactory getChatbotProfileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profiles.chatbot.impl.BotVocabularyImpl <em>Bot Vocabulary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profiles.chatbot.impl.BotVocabularyImpl
		 * @see edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl#getBotVocabulary()
		 * @generated
		 */
		EClass BOT_VOCABULARY = eINSTANCE.getBotVocabulary();

		/**
		 * The meta object literal for the '<em><b>Output Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOT_VOCABULARY__OUTPUT_NAME = eINSTANCE.getBotVocabulary_OutputName();

		/**
		 * The meta object literal for the '<em><b>Synonyms</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOT_VOCABULARY__SYNONYMS = eINSTANCE.getBotVocabulary_Synonyms();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOT_VOCABULARY__BASE_NAMED_ELEMENT = eINSTANCE.getBotVocabulary_Base_NamedElement();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profiles.chatbot.impl.PropertyConfigImpl <em>Property Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profiles.chatbot.impl.PropertyConfigImpl
		 * @see edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl#getPropertyConfig()
		 * @generated
		 */
		EClass PROPERTY_CONFIG = eINSTANCE.getPropertyConfig();

		/**
		 * The meta object literal for the '<em><b>To Expose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CONFIG__TO_EXPOSE = eINSTANCE.getPropertyConfig_ToExpose();

		/**
		 * The meta object literal for the '<em><b>To Filter With</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CONFIG__TO_FILTER_WITH = eINSTANCE.getPropertyConfig_ToFilterWith();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONFIG__BASE_PROPERTY = eINSTANCE.getPropertyConfig_Base_Property();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.oda.profiles.chatbot.impl.ClassConfigImpl <em>Class Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.oda.profiles.chatbot.impl.ClassConfigImpl
		 * @see edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl#getClassConfig()
		 * @generated
		 */
		EClass CLASS_CONFIG = eINSTANCE.getClassConfig();

		/**
		 * The meta object literal for the '<em><b>To Expose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_CONFIG__TO_EXPOSE = eINSTANCE.getClassConfig_ToExpose();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_CONFIG__BASE_CLASS = eINSTANCE.getClassConfig_Base_Class();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see edu.uoc.som.oda.profiles.chatbot.impl.ChatbotProfilePackageImpl#getDouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getDouble();

	}

} //ChatbotProfilePackage
