/*******************************************************************************
 * Copyright 2005-2006, CHISEL Group, University of Victoria, Victoria, BC,
 * Canada. All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: The Chisel Group, University of Victoria
 ******************************************************************************/
package org.eclipse.zest.core.viewers.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.zest.core.viewers.INestedContentProvider;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphItem;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.IContainer;

/*
 * Base class that can be used for model factories. Offers facilities to style
 * the items that have been created by the factory.
 * 
 * @author Del Myers
 */
// @tag zest.bug.160367-Refreshing.fix : update the factory to use the
// IStylingGraphModelFactory
public abstract class AbstractStylingModelFactory implements IStylingGraphModelFactory {
	private AbstractStructuredGraphViewer viewer;
	private int connectionStyle;
	private int nodeStyle;
	private List /* ConstraintAdapater */constraintAdapters = new ArrayList();

	/**
	 * 
	 */
	public AbstractStylingModelFactory(AbstractStructuredGraphViewer viewer) {
		this.viewer = viewer;
		this.connectionStyle = SWT.NONE;
		this.nodeStyle = SWT.NONE;
		if (viewer instanceof AbstractStructuredGraphViewer) {
			this.constraintAdapters = (viewer).getConstraintAdapters();
		}
	}

	public void styleConnection(GraphConnection conn) {
		// recount the source and target connections on the node.
		// this isn't a great way to do it, because it results in
		// an n^2 algorithm. But, if anyone can figure out a better way
		// go ahead and try it.
		GraphNode source = conn.getSource();
		GraphNode dest = conn.getDestination();
		LinkedList rightList = getConnectionList(source, dest);

		LinkedList leftList = null;

		if (dest != source) {
			leftList = getConnectionList(dest, source);
		}

		// adjust the arcs going from source to destination
		adjustCurves(rightList);
		// adjust the arcs going from destination to source
		if (leftList != null) {
			adjustCurves(leftList);
		}
	}

	/**
	 * Takes a list of IGraphModelConnections and adjusts the curve depths and
	 * the bezier curves based on the number of curves in the list.
	 * 
	 * @param rightList
	 */
	protected void adjustCurves(List connections) {
		// @tag TODO curves : add back this code to adjust the curves
		//		int scale = 3;
		//		for (int i = 0; i < connections.size(); i++) {
		//			GraphConnection conn = (GraphConnection) connections.get(i);
		//			if (conn.getSource() == conn.getDestination()) {
		//				scale = 5;
		//			}
		//			// even if the connection isn't curved in the style, the edit part
		//			// may decide that it should be curved if source and dest are equal.
		//			// @tag drawing(arcs) : check here if arcs are too close when being
		//			// drawn. Adjust the constant.
		//			int lineWidth = conn.getLineWidth();
		//			conn.setCurveDepth((i + 1) * (scale + lineWidth));
		//
		//			// @tag zest(bug(152530-Bezier(fix))) : set the angles, etc based on
		//			// the count.
		//			// limit the angle to 90 degrees.
		//			conn.setStartAngle(90.0 - 85.0 / Math.pow(i, 1.0 / 9.0));
		//			conn.setEndAngle(85.0 / Math.pow(i, 1.0 / 9.0) - 90.0);
		//			// limit the length to 1
		//			conn.setStartLength(.75 - .25 / (Math.sqrt(i)));
		//			conn.setEndLength(.75 - .25 / (Math.sqrt(i)));
		//		}
	}

	/**
	 * @param source
	 * @param dest
	 * @return
	 */
	private LinkedList getConnectionList(GraphNode source, GraphNode dest) {
		LinkedList list = new LinkedList();
		Iterator i = source.getSourceConnections().iterator();
		while (i.hasNext()) {
			GraphConnection c = (GraphConnection) i.next();
			if (c.getDestination() == dest) {
				list.add(c);
			}
		}
		return list;
	}

	public void styleItem(GraphItem item) {
		GraphItemStyler.styleItem(item, getLabelProvider());
		if (item instanceof GraphConnection) {
			styleConnection((GraphConnection) item);
		}
	}

