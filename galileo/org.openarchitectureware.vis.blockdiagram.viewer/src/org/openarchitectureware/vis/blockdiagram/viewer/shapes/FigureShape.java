package org.openarchitectureware.vis.blockdiagram.viewer.shapes;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.graphics.Color;
import org.openarchitectureware.vis.blockdiagram.viewer.BlockDiagramCanvas;

/**
 * A generic shape which holds a figure.
 */

public class FigureShape extends Shape {

	private Figure figure;
	private Border border;
	private Color fillColor;
	
	public FigureShape(BlockDiagramCanvas canvas) {
		super(canvas);
	}

	public void setLabel(Figure figure) {
		this.figure = figure;		
	}

	// TODO: really required?, the client can directly set the border in the label figure?
	public void setBorder (Border border) {
		this.border = border;
	}
	
	@Override
	public IFigure createFigure() {
		Figure f = new Figure ();
		f.setLayoutManager(new BorderLayout()); 
		f.setBackgroundColor(fillColor);
		f.setOpaque(true);
		f.setBorder (border);
        f.add (figure, BorderLayout.CENTER);
		return f;
	}
	
	protected void refreshFigure() {
		if (isHighlighted()) {
			getFigure().setBackgroundColor(ColorConstants.cyan);
		} else {			
			getFigure().setBackgroundColor(fillColor);
		}
	}

	public void setFillColor(Color color) {
		this.fillColor = color;		
	}
}
