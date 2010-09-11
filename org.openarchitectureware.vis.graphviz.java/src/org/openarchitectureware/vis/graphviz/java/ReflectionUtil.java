package org.openarchitectureware.vis.graphviz.java;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.eclipse.core.runtime.Assert;

public class ReflectionUtil {

	public static String getShortName (Class c) {
		String[] strings = c.getName().split("[a-zA-Z][a-zA-z0-9]*\\.");
		return strings[strings.length-1];
	}
	
	public static Class getClass(String className) throws ClassNotFoundException {
		return getClass (Thread.currentThread().getContextClassLoader(), className);
	}
	
	
	private static Class getClass(ClassLoader contextClassLoader,
			String className) throws ClassNotFoundException {
		return contextClassLoader.loadClass(className);
	}

	public static List<Class> getClasses(String packageName) throws ClassNotFoundException {
		return getClasses (Thread.currentThread().getContextClassLoader(), packageName);
	}
	
	// FIXME: add flag whether to get classes from subpackages
	public static List<Class> getClasses(ClassLoader cld, String packageName)
			throws ClassNotFoundException {
		Assert.isNotNull(cld);
		// This will hold a list of directories matching the packageName.
		// There may be more than one if a package is split over multiple
		// jars/paths
		List<Class> classes = new ArrayList<Class>();
		ArrayList<File> directories = new ArrayList<File>();
		try {
			// Ask for all resources for the path
			Enumeration<URL> resources = cld.getResources(packageName.replace('.','/'));
			while (resources.hasMoreElements()) {
				URL res = resources.nextElement();
				//res= FileLocator.resolve(res);
				if (res.getProtocol().equalsIgnoreCase("jar")) {
					JarURLConnection conn = (JarURLConnection) res
							.openConnection();
					JarFile jar = conn.getJarFile();
					// System.out.println ("jar:"+jar.getName());
					for (JarEntry e : Collections.list(jar.entries())) {
						if (e.getName().startsWith(packageName.replace('.', '/'))
								&& e.getName().endsWith(".class")
								&& !e.getName().contains("$")) {
							String className = e.getName().replace("/", ".")
									.substring(0, e.getName().length() - 6);
							// System.out.println(className);
							if (className.substring(packageName.length()+1).matches("[a-zA-Z][a-zA-z0-9]*\\.class")) {				
								classes.add(Class.forName(className));
							}
						}
					}
				} else {
					//System.out.println (URLDecoder.decode(res.getPath(), "UTF-8").toString());
					directories.add(new File(URLDecoder.decode(res.getPath(),
							"UTF-8")));
				}
			}
		} catch (NullPointerException x) {
			throw new ClassNotFoundException(packageName
					+ " does not appear to be "
					+ "a valid package (Null pointer exception)");
		} catch (UnsupportedEncodingException encex) {
			throw new ClassNotFoundException(packageName
					+ " does not appear to be "
					+ "a valid package (Unsupported encoding)");
		} catch (IOException ioex) {
			throw new ClassNotFoundException(
					"IOException was thrown when trying "
							+ "to get all resources for " + packageName);
		}

		// For every directory identified capture all the .class files
		for (File directory : directories) {
			if (directory.exists()) {
				// Get the list of the files contained in the package
				String[] files = directory.list();
				for (String file : files) {
					// we are only interested in .class files
					if (file.endsWith(".class")) {
						//System.out.println (file.toString());
						// removes the .class extension
						classes.add(Class.forName(packageName + '.'
								+ file.substring(0, file.length() - 6)));
					}
				}
			} else {
				throw new ClassNotFoundException(packageName + " ("
						+ directory.getPath()
						+ ") does not appear to be a valid package");
			}
		}
		return classes;
	}

	public static Boolean isAbstract (Integer modifiers) {
		return java.lang.reflect.Modifier.isAbstract(modifiers);
	}
	
	public static Boolean isInterface (Integer modifiers) {
		return java.lang.reflect.Modifier.isInterface(modifiers);
	}
}