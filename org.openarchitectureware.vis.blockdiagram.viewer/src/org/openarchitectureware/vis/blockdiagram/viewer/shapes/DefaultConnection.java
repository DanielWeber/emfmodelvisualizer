package org.openarchitectureware.vis.blockdiagram.viewer.shapes;

import java.util.List;
import java.util.Vector;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.graphics.Color;

public class DefaultConnection extends Connection {

	private RotatableDecoration sourceDecoration;
	private RotatableDecoration targetDecoration;
	private int lineWidth;
	private int lineStyle;
	private Color lineColor;
	private List<ConnectionLabel> labels = new Vector<ConnectionLabel>();
	private PolylineConnection figure;

	@Override
	public IFigure getFigure() {
		if (null == figure)
			figure = createFigure();
		return figure;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.vis.blockdiagram.viewer.shapes.Connection#refreshFigure()
	 */
	@Override
	protected void refreshFigure() {
		if (isHighlighted) {
			figure.setForegroundColor(ColorConstants.cyan);
		} else {
			figure.setForegroundColor(lineColor);
		}
	}

	/**
	 * @return
	 */
	private PolylineConnection createFigure() {
		PolylineConnection pc = new PolylineConnection();

		pc.setSourceAnchor(new ChopboxAnchor(source.getFigure()));
		pc.setTargetAnchor(new ChopboxAnchor(target.getFigure()));
		pc.setTargetDecoration(getTargetDecoration());
		pc.setSourceDecoration(getSourceDecoration());
		pc.setLineWidth(lineWidth);
		pc.setLineStyle(lineStyle);
		pc.setForegroundColor(lineColor);
		pc.setBackgroundColor(lineColor);
		pc.setFill(true);

		pc.addMouseListener(new org.eclipse.draw2d.MouseListener() {
			public void mouseReleased(org.eclipse.draw2d.MouseEvent arg0) {
				source.getCanvas().setSelection(DefaultConnection.this);
			}

			public void mousePressed(org.eclipse.draw2d.MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			public void mouseDoubleClicked(org.eclipse.draw2d.MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		for (ConnectionLabel connectionLabel : labels) {
			ConnectionLocator locator = null;
			switch (connectionLabel.getPosition()) {
			case center:
				locator = new ConnectionLocator(pc, ConnectionLocator.MIDDLE);
				break;
			case target:
				locator = new ConnectionLocator(pc, ConnectionLocator.TARGET);
				break;
			case source:
				locator = new ConnectionLocator(pc, ConnectionLocator.SOURCE);
				break;

			}
			if (null != locator) {
				locator.setGap(5);
				switch (connectionLabel.getAlignment()) {
				case center:
					locator.setRelativePosition(PositionConstants.CENTER);
					break;
				case east:
					locator.setRelativePosition(PositionConstants.EAST);
					break;
				case west:
					locator.setRelativePosition(PositionConstants.WEST);
					break;
				}
				pc.add(connectionLabel.getLabel(), locator);
			}

		}
		return pc;
	}

	public static PolygonDecoration getArrowHeadDecoration() {
		PolygonDecoration decoration = new PolygonDecoration();
		PointList decorationPointList = new PointList();
		decorationPointList.addPoint(0, 0);
		decorationPointList.addPoint(-1, 1);
		decorationPointList.addPoint(-1, -1);
		decoration.setTemplate(decorationPointList);
		return decoration;
	}

	public void setTargetDecoration(RotatableDecoration targetDecoration) {
		this.targetDecoration = targetDecoration;
	}

	public RotatableDecoration getTargetDecoration() {
		return targetDecoration;
	}

	public void setSourceDecoration(RotatableDecoration sourceDecoration) {
		this.sourceDecoration = sourceDecoration;
	}

	public RotatableDecoration getSourceDecoration() {
		return sourceDecoration;
	}

	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
	}

	public int getLineWidth() {
		return lineWidth;
	}

	public void setLineStyle(int lineStyle) {
		this.lineStyle = lineStyle;
	}

	public int getLineStyle() {
		return lineStyle;
	}

	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}

	public Color getLineColor() {
		return lineColor;
	}

	public void addLabel(ConnectionLabel label) {
		labels.add(label);
	}
}
