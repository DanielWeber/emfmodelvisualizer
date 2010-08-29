package org.openarchitectureware.vis.graphviz;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExecuteCommand {

	static class InputStreamHandler extends Thread {
		/**
		 * Stream being read
		 */

		private InputStream m_stream;

		/**
		 * The StringBuffer holding the captured output
		 */

		private StringBuffer m_captureBuffer;

		/**
		 * Constructor.
		 * 
		 * @param
		 */

		InputStreamHandler(StringBuffer captureBuffer, InputStream stream) {
			m_stream = stream;
			m_captureBuffer = captureBuffer;
			start();
		}

		/**
		 * Stream the data.
		 */

		public void run() {
			try {
				int nextChar;
				while ((nextChar = m_stream.read()) != -1) {
					m_captureBuffer.append((char) nextChar);
				}
			} catch (IOException ioe) {
			}
		}
	}

	public static int executeCommand(String command) {
		try {
			Process p = Runtime.getRuntime().exec(command);

			StringBuffer inBuffer = new StringBuffer();
			InputStream inStream = p.getInputStream();
			new InputStreamHandler(inBuffer, inStream);

			StringBuffer errBuffer = new StringBuffer();
			InputStream errStream = p.getErrorStream();
			new InputStreamHandler(errBuffer, errStream);

			p.waitFor();

			if (inBuffer.length()>0)
				org.eclipse.xtend.util.stdlib.IOExtensions.info(inBuffer);
			if (errBuffer.length()>0)
				org.eclipse.xtend.util.stdlib.IOExtensions.error(errBuffer);

			return p.exitValue();
		} catch (Exception err) {
			err.printStackTrace();
		}
		return 0;
	}

	public static boolean isWindows() {

		String os = System.getProperty("os.name").toLowerCase();
		// windows
		return (os.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		String os = System.getProperty("os.name").toLowerCase();
		// Mac
		return (os.indexOf("mac") >= 0);

	}

	public static boolean isUnix() {

		String os = System.getProperty("os.name").toLowerCase();
		// linux or unix
		return (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0);

	}

	public static String getCanonicalPath(String fileName) {
		File file = new File(fileName);
		try {
			return file.getCanonicalPath().toString();
		} catch (IOException e) {
			return fileName;
		}
	}
}
