package tut1;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//value between 0 (0%) and 1.0 (100%) representing the
		//percentage of similaruty between image and screen shot.
		float similarity =  (float) 0.8;
		
		//number of seconds Sikuli will spend attemting to find a match
		//between pattern and screen shot
		int timeout =5;
		
		//Instance Sikuli Pattern object by passing in an image of
		//the windows 7 start button
		Pattern win7StartButton = new Pattern("./imgs/start.png");
		
		//Instance Sikuli Srceen object which takes a snapshot of
		//your current destop. All comparisons will be performed
		//against the contents of this object.
		Screen screen = new Screen();
		
		// Attempt to find win7StartButton in screen shot using the
		//similarity level and timeout specified above. Similarity and
		//timeout are optional and if left out will result in Sikuli
		//using it's built-in defaults.
		if(screen.exists(win7StartButton.similar(similarity),timeout) != null){
			try {
				//Pattern was found in screen and we will now attempt
				//to click the pattern that was located
				screen.click(win7StartButton,0);
			} catch (FindFailed e) {
				//Pattern was lot between the screen.exists statement
				//and the attempt to click
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}
	}

}
