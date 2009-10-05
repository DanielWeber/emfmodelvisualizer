package org.openarchitectureware.vis.blockdiagram.model.view.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;

// FIXME: add support for history

public class WorkflowRunner {

	public IFile selectWorkflowFile() {
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
				new Shell(Display.getCurrent()), new WorkbenchLabelProvider(),
				new WorkbenchContentProvider());
		dialog.setTitle("Select a Modeling Workflow Engine (mwe) file");
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dialog.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				if (element instanceof IFile
						&& !((IFile) element).getFileExtension()
								.equalsIgnoreCase("mwe"))
					return false;
				return true;
			}

		});
		IFile selected = null;
		if (dialog.open() == Window.OK) {
			Object[] selection = ((ElementTreeSelectionDialog) dialog)
					.getResult();
			if (selection.length > 0)
				if (selection[0] instanceof IFile)
					selected = (IFile) selection[0];
				else {
					MessageDialog.openError(Display.getCurrent()
							.getActiveShell(), "", "No workflow selected.");
				}
		}
		return selected;
	}

	public EObject runWorkflow(IFile workflowFile) {
		EObject model = null;
		if (workflowFile != null) {
			IProject project = workflowFile.getProject();
			if (project != null && project.getLocation()!=null) {
				Map<String, String> properties = new HashMap<String, String>();
				Map<?, ?> slotContents = new HashMap<String, Object>();

				// configure properties passed to the workflow engine
				properties.put("basedir", project.getLocation().toFile()
						.getAbsolutePath());

				// Logging disabled: ResourceLoading does not work. (Bollbach)
				// ClassLoader oldcl =
				// Thread.currentThread().getContextClassLoader();
				// Thread.currentThread().setContextClassLoader(
				// this.getClass().getClassLoader());
				// MyLog.registerToLogFactory();
				// ResourceLoader oldResourceLoader = ResourceLoaderFactory
				// .createResourceLoader();
				try {
					ResourceLoader resourceLoader = new EclipseJavaProjectResourceAndClassesLoader(
							project);
					ResourceLoaderFactory
							.setCurrentThreadResourceLoader(resourceLoader);
					org.eclipse.emf.mwe.core.WorkflowRunner runner = new org.eclipse.emf.mwe.core.WorkflowRunner();
					final boolean configOK = runner.prepare(workflowFile
							.getLocationURI().toString(),
							new NullProgressMonitor(), properties);
					if (configOK) {
						final Issues issues = new IssuesImpl();
						runner.executeWorkflow(slotContents, issues);
						for (MWEDiagnostic diag : issues.getErrors()) {
							System.out.println (diag.toString());
						}
						// TODO: make output slot name configurable
						model = (EObject) runner.getContext().get(
								"blockdiagram");
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				} finally {
					ResourceLoaderFactory.setCurrentThreadResourceLoader(null);
					// Thread.currentThread().setContextClassLoader(oldcl);
					// MyLog.unregisterFromLogFactory();
				}
			}
		}
		return model;
	}
}