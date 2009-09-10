package org.openarchitectureware.vis.graphviz.eobject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EObjectUtils {

	public static String getFilename (EObject o) {
		return o.eResource().getURI().lastSegment();
		
	}
	public static EList<EObject> eCrossReferences (EObject o) {
		return o.eCrossReferences();
	}
	
	public static String getTypeName (Object o) {
		return o.getClass().getSimpleName().replaceAll ("Impl\\z", "");
	}
	
	public static String getName (EObject o) {
		String name = "";
		if (o!=null && o.eClass()!=null) {
			EStructuralFeature f = o.eClass().getEStructuralFeature("name");
			if (f!=null)
				name = (String) o.eGet(f);
		}
		return name;
	}
	
	public static String getContainingFeatureName (EObject o) {
		EStructuralFeature feature = o.eContainingFeature();
		Object featureValue = o.eContainer().eGet (feature);
		if (featureValue instanceof EList) {
			EList eList = (EList) featureValue;
			if (eList.contains(o)) {
				return feature.getName()+"["+eList.indexOf(o)+"]";	
			}			
		}
		return feature.getName();
	}
	
	public static String getFeatureNamePointingTo (EObject o, Object reference) {
		EList<EReference> references = o.eClass().getEAllReferences();
		for (EReference r: references) {			
			if (o.eGet(r) == reference) {
				return r.getName();
			}
			if (o.eGet(r) instanceof EList) {
				EList eList = (EList) o.eGet(r);
				if (eList.contains(reference)) {
					return r.getName()+"["+eList.indexOf(reference)+"]";	
				}										
			}
		}
		return "";
	}
	
	public static String getFeaturesAsString (EObject o) {
		String rv = "";
		for (EStructuralFeature f : o.eClass().getEAllStructuralFeatures()) {			
			if (!(f instanceof EReference)) {
				String value = "";
				if (o.eGet(f)==null) {
					value = "null";
				}
				if (f.getUpperBound()==1 && o.eGet(f)!=null) {
					if (f.getEType().getName().equals("EBoolean") || 
						f.getEType().getName().equals("EInteger")) {
						// FIXME: add more primitive types
						value = o.eGet(f).toString();
					}
					if (f.getEType().getName().equals("EString")) {
						value = (String) o.eGet(f);
						if (value!=null) {
							if (value.equals("\"")) {
								value = "\\\"";
							}
							if (value.equals("\\")) {
								value = "\\\\";
							}
							//value = value.replaceAll("\"", "\\\\\"");
							value = value.replaceAll("\\}", "\\\\}");
							value = value.replaceAll("\\{", "\\\\{");
							value = value.replaceAll("\n", "\\\\n");
						}
						value = "\\\"" + value + "\\\"";
					}									
				}
				if (f.getUpperBound()>1 && o.eGet(f)!=null) {
					// FIXME: handle lists
				}
				rv += f.getName()+":"+value+ "\\n";									
			}
		}
		return rv;
	}
}


