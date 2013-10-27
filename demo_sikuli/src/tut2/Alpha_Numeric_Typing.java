package tut2;

import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Alpha_Numeric_Typing {
	public static void main(String[] args) {
		Alpha_Numeric_Typing.testSikuliTyping();
	}

	public static void testSikuliTyping() {
		// the following code will using Sikuli Script
		// to emulate a beyborad typing Hello World in Notepad.exe

		// Launch Notepad
		try {
			Runtime.getRuntime().exec("Notepad.exe");
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		// Type Hello World in Notepad.exe
		try {
			// Instantiate Sikuli screen object
			Screen s = new Screen();

			// type Hello World into Notepad
			String typeMe = "Hello World";
			s.type(null, typeMe, 0);
		} catch (FindFailed e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
