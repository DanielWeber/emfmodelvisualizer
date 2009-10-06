package org.openarchitectureware.vis.blockdiagram.viewer.shapes;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;

public class ConnectionLabel {

	public enum Position {
		source, target, center
	}
	
	public enum Alignment {
		west, east, center
	}
	
	Position position;
	Alignment alignment;
	Label label;
	
	public ConnectionLabel (Label label, Position position, Alignment alignment) {
		this.label = label;
		this.position = position;
		this.alignment = alignment;
	}

	public Alignment getAlignment() {
		return alignment;
	}

	public IFigure getLabel() {
		return label;
	}

	public Position getPosition() {
		return position;
	}
	
}
