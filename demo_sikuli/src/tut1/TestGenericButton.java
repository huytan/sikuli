package tut1;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;

public class TestGenericButton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GenericButton.click("imgs/start.PNG");
		GenericButton.click("imgs/start.PNG", .8, 5);
		
	}

}
