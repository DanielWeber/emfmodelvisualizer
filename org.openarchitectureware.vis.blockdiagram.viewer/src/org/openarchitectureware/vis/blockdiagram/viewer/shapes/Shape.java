package org.openarchitectureware.vis.blockdiagram.viewer.shapes;

import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.widgets.Item;
import org.openarchitectureware.vis.blockdiagram.viewer.BlockDiagramCanvas;

// FIXME: why does a shape need to be derived from Item? Look at zest.

public abstract class Shape extends Item {

	public Shape(BlockDiagramCanvas canvas) {
		super(canvas, 0);
		this.canvas = canvas;
	}

	private boolean isHighlighted;
	private IFigure figure;
	private BlockDiagramCanvas canvas;
	
	protected BlockDiagramCanvas getCanvas () {
		return canvas;
	}
	
	public IFigure getFigure () {
		if (figure==null) {
			figure = createFigure();
			if (isSelectable()) {
				figure.addMouseListener(new org.eclipse.draw2d.MouseListener() {
					public void mouseReleased(org.eclipse.draw2d.MouseEvent arg0) {
						canvas.setSelection (Shape.this);	
					}
					
					public void mousePressed(org.eclipse.draw2d.MouseEvent arg0) {
						// TODO Auto-generated method stub				
					}
					
					public void mouseDoubleClicked(org.eclipse.draw2d.MouseEvent arg0) {
						// TODO Auto-generated method stub				
					}
				});
			}
		}
		return figure;
	}
	
	public void highlight (boolean highlight) {
		if (highlight!=this.isHighlighted) {
			isHighlighted = highlight;
			refreshFigure();
		}
	}
	
	public boolean isHighlighted () {
		return isHighlighted;
	}
	
	protected abstract IFigure createFigure ();

	protected void refreshFigure () {
	}

	public boolean isSelectable () {
		return true;
	}
}
