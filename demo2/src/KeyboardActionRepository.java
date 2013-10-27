

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;

public class KeyboardActionRepository {
	public static void sendEnter() throws Exception {

		// send Control + Alt + Delete command and releases
		
		Robot  Keyboard = new Robot();
		Keyboard.keyPress(KeyEvent.VK_ENTER);
	
		
		Keyboard.keyRelease(KeyEvent.VK_ENTER);

	}
}
