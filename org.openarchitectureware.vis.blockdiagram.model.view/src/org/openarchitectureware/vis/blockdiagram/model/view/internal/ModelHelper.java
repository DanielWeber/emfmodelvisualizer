package org.openarchitectureware.vis.blockdiagram.model.view.internal;

import org.eclipse.draw2d.Graphics;
import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.BlockDiagramPackage;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.BlockShape;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Color;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.DefaultValues;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Diagram;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.FontAttributes;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.FontStyleEnum;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.LabelPlacementEnum;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Layout;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.LayoutOrientationEnum;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.LayoutShape;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.LineStyleEnum;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Shape;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.ShapeAttributes;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.SpaceShape;

// This class must not have any dependencies to SWT classes. 
// It is intended to be used in other contexts later.

/**
 * This class provides convenience methods to access model data.
 * 
 * @author CKulla
 * 
 */
public class ModelHelper {

	/**
	 * Returns the label of the block. If no label is specified return the name
	 * of the block.
	 * 
	 * @param block
	 * @return
	 */
	public static String getLabel(BlockShape block) {
		if (block.getLabel() != null) {
			return block.getLabel();
		}
		return block.getName();
	}

	public static int getSpacing(Layout layout) {
		if (layout != null && layout.isSetSpacing())
			return layout.getSpacing();
		DefaultValues dv = getDefaultValues(layout);
		while (dv != null) {
			if (dv.isSetSpacing())
				return dv.getSpacing();
			dv = getDefaultValues(dv);
		}
		return Defaults.SPACING;
	}

	public static int getLineWidth(EObject refObject, ShapeAttributes sa) {
		if (sa != null && sa.getLineAttributes() != null
				&& sa.getLineAttributes().isSetLineWidth())
			return sa.getLineAttributes().getLineWidth();
		DefaultValues dv = getDefaultValues(refObject);
		while (dv != null) {
			if (dv.getAttributes() != null
					&& dv.getAttributes().getLineAttributes() != null
					&& dv.getAttributes().getLineAttributes().isSetLineWidth())
				return dv.getAttributes().getLineAttributes().getLineWidth();
			dv = getDefaultValues(dv);
		}
		return Defaults.LINEWIDTH;
	}

	public static Color getLineColor(EObject refObject,	ShapeAttributes sa) {
		if (sa != null && sa.getLineAttributes() != null
				&& sa.getLineAttributes().getLineColor()!=null)
			return sa.getLineAttributes().getLineColor();
		DefaultValues dv = getDefaultValues(refObject);
		while (dv != null) {
			if (dv.getAttributes() != null
					&& dv.getAttributes().getLineAttributes() != null
					&& dv.getAttributes().getLineAttributes().getLineColor() != null)
				return dv.getAttributes().getLineAttributes().getLineColor();
			dv = getDefaultValues(dv);
		}
		return null;		
	}

	public static LineStyleEnum getLineStyle(EObject refObject,	ShapeAttributes sa) {
		if (sa != null && sa.getLineAttributes() != null
				&& sa.getLineAttributes().isSetLineStyle())
			return sa.getLineAttributes().getLineStyle();
		DefaultValues dv = getDefaultValues(refObject);
		while (dv != null) {
			if (dv.getAttributes() != null
					&& dv.getAttributes().getLineAttributes() != null
					&& dv.getAttributes().getLineAttributes().getLineStyle() != null)
				return dv.getAttributes().getLineAttributes().getLineStyle();
			dv = getDefaultValues(dv);
		}
		return Defaults.LINESTYLE;		
	}
	
	public static int getInset(EObject refObject, ShapeAttributes sa) {
		if (sa != null && sa.isSetInset())
			return sa.getInset();
		DefaultValues dv = getDefaultValues(refObject);
		while (dv != null) {
			if (dv.getAttributes() != null && dv.getAttributes().isSetInset())
				return dv.getAttributes().getInset();
			dv = getDefaultValues(dv);
		}
		return Defaults.INSET;
	}

	public static Color getFillColor(BlockShape refObject, ShapeAttributes sa) {
		if (sa != null && sa.getFillColor() != null)
			return sa.getFillColor();
		DefaultValues dv = getDefaultValues(refObject);
		while (dv != null) {
			if (dv.getAttributes() != null
					&& dv.getAttributes().getFillColor() != null)
				return dv.getAttributes().getFillColor();
			dv = getDefaultValues(dv);
		}
		return null;
	}

	public static FontAttributes getFontData(BlockShape shape,
			ShapeAttributes sa) {
		FontAttributes rv = BlockDiagramPackage.eINSTANCE
				.getBlockDiagramFactory().createFontAttributes();
		rv.setFontName(getFontName(shape, sa));
		rv.setFontSize(getFontSize(shape, sa));
		rv.setFontStyle(getFontStyle(shape, sa));
		return rv;
	}

