package org.openarchitectureware.vis.zest.builder;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Color;

public class GraphMMModelWrapper {

	private EObject model = null;
	private Map<String, Color> colorMap = new HashMap<String, Color>();
	private Map<String, Integer> styleMap = new HashMap<String, Integer>();
	
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
		styleMap.put("solid", 1 );
		styleMap.put("dashed", 2 ); 
		styleMap.put("dotted", 3 ); 
		styleMap.put("dashDotted", 4 );
		styleMap.put("dashDotDotted", 5);

	}
	

	public Object getGraphName(EObject graphNode) {
		return getString(graphNode, "name");
	}
	
	public Collection<EObject> getGraphs() {
		return (Collection<EObject>)getCollection(model, "graphs");
	}	
	
	public Collection<EObject> getNodes(EObject graph) {
		return (Collection<EObject>) getCollection(graph, "nodes");
	}

	public Collection<EObject> getEdges(EObject graph) {
		return (Collection<EObject>) getCollection(graph, "edges");
	}
	
	public String getNodeOrEdgeLabel(EObject node) {
		return getString( node, "label" );
	}

	public String getNodeIcon(EObject node) {
		String icon = getString( node, "icon" );
		return fixImageUri(icon);
		
	}
	
	public EObject getEdgeSource(EObject edge) {
		return getElement( edge, "source" );
	}
	
	public EObject getEdgeTarget(EObject edge) {
		return getElement( edge, "target" );
	}

	public String getNodeSourceLocation(EObject node) {
		return getString(node, "sourceLocation");
	}

	public String getTooltip(EObject nodeOrConnection) {
		return getString(nodeOrConnection, "tooltip" );
	}
	
	public EObject getFirstGraph() {
		return (EObject)getCollection(model, "graphs").iterator().next();
	}

	public Color getEdgeLineColor(EObject edge) {
		return getColor( edge, "color");
	}
	
	public Color getNodeLineColor(EObject node) {
		return getColor( node, "linecolor");
	}
	
	public Color getNodeTextColor(EObject node) {
		return getColor( node, "textcolor");
	}

	public EObject getUserData(EObject nodeOrEdge) {
		return getElement( nodeOrEdge, "userData");
	}
	
	public Map getUserDataMap( EObject nodeOrEdge ) {
		Map<String, String> res = new HashMap<String, String>();
		EObject ud = getUserData(nodeOrEdge);
		res.put( "name" , getNodeOrEdgeLabel(nodeOrEdge));
		String cat = getNodeOrEdgeCategory( nodeOrEdge );
		if ( cat != null ) {
			res.put( "cat" , cat);
		}
		
		if ( ud == null ) return res;
		Collection<EObject> nvpairs = (Collection<EObject>)getCollection(ud, "nvpairs");
		for (EObject nvp : nvpairs) {
			res.put( getString(nvp, "name"), getString(nvp, "value")); 
		}
		return res;
	}
	
	public String getNodeOrEdgeCategory(EObject nodeOrEdge) {
		return getString(nodeOrEdge, "category");
	}


	public Color getNodeFillColor(EObject node) {
		return getColor( node, "fillcolor", ColorConstants.lightGray);
	}
	
	public int getEdgeLineWidth(EObject edge) {
		Object o = get(edge, "width");
		if ( o == null ) return 2;
		return ((Integer)o).intValue();
	}
	
	public int getEdgeStyle(EObject edge) {
		String c = getElement(edge, "style").toString();
		if ( c == null || c.equals("NULL")) return styleMap.get("solid");
		int style = styleMap.get(c);
		if ( style == 0 ) return styleMap.get("solid");
		return style;
	}
	
	public double getEdgeLineWeight(EObject edge) {
		Object o = get(edge, "weight");
		if ( o == null ) return 0;
		double d = Integer.valueOf(o.toString()).doubleValue()/100;
		return d;
	}
	
	public boolean isEdgeDirected(EObject edge) {
		String dir = get( edge, "direction").toString();
		return dir.equals("directed");
	}

	public String getEdgeIcon(EObject edge) {
		String icon = getString( edge, "icon" );
		return fixImageUri(icon);
	}

	private String fixImageUri(String icon) {
		if ( icon == null ) return null;
		if ( icon.toLowerCase().startsWith("platform:")) return icon;
		EObject prolog = getElement(model, "prolog");
		if ( prolog == null ) return null;
		String iconPath = getString(prolog, "iconBasePath");
		if ( !iconPath.endsWith("/") ) iconPath += "/";
		return iconPath+icon;
	}
	
	
	private Collection<?> getCollection(EObject element, String featureName) {
		return (Collection<?>)get(element, featureName);
	}
	
	private String getString(EObject element, String featureName) {
		return (String)get(element, featureName);
	}

	private EObject getElement(EObject element, String featureName) {
		return (EObject)get(element, featureName);
	}

	private Object get(EObject element, String featureName) {
		return element.eGet( element.eClass().getEStructuralFeature(featureName) );
	}

	private Color getColor( EObject elem, String colorkind ) {
		return getColor(elem, colorkind, ColorConstants.black);
	}

	private Color getColor( EObject elem, String colorkind, Color defaultcolor ) {
		String c = getElement(elem, colorkind).toString();
		if ( c == null ) return defaultcolor;
		Color col = colorMap.get(c);
		if ( col == null ) return defaultcolor;
		return col;
	}















	
	
}
