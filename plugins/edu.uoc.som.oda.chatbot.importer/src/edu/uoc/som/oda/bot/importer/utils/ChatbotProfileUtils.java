package edu.uoc.som.oda.bot.importer.utils;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

import static java.util.Objects.nonNull;

import java.util.List;

public class ChatbotProfileUtils {

	public static String BOT_VOCABULARY_QN = "ChatbotProfile::BotVocabulary";
	public static String CLASS_CONFIC_QN = "ChatbotProfile::ClassConfig";
	public static String PROPERTY_CONFIG_QN = "ChatbotProfile::PropertyConfig";
	
	public static void applyBotVocabularyStereotype(NamedElement namedElement, String outputName, List<String> synonyms) {
		Stereotype vocabulary = namedElement.getApplicableStereotype(BOT_VOCABULARY_QN);
		if (nonNull(vocabulary)) {
			if (!namedElement.isStereotypeApplied(vocabulary))
				namedElement.applyStereotype(vocabulary);
			if (nonNull(outputName) && !outputName.isEmpty())
				UMLUtil.setTaggedValue(namedElement, vocabulary, "outputName", outputName);
			if (nonNull(synonyms) && !synonyms.isEmpty())
				UMLUtil.setTaggedValue(namedElement, vocabulary, "synonyms", synonyms);
		} else {
			// TODO throw exception
		}
	}
	
		public static void applyPropertyConfigStereotype(Property property, Boolean toExpose, Boolean toFilterWith) {
		Stereotype config = property.getApplicableStereotype(PROPERTY_CONFIG_QN);
		if (nonNull(config)) {
			if (!property.isStereotypeApplied(config))
				property.applyStereotype(config);
			if (nonNull(toExpose))
				UMLUtil.setTaggedValue(property, config, "toExpose", toExpose);
			if (nonNull(toFilterWith))
				UMLUtil.setTaggedValue(property, config, "toFilterWith", toFilterWith);
		} else {
			// TODO throw exception
		}
	}
	
	

	public static void applyClassConfigStereotype(Class clazz, Boolean toExpose) {
		Stereotype classConfig = clazz.getApplicableStereotype(CLASS_CONFIC_QN);
		if (nonNull(classConfig)) {
			if (!clazz.isStereotypeApplied(classConfig))
				clazz.applyStereotype(classConfig);
			if (nonNull(toExpose))
				UMLUtil.setTaggedValue(clazz, classConfig, "toExpose", toExpose);
		}
	}
	
	
}
	

