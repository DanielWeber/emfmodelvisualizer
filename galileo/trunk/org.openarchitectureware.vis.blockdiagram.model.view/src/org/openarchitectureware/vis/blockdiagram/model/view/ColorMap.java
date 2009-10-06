package org.openarchitectureware.vis.blockdiagram.model.view;

import java.util.HashMap;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.graphics.Color;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.ColorEnum;

@SuppressWarnings("serial")
public class ColorMap extends HashMap<ColorEnum, Color> {

	private static ColorMap instance = new ColorMap();
	
	private ColorMap () {
		put(ColorEnum.WHITE, ColorConstants.white );  
		put(ColorEnum.LIGHT_GRAY, ColorConstants.lightGray );
		put(ColorEnum.GRAY, ColorConstants.gray );
		put(ColorEnum.DARK_GRAY, ColorConstants.darkGray );   
		put(ColorEnum.BLACK, ColorConstants.black );      
		put(ColorEnum.RED, ColorConstants.red );        
		put(ColorEnum.ORANGE, ColorConstants.orange );     
		put(ColorEnum.YELLOW, ColorConstants.yellow );     
		put(ColorEnum.GREEN, ColorConstants.green );      
		put(ColorEnum.LIGHT_GREEN, ColorConstants.lightGreen ); 
		put(ColorEnum.DARK_GREEN, ColorConstants.darkGreen );  
		put(ColorEnum.CYAN, ColorConstants.cyan );       
		put(ColorEnum.LIGHT_BLUE, ColorConstants.lightBlue );  
		put(ColorEnum.BLUE, ColorConstants.blue );       
		put(ColorEnum.DARK_BLUE, ColorConstants.darkBlue );   		
	}

	public static Color getColor (ColorEnum ce) {
		return instance.get(ce);
	}
}
