/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openarchitectureware.vis.blockdiagram.viewer.util;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;

/**
 * Works like a flow layout, but resizes child figures to fill the entire row or
 * column. Different modes for resizing are support.
 */
public class FillFlowLayout extends FlowLayout {
	
	public enum LayoutMode {
		proportional,
		samesize
	};
	
	private LayoutMode layoutMode = LayoutMode.samesize;
	
	public FillFlowLayout() {
	}

	public FillFlowLayout(boolean isHorizontal) {
		setHorizontal(isHorizontal);
	}

	public void setLayoutMode (LayoutMode layoutMode) {
		this.layoutMode = layoutMode;
	}
	
	/**
	 * Layouts one row of components. This is done based on the layout's
	 * orientation, minor alignment and major alignment.
	 * 
	 * @param parent
	 *            the parent figure
	 * @since 2.0
	 */
	protected void layoutRow(IFigure parent) {
		int minorAdjustment = 0;
		int correctMinorAlignment = minorAlignment;

		double scale = 1.0;
		double childWidth = 0.0;
		
		if (layoutMode==LayoutMode.proportional) {
			scale = ((double) data.area.width - (data.rowCount - 1) * getMinorSpacing())	/ ((double) data.rowWidth - (getMinorSpacing() * data.rowCount));
		}
		if (layoutMode==LayoutMode.samesize) {
			childWidth = (data.area.width - (data.rowCount*getMinorSpacing())) / (double) data.rowCount; 
		}

		int x = 0;
		for (int j = 0; j < data.rowCount; j++) {
			if (fill) {
				data.bounds[j].height = data.rowHeight;
			} else {
				minorAdjustment = data.rowHeight - data.bounds[j].height;
				switch (correctMinorAlignment) {
				case ALIGN_LEFTTOP:
					minorAdjustment = 0;
					break;
				case ALIGN_CENTER:
					minorAdjustment /= 2;
					break;
				case ALIGN_RIGHTBOTTOM:
					break;
				}
				data.bounds[j].y += minorAdjustment;
			}
			if (layoutMode==LayoutMode.proportional) {
				data.bounds[j].x = (int) (x * scale) + (j * getMinorSpacing());
				x += data.bounds[j].width;
				data.bounds[j].width *= scale;
			} 
			if (layoutMode==LayoutMode.samesize) {
				data.bounds[j].x = (int) ((j*childWidth)+(j*getMinorSpacing()));
				data.bounds[j].width = (int) ((x+childWidth)-x);
			}
			setBoundsOfChild(parent, data.row[j], transposer.t(data.bounds[j]));
		}
		data.rowY += getMajorSpacing() + data.rowHeight;
		initRow();
	}

} 