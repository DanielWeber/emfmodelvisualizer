package org.openarchitectureware.vis.zest.viewer.views;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.openarchitectureware.vis.zest.viewer.Activator;

public class ImageRegistry {

	public static final String WORKFLOWFILE = "workflowfile";
	public static final String REFRESH = "refresh";
	
	private static Map<String, Image> imageCache = new HashMap<String, Image>();
	private static Map<String, ImageDescriptor> imageDescriptorCache = new HashMap<String, ImageDescriptor>();
	
	public static Image getImageFromPlugin( String name ) {
		if ( imageCache.containsKey(name)) return imageCache.get(name);
		ImageDescriptor id = getImageDescriptorFromPlugin(name);
		Image i = id.createImage();
		imageCache.put( name , i);
		return i;
	}
	
	public static ImageDescriptor getImageDescriptorFromPlugin(String name)
   {
      if(imageDescriptorCache.containsKey(name))
         return imageDescriptorCache.get(name);
      URL url = Activator.getDefault().getBundle().getResource("icons/" + name + ".gif");
			ImageDescriptor id = ImageDescriptor.createFromURL(url);
      imageDescriptorCache.put(name, id);
			return id;
	}
	
	public static Image getImageFromClasspath( String name ) {
		if ( imageCache.containsKey(name)) return imageCache.get(name);
		URL resource = ImageRegistry.class.getResource(name);
		ImageDescriptor id = ImageDescriptor.createFromURL(resource);
		Image i = id.createImage();
		imageCache.put( name , i);
		return i;
	}
	
	
	
	
	
}
