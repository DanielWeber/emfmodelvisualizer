package org.openarchitectureware.vis.graphviz.ecore.ui.handler;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class VisualizeEcore extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil
				.getActiveMenuSelection(event);
		Object o = selection.getFirstElement();

		if (o instanceof IFile) {
			IFile file = (IFile) o;
			Mwe2Runner runner = new Mwe2StandaloneSetup().createInjector()
					.getInstance(Mwe2Runner.class);
			Map<String, String> parameters = new HashMap<String, String>();
			parameters.put("modelFile", file.getWorkspace().getRoot().getFullPath().toString());
			runner.run("org.openarchitectureware.vis.graphviz.ecore.VisualizeEcore", parameters);
		}
		return o;
	}

}