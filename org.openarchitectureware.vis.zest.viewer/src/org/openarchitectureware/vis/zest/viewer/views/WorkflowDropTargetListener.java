package org.openarchitectureware.vis.zest.viewer.views;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.TextTransfer;

/*
 * Calls the viewer with the droped IFile
 */
public class WorkflowDropTargetListener implements DropTargetListener {

	private ModelVisualizationView view;

	public WorkflowDropTargetListener(ModelVisualizationView view) {
		this.view = view;
	}

	final FileTransfer fileTransfer = FileTransfer.getInstance();
	final TextTransfer textTransfer = TextTransfer.getInstance();

	public void dragEnter(DropTargetEvent event) {

		if (event.detail == DND.DROP_DEFAULT) {
			if ((event.operations & DND.DROP_COPY) != 0) {
				event.detail = DND.DROP_COPY;
			} else {
				event.detail = DND.DROP_NONE;
			}
		}
		// will accept text but prefer to have files dropped
		for (int i = 0; i < event.dataTypes.length; i++) {
			if (fileTransfer.isSupportedType(event.dataTypes[i])) {
				event.currentDataType = event.dataTypes[i];

				if (event.detail != DND.DROP_COPY) {
					event.detail = DND.DROP_NONE;
				}
				break;
			}
		}
	}

	public void dragOver(DropTargetEvent event) {
		event.feedback = DND.FEEDBACK_SELECT | DND.FEEDBACK_SCROLL;
	}

	public void dragOperationChanged(DropTargetEvent event) {
		if (event.detail == DND.DROP_DEFAULT) {
			if ((event.operations & DND.DROP_COPY) != 0) {
				event.detail = DND.DROP_COPY;
			} else {
				event.detail = DND.DROP_NONE;
			}
		}
		// allow text to be moved but files should only be copied
		if (fileTransfer.isSupportedType(event.currentDataType)) {
			if (event.detail != DND.DROP_COPY) {
				event.detail = DND.DROP_NONE;
			}
		}
	}

	public void dragLeave(DropTargetEvent event) {
	}

	public void dropAccept(DropTargetEvent event) {
	}

	public void drop(DropTargetEvent event) {
		if (textTransfer.isSupportedType(event.currentDataType)) {
			String text = (String) event.data;
		}
		if (fileTransfer.isSupportedType(event.currentDataType)) {
			String[] files = (String[]) event.data;
			if (files.length > 0) {
				String pathString = files[0];
				if (pathString.endsWith("mwe")) {
					IPath path = Path.fromOSString(pathString);
					IWorkspaceRoot rootWorkspace = ResourcesPlugin
							.getWorkspace().getRoot();
					IFile file = rootWorkspace.getFileForLocation(path);
					System.out.println(file);
					view.setFilenameAndRedraw(file);
				}
			}
		}
	}

}
