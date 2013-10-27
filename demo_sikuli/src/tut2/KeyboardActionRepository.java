package tut2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;

public class KeyboardActionRepository {
	public static void sendCtrAltDel() throws Exception {

		// send Control + Alt + Delete command and releases
		
		Robot  Keyboard = new Robot();
		Keyboard.keyPress(KeyEvent.VK_CONTROL);
		Keyboard.keyPress(KeyEvent.VK_ALT);
		Keyboard.keyPress(KeyEvent.VK_DELETE);
		
		Keyboard.keyRelease(KeyEvent.VK_CONTROL);
		Keyboard.keyRelease(KeyEvent.VK_ALT);
		Keyboard.keyRelease(KeyEvent.VK_DELETE);
	}
	
	/**
	 * method logs into a windows Xp desktop using provided creds
	 * @param userName the domain user name including any domain prefix
	 * @param password the domain user password 
	 * @throws Exception
	 */
//	public static void logIntoComputerFirstTime(String userName,String password)throws Exception{
//		log.note("Left clicking on login dealog");
//		WindowsXpDialogRepository.WindowsXpLoginDialog.leftClick();
//		log.note("typing keys");
//		KeyboardActionRepository.sendAltU();
//		log.not("taking screenshot");
//		Screen s =new Screen();
//		log.note("Typing login");
//		s.type(null,userName,0);
//		log.note("typing keys");
//		KeyboardActionRepository.sendAltP();
//		log.note("typing password");
//		s.type(null,pasword,0);
//		log.note("clicking ok button");
//		KeyboardActionRepository.sendEnter();
//		log.note("End of the show");
//	}
}
