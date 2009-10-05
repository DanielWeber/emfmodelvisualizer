package org.openarchitectureware.vis.blockdiagram.viewer.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public class ImageManager {

    protected Map<String, Image> imageMap = new HashMap<String, Image>(10);
    private String basePath = "";
    
    public ImageManager (String basePath) {
    	this.setBasePath(basePath); 
    }

    public ImageManager () {
    }
    
    public void dispose() {
    	for (Image i:imageMap.values()) {
    		i.dispose();
    	}
    }

    public Image getImage(String fileName) {
        Image image = imageMap.get(fileName);
        if (image == null) {
            image = createImage (fileName);
            imageMap.put(fileName, image);
        }
        return image;
    }

    public Image createImage (String fileName) {
    	Image image = null;
    	if (fileName!=null && fileName.length()>0) {
			if (!fileName.toLowerCase().startsWith("platform:")) {				
				fileName = getBasePath() + fileName;
			}
			ImageDescriptor desc;
			try {
				desc = ImageDescriptor.createFromURL(new URL(fileName));
				image = desc.createImage();
			} catch (MalformedURLException e) {
				// ignore exception, image could not be loaded, return null
			}
    	}
    	return image;
    }

	public void setBasePath(String basePath) {
		this.basePath = basePath;
		// make sure the path ends with an "/"
    	if (!getBasePath().endsWith("/")) 
    		setBasePath(getBasePath() + "/");
	}

	public String getBasePath() {
		return basePath;
	}
}
