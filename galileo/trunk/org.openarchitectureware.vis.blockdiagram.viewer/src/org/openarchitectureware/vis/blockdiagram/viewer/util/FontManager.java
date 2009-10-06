package org.openarchitectureware.vis.blockdiagram.viewer.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;

public class FontManager {

	Map<FontData, Font> fontMap = new HashMap<FontData, Font>(10);

    public void dispose() {
    	for (Font f:fontMap.values()) {
    		f.dispose();
    	}
    }

    public Font getFont(FontData fontData) {
        Font font = fontMap.get(fontData);
        if (font == null) {
            font = new Font (Display.getDefault(), fontData);
            fontMap.put(fontData, font);
        }
        return font;
    };	
}
