package sikuli;

import java.net.MalformedURLException;
import java.net.URL;

import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.visual.Canvas;
import org.sikuli.api.visual.DesktopCanvas;


public class DesktopCanvasDemo {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void callDesktop() throws MalformedURLException {
		ScreenRegion s = new DesktopScreenRegion();
		URL imageUrl = new URL("http://wiki.sikuli-api.googlecode.com/git/images/canvas/chrome.png");
		Target target = new ImageTarget(imageUrl);
		ScreenRegion r = s.find(target);
		// TODO Auto-generated method stub
		// create a canvas of the type "DesktopCanvas"
//		Canvas canvas = new DesktopCanvas();
//		canvas.addBox(r).display(3);
		
		// create a canvas of the type "DesktopCanvas"
		Canvas canvas = new DesktopCanvas();
		// add a label and display for 3 seconds
		canvas.addLabel(r, "This is Chrome").display(3);
	}

}
