package org.openarchitectureware.vis.graphmm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

public class TempWriter extends org.eclipse.mwe.emf.Writer {
	public final static String FILEPROTOCOL = "file:";
	
	public void invoke(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		String uri = super.getUri();
		
		String tempdir = System.getProperty("java.io.tmpdir");

		if (!(tempdir.endsWith("/") || tempdir.endsWith("\\")))
			tempdir = tempdir + System.getProperty("file.separator");
		uri = FILEPROTOCOL+tempdir + uri;
		System.out.println("writing:" + uri);
		super.setUri(uri);
		super.invoke(ctx, monitor, issues);
	}
	
	public Object loadX(ResourceSet resourceSet, String uri, boolean firstElementOnly) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", 
				new XMIResourceFactoryImpl());

				Resource res = resourceSet.createResource(URI.createFileURI("/tmp/xxxGraphmodelxxx.xmi"));
				EList result = res.getContents();
				if (firstElementOnly) {
					if (result.isEmpty())
						return null;
					return result.iterator().next();
				}
				else
					return result;
	}
}
