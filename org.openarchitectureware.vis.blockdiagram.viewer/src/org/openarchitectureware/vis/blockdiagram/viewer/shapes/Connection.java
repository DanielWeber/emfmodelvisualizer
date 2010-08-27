package org.openarchitectureware.vis.blockdiagram.viewer.shapes;

import org.eclipse.draw2d.IFigure;

public abstract class Connection {

	Shape source, target;
	protected boolean isHighlighted = false;

	public abstract IFigure getFigure();

	public void setSource(Shape shape) {
		source = shape;
	}

	public void setTarget(Shape shape) {
		target = shape;
	}

	public void highlight(boolean highlight) {
		if (highlight != this.isHighlighted) {
			isHighlighted = highlight;
			refreshFigure();
		}
	}

	/**
    *
    */
	protected void refreshFigure() {
		// no defaults
	}

}
