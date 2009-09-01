package org.openarchitectureware.vis.graphviz;

import java.io.BufferedReader;
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

}
