package sikuli;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.sikuli.api.*;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopMouse;
import org.sikuli.api.visual.Canvas;
import org.sikuli.api.visual.DesktopCanvas;




public class HelloWorldExample {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 * @throws IOException 
	 */
	public static void hello() throws IOException, URISyntaxException {
		org.sikuli.script.Settings.MoveMouseDelay =0;
		// Open the main page of Google Code in the default web browser
		// Create Desktop object
		 Desktop d=Desktop.getDesktop();

		 // Browse a URL, say google.com
		 d.browse(new URI("http://code.google.com"));

        // Create a screen region object that corresponds to the default monitor in full screen 
        ScreenRegion s = new DesktopScreenRegion();
                        
        // Specify an image as the target to find on the screen
        URL imageURL = new URL("http://code.google.com/images/code_logo.gif");                
        Target imageTarget = new ImageTarget(imageURL);
                        
        // Wait for the target to become visible on the screen for at most 5 seconds
        // Once the target is visible, it returns a screen region object corresponding
        // to the region occupied by this target
        ScreenRegion r = s.wait(imageTarget,5000);
                        
        // Display "Hello World" next to the found target for 3 seconds
        Canvas canvas = new DesktopCanvas();
        canvas.addLabel(r, "Hello World").display(3);
        
        // Click the center of the found target
        Mouse mouse = new DesktopMouse();
        mouse.click(r.getCenter());
        
       
	}

}