	public StructuredViewer getViewer() {
		return viewer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.internal.graphmodel.IStylingGraphModelFactory#getLabelProvider()
	 */
	public IBaseLabelProvider getLabelProvider() {
		return viewer.getLabelProvider();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.internal.graphmodel.IStylingGraphModelFactory#getContentProvider()
	 */
	public IStructuredContentProvider getContentProvider() {
		return (IStructuredContentProvider) viewer.getContentProvider();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.internal.graphmodel.IStylingGraphModelFactory#createConnection(org.eclipse.zest.core.internal.graphmodel.GraphModel,
	 *      java.lang.Object, java.lang.Object, java.lang.Object)
	 */
	public GraphConnection createConnection(Graph graph, Object element, Object source, Object dest) {
		if (source == null || dest == null) {
			return null;
		}
		GraphConnection oldConnection = viewer.getGraphModelConnection(element);
		GraphNode sn = viewer.getGraphModelNode(source);
		GraphNode dn = viewer.getGraphModelNode(dest);
		if (oldConnection != null) {
			if (sn != oldConnection.getSource() || dn != oldConnection.getDestination()) {
				viewer.removeGraphModelConnection(oldConnection);
			} else {
				styleItem(oldConnection);
				return oldConnection;
			}
		}
		if (sn == null) {
			sn = createNode(graph, source);
		}
		if (dn == null) {
			dn = createNode(graph, dest);
		}
		GraphConnection c = viewer.addGraphModelConnection(element, sn, dn);
		styleItem(c);
		return c;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.internal.graphmodel.IStylingGraphModelFactory#createNode(org.eclipse.zest.core.internal.graphmodel.GraphModel,
	 *      java.lang.Object)
	 */
	public GraphNode createNode(Graph graph, Object element, IFigure figure) {
		GraphNode node = null;
		if (getContentProvider() instanceof INestedContentProvider) {
			boolean isContainer = ((INestedContentProvider) getContentProvider()).hasChildren(element);
			if (isContainer) {
				node = viewer.addGraphModelContainer(element);
				styleItem(node);
				Object[] childNodes = ((INestedContentProvider) getContentProvider()).getChildren(element);
				childNodes = filter(getViewer().getInput(), childNodes);
				if (childNodes == null) {
					return node;
				}
				for (int i = 0; i < childNodes.length; i++) {
					GraphNode childNode = viewer.addGraphModelNode((IContainer) node, childNodes[i]);
					styleItem(childNode);
				}
				((IContainer) node).applyLayout();
				return node;
			}
		}
		node = viewer.addGraphModelNode(element, figure);
		styleItem(node);
		return node;
	}

	public GraphNode createNode(Graph graph, Object element) {
		return this.createNode(graph, element, null);
	}

	public void setConnectionStyle(int style) {
		this.connectionStyle = style;
	}

	/**
	 * @return the connectionStyle
	 */
	public int getConnectionStyle() {
		return connectionStyle;
	}

	public void setNodeStyle(int style) {
		this.nodeStyle = style;
	}

	public List /* ConstraintAdapter */getConstraintAdapters() {
		return this.constraintAdapters;
	}

	/**
	 * @return the nodeStyle
	 */
	public int getNodeStyle() {
		return nodeStyle;
	}

	/**
	 * Default implementation simply restyles the item, regardless of the
	 * properties.
	 */
	public void update(GraphItem item) {
		styleItem(item);
	}

	/**
	 * Default implementation simply restyles the items, regardless of the
	 * properties.
	 */
	public void update(GraphItem[] items) {
		for (int i = 0; i < items.length; i++) {
			styleItem(items[i]);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.internal.graphmodel.IStylingGraphModelFactory#refreshGraph(org.eclipse.zest.core.internal.graphmodel.GraphModel)
	 */
	public void refreshGraph(Graph graph) {
		// with this kind of graph, it is just as easy and cost-effective to
		// rebuild the whole thing.

		Map oldMap = viewer.getNodesMap();
		HashMap nodesMap = new HashMap();
		// have to copy the Map data accross so that it doesn't get overwritten
		for (Iterator keys = oldMap.keySet().iterator(); keys.hasNext();) {
			Object key = keys.next();
			nodesMap.put(key, oldMap.get(key));
		}
		clearGraph(graph);
		doBuildGraph(graph);
		// update the positions on the new nodes to match the old ones.
		GraphNode[] nodes = getNodesArray(graph);
		// save a little time, go with the smallest list as the primary list
		if (nodes.length < nodesMap.keySet().size()) {
			for (int i = 0; i < nodes.length; i++) {
				GraphNode oldNode = (GraphNode) nodesMap.get(nodes[i].getData());
				if (oldNode != null) {
					nodes[i].setLocation(oldNode.getLocation().x, oldNode.getLocation().y);
					if (oldNode.isSizeFixed()) {
						nodes[i].setSize(oldNode.getSize().width, oldNode.getSize().height);
					}
				}
			}
		} else {
			for (Iterator i = nodesMap.keySet().iterator(); i.hasNext();) {
				Object key = i.next();
				GraphNode node = viewer.getGraphModelNode(key);
				if (node != null) {
					GraphNode oldNode = (GraphNode) nodesMap.get(key);
					node.setLocation(oldNode.getLocation().x, oldNode.getLocation().y);
					if (oldNode.isSizeFixed()) {
						node.setSize(oldNode.getSize().width, oldNode.getSize().height);
					}
				}
			}
		}
	}

	/**
	 * Convenience method for clearing all the elements in the graph.
	 * 
	 * @param graph
	 */
	public void clearGraph(Graph graph) {
		graph.setSelection(null);
		Object[] nodeElements = viewer.getNodeElements();
		for (int i = 0; i < nodeElements.length; i++) {
			viewer.removeGraphModelNode(nodeElements[i]);
		}
		Object[] connectionElements = viewer.getConnectionElements();
		for (int i = 0; i < connectionElements.length; i++) {
			viewer.removeGraphModelConnection(connectionElements[i]);
		}
	}

	/**
	 * Builds the graph model from the viewer's content provider. There is no
	 * guarantee that the model will be cleared before this method is called.
	 * 
	 * @param graph
	 */
	protected void doBuildGraph(Graph model) {
		clearGraph(model);
		model.setConnectionStyle(getConnectionStyle());
		model.setNodeStyle(getNodeStyle());
		model.setConstraintAdapters(getConstraintAdapters());
	}

	/**
	 * Determines if this element should be filtered or not.
	 * 
	 * @param parent
	 * @param element
	 * @return
	 */
	protected boolean filterElement(Object parent, Object element) {
		ViewerFilter[] filters = getViewer().getFilters();
		for (int i = 0; i < filters.length; i++) {
			boolean selected = filters[i].select(viewer, parent, element);
			if (!selected) {
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.internal.graphmodel.IStylingGraphModelFactory#isFiltered(java.lang.Object)
	 */
	protected Object[] filter(Object parent, Object[] elements) {
		Object[] result = elements;
		ViewerFilter[] filters = getViewer().getFilters();
		for (int i = 0; i < filters.length; i++) {
			result = filters[i].filter(viewer, parent, result);
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.internal.graphmodel.IStylingGraphModelFactory#refresh(org.eclipse.zest.core.internal.graphmodel.GraphModel,
	 *      java.lang.Object)
	 */
	public void refresh(Graph graph, Object element) {
		refresh(graph, element, false);
	}

	/**
	 * Converts the list of GraphNode objects into an array and return it.
	 * 
	 * @return GraphModelNode[]
	 */
	protected GraphNode[] getNodesArray(Graph graph) {
		GraphNode[] nodesArray = new GraphNode[graph.getNodes().size()];
		nodesArray = (GraphNode[]) graph.getNodes().toArray(nodesArray);
		return nodesArray;
	}

	/**
	 * Converts the list of GraphConnections objects into an array and return it.
	 * @param graph
	 * @return
	 */
	protected GraphConnection[] getConnectionArray(Graph graph) {
		GraphConnection[] connectionArray = new GraphConnection[graph.getConnections().size()];
		connectionArray = (GraphConnection[]) graph.getConnections().toArray(connectionArray);
		return connectionArray;
	}
}
