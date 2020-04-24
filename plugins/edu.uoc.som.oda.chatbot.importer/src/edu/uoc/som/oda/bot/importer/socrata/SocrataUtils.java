package edu.uoc.som.oda.bot.importer.socrata;

import java.util.Arrays;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class SocrataUtils {

	public static String getDataURIfromMetadata(JsonElement metadata) {
		if(metadata.isJsonObject()) {
			JsonObject metadataObject = metadata.getAsJsonObject();
			if(metadataObject.has("dataUri")) {
				return  metadataObject.get("dataUri").getAsString();
			}
			else {
				//TODO throw an exception
			}
		}
		else {
			//TODO throw an exception: not a JSON object
		}
		return null;
	
	}
	
	public static String inferViewsMetadataURI(JsonElement metadata) {
		if(metadata.isJsonObject()) {
			JsonObject metadataObject = metadata.getAsJsonObject();
			String domain = null;
			String id = null;
			String dataUri = null;
			if(metadataObject.has("id")) {
				id =  metadataObject.get("id").getAsString();
			}
			if(metadataObject.has("domain")) {
				domain = metadataObject.get("domain").getAsString();
			}
			if(metadataObject.has("dataUri")) {
				dataUri =  metadataObject.get("dataUri").getAsString();
			}
			//TODO check that id domain and dataUri are not null
			StringBuilder viewMetadataURIBuilder = new StringBuilder();
			viewMetadataURIBuilder.append(dataUri.startsWith("https://")?"https://":"http://")
			.append(domain).append("/views.json?method=getByResourceName&name=").append(id);
			return viewMetadataURIBuilder.toString();
			
		}
		else {
			//TODO throw an exception: not a JSON object
		}
		return null;
	}
	
	public static boolean isPrimitive(String dataType) {
		List<String> primitiveTypes = Arrays.asList("text","number","calendar_date","checkbox");
		if(primitiveTypes.contains(dataType))
			return true;
		return false;
	}


}
