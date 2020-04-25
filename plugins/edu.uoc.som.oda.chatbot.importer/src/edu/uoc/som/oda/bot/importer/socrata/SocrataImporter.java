package edu.uoc.som.oda.bot.importer.socrata;

import static java.util.Objects.nonNull;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import edu.uoc.som.oda.bot.importer.OpenDataImporter;
import edu.uoc.som.oda.bot.importer.utils.ChatbotProfileUtils;
import edu.uoc.som.oda.bot.importer.utils.JsonUtils;
import edu.uoc.som.oda.bot.importer.utils.OpenDataProfileUtils;
import edu.uoc.som.oda.bot.importer.utils.UMLUtils;
import edu.uoc.som.oda.profiles.opendata.OpenDataAPIType;
import edu.uoc.som.oda.profiles.opendata.SocrataFieldTypeKind;

public class SocrataImporter extends OpenDataImporter<JsonElement> {

	private JsonElement viewsMetadata;

	public SocrataImporter(JsonElement input, File outputDestination) throws MalformedURLException, IOException {
		super(input, outputDestination);
		viewsMetadata = initViewsMetadata();

	}

	@Override
	public Model importModel() {
	
		Gson gson = new Gson();
		JsonObject inputObject = input.getAsJsonObject();
		JsonObject viewsMetadataObject = viewsMetadata.getAsJsonObject();
		Package classPackage = UMLFactory.eINSTANCE.createPackage();
		classPackage.setName("DataModel");
		model.getPackagedElements().add(classPackage);
		Package types = UMLFactory.eINSTANCE.createPackage();
		types.setName("types");
		model.getPackagedElements().add(types);
		Class clazz = UMLFactory.eINSTANCE.createClass();
		clazz.setName("Record");
		classPackage.getOwnedTypes().add(clazz);

		OpenDataProfileUtils.applyOpenDataAPIDetailsStereotype(clazz,
				inputObject.has("id") ? inputObject.get("id").getAsString() : null,
				inputObject.has("name") ? inputObject.get("name").getAsString() : null,
				inputObject.has("category") ? inputObject.get("category").getAsString() : null,
				inputObject.has("dataUri") ? inputObject.get("dataUri").getAsString() : null,
				inputObject.has("description") ? inputObject.get("description").getAsString() : null,
				inputObject.has("domain") ? inputObject.get("domain").getAsString() : null,
				inputObject.has("license") ? inputObject.get("license").getAsString() : null,
				inputObject.has("webUri") ? inputObject.get("webUri").getAsString() : null, inputObject.has("tags")
						? gson.fromJson(inputObject.get("tags").getAsJsonArray(), new TypeToken<List<String>>() {
						}.getType())
						: null,
				OpenDataAPIType.SOCRATA,
				inputObject.has("apiTypeVersion") ? inputObject.get("apiTypeVersion").getAsString() : null);

		ChatbotProfileUtils.applyClassConfigStereotype(clazz, true);

		ChatbotProfileUtils.applyBotVocabularyStereotype(clazz, "Please change this", Collections.emptyList());

		if (viewsMetadataObject.has("columns")) {
			for (JsonElement jsonElement : viewsMetadataObject.get("columns").getAsJsonArray()) {

				JsonObject jsonObject = jsonElement.getAsJsonObject();
				if (jsonObject.has("dataTypeName")) {
					String dataTypeName = jsonObject.get("dataTypeName").getAsString();
					String name = jsonObject.has("name")?jsonObject.get("name").getAsString():null;
					String description = jsonObject.has("description")?jsonObject.get("description").getAsString():null;
					String fieldName = jsonObject.has("fieldName")?jsonObject.get("fieldName").getAsString():null;
					if (SocrataUtils.isPrimitive(dataTypeName)) {
						Property attribute = UMLFactory.eINSTANCE.createProperty();
						clazz.getOwnedAttributes().add(attribute);
						ChatbotProfileUtils.applyPropertyConfigStereotype(attribute, true, true);
						ChatbotProfileUtils.applyBotVocabularyStereotype(attribute, name, Collections.emptyList());
			
						if (nonNull(name))
							attribute.setName(name);
							

						if (dataTypeName.equals("text")) {
							
							attribute.setType(getOrCreatePrimitiveType("String", SocrataFieldTypeKind.TEXT, types));
							OpenDataProfileUtils.applySocrataFieldStereotype(attribute, name, fieldName, description);
						}
						if (dataTypeName.equals("number")) {
							attribute.setType(getOrCreatePrimitiveType("Number", SocrataFieldTypeKind.NUMBER, types));
							OpenDataProfileUtils.applySocrataFieldStereotype(attribute, name, fieldName, description);
						}
						if (dataTypeName.equals("calendar_date")) {
							attribute.setType(getOrCreatePrimitiveType("Date", SocrataFieldTypeKind.DATE, types));
							OpenDataProfileUtils.applySocrataFieldStereotype(attribute, name, fieldName, description);
						}
					} else {
						if (dataTypeName.equals("point")) {
							Class point = UMLFactory.eINSTANCE.createClass();
							point.setName("Point");
							classPackage.getOwnedTypes().add(point);
							Property property = UMLFactory.eINSTANCE.createProperty();
							property.setName("longitude");
							property.setLower(1);
							property.setType(UMLUtils.getOrCreatePrimitiveType("Double", types));
							point.getOwnedAttributes().add(property);

							property = UMLFactory.eINSTANCE.createProperty();
							property.setName("latitude");
							property.setType(UMLUtils.getOrCreatePrimitiveType("Double", types));
							property.setLower(1);
							point.getOwnedAttributes().add(property);

							Association association = UMLFactory.eINSTANCE.createAssociation();
							association.setName(clazz.getName() + "_" + point.getName());
							Property firstOwnedEnd = UMLFactory.eINSTANCE.createProperty();
							association.getOwnedEnds().add(firstOwnedEnd);
							Property secondOwnedEnd = UMLFactory.eINSTANCE.createProperty();
							association.getOwnedEnds().add(secondOwnedEnd);
							firstOwnedEnd.setName(clazz.getName());
							firstOwnedEnd.setType(clazz);
							secondOwnedEnd.setName(name);
							secondOwnedEnd.setAggregation(AggregationKind.COMPOSITE_LITERAL);
							secondOwnedEnd.setLower(0);
							secondOwnedEnd.setType(point);
							secondOwnedEnd.setUpper(1);
							

							association.getNavigableOwnedEnds().add(secondOwnedEnd);
							classPackage.getPackagedElements().add(association);
							OpenDataProfileUtils.applySocrataFieldTypeStereotype(point, SocrataFieldTypeKind.POINT);
							OpenDataProfileUtils.applySocrataFieldStereotype(secondOwnedEnd, name, fieldName, description);
							ChatbotProfileUtils.applyPropertyConfigStereotype(secondOwnedEnd, true, true);
							ChatbotProfileUtils.applyBotVocabularyStereotype(secondOwnedEnd, name, Collections.emptyList());
				
						}
						//TODO the other geo formats
					}
				}
				

			}
		} else {
			// TODO error message
		}

		return model;
	}

	private JsonElement initViewsMetadata() throws MalformedURLException, IOException {
		String viewsmetadataURI = SocrataUtils.inferViewsMetadataURI(input);
		return JsonUtils.getGsonFromUrl(viewsmetadataURI);
	}
	
	private PrimitiveType getOrCreatePrimitiveType(String umlTypeName, SocrataFieldTypeKind socrataFieldTypeKind,Package types) {

		List<Type> candidates = types.getOwnedTypes().stream().filter(t -> t.getName().equals(umlTypeName) && OpenDataProfileUtils.getSocrataFieldTypeKind(t)!=null && OpenDataProfileUtils.getSocrataFieldTypeKind(t).equals(socrataFieldTypeKind)).collect(Collectors.toList());
		if (!candidates.isEmpty())
			return (PrimitiveType) candidates.get(0);
		else {
			PrimitiveType primitiveType = UMLFactory.eINSTANCE.createPrimitiveType();
			primitiveType.setName(umlTypeName);
			types.getOwnedTypes().add(primitiveType);
			OpenDataProfileUtils.applySocrataFieldTypeStereotype(primitiveType, socrataFieldTypeKind);
			return primitiveType;
		}
	}

}
