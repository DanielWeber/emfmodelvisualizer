package de.test.test;

import org.eclipse.xtext.ISetup;
import org.xtext.example.MyDslStandaloneSetup;

public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDslStandaloneSetup x = new MyDslStandaloneSetup(); 
		
		System.out.println(ISetup.class.isAssignableFrom(x.getClass()));
	}

}
