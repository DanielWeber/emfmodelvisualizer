package org.openarchitectureware.vis.blockdiagram.model.view;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.BlockShape;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Color;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.ConnectorLabel;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Diagram;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.FontAttributes;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.LabelPlacementEnum;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Layout;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.LayoutOrientationEnum;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.LayoutShape;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.LineStyleEnum;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Model;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Shape;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.SpaceShape;
import org.openarchitectureware.vis.blockdiagram.model.view.internal.Defaults;
import org.openarchitectureware.vis.blockdiagram.model.view.internal.ModelHelper;
import org.openarchitectureware.vis.blockdiagram.viewer.BlockDiagramCanvas;
import org.openarchitectureware.vis.blockdiagram.viewer.IBlockDiagramContentProvider;
import org.openarchitectureware.vis.blockdiagram.viewer.shapes.Connection;
import org.openarchitectureware.vis.blockdiagram.viewer.shapes.ConnectionLabel;
import org.openarchitectureware.vis.blockdiagram.viewer.shapes.DefaultConnection;
import org.openarchitectureware.vis.blockdiagram.viewer.shapes.ConnectionLabel.Alignment;
import org.openarchitectureware.vis.blockdiagram.viewer.shapes.ConnectionLabel.Position;
import org.openarchitectureware.vis.blockdiagram.viewer.util.ColorManager;
import org.openarchitectureware.vis.blockdiagram.viewer.util.FillFlowLayout;
import org.openarchitectureware.vis.blockdiagram.viewer.util.FontManager;
import org.openarchitectureware.vis.blockdiagram.viewer.util.ImageManager;
import org.openarchitectureware.vis.blockdiagram.viewer.util.LineBorderWithInsets;

