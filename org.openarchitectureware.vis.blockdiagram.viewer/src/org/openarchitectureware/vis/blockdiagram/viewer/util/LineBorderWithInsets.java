package org.openarchitectureware.vis.blockdiagram.viewer.util;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.swt.graphics.Color;

public class LineBorderWithInsets extends LineBorder {

	private int mInsets;

	public LineBorderWithInsets(Color color, int width, int style, int insets) {
		super(color, width, style);
		mInsets = insets;
	}

	public LineBorderWithInsets(Color color, int width, int insets) {
		super (color, width);
		mInsets = insets;
	}

	public LineBorderWithInsets(int width, int insets) {
		super (width);
		mInsets = insets;
	}

    public Insets getInsets(IFigure figure) {
        return new Insets(mInsets, mInsets, mInsets, mInsets);
      }

};
