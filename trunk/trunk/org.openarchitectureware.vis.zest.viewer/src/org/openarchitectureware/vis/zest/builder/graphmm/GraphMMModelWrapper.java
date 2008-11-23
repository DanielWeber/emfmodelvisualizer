package org.openarchitectureware.vis.zest.builder.graphmm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Color;

public class GraphMMModelWrapper {

	private EObject model = null;
	private Map<String, Color> colorMap = new HashMap<String, Color>();
	
	public GraphMMModelWrapper( EObject graphmmModel ) {
		this.model = graphmmModel;
		colorMap.put("white", ColorConstants.white );  
		colorMap.put("lightGray", ColorConstants.lightGray );
		colorMap.put("gray", ColorConstants.gray );
		colorMap.put("darkGray", ColorConstants.darkGray );   
		colorMap.put("black", ColorConstants.black );      
		colorMap.put("red", ColorConstants.red );        
		colorMap.put("orange", ColorConstants.orange );     
		colorMap.put("yellow", ColorConstants.yellow );     
		colorMap.put("green", ColorConstants.green );      
		colorMap.put("lightGreen", ColorConstants.lightGreen ); 
		colorMap.put("darkGreen", ColorConstants.darkGreen );  
		colorMap.put("cyan", ColorConstants.cyan );       
		colorMap.put("lightBlue", ColorConstants.lightBlue );  
		colorMap.put("blue", ColorConstants.blue );       
		colorMap.put("darkBlue", ColorConstants.darkBlue );   
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

	public String getSourceLocation(EObject node) {
		return getString(node, "source");
	}

	public String getTooltip(EObject nodeOrConnection) {
		return getString(nodeOrConnection, "tooltip" );
	}
	
	public EObject getFirstGraph() {
		return (EObject)getCollection(model, "graphs").iterator().next();
	}

	public Color getEdgeColor(EObject edge) {
		return getColor( edge, "color");
	}
	
	public Color getNodeLineColor(EObject node) {
		return getColor( node, "linecolor");
	}
	
	public Color getTextColor(EObject node) {
		return getColor( node, "textcolor");
	}

	public Color getFillColor(EObject node) {
		return getColor( node, "fillcolor");
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

	private Color getColor( EObject elem, String colorkind ) {
		String c = getElement(elem, colorkind).toString();
		if ( c == null ) return ColorConstants.black;
		Color col = colorMap.get(c);
		if ( col == null ) return ColorConstants.black;
		return col;
	}








	
	
}
