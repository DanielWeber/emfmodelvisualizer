package org.openarchitectureware.vis;

import static org.junit.Assert.assertFalse;

import java.io.File;

import org.junit.Before;
import org.openarchitectureware.vis.graphviz.java.ReflectionUtil;

public class CleanSrcGenDirectory {

	private boolean deleteDir(File dir) {
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
	
	@Before
	public void cleanSrcGen() {
		File file = new File("src-gen/" + ReflectionUtil.getShortName(this.getClass()));
		if (file.exists()) {
			deleteDir (file);
		}
		assertFalse (file.exists());
	}
}
