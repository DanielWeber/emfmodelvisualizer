package org.openarchitectureware.vis.zest;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.openarchitectureware.eclipse.launch.IWfLaunchConfigurationConstants;
import org.openarchitectureware.workflow.Activator;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.view.LaunchView;

public class TestRunner {

	private IFile currFile;

	private ILaunchManager launchManager = DebugPlugin.getDefault()
			.getLaunchManager();

	public void launch(final IFile workflowFile) {
		currFile = workflowFile;
		launch("run");
	}

	private void launch(final String mode) {
		try {
			locateWfRunner(currFile, mode);
		} catch (CoreException e) {
			Activator.logError(e);
			Activator.showError(e.getStatus());
			return;
		}

		LaunchConfigurationInfo info = new LaunchConfigurationInfo(currFile);
		ILaunchConfiguration[] configs;
		ILaunchConfiguration config = null;
		try {
			configs = launchManager.getLaunchConfigurations();
			for (ILaunchConfiguration configuration : configs)
				if (info.configEquals(configuration)) {
					config = configuration;
					break;
				}
			//if (config == null)
				config = createConfiguration(info);
			DebugUITools.launch(config, mode);
			LaunchView.addConfiguration(config, mode, currFile);
			currFile.getProject().refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
		} catch (CoreException e) {
			Activator.logError(e);
			Activator.showError(e.getStatus());
			return;
		}
	}

	private void locateWfRunner(final IResource resource, String mode)
			throws CoreException {
		final IJavaProject project = JavaCore.create(resource.getProject());
		if (!isOnClasspath(WorkflowRunner.class.getName(), project)) {
			throw new DebugException(Activator.createErrorStatus(
					"Could not execute workflow: "
							+ WorkflowRunner.class.getName()
							+ " needs to be on the class path.", null));
		}
	}

	private boolean checkClasspathEntries(final IResource resource,
			String classNameToFind) throws CoreException {
		// TODO: ER: put required oAW packages always to the classpath
		final IJavaProject project = JavaCore.create(resource.getProject());
		final SearchPattern pattern = SearchPattern.createPattern(
				classNameToFind, IJavaSearchConstants.TYPE,
				IJavaSearchConstants.DECLARATIONS,
				SearchPattern.R_PATTERN_MATCH | SearchPattern.R_CASE_SENSITIVE);
		final IJavaSearchScope scope = SearchEngine.createJavaSearchScope(
				new IJavaElement[] { project }, true);
		final TypeDeclarationSearchRequestor requestor = new TypeDeclarationSearchRequestor();

		final SearchEngine searchEngine = new SearchEngine();
		searchEngine.search(pattern, new SearchParticipant[] { SearchEngine
				.getDefaultSearchParticipant() }, scope, requestor, null);
		return requestor.match();
	}

	public boolean isOnClasspath(String fullyQualifiedName, IJavaProject project) {
		if (fullyQualifiedName.indexOf('$') != -1)
			fullyQualifiedName = fullyQualifiedName.replace('$', '.');
		try {
			IType type = project.findType(fullyQualifiedName);
			return type != null && type.exists();
		} catch (JavaModelException e) {
		}
		return false;
	}

	public class TypeDeclarationSearchRequestor extends SearchRequestor {

		private IType match = null;

		@Override
		public void acceptSearchMatch(final SearchMatch match) {
			this.match = (IType) match.getElement();
		}

		public boolean match() {
			return match != null;
		}
	}

	protected ILaunchConfiguration createConfiguration(
			final LaunchConfigurationInfo info) throws CoreException {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		final ILaunchConfigurationType configType = launchManager
				.getLaunchConfigurationType(IWfLaunchConfigurationConstants.WORKFLOW_LAUNCH_CONFIGURATION_TYPE_ID);

		// 2nd param is Name of the LaunchConfig in the Config Window
		wc = configType.newInstance(null, launchManager
				.generateUniqueLaunchConfigurationNameFrom(info.name));

		// the 4 values displayed in the Config main window
		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,
				info.project);
		wc.setAttribute(IWfLaunchConfigurationConstants.ATTR_OAW_WORKFLOW_FILE,
				info.wfFile);
		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_STOP_IN_MAIN,
				false);
		wc
				.setAttribute(
						IWfLaunchConfigurationConstants.ATTR_OAW_JAVA_DEBUG_MODE,
						false);

		// the values displayed in the VM arguments field
		wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS,
				"-Xms40m\n-Xmx256m");

		wc.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, true);
		config = wc.doSave();

		return config;
	}

	public class LaunchConfigurationInfo {
		private String name;

		private String project;

		private String wfFile;

		private LaunchConfigurationInfo(IFile file) {
			name = file.getName();
			project = file.getProject().getName();
			wfFile = file.getFullPath().toString();
		}

		private boolean configEquals(final ILaunchConfiguration a)
				throws CoreException {
			return wfFile
					.equals(a
							.getAttribute(
									IWfLaunchConfigurationConstants.ATTR_OAW_WORKFLOW_FILE,
									"X"))
					&& project
							.equals(a
									.getAttribute(
											IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,
											"X"));
		}

	}
}
