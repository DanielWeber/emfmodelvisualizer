package org.openarchitectureware.vis.blockdiagram.viewer;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.openarchitectureware.vis.blockdiagram.viewer.shapes.Connection;
import org.openarchitectureware.vis.blockdiagram.viewer.shapes.Shape;

// returns a diagram from an object

public interface IBlockDiagramContentProvider extends IContentProvider, ITreeContentProvider {

	// shape interface
	
	IFigure getRootFigure (Object object, BlockDiagramCanvas canvas);
	
	Shape getDiagramShape (Object object, BlockDiagramCanvas canvas);
	
	// connection interface
	
	Object[] getConnections (Object object);
	
	Connection getConnection (Object object, BlockDiagramCanvas canvas);
	
	Object getSource (Object object);
	
	Object getTarget (Object object);
}
