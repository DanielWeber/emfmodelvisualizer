package org.openarchitectureware.vis.zest.builder;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.ToolbarLayout;

public class MultiCompartmentFigure extends Figure {

	public MultiCompartmentFigure(Label name) {
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new LineBorder(ColorConstants.black, 1));
		setOpaque(true);

		add(name);
	}

	public void addCompartment(CompartmentFigure compartmentFigure) {
		add(compartmentFigure);
	}
}