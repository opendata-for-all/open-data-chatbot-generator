package edu.uoc.som.oda.bot.importer.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;


public class UMLUtils {

	public static Package eCoreToUML(EPackage ePackage, org.eclipse.uml2.uml.Package umlClassPackage, Package umlDataTypePackage) {
		
		Map<EClass, org.eclipse.uml2.uml.Class> map = new HashMap<EClass,org.eclipse.uml2.uml.Class>();
		
			for (EObject object : ePackage.getEClassifiers()) {
				if (object instanceof EClass) {
					EClass eClass = (EClass) object;

					org.eclipse.uml2.uml.Class clazz = UMLFactory.eINSTANCE.createClass();
					
					clazz.setName(eClass.getName());
					umlClassPackage.getOwnedTypes().add(clazz);
					
					map.put(eClass, clazz);

					for (EAttribute eAttribute : eClass.getEAttributes()) {
						
							Property property = UMLFactory.eINSTANCE.createProperty();
							property.setType(getUMLTypeFromECoreType(eAttribute.getEAttributeType(), umlDataTypePackage));
							property.setName(eAttribute.getName());
							property.setUpper(eAttribute.getUpperBound());
							property.setLower(eAttribute.getLowerBound());
							clazz.getOwnedAttributes().add(property);
						
					}

				}

			}
			// resolving references
//			for (EObject object : dataModel.getEClassifiers()) {
//				if (object instanceof EClass) {
//					EClass eClass = (EClass) object;
//					Schema schema = map.get(eClass);
//					for (EReference eReference : eClass.getEReferences()) {
//						if (eReference.getUpperBound() == 1) {
//							Schema property = map.get((EClass) eReference.getEType());
//							schema.getProperties().add(property);
//						} else {
//							Schema arrayProperty = factory.createSchema();
//							arrayProperty.setType(JSONDataType.ARRAY);
//							arrayProperty.setName(eReference.getName());
//							apiRoot.getSchemas().add(arrayProperty);
//							arrayProperty.setDeclaringContext(schema);
//							Schema items = map.get((EClass) eReference.getEType());
//							arrayProperty.setItems(items);
//							schema.getProperties().add(arrayProperty);
//						}
//
//					}
//				}
//
//			}
			return umlClassPackage;
		

	}
	
	public static PrimitiveType getUMLTypeFromECoreType(EDataType eAttributeType, org.eclipse.uml2.uml.Package umlTypesContainer) {
		if (eAttributeType.getName().equals("EString"))
			return getOrCreatePrimitiveType("String", umlTypesContainer);
		if (eAttributeType.getName().equals("EInt"))
			return getOrCreatePrimitiveType("Number", umlTypesContainer);
		return getOrCreatePrimitiveType("String", umlTypesContainer);
	}
	
	public static PrimitiveType getOrCreatePrimitiveType(String commonName,Package types) {

		Type type = types.getOwnedType(commonName, false, UMLPackage.eINSTANCE.getPrimitiveType(), false);
		if (type != null)
			return (PrimitiveType) type;
		else {
			PrimitiveType primitiveType = UMLFactory.eINSTANCE.createPrimitiveType();
			primitiveType.setName(commonName);
			types.getOwnedTypes().add(primitiveType);
			return primitiveType;
		}
	}
}
