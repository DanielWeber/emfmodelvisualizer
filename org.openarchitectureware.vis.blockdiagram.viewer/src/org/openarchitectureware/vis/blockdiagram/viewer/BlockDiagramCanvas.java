package org.openarchitectureware.vis.blockdiagram.viewer;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.openarchitectureware.vis.blockdiagram.viewer.shapes.Connection;
import org.openarchitectureware.vis.blockdiagram.viewer.shapes.Shape;

// SWT class (no jface)

public class BlockDiagramCanvas extends FigureCanvas {

	List<Object> selectedShapes = new ArrayList<Object>();
	private List<SelectionListener> selectionListeners = new Vector<SelectionListener>();

	public BlockDiagramCanvas(Composite parent) {
		super(parent);
	}

	public List<Object> getSelection() {
		return selectedShapes;
	}

	protected void clearSelection() {
		for (Object s : selectedShapes) {
			if (s instanceof Shape)
				((Shape) s).highlight(false);
			if (s instanceof Connection)
				((Connection) s).highlight(false);
		}
		selectedShapes.clear();
	}

	public void setSelection(Shape shape) {
		clearSelection();
		if (shape != null) {
			shape.highlight(true);
			selectedShapes.add(shape);
			fireSelectionEvent(shape);
		}
	}

	public void setSelection(Connection conn) {
		clearSelection();
		if (conn != null) {
			conn.highlight(true);
			selectedShapes.add(conn);
			fireSelectionEvent(conn);
		}
	}

	public void addSelectionListener(SelectionListener selectionListener) {
		if (!selectionListeners.contains(selectionListener)) {
			selectionListeners.add(selectionListener);
		}
	}

	public void removeSelectionListener(SelectionListener selectionListener) {
		if (selectionListeners.contains(selectionListener)) {
			selectionListeners.remove(selectionListener);
		}
	}

	protected void fireSelectionEvent(Object selection) {
		for (SelectionListener l : selectionListeners) {
			Event swtEvent = new Event();
			// swtEvent.item = shape;
			swtEvent.widget = this;
			l.widgetSelected(new SelectionEvent(swtEvent));
		}
	}
}
