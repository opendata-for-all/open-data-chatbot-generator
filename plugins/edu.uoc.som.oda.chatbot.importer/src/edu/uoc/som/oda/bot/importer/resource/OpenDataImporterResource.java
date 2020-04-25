package edu.uoc.som.oda.bot.importer.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;


public class OpenDataImporterResource {

	private static ResourceSet umlResourceSet;

	private OpenDataImporterResource() {
	}

	public static ResourceSet getUMResourceSet() {
		if (umlResourceSet == null) {
			umlResourceSet = new ResourceSetImpl();
			umlResourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
			umlResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
					UMLResource.Factory.INSTANCE);
			boolean standalone;
			// Check if we are inside eclipse or in a standalone mode
			try {

				URI.createPlatformPluginURI("edu.uoc.som.oda.profiles.opendata/resources/openapi.profile.uml", true);

				standalone = false;
			} catch (Exception e) {
				standalone = true;
			}

			if (standalone) {
				// TODO

			} else {

				umlResourceSet.getURIConverter().getURIMap()
						.put(URI.createURI("pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml"),
								URI.createPlatformPluginURI(
										"org.eclipse.uml2.uml.resources/libraries/UMLPrimitiveTypes.library.uml",
										true));
				umlResourceSet.getURIConverter().getURIMap().put(URI.createURI(UMLResource.LIBRARIES_PATHMAP),
						URI.createPlatformPluginURI("org.eclipse.uml2.uml.resources", true).appendSegment("libraries")
								.appendSegment(""));
				umlResourceSet.getURIConverter().getURIMap().put(URI.createURI(UMLResource.METAMODELS_PATHMAP),
						URI.createPlatformPluginURI("org.eclipse.uml2.uml.resources", true).appendSegment("metamodels")
								.appendSegment(""));
				umlResourceSet.getURIConverter().getURIMap().put(URI.createURI(UMLResource.PROFILES_PATHMAP),
						URI.createPlatformPluginURI("org.eclipse.uml2.uml.resources", true).appendSegment("profiles")
								.appendSegment(""));
				umlResourceSet.getURIConverter().getURIMap().put(
						URI.createURI("pathmap://OPENAPI_PROFILES/openapi.profile.uml"), URI.createPlatformPluginURI(
								"edu.uoc.som.openapi2.profile/resources/openapi.profile.uml", true));
				umlResourceSet.getURIConverter().getURIMap().put(
						URI.createURI("pathmap://CHATBOT_PROFILES/chatbot.profile.uml"),
						URI.createPlatformPluginURI("edu.uoc.som.oda.profiles.chatbot/resources/chatbot.profile.uml", true));
				umlResourceSet.getURIConverter().getURIMap().put(
						URI.createURI("pathmap://ODA_PROFILES/opendata.profile.uml"),
						URI.createPlatformPluginURI("edu.uoc.som.oda.profiles.opendata/resources/opendata.profile.uml", true));
			}

		}
		return umlResourceSet;
	}

}
