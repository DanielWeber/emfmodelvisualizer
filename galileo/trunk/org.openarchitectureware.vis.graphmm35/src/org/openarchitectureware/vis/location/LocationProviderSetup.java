package org.openarchitectureware.vis.location;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.ui.core.ILocationInFileProvider;

import com.google.inject.Injector;

public class LocationProviderSetup extends AbstractWorkflowComponent {

	private Injector injector;
	private static ILocationInFileProvider locationProvider;

	public void setRegister(ISetup setup) {
		injector = setup.createInjectorAndDoEMFRegistration();
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		locationProvider = injector.getInstance(ILocationInFileProvider.class);
	}

	public static String getLocation(EObject o) {
		String res = o.eResource().getURI().toString();
		Region l = locationProvider.getLocation(o);
		String location = res+","+l.getOffset()+","+l.getLength();
		System.err.println(location);
		return location;
		
	}
	
	public void checkConfiguration(Issues issues) {
	}

}
