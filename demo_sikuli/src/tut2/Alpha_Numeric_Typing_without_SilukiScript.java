package tut2;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Alpha_Numeric_Typing_without_SilukiScript {
public static void type(String text,int keypressDelayMS)throws Exception{
	if(text.length() <0){
		return;
	}
	Robot keyboard = new Robot();
	//convert String to text array
	char textArray[]=text.toCharArray();
	
	//iterate through text array
	for(char c: textArray){
		//if key is upper case, hold Shift
		if(Character.toLowerCase(c) !=c){
			keyboard.keyPress(KeyEvent.VK_SHIFT);
		}
		//type key
		switch (Character.toLowerCase(c)) {
		case 'a':
			keyboard.keyPress(KeyEvent.VK_A);
			break;
		case 'b':
			keyboard.keyPress(KeyEvent.VK_B);
			break;
		case 'c':
			keyboard.keyPress(KeyEvent.VK_C);
			break;
		case 'd':
			keyboard.keyPress(KeyEvent.VK_D);
			break;
		case 'e':
			keyboard.keyPress(KeyEvent.VK_E);
			break;
		case 'f':
			keyboard.keyPress(KeyEvent.VK_F);
			break;
		case 'g':
			keyboard.keyPress(KeyEvent.VK_G);
			break;
		case 'h':
			keyboard.keyPress(KeyEvent.VK_H);
			break;
		case 'i':
			keyboard.keyPress(KeyEvent.VK_I);
			break;
		case 'j':
			keyboard.keyPress(KeyEvent.VK_J);
			break;
		case 'k':
			keyboard.keyPress(KeyEvent.VK_K);
			break;
		case 'l':
			keyboard.keyPress(KeyEvent.VK_L);
			break;
		case 'm':
			keyboard.keyPress(KeyEvent.VK_M);
			break;
		case 'n':
			keyboard.keyPress(KeyEvent.VK_N);
			break;
		case 'o':
			keyboard.keyPress(KeyEvent.VK_O);
			break;
		case 'p':
			keyboard.keyPress(KeyEvent.VK_P);
			break;
		case 'q':
			keyboard.keyPress(KeyEvent.VK_Q);
			break;
		case 'r':
			keyboard.keyPress(KeyEvent.VK_R);
			break;
		case 's':
			keyboard.keyPress(KeyEvent.VK_S);
			break;
		case 't':
			keyboard.keyPress(KeyEvent.VK_T);
			break;
		case 'u':
			keyboard.keyPress(KeyEvent.VK_U);
			break;
		case 'v':
			keyboard.keyPress(KeyEvent.VK_V);
			break;
		case 'w':
			keyboard.keyPress(KeyEvent.VK_W);
			break;
		case 'y':
			keyboard.keyPress(KeyEvent.VK_Y);
			break;
		case 'z':
			keyboard.keyPress(KeyEvent.VK_Z);
			break;
		case '0':
			keyboard.keyPress(KeyEvent.VK_0);
			break;
		case '1':
			keyboard.keyPress(KeyEvent.VK_1);
			break;
		case '2':
			keyboard.keyPress(KeyEvent.VK_2);
			break;
		case '3':
			keyboard.keyPress(KeyEvent.VK_3);
			break;
		case '4':
			keyboard.keyPress(KeyEvent.VK_4);
			break;
		case '5':
			keyboard.keyPress(KeyEvent.VK_5);
			break;
		case '6':
			keyboard.keyPress(KeyEvent.VK_6);
			break;
		case '7':
			keyboard.keyPress(KeyEvent.VK_7);
			break;
		case '8':
			keyboard.keyPress(KeyEvent.VK_8);
			break;
		case '9':
			keyboard.keyPress(KeyEvent.VK_9);
			break;
		}
		
		//release sift
		keyboard.keyRelease(KeyEvent.VK_SHIFT);
		
		//sleep between keys
		Thread.sleep(keypressDelayMS);
	}
}
}
