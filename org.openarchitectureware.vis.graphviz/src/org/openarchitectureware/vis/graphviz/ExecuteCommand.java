package org.openarchitectureware.vis.graphviz;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class ExecuteCommand {

	public static int executeCommand(String command) {
		try {
			String line;
			InputStream stdout = null;
			InputStream stderr = null;

			Process p = Runtime.getRuntime().exec(command);
			stderr = p.getErrorStream();
			stdout = p.getInputStream();

			// clean up if any output in stdout
			BufferedReader brCleanUp = new BufferedReader(
					new InputStreamReader(stdout));
			while ((line = brCleanUp.readLine()) != null) {
				org.eclipse.xtend.util.stdlib.IOExtensions.info(line);
			}
			brCleanUp.close();

			// clean up if any output in stderr
			brCleanUp = new BufferedReader(new InputStreamReader(stderr));
			while ((line = brCleanUp.readLine()) != null) {
				org.eclipse.xtend.util.stdlib.IOExtensions.error(line);
			}
			brCleanUp.close();

			p.waitFor();
			return p.exitValue();
		} catch (Exception err) {
			err.printStackTrace();
		}
		return 0;
	}

	public static boolean isWindows(){
		 
		String os = System.getProperty("os.name").toLowerCase();
		//windows
	    return (os.indexOf( "win" ) >= 0); 
 
	}
 
	public static boolean isMac(){
 
		String os = System.getProperty("os.name").toLowerCase();
		//Mac
	    return (os.indexOf( "mac" ) >= 0); 
 
	}
 
	public static boolean isUnix(){
 
		String os = System.getProperty("os.name").toLowerCase();
		//linux or unix
	    return (os.indexOf( "nix") >=0 || os.indexOf( "nux") >=0);
 
	}

	public static String getCanonicalPath (String fileName) {
		File file = new File (fileName);			
		try {
			return file.getCanonicalPath().toString();
		} catch (IOException e) {
			return fileName;
		}			
	}
}
