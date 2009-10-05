package org.openarchitectureware.vis.blockdiagram.model.view.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * Locates source code in Eclipse textual resources,
 * such as Xtext files
 * @author MarkusVoelter
 *
 */
public class EclipseSourceLocator {

	private static final String PLATFORM_RESOURCE = "platform:/resource/";
	private static final String PLATFORM_PLUGIN = "platform:/plugin/";
	
	public void locate(final String location, final boolean setSelection) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				// string has the format filename,startoffset,endoffset
				String[] l = location.split(",");
				String resource = l[0];
				String fromIndex = l[1];
				String toIndex = l[2];
				if ( resource.toLowerCase().startsWith(PLATFORM_RESOURCE)) resource = resource.substring(PLATFORM_RESOURCE.length());
				if ( resource.toLowerCase().startsWith(PLATFORM_PLUGIN)) resource = resource.substring(PLATFORM_PLUGIN.length());
				final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resource));
				try {
					IEditorPart opened = IDE.openEditor(page, file);
					if (setSelection && opened instanceof ITextEditor) {
						int start = Integer.parseInt(fromIndex);
						int end = Integer.parseInt(toIndex);
						((ITextEditor) opened).selectAndReveal(start, end-start);
					}
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	public void locate(final String location) {
		locate (location, true);
	}	
}
