package tut4;

import java.awt.Rectangle;
import java.awt.Toolkit;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class Sandbox {

	/**
	 * @param args
	 * @throws FindFailed
	 */
	public static void main(String[] args) {
		try {
			// 1. First we instantiate two Sikuli Pattern objects.
			// "lastNameRegion" references a bitmap containing the region of the
			// screen we are using
			// "textBox" reference a bitmap of our generic textbox
			Pattern lastNameRegion = new Pattern("./imgs/passText.JPG");
			Pattern textBox = new Pattern("./imgs/textBox.JPG");

			// 2.Next, we instantiate a Rectangle object of the same dimensions
			// as our screen.
//			Rectangle scrrenResolution = new Rectangle(Toolkit
//					.getDefaultToolkit().getScreenSize());

			// 3.Third, we instantiate a Sikuli Region using this newly created
			// Rectangle object.
			// we will use this full-screen Region to locate our sub-region,
			// "lastNameRegion". This
			// methodology addresses scenarios in which our desired region will
			// not always be located
			// at the same screem location
			Region testr = new Screen();

			// 4. As mentioned in step 3, we will now attempt to find
			// "lastNameRegion" within our full screen region
			testr = testr.find(lastNameRegion.similar((float) .9));

			// 5. Now that we have successfully created our region, we can use
			// it
			testr.inside().click(textBox, 0);
		} catch (FindFailed e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
