import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliScript;

import util.LoadImage;


public class Main {

	//Sikuli script object  
    private SikuliScript m_sikscr;  
  
    //Computer screen object  
    private Screen m_screen;  
    static LoadImage image =new LoadImage();;
    public Main() {
    	
    	
    	 //Create Sikuli script and screen objects  
//        try  
//        {  
//            m_sikscr = new SikuliScript();  
//            m_screen = new Screen();  
//        }  
//        catch (Exception e)  
//        {  
//            e.printStackTrace();  
//        } 
	}
    
	public static void main(String[] args) throws FindFailed {
		Region testr = new Screen();
		System.out.println(image.getT());
		
		
	}

}
