package org.openarchitectureware.vis;

import static org.junit.Assert.assertFalse;

import java.io.File;

import org.junit.Test;

public class CleanSrcGenDirectoryTest {

	public static boolean deleteDir(File dir) {
	    if (dir.isDirectory()) {
	        String[] children = dir.list();
	        for (int i=0; i<children.length; i++) {
	            boolean success = deleteDir(new File(dir, children[i]));
	            if (!success) {
	                return false;
	            }
	        }
	    }
	    // The directory is now empty so delete it
	    return dir.delete();
	}
	
	@Test
	public void cleanSrcGen() {
		File file = new File("src-gen");
		if (file.exists()) {
			deleteDir (file);
		}
		assertFalse (file.exists());
	}
}
