package org.openarchitectureware.vis.blockdiagram.viewer.shapes;

import java.util.List;
import java.util.Vector;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.graphics.Color;
import org.openarchitectureware.vis.blockdiagram.viewer.BlockDiagramCanvas;

// FIXME: add a subclass for the tool bar layout. Other subclass could support other layout algorithms, such as free form layout etc).

public class ContainerShape extends Shape {

	List<Shape> children = new Vector<Shape>();
	private Label label;
	private Integer labelPlacement;
	private LayoutManager layoutManager;
	private Border border;
	private Color fillColor;
	private boolean selectable = true;
	
	public ContainerShape(BlockDiagramCanvas canvas) {
		super(canvas);
	}

	public void setSelectable (boolean isSelectable) {
		selectable = isSelectable;
	}
	
	public void setBorder(Border border) {
		this.border = border;		
	}	
	
	public void setLayoutManager (LayoutManager layoutManager) {
		this.layoutManager = layoutManager;
	}
		
	public void setLabel(Label label) {
		this.label = label;		
	}
	
	public void setLabelPlacement (Integer placement) {
		this.labelPlacement = placement;
	}

	public void setFillColor (Color fillColor) {
		this.fillColor = fillColor;
	}
	
	public void addChild(Shape child) {
		if (child!=null) children.add(child);
	}

	@Override
	public IFigure createFigure() {
		Figure f = new Figure ();
		f.setBackgroundColor(fillColor);
		f.setOpaque(true);
		
		if (border!=null) {
			f.setBorder(border);
		}
		Figure innerFigure = f;		
		if (hasLabel()) {
			BorderLayout bl = new BorderLayout ();
			bl.setHorizontalSpacing(3);
			bl.setVerticalSpacing(3);
			f.setLayoutManager (bl);
			f.add(label, labelPlacement);
			innerFigure = new Figure ();
			f.add(innerFigure, BorderLayout.CENTER);
		}
		if (layoutManager!=null) {
			innerFigure.setLayoutManager(layoutManager);
		} else
			innerFigure.setLayoutManager(new ToolbarLayout());
		for (Shape s: children) {
			innerFigure.add (s.getFigure());
		}
		return f;
	}

	private boolean hasLabel() {
		return (label!=null);
	}

	protected void refreshFigure() {
		if (isHighlighted()) {
			getFigure().setBackgroundColor(ColorConstants.cyan);
		} else {			
			getFigure().setBackgroundColor(fillColor);
		}	}
	
	@Override
	public boolean isSelectable () {
		return selectable;
	}

}