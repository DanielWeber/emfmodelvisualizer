package org.openarchitectureware.vis.blockdiagram.viewer.shapes;

import org.eclipse.draw2d.IFigure;

public abstract class Connection {

	Shape source, target;
	
	public abstract IFigure getFigure();
	
	public void setSource(Shape shape) {
		source = shape;		
	}

	public void setTarget(Shape shape) {
		target = shape;
	}

}
