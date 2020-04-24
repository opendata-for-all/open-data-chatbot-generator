package edu.uoc.som.oda.bot.importer.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class JsonUtils {

	public static JsonElement getGsonFromString(String text) {
		JsonParser parser = new JsonParser();
		return parser.parse(text);
	}
	public static JsonElement getGsonFromUrl(String metadataUrl) throws MalformedURLException, IOException {
		InputStream inputStream = new URL(metadataUrl).openStream();
		Reader reader = new InputStreamReader(inputStream,"UTF8");
		JsonParser parser = new JsonParser();
		return parser.parse(reader);
	}
	
	
	
	
}
