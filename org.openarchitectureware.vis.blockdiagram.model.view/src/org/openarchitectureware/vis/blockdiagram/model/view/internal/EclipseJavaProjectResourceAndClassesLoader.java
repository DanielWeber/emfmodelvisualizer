package org.openarchitectureware.vis.blockdiagram.model.view.internal;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderDefaultImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * This ResourceLoader is capable of loading resources from a specific Java
 * project within the workspace. Typical use is when invoking a workflow from
 * within a plugin. It can also load classes of the project's classpath.
 *
 * @author PhilippBollbach
 *
 *         inspired by the OawEclipseProjectResourceLoader by
 * @author Axel Terfloth (axel.terfloth@itemis.de)
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 *
 */
public class EclipseJavaProjectResourceAndClassesLoader extends
		ResourceLoaderDefaultImpl {
	private ClassLoader projectCL;

	public EclipseJavaProjectResourceAndClassesLoader() {
		super();
	}

	public EclipseJavaProjectResourceAndClassesLoader(IProject project)
			throws CoreException {
		super();
		projectCL = createClassLoader(project);
		Thread.currentThread().setContextClassLoader(this.projectCL);
	}

	/***
	 * Assembles a Classpath for an URLClassloader from a Project-Configuration
	 * @param project the eclipse project to get the config info from
	 * @return a configured Classloader with the classpath of the project
	 */
	public ClassLoader createClassLoader(IProject project) throws CoreException {
		IJavaProject jp = JavaCore.create(project);
		IClasspathEntry javacp[] = jp.getResolvedClasspath(true);
		List<URL> urls = new ArrayList<URL>();
		for (int i = 0; i < javacp.length; i++)
			try {
				//load bin folder of referenced projects into classpath
				if (javacp[i].getEntryKind() > 1) {
					if (javacp[i].getEntryKind() == 2) {
						IPath p = ResourcesPlugin.getWorkspace().getRoot()
						.getFolder(javacp[i].getPath().append("bin")).getLocation();
						System.out.println ("2:"+p);
						urls.add(p.toFile().toURI().toURL());
					//add the source folders of the project
					} else if (javacp[i].getEntryKind() == 3) {
						IPath p = ResourcesPlugin.getWorkspace().getRoot().getFolder(javacp[i].getPath()).getLocation();
						System.out.println ("3:"+p);
						urls.add(p.toFile().toURI().toURL());
					}
				} else {
					// entrykind <= 1
					//add jars
					urls.add(javacp[i].getPath().toFile().toURI().toURL());
					System.out.println ("<=1:"+javacp[i].getPath());
				}

			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		return new URLClassLoader((URL[]) urls.toArray(new URL[urls.size()]),
				Thread.currentThread().getContextClassLoader());
	}
	@Override
	protected URL loadFromContextClassLoader(final String path) {
		URL u = super.loadFromContextClassLoader(path);
		System.out.println(path+":--:"+(u==null?"":u.toString()));
		return u;
	}

//	public URL getResource(String path) {
//		URL resource = super.getResource(path);
//		if (resource == null)
//			resource = projectCL.getResource(path);
//		return resource;
//	}

//	protected InputStream internalGetResourceAsStream(String path) {
//		URL url = internalGetResource(path);
//		try {
//			return url == null ? null : url.openStream();
//		} catch (IOException _ex) {
//			return null;
//		}
//	}

//	protected Class<?> internalLoadClass(String clazzName)
//			throws ClassNotFoundException {
//		Class<?> c = projectCL.loadClass(clazzName);
//		if (c == null)
//			throw new ClassNotFoundException(clazzName);
//		return c;
//	}
	@Override
	protected Class<?> internalLoadClass(final String clazzName)
	throws ClassNotFoundException {
		Class<?> c =  Class.forName(clazzName, true, Thread.currentThread()
				.getContextClassLoader());
			return c;
	}

}