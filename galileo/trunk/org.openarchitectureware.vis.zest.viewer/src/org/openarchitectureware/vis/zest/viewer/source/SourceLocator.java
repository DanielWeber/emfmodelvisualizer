package org.openarchitectureware.vis.zest.viewer.source;

/**
 * interface used to locate source code in Xtext files; 
 * see implementation EclipseSourceLocator
 * @author MarkusVoelter
 *
 */
public interface SourceLocator {

	void locate( String location );
	
}