	private static String getFontName(BlockShape refObject, ShapeAttributes sa) {
		if (sa != null && sa.getFontAttributes() != null
				&& sa.getFontAttributes().isSetFontName())
			return sa.getFontAttributes().getFontName();
		DefaultValues dv = getDefaultValues(refObject);
		while (dv != null) {
			if (dv.getAttributes() != null
					&& dv.getAttributes().getFontAttributes() != null
					&& dv.getAttributes().getFontAttributes().isSetFontName())
				return dv.getAttributes().getFontAttributes().getFontName();
			dv = getDefaultValues(dv);
		}
		return Defaults.FONTNAME;
	}

	private static int getFontSize(BlockShape refObject, ShapeAttributes sa) {
		if (sa != null && sa.getFontAttributes() != null
				&& sa.getFontAttributes().isSetFontSize())
			return sa.getFontAttributes().getFontSize();
		DefaultValues dv = getDefaultValues(refObject);
		while (dv != null) {
			if (dv.getAttributes() != null
					&& dv.getAttributes().getFontAttributes() != null
					&& dv.getAttributes().getFontAttributes().isSetFontSize())
				return dv.getAttributes().getFontAttributes().getFontSize();
			dv = getDefaultValues(dv);
		}
		return Defaults.FONTSIZE;
	}

	private static FontStyleEnum getFontStyle(BlockShape refObject,
			ShapeAttributes sa) {
		if (sa != null && sa.getFontAttributes() != null
				&& sa.getFontAttributes().isSetFontStyle())
			return sa.getFontAttributes().getFontStyle();
		DefaultValues dv = getDefaultValues(refObject);
		while (dv != null) {
			if (dv.getAttributes() != null
					&& dv.getAttributes().getFontAttributes() != null
					&& dv.getAttributes().getFontAttributes().isSetFontStyle())
				return dv.getAttributes().getFontAttributes().getFontStyle();
			dv = getDefaultValues(dv);
		}
		return Defaults.FONTSTYLE;
	}

	public static Color getFontColor(BlockShape refObject, ShapeAttributes sa) {
		if (sa != null && sa.getFontAttributes() != null
				&& sa.getFontAttributes().getFontColor() != null)
			return sa.getFontAttributes().getFontColor();
		DefaultValues dv = getDefaultValues(refObject);
		while (dv != null) {
			if (dv.getAttributes() != null
					&& dv.getAttributes().getFontAttributes() != null
					&& dv.getAttributes().getFontAttributes().getFontColor() != null)
				return dv.getAttributes().getFontAttributes().getFontColor();
			dv = getDefaultValues(dv);
		}
		return null;
	}

	public static LabelPlacementEnum getLabelPlacement(BlockShape refObject,
			ShapeAttributes sa) {
		if (sa != null && sa.isSetLabelPlacement())
			return sa.getLabelPlacement();
		DefaultValues dv = getDefaultValues(refObject);
		while (dv != null) {
			if (dv.getAttributes() != null
					&& dv.getAttributes().isSetLabelPlacement())
				return dv.getAttributes().getLabelPlacement();
			dv = getDefaultValues(dv);
		}
		return Defaults.LABEL_PLACEMENT;
	}

	public static boolean isLayoutHorizontal(Shape shape) {
		EObject o = shape;
		if (o != null) {
			o = o.eContainer();
		}
		while (o != null)  {
			if (o instanceof BlockShape) {
				BlockShape blockShape = (BlockShape) o;
				return blockShape.getLayout().getLayout()==LayoutOrientationEnum.HORIZONTAL;
			}
			if (o instanceof LayoutShape) {
				LayoutShape layoutShape = (LayoutShape) o;
				return layoutShape.getLayout().getLayout()==LayoutOrientationEnum.HORIZONTAL;
			}			
			if (o instanceof Diagram) {
				Diagram diagram = (Diagram) o;
				return diagram.getLayout().getLayout()==LayoutOrientationEnum.HORIZONTAL;
			}
			o = o.eContainer();
		}
		return false;
	}

	/**
	 * Walks up in the containment hierarchy until a shape with DefaultValues is
	 * found.
	 * 
	 * @param o
	 * @return Default values object of the nearest ancestor with default values
	 *         set. Null if no ancestor containing default values is found.
	 */
	private static DefaultValues getDefaultValues(EObject o) {
		if (o != null) {
			if (o instanceof DefaultValues) {
				o = o.eContainer().eContainer();
			} else {
				o = o.eContainer();
			}
			while (o != null && !(o instanceof BlockShape)
					&& !(o instanceof Diagram)) {
				o = o.eContainer();
			}
			if (o != null) {
				if (o instanceof BlockShape) {
					BlockShape blockShape = (BlockShape) o;
					if (blockShape.getDefaultValues() != null)
						return blockShape.getDefaultValues();
					else
						return getDefaultValues(blockShape);
				}
				if (o instanceof Diagram) {
					Diagram diagram = (Diagram) o;
					return diagram.getDefaultValues();
				}
			}
		}
		return null;
	}

}
