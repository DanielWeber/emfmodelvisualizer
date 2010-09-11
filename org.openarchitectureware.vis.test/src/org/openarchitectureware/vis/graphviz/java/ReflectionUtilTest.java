package org.openarchitectureware.vis.graphviz.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

public class ReflectionUtilTest {

	@Test
	public void packageTest() throws ClassNotFoundException {
		@SuppressWarnings("rawtypes")
		List<Class> classes = ReflectionUtil.getClasses("org.openarchitectureware.vis.graphviz.java.test");
		assertNotNull (classes);
		assertEquals(2, classes.size());
	}
	
	@Test
	public void shortName() {
		assertEquals ("ReflectionUtilTest", ReflectionUtil.getShortName(this.getClass()));
	}

}
