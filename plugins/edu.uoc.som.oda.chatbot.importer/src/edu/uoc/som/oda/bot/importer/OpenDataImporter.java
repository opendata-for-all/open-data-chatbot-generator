package edu.uoc.som.oda.bot.importer;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;

import edu.uoc.som.oda.bot.importer.resource.OpenDataImporterResource;

public abstract class OpenDataImporter<T> {

	protected T input;

	protected File outputDestination;
	
	protected Model model;
	
	protected ResourceSet openDataResourceSet;

	
	protected Resource chatbotProfileResource;
	protected Resource openDataProfileResoure;

	public OpenDataImporter(T input, File outputDestination) {
		
		this.input = input;
		this.outputDestination = outputDestination;
		
		openDataResourceSet = OpenDataImporterResource.getUMResourceSet();
		chatbotProfileResource =  openDataResourceSet
				.getResource(URI.createURI("pathmap://CHATBOT_PROFILES/chatbot.profile.uml"), true);
		openDataProfileResoure =  openDataResourceSet
				.getResource(URI.createURI("pathmap://ODA_PROFILES/opendata.profile.uml"), true);
		
		URI resourceURI = URI.createFileURI(outputDestination.getPath());
		Resource umlModelResource = OpenDataImporterResource.getUMResourceSet().createResource(resourceURI);
		model = UMLFactory.eINSTANCE.createModel();
		umlModelResource.getContents().add(model);
		
		model.applyProfile((Profile) chatbotProfileResource.getContents().get(0));
		model.applyProfile((Profile) openDataProfileResoure.getContents().get(0));
	}

	public abstract Model importModel();

	public void saveResource() throws IOException {
		model.eResource().save(Collections.EMPTY_MAP);
	}
}
