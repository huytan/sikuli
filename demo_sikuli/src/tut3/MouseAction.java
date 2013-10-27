package tut3;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.Settings;

public class MouseAction {
	static Pattern imagePattern;

	//mouse left-click
	public void leftClick() throws FindFailed {
		Screen s = new Screen();
		s.click(imagePattern, 0);
	}
	//mouse right-click
	public void rightClick() throws FindFailed {
		Screen s = new Screen();
		s.rightClick(imagePattern, 0);
	}

	//mouse double-click
	public void doubleClick() throws FindFailed {
		Screen s = new Screen();
		s.doubleClick(imagePattern, 0);
	}
	
	//mouse double right-click
	public void doubleRightClick() throws FindFailed {
		Screen s = new Screen();
		s.rightClick(imagePattern, 0);
		s.rightClick(imagePattern, 0);
	}
	
	//change the mouse move speed
	//By default, the Sikuli Script controlled mouse is relatively slow.  
	//To change the speed, you use the global function Settings.MoveMouseDelay(float). 
	//The lower the value, the faster the mouse will move.  
	//A value of ‘0’ is near instantaneous movement which has been proven to cause nausea. 
	
	//	Settings.MoveMouseDelay = (float)0;
	
}
