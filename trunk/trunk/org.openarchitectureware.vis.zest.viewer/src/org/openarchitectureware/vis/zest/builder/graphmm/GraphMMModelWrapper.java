package org.openarchitectureware.vis.zest.builder.graphmm;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

public class GraphMMModelWrapper {

	private EObject model = null;

	public GraphMMModelWrapper( EObject graphmmModel ) {
		this.model = graphmmModel;
	}
	
	public Collection<EObject> getNodes(EObject graph) {
		return (Collection<EObject>) getCollection(graph, "nodes");
	}

	public Collection<EObject> getEdges(EObject graph) {
		return (Collection<EObject>) getCollection(graph, "edges");
	}
	
	public String getLabel(EObject node) {
		return getString( node, "label" );
	}

	public String getIcon(EObject node) {
		String icon = getString( node, "icon" );
		if ( icon == null ) return null;
		if ( icon.toLowerCase().startsWith("platform:")) return icon;
		EObject prolog = getElement(model, "prolog");
		if ( prolog == null ) return null;
		String iconPath = getString(prolog, "iconBasePath");
		if ( !iconPath.endsWith("/") ) iconPath += "/";
		return iconPath+icon;
		
	}
	
	public EObject getEdgeSource(EObject edge) {
		return getElement( edge, "source" );
	}
	
	public EObject getEdgeTarget(EObject edge) {
		return getElement( edge, "target" );
	}

	public EObject getFirstGraph() {
		return (EObject)getCollection(model, "graphs").iterator().next();
	}
	
	private Collection<?> getCollection(EObject element, String featureName) {
		return (Collection<?>)element.eGet( element.eClass().getEStructuralFeature(featureName) );
	}
	
	private String getString(EObject element, String featureName) {
		return (String)element.eGet( element.eClass().getEStructuralFeature(featureName) );
	}

	private EObject getElement(EObject element, String featureName) {
		return (EObject)element.eGet( element.eClass().getEStructuralFeature(featureName) );
	}



	
	
}
