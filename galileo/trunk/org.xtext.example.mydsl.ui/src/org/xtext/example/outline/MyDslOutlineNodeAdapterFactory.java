/*
* generated by Xtext
*/
package org.xtext.example.outline;

import org.eclipse.xtext.ui.common.editor.outline.actions.DefaultContentOutlineNodeAdapterFactory;

public class MyDslOutlineNodeAdapterFactory extends DefaultContentOutlineNodeAdapterFactory {

	private static final Class[] types = { 
		// provide list of classes to adapt to, e.g.:
		// Entity.class
		// Service.class
	};

	@Override
	public Class[] getAdapterList() {
		return types;
	}

}

