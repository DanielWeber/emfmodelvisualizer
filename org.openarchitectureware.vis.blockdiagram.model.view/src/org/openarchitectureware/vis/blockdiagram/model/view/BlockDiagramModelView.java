package org.openarchitectureware.vis.blockdiagram.model.view;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.BlockShape;
import org.openarchitectureware.vis.blockdiagram.metamodel.blockDiagram.Model;
import org.openarchitectureware.vis.blockdiagram.model.view.internal.EclipseSourceLocator;
import org.openarchitectureware.vis.blockdiagram.model.view.internal.WorkflowRunner;
import org.openarchitectureware.vis.blockdiagram.viewer.BlockDiagramViewer;

/**
 * This class represents the view of this plug-in.
 */

public class BlockDiagramModelView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.openarchitectureware.vis.blockdiagram.model.view.BlockDiagramModelView";

	private BlockDiagramViewer viewer;
	private BlockDiagramContentProvider contentProvider;
	
	private Action actionSelectWorkflow;
	private Action actionGoToDeclaration;

	// the workflow runner runs workflows and holds a history of workflows
	private WorkflowRunner workflowRunner = new WorkflowRunner();
	
	// the source locator is used to open the source of an model element on double click
	private EclipseSourceLocator sourceLocator = new EclipseSourceLocator();
	
	/**
	 * The constructor.
	 */
	public BlockDiagramModelView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new BlockDiagramViewer(parent); // ,SWT.MULTI | SWT.H_SCROLL |
		contentProvider = new BlockDiagramContentProvider();
		viewer.setContentProvider(contentProvider);
		
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			
			public void doubleClick(DoubleClickEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection ss = (IStructuredSelection) event
							.getSelection();
					for (Object o : ss.toArray()) {
						
						System.out.println("Double click occured: " + o.toString());
						if (o instanceof BlockShape) {
							BlockShape b = (BlockShape) o;
							if (b.getAttributes()!=null && b.getAttributes().getSourceLocation()!=null) {
								sourceLocator.locate(b.getAttributes().getSourceLocation(), false);
							}
						}
					}					
				}
			}
		});
		
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection ss = (IStructuredSelection) event
							.getSelection();
					for (Object o : ss.toArray()) {
						System.out.println("Selection occured: " + o.toString());
						if (o instanceof BlockShape) {
							BlockShape b = (BlockShape) o;
							if (b.getAttributes()!=null && b.getAttributes().getSourceLocation()!=null) {
								System.out.println ("Source location: " + b.getAttributes().getSourceLocation());
							}
							if (b.getAttributes()!=null && b.getAttributes().getDataObject()!=null) {
								System.out.println ("Data object: " + b.getAttributes().getDataObject().toString());
							}							
						}
					}					
				}
			}
		});

		// SWT.V_SCROLL);
		// viewer.setContentProvider(new ViewContentProvider());
		// viewer.setLabelProvider(new ViewLabelProvider());
		// viewer.setSorter(new NameSorter());
		// viewer.setInput(getViewSite());
		makeActions();
		hookContextMenu();
		// hookDoubleClickAction();
		contributeToActionBars();

		// This block runs a worklflow on startup. Useful during development
//		processModel(workflowRunner.runWorkflow(ResourcesPlugin.getWorkspace()
//				.getRoot().getProject("org.openarchitectureware.vis.blockdiagram.example")
//				.getFile("src/Windows2000Architecture.mwe")));
	}

	private void fillContextMenu(IMenuManager manager) {
		ISelection selection = viewer.getSelection();
		if (selection != null) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof BlockShape) {
				BlockShape block = (BlockShape) structuredSelection
						.getFirstElement();
				if (block.getAttributes() != null
						&& block.getAttributes().getSourceLocation() != null) {
					manager.add(actionGoToDeclaration);
				}
			}
		}
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				BlockDiagramModelView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(actionSelectWorkflow);
		// manager.add(new Separator());
		// manager.add(action2);
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(actionSelectWorkflow);
	}

	/*
	 * private void fillContextMenu(IMenuManager manager) {
	 * manager.add(action1); manager.add(action2); // Other plug-ins can
	 * contribute there actions here manager.add(new
	 * Separator(IWorkbenchActionConstants.MB_ADDITIONS)); }
	 */

	private void processModel(EObject object) {
		if (object != null && object instanceof Model) {
			contentProvider.setModel ((Model) object);
			viewer.setInput(((Model) object).getDiagram());
		} else {
			MessageDialog.openError(Display.getCurrent().getActiveShell(), "",
					"There is no model to interpret after workflow execution!");
		}
	}

	private void makeActions() {
		makeActionSelectWorkflow();
		makeActionGoToSource();
	}

	private void makeActionGoToSource() {
		actionGoToDeclaration = new Action() {
			public void run() {
				// TODO
			}
		};
		actionGoToDeclaration.setText("Open Declaration");
	}

	private void makeActionSelectWorkflow() {
		actionSelectWorkflow = new Action() {
			public void run() {
				processModel(workflowRunner.runWorkflow(workflowRunner
						.selectWorkflowFile()));
			}
		};
		actionSelectWorkflow.setText("Run workflow");
		actionSelectWorkflow.setToolTipText("Run workflow");
		actionSelectWorkflow.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages().getImageDescriptor(
						ISharedImages.IMG_OBJS_INFO_TSK));
	}

	/*
	 * private void hookDoubleClickAction() { viewer.addDoubleClickListener(new
	 * IDoubleClickListener() { public void doubleClick(DoubleClickEvent event)
	 * { doubleClickAction.run(); } }); }
	 */

	/*
	 * private void showMessage(String message) { MessageDialog.openInformation(
	 * viewer.getControl().getShell(), "Block Diagram Model View", message); }
	 */

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}