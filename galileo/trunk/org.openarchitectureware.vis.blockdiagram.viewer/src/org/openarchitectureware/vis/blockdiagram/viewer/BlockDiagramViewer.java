package org.openarchitectureware.vis.blockdiagram.viewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Widget;
import org.openarchitectureware.vis.blockdiagram.viewer.shapes.Connection;
import org.openarchitectureware.vis.blockdiagram.viewer.shapes.ContainerShape;
import org.openarchitectureware.vis.blockdiagram.viewer.shapes.Shape;

// jface class

public class BlockDiagramViewer extends StructuredViewer implements ISelectionProvider {

	BlockDiagramCanvas canvas;
	Map<Shape, Object> shapeObjectMap = new HashMap<Shape, Object>(10);
	Map<Object, Shape> objectShapeMap = new HashMap<Object, Shape>(10);
	Map<Object, Connection> objectConnectionMap = new HashMap<Object, Connection>(10);
	
	List<ISelectionChangedListener> selectionChangedListeners = new Vector<ISelectionChangedListener>();
	
	public BlockDiagramViewer (Composite parent) {
		this.canvas = new BlockDiagramCanvas(parent);
		hookControl(this.canvas);
		canvas.getViewport().setContentsTracksWidth(true); 				
	}

	public void setContentProvider(IContentProvider contentProvider) {	
		if (contentProvider instanceof IBlockDiagramContentProvider) {
			super.setContentProvider(contentProvider);
		} else {
			throw new IllegalArgumentException
				("Invalid content provider, only IBlockDiagramContentProvider is supported.");
		}
	}

	// hook called whenever the input data of the viewer changed (triggered by setInput). 
    protected void inputChanged(Object input, Object oldInput) {
    	shapeObjectMap.clear();
    	objectShapeMap.clear();
    	objectConnectionMap.clear();
    	canvas.setContents (null);
    	
    	if (input!=null) {
    		if (getContentProvider() instanceof IBlockDiagramContentProvider) {
    			IBlockDiagramContentProvider contentProvider = (IBlockDiagramContentProvider) getContentProvider();
				IFigure f = contentProvider.getRootFigure(input, canvas);
				for (Object o: contentProvider.getElements(input)) {
					Shape shape = createShape (o);
					if (shape!=null)
						f.add(shape.getFigure());
				}
				for (Object o: contentProvider.getConnections(input)) {
					Connection connection = createConnection (o);
					if (connection!=null) {
						f.add(connection.getFigure());
					}
				}
				canvas.setContents(f);
    		}
    	}
    }

	protected void hookControl(Control control) {
		super.hookControl(control);

		canvas.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				ISelection structuredSelection = getSelection();
				SelectionChangedEvent event = new SelectionChangedEvent(BlockDiagramViewer.this, structuredSelection);
				for (ISelectionChangedListener scl:selectionChangedListeners) {
					scl.selectionChanged(event);
				}
			}
		});
		
		canvas.addMouseListener(new MouseListener() {
			
			public void mouseUp(MouseEvent e) {
				// do nothing
			}
			
			public void mouseDown(MouseEvent e) {
				// do nothing				
			}
			
			public void mouseDoubleClick(MouseEvent e) {
				DoubleClickEvent doubleClickEvent = new DoubleClickEvent(BlockDiagramViewer.this, getSelection());
				fireDoubleClick(doubleClickEvent);								
			}
		});
	}
    
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		if (!selectionChangedListeners.contains(listener)) {
			selectionChangedListeners.add(listener);
		}
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		if (selectionChangedListeners.contains(listener)) {
			selectionChangedListeners.remove(listener);
		}
	}
    

    private Connection createConnection(Object o) {
		if (getContentProvider() instanceof IBlockDiagramContentProvider) {
			IBlockDiagramContentProvider contentProvider = (IBlockDiagramContentProvider) getContentProvider();
			Connection connection = contentProvider.getConnection(o, canvas);			
			if (connection!=null) {
				Object source = contentProvider.getSource(o);				
				Object target = contentProvider.getTarget(o);				
				connection.setSource (objectShapeMap.get(source));
				connection.setTarget (objectShapeMap.get(target));				
				objectConnectionMap.put(o, connection);
			}
			return connection;
		}
		return null;
	}
	
	private Shape createShape(Object input) {
		if (getContentProvider() instanceof IBlockDiagramContentProvider) {
			IBlockDiagramContentProvider contentProvider = (IBlockDiagramContentProvider) getContentProvider();
			Shape shape = contentProvider.getDiagramShape(input, canvas);
			if (shape!=null) {
				shapeObjectMap.put (shape, input);
				objectShapeMap.put(input, shape);
				if (shape instanceof ContainerShape) {
					for (Object o: contentProvider.getChildren(input)) {
						Shape child = createShape (o);
						((ContainerShape) shape).addChild(child);
					}
				}
			}
			return shape;
		}
		return null;
	}
    
	// --------------------------------------------------------------------	
	// implementation of abstract methods from StructuredViewer
	// --------------------------------------------------------------------	

	@Override
	protected Widget doFindInputItem(Object element) {
		return objectShapeMap.get(element);
	}

	@Override
	protected Widget doFindItem(Object element) {
		// TODO: is this correct? What is difference between doFindItem and doFindInputItem?
		return doFindInputItem(element);
	}

	@Override
	protected void doUpdateItem(Widget item, Object element, boolean fullMap) {
		// TODO Auto-generated method stub		
	}

	@SuppressWarnings("unchecked")
	@Override
	protected List getSelectionFromWidget() {
		List rv = new ArrayList(canvas.getSelection().size());
		for (Shape s:canvas.getSelection()) {
			rv.add(shapeObjectMap.get(s));
		}
		return rv;
	}

	@Override
	protected void internalRefresh(Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reveal(Object element) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void setSelectionToWidget(List l, boolean reveal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Control getControl() {
		return canvas;
	}

}
