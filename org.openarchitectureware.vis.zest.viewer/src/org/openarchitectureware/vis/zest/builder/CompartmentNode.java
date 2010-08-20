package org.openarchitectureware.vis.zest.builder;

import org.eclipse.draw2d.IFigure;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.IContainer;

public class CompartmentNode extends GraphNode {
		IFigure customFigure = null;

		public CompartmentNode(IContainer graphModel, int style, IFigure figure) {
			super(graphModel, style, figure);
		}

		protected IFigure createFigureForModel() {
			return (IFigure) this.getData();
		}
}
