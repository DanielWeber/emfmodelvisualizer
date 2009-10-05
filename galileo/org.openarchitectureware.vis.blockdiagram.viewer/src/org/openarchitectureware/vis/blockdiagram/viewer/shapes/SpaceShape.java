package org.openarchitectureware.vis.blockdiagram.viewer.shapes;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.openarchitectureware.vis.blockdiagram.viewer.BlockDiagramCanvas;

public class SpaceShape extends Shape {

	protected int width = 1;
	protected boolean isHorizontal;
	
	public SpaceShape(BlockDiagramCanvas canvas) {
		super(canvas);
	}

	public void setWidth (int width) {
		this.width = width;
	}
	
	public void setHorizontal (boolean b) {
		isHorizontal = b;
	}
	
	@Override
	public IFigure createFigure() {
		Figure f = new Figure ();
		f.setBorder(new MarginBorder(0));	
		f.setOpaque(false);
		if (isHorizontal) {			
			f.setPreferredSize(width, 1);			
		} else {
			f.setPreferredSize(1, width);
		}
		return f;		
	}

	@Override
	public boolean isSelectable() {
		return false;
	}
}
