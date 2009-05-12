package org.openarchitectureware.vis.graphmm;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.mwe.emf.Reader;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

public class TempReader extends Reader {
	public final static String FILEPROTOCOL = "file:";

	public void invoke(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		String filename = super.getUri();

		String tempdir = System.getProperty("java.io.tmpdir");

		if (!(tempdir.endsWith("/") || tempdir.endsWith("\\")))
			tempdir = tempdir + System.getProperty("file.separator");
		String uri = FILEPROTOCOL + tempdir + filename;
		System.out.println("reading:" + uri);
		File tmpFile = new File(tempdir + filename);
		System.out.println("file exists: " + tmpFile.exists());
		if (tmpFile.exists()) {
			super.setUri(uri);
			super.invoke(ctx, monitor, issues);
		}
		else
			throw new IllegalArgumentException("file does not exist:"+tmpFile.toString());
	}

	public Object loadX(ResourceSet resourceSet, String uri,
			boolean firstElementOnly) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xmi", new XMIResourceFactoryImpl());

		Resource res = resourceSet.createResource(URI
				.createFileURI("/tmp/xxxGraphmodelxxx.xmi"));
		EList result = res.getContents();
		if (firstElementOnly) {
			if (result.isEmpty())
				return null;
			return result.iterator().next();
		} else
			return result;
	}
}
