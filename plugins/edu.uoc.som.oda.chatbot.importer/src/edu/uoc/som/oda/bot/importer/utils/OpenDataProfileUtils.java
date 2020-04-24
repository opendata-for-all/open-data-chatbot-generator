package edu.uoc.som.oda.bot.importer.utils;

import static java.util.Objects.nonNull;

import edu.uoc.som.oda.profiles.opendata.OpenDataAPIType;
import edu.uoc.som.oda.profiles.opendata.SocrataFieldTypeKind;

import java.util.List;

import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

public class OpenDataProfileUtils {
	public static String OPEN_DATA_API_DETAILS_QN = "OpenData::OpenDataAPIDetails";
	public static String SOCRATA_FIELD_QN = "OpenData::SocrataField";
	public static String SOCRATA_FIELD_TYPE_QN = "OpenData::SocrataFieldType";

	
	
	
	
	public static void applyOpenDataAPIDetailsStereotype(org.eclipse.uml2.uml.Class clazz, String id, String name,String category, String dataUri, String description, String domain, String license, String webUri, List<String> tags, OpenDataAPIType apiType, String apiTypeVersion) {
		Stereotype openDataAPIDetails = clazz.getApplicableStereotype(OPEN_DATA_API_DETAILS_QN);
		if (nonNull(openDataAPIDetails)) {
			if (!clazz.isStereotypeApplied(openDataAPIDetails))
				clazz.applyStereotype(openDataAPIDetails);
			if (nonNull(id) && !id.isEmpty())
				UMLUtil.setTaggedValue(clazz, openDataAPIDetails, "id", id);
			if(nonNull(name) && !name.isEmpty())
				UMLUtil.setTaggedValue(clazz, openDataAPIDetails, "name", name);
			if(nonNull(category))
				UMLUtil.setTaggedValue(clazz, openDataAPIDetails, "category", category);
			if(nonNull(dataUri) && !dataUri.isEmpty())
				UMLUtil.setTaggedValue(clazz, openDataAPIDetails, "dataUri", dataUri);
			if(nonNull(description) && !description.isEmpty())
				UMLUtil.setTaggedValue(clazz, openDataAPIDetails, "description", description);
			if(nonNull(domain) && !domain.isEmpty())
				UMLUtil.setTaggedValue(clazz, openDataAPIDetails, "domain", domain);
			if(nonNull(license) && !license.isEmpty())
				UMLUtil.setTaggedValue(clazz, openDataAPIDetails, "license", license);
			if(nonNull(webUri) && !webUri.isEmpty())
				UMLUtil.setTaggedValue(clazz, openDataAPIDetails, "webUri", webUri);
			if(!tags.isEmpty())
				UMLUtil.setTaggedValue(clazz, openDataAPIDetails, "tags", tags);
			if(nonNull(apiType))
				UMLUtil.setTaggedValue(clazz, openDataAPIDetails, "apiType", apiType);
			if(nonNull(apiTypeVersion) && !apiTypeVersion.isEmpty())
				UMLUtil.setTaggedValue(clazz, openDataAPIDetails, "apiTypeVersion", apiTypeVersion);
			
		} else {
			// TODO throw exception
		}
	}
	
	public static void applySocrataFieldStereotype(Property property, String name, String fieldName, String description) {
		Stereotype socrataField = property.getApplicableStereotype(SOCRATA_FIELD_QN);
		if (nonNull(socrataField)) {
			if (!property.isStereotypeApplied(socrataField))
				property.applyStereotype(socrataField);
			if (nonNull(name) && !name.isEmpty())
				UMLUtil.setTaggedValue(property, socrataField, "name", name);
			if (nonNull(fieldName) && !fieldName.isEmpty())
				UMLUtil.setTaggedValue(property, socrataField, "fieldName", fieldName);
			if (nonNull(description) && !description.isEmpty())
				UMLUtil.setTaggedValue(property, socrataField, "description", description);
		}
		
		
	}
	

	public static void applySocrataFieldTypeStereotype(Type dataType, SocrataFieldTypeKind type) {
		Stereotype socrataFieldType = dataType.getApplicableStereotype(SOCRATA_FIELD_TYPE_QN);
		if (nonNull(socrataFieldType)) {
			if (!dataType.isStereotypeApplied(socrataFieldType))
				dataType.applyStereotype(socrataFieldType);
			if (nonNull(type))
				UMLUtil.setTaggedValue(dataType, socrataFieldType, "type", type);
		
		}
		
		
	}
	public static SocrataFieldTypeKind getSocrataFieldTypeKind(Type type) {
		Stereotype socrataFieldType = type.getApplicableStereotype(SOCRATA_FIELD_TYPE_QN);
		if(nonNull(socrataFieldType) && type.isStereotypeApplied(socrataFieldType)) {
			return (SocrataFieldTypeKind) UMLUtil.getTaggedValue(type, SOCRATA_FIELD_TYPE_QN, "type");
		}
		return null;
 	}
 
}