public class BlockDiagramContentProvider implements
		IBlockDiagramContentProvider {

	protected ColorManager colorManager = new ColorManager();
	protected FontManager fontManager = new FontManager();
	protected ImageManager imageManager = new ImageManager();

	@Override
	public org.openarchitectureware.vis.blockdiagram.viewer.shapes.Shape getDiagramShape(
			Object object, BlockDiagramCanvas canvas) {
		if (object instanceof BlockShape) {
			BlockShape blockShape = (BlockShape) object;
			if (blockShape.getShapes() != null
					&& blockShape.getShapes().size() > 0) {
				return createContainerShape(blockShape, canvas);
			} else {
				return createBlockShape(blockShape, canvas);
			}
		}
		if (object instanceof LayoutShape) {
			return createLayoutShape((LayoutShape) object, canvas);
		}
		if (object instanceof SpaceShape) {
			return createSpaceShape((SpaceShape) object, canvas);
		}
		return null;
	}

	private org.openarchitectureware.vis.blockdiagram.viewer.shapes.Shape createLayoutShape(
			LayoutShape object, BlockDiagramCanvas canvas) {
		org.openarchitectureware.vis.blockdiagram.viewer.shapes.ContainerShape rv = new org.openarchitectureware.vis.blockdiagram.viewer.shapes.ContainerShape(
				canvas);
		LayoutManager layoutManager = getLayout(object.getLayout(), false);
		rv.setLayoutManager(layoutManager);
		rv.setSelectable(false);
		return rv;
	}

	private org.openarchitectureware.vis.blockdiagram.viewer.shapes.Shape createSpaceShape(
			SpaceShape shape, BlockDiagramCanvas canvas) {
		org.openarchitectureware.vis.blockdiagram.viewer.shapes.SpaceShape rv = new org.openarchitectureware.vis.blockdiagram.viewer.shapes.SpaceShape(
				canvas);
		rv.setHorizontal(ModelHelper.isLayoutHorizontal(shape));
		rv.setWidth(shape.getWidth());
		return rv;
	}

	private org.openarchitectureware.vis.blockdiagram.viewer.shapes.FigureShape createBlockShape(
			BlockShape blockShape, BlockDiagramCanvas canvas) {
		org.openarchitectureware.vis.blockdiagram.viewer.shapes.FigureShape rv = new org.openarchitectureware.vis.blockdiagram.viewer.shapes.FigureShape(
				canvas);
		rv.setLabel(createLabel(blockShape));
		rv.setBorder(createBorder(blockShape));
		rv.setFillColor(getColor(ModelHelper.getFillColor(blockShape,
				blockShape.getAttributes())));
		return rv;
	}

	private org.openarchitectureware.vis.blockdiagram.viewer.shapes.ContainerShape createContainerShape(
			BlockShape blockShape, BlockDiagramCanvas canvas) {
		org.openarchitectureware.vis.blockdiagram.viewer.shapes.ContainerShape rv = new org.openarchitectureware.vis.blockdiagram.viewer.shapes.ContainerShape(
				canvas);

		// create and set layout manager according to layout settings
		LayoutManager layoutManager = getLayout(blockShape.getLayout(), false);
		rv.setLayoutManager(layoutManager);
		rv.setBorder(createBorder(blockShape));
		Label l = createLabel(blockShape);
		if (l != null) {
			l
					.setLabelAlignment(getLabelAlignment(ModelHelper
							.getLabelPlacement(blockShape, blockShape
									.getAttributes())));
			rv
					.setLabelPlacement(getLabelPlacement(ModelHelper
							.getLabelPlacement(blockShape, blockShape
									.getAttributes())));
		}
		rv.setLabel(l);
		rv.setFillColor(getColor(ModelHelper.getFillColor(blockShape,
				blockShape.getAttributes())));
		return rv;
	}

	private Label createLabel(BlockShape shape) {
		String label = ModelHelper.getLabel(shape);
		if (label != null && label.length() > 0) {
			Label l = new Label(label);
			if (shape.getIcon() != null && shape.getIcon().length() > 0) {
				l.setIcon(imageManager.getImage(shape.getIcon()));
			}
			l.setTextAlignment(PositionConstants.CENTER);
			l.setFont(getFont(ModelHelper.getFontData(shape, shape
					.getAttributes())));
			l.setForegroundColor(getColor(ModelHelper.getFontColor(shape, shape
					.getAttributes())));
			return l;
		}
		return null;
	}

	private LayoutManager getLayout(Layout layout, boolean isRootLayout) {
		if (layout instanceof org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.ToolbarLayout) {
			ToolbarLayout layoutManager = new ToolbarLayout();
			layoutManager
					.setVertical(layout.getLayout() == LayoutOrientationEnum.VERTICAL);
			layoutManager.setStretchMinorAxis(true);
			layoutManager.setMinorAlignment(FlowLayout.ALIGN_CENTER);
			layoutManager.setSpacing(ModelHelper.getSpacing(layout));
			return layoutManager;
		}
		if (layout instanceof org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.FlowLayout) {
			FlowLayout layoutManager = new FlowLayout();
			layoutManager
					.setHorizontal(layout.getLayout() == LayoutOrientationEnum.HORIZONTAL);
			layoutManager.setStretchMinorAxis(true);
			layoutManager.setMinorAlignment(FlowLayout.ALIGN_CENTER);
			if (!isRootLayout)
				layoutManager.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutManager.setMinorSpacing(ModelHelper.getSpacing(layout));
			layoutManager.setMajorSpacing(ModelHelper.getSpacing(layout));
			return layoutManager;
		}
		if (layout instanceof org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.FillLayout) {
			FillFlowLayout layoutManager = new FillFlowLayout();
			layoutManager
					.setHorizontal(layout.getLayout() == LayoutOrientationEnum.HORIZONTAL);
			layoutManager.setStretchMinorAxis(true);
			if (!isRootLayout)
				layoutManager.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutManager.setMinorSpacing(ModelHelper.getSpacing(layout));
			layoutManager.setMajorSpacing(ModelHelper.getSpacing(layout));
			if (((org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.FillLayout) layout)
					.isSetMode()) {
				switch (((org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.FillLayout) layout)
						.getMode()) {
				case PROPORTIONAL:
					layoutManager
							.setLayoutMode(FillFlowLayout.LayoutMode.proportional);
					break;
				case SAMESIZE:
					layoutManager
							.setLayoutMode(FillFlowLayout.LayoutMode.samesize);
					break;
				}
			}
			return layoutManager;
		}
		return null;
	}

	private Border createBorder(BlockShape shape) {
		if (ModelHelper.getLineWidth(shape, shape.getAttributes()) > 0) {
			Border border = new LineBorderWithInsets(getColor(ModelHelper
					.getLineColor(shape, shape.getAttributes())), ModelHelper
					.getLineWidth(shape, shape.getAttributes()),
					getLineStyle(ModelHelper.getLineStyle(shape, shape
							.getAttributes())), ModelHelper.getInset(shape,
							shape.getAttributes()));
			return border;
		}
		return null;
	}

	private int getLineStyle(LineStyleEnum lineStyle) {
		switch (lineStyle) {
		case SOLID:
			return Graphics.LINE_SOLID;
		case DASH_DOT_DOTTED:
			return Graphics.LINE_DASHDOTDOT;
		case DASHED:
			return Graphics.LINE_DASH;
		case DOTTED:
			return Graphics.LINE_DOT;
		}
		return 0;
	}

	private org.eclipse.swt.graphics.Color getColor(Color color) {
		if (color != null) {
			if (color.isSetColorEnum()) {
				return ColorMap.getColor(color.getColorEnum());
			}
			if (color.isSetColor()) {
				String[] rgb = color.getColor().split(",");
				if (rgb.length == 3) {
					return colorManager.getColor(new RGB(Integer
							.parseInt(rgb[0]), Integer.parseInt(rgb[1]),
							Integer.parseInt(rgb[2])));
				}
			}
		}
		return null;
	}

	private Font getFont(FontAttributes fontAttributes) {
		if (fontAttributes != null) {
			FontData fontData = new FontData();
			fontData.setHeight(fontAttributes.getFontSize());
			fontData.setName(fontAttributes.getFontName());
			if (fontAttributes.isSetFontStyle()) {
				switch (fontAttributes.getFontStyle()) {
				case BOLD:
					fontData.setStyle(SWT.BOLD);
					break;
				case ITALIC:
					fontData.setStyle(SWT.ITALIC);
					break;
				}
			}
			return fontManager.getFont(fontData);
		}
		return null;
	}

	@Override
	public void dispose() {
		colorManager.dispose();
		fontManager.dispose();
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof BlockShape) {
			BlockShape blockShape = (BlockShape) parentElement;
			return blockShape.getShapes().toArray();
		}
		if (parentElement instanceof LayoutShape) {
			LayoutShape layoutShape = (LayoutShape) parentElement;
			return layoutShape.getShapes().toArray();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Shape) {
			Shape shape = (org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Shape) element;
			if (shape.eContainer() instanceof org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Shape)
				return (org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Shape) shape
						.eContainer();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof BlockShape) {
			BlockShape blockShape = (BlockShape) element;
			return (blockShape.getShapes() != null && blockShape.getShapes()
					.size() > 0);
		}
		if (element instanceof LayoutShape) {
			LayoutShape layoutShape = (LayoutShape) element;
			return (layoutShape.getShapes() != null && layoutShape.getShapes()
					.size() > 0);
		}
		return false;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Diagram) {
			Diagram d = (Diagram) inputElement;
			return d.getShapes().toArray();
		}
		return null;
	}

	@Override
	public IFigure getRootFigure(Object object, BlockDiagramCanvas canvas) {
		Figure f = new Figure();
		if (object instanceof Diagram) {
			Diagram diagram = (Diagram) object;
			f.setLayoutManager(getLayout(diagram.getLayout(), true));
		}
		return f;
	}

	int getLabelAlignment(LabelPlacementEnum lpe) {
		switch (lpe) {
		case EAST:
		case NORTHEAST:
		case SOUTHEAST:
			return PositionConstants.RIGHT;
		case WEST:
		case NORTHWEST:
		case SOUTHWEST:
			return PositionConstants.LEFT;
		}
		return PositionConstants.CENTER;
	}

	int getLabelPlacement(LabelPlacementEnum lpe) {
		switch (lpe) {
		case NORTHEAST:
		case NORTH:
		case NORTHWEST:
			return PositionConstants.TOP;
		case SOUTHEAST:
		case SOUTH:
		case SOUTHWEST:
			return PositionConstants.BOTTOM;
		case EAST:
			return PositionConstants.RIGHT;
		case WEST:
			return PositionConstants.LEFT;
		}
		return PositionConstants.TOP;
	}

	@Override
	public Connection getConnection(Object object, BlockDiagramCanvas canvas) {
		if (object instanceof org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.SimpleConnection) {
			org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.SimpleConnection connection = (org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.SimpleConnection) object;
			DefaultConnection c = new DefaultConnection();
			c.setTargetDecoration(DefaultConnection.getArrowHeadDecoration());
			c.setSourceDecoration(DefaultConnection.getArrowHeadDecoration());
			if (connection.getLineAttributes() != null) {
				if (connection.getLineAttributes().isSetLineStyle()) {
					c.setLineStyle(getLineStyle(connection.getLineAttributes()
							.getLineStyle()));
				} else
					c.setLineStyle(getLineStyle(Defaults.LINESTYLE));
				if (connection.getLineAttributes().isSetLineWidth()) {
					c.setLineWidth(connection.getLineAttributes()
							.getLineWidth());
				} else
					c.setLineWidth(Defaults.LINEWIDTH);
				if (connection.getLineAttributes().getLineColor() != null) {
					c.setLineColor(getColor(connection.getLineAttributes()
							.getLineColor()));
				} else
					c.setLineColor(getColor(null));
			}

			for (ConnectorLabel label : connection.getLabel()) {
				if (label != null && label.getLabel() != null) {
					Label l = new Label(label.getLabel());
					l.setTextAlignment(PositionConstants.CENTER);
					if (label.getFontAttributes() != null) {
						l.setFont(getFont(label.getFontAttributes()));
						l.setForegroundColor(getColor(label.getFontAttributes()
								.getFontColor()));
					}
					ConnectionLabel cl = new ConnectionLabel(l,
							getConnectionLabelPosition(label),
							getConnectionLabelAlignment(label));
					c.addLabel(cl);
				}
			}
			return c;
		}
		return null;
	}

	private Alignment getConnectionLabelAlignment(ConnectorLabel label) {
		if (label.isSetAlignment())
			switch (label.getAlignment()) {
			case CENTER:
				return Alignment.center;
			case EAST:
				return Alignment.east;
			case WEST:
				return Alignment.west;
			}
		return Alignment.center;
	}

	private ConnectionLabel.Position getConnectionLabelPosition(
			ConnectorLabel label) {
		if (label.isSetPosition()) {
			switch (label.getPosition()) {
			case CENTER:
				return Position.center;
			case SOURCE:
				return Position.source;
			case TARGET:
				return Position.target;
			}
		}
		return Position.center;
	}

	@Override
	public Object[] getConnections(Object object) {
		if (object instanceof Diagram) {
			Diagram diagram = (Diagram) object;
			return diagram.getConnections().toArray();
		}
		return null;
	}

	@Override
	public Object getSource(Object object) {
		if (object instanceof org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.SimpleConnection) {
			org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.SimpleConnection connection = (org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.SimpleConnection) object;
			return connection.getSource();
		}
		return null;
	}

	@Override
	public Object getTarget(Object object) {
		if (object instanceof org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.SimpleConnection) {
			org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.SimpleConnection connection = (org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.SimpleConnection) object;
			return connection.getTarget();
		}
		return null;
	}

	public void setModel(Model model) {
		if (model.getProlog()!=null) {
			imageManager.setBasePath(model.getProlog().getIconBasePath());
		}
	}

}