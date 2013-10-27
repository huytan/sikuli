package tut1;
import org.sikuli.script.*;
public class GenericButton {
	static int timeout = 5;
	static double similarity = .8;
	public static void click(String imagePath){
		click(imagePath,similarity,timeout);
	}
	public static void click (String imagePath,double similarity,int timeout){
		try {
			Pattern imagePattern = new Pattern(imagePath);
			
			Screen  screen = new Screen();
			
			if (screen.exists(imagePattern.similar((float) similarity), timeout) != null) {
				screen.click(imagePattern,0);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
}
