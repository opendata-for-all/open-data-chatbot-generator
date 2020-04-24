package edu.uoc.som.oda.bot.importer.socrata;

import static java.util.Objects.nonNull;

import java.io.File;
import java.io.IOException;

import com.google.gson.JsonElement;

import edu.uoc.som.oda.bot.importer.Builder;
import edu.uoc.som.oda.bot.importer.utils.JsonUtils;

public class SocrataImporterBuilder extends Builder<SocrataImporter>{

	private String stringMetadata;
	private JsonElement jsonMetadata;
	private String metadataURI;
	
	
	private String outputDestination;
	
	private File outputDestinationFile;
	

	
	public SocrataImporterBuilder fromMetadata(String stringMetadata) {
		this.stringMetadata = stringMetadata;
		jsonMetadata = null;
		return this;
	}
	
	public SocrataImporterBuilder fromMetadata(JsonElement jsonMetadata) {
		this.jsonMetadata = jsonMetadata;
		stringMetadata = null;
		return this;
	}
	
	public SocrataImporterBuilder fromMetadataURI(String metadataURI) {
		this.metadataURI = metadataURI;
		return this;
	}
	
	public SocrataImporterBuilder output(String outputDestination){
		this.outputDestination = outputDestination;
		this.outputDestinationFile = null;
		return this;
	}
	
	
	public SocrataImporterBuilder output(File outputDestination){
		this.outputDestinationFile = outputDestination;
		this.outputDestination = null;
		return this;
	}
	
	@Override
	public SocrataImporter build() {
		
		if(nonNull(metadataURI)) {
			try {
				jsonMetadata = JsonUtils.getGsonFromUrl(metadataURI);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(nonNull(stringMetadata))
			jsonMetadata = JsonUtils.getGsonFromString(stringMetadata);
		
		if(nonNull(outputDestination))
			outputDestinationFile = new File(outputDestination);
	
		
		if(nonNull(jsonMetadata) && nonNull(outputDestinationFile)) {
			try {
				return new SocrataImporter(jsonMetadata,outputDestinationFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	
	
	}

}
