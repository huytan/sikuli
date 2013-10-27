import static org.junit.Assert.fail;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliScript;
import org.sikuli.script.natives.Vision;


public class Testing {

	//Sikuli script object  
    private SikuliScript m_sikscr;  
  
    //Computer screen object  
    private Screen m_screen;  
      
    //Image of Firefox address bar  
    private Pattern m_address;  
      
//    //Image of Firefox go image  
//    private Pattern m_go;  
//      
    //Image of Yahoo ID label  
    private Pattern m_yid;  
      
    //Image of Yahoo password label  
    private Pattern m_pass;  
      
    //Image of Yahoo Signin button  
    private Pattern m_signin;  
      
    //Image of Yahoo brand name  
    private Pattern m_logo;  
	
  //Constructor  
    public Testing()  
    {  
    	
        //Load images from files  
        m_address = new Pattern("./img/chromebar.JPG");  
        m_yid = new Pattern("./img/yahooId.JPG");  
        m_pass = new Pattern("./img/password.JPG");  
        m_signin = new Pattern("./img/SignIn.JPG");  
        m_logo = new Pattern("./img/logo.JPG");  
        
        //Create Sikuli script and screen objects  
        try  
        {  
            m_sikscr = new SikuliScript();  
            m_screen = new Screen();  
        }  
        catch (Exception e)  
        {  
            e.printStackTrace();  
        }  
    }
    
  //This method is invoked before JUnite test case executes  
	@Before
	public void setUp() throws Exception {
		m_sikscr.openApp("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	
		//Wait a bit  
        m_screen.wait((double) 1.0);  
        
        try  
        {  
            //Click Firefox address bar then type address  
            m_screen.type(m_address, "http://mail.yahoo.com");  
              
            //press enter 
           KeyboardActionRepository.sendEnter();
              
            //Wait a bit  
            m_screen.wait((double) 3.0);  
                          
            //Find login label   
            Match login = m_screen.exists(m_yid.similar((float)0.50));  
             
            //Sikuli Click below the login label  
          //  m_screen.click(login.below(0));
            m_screen.click(m_yid);  
            //Type user name  
            m_screen.type("bomnich18@yahoo.com.vn");  
            
          //  m_screen.wait((double) 3.0);
            //Find the password label  
            Match pass = m_screen.exists(m_pass.similar((float)0.70));  
            
            //Sikuli Click below the password label  
          //  m_screen.click(pass.below(0)); 
            
            m_screen.click(m_pass);  

              
            //Enter password  
            m_screen.type("huytan2");  
            
         //   m_screen.wait((double) 3.0);
            
            //Sikuli Click the sign in button  
            m_screen.click(m_signin);  
              
            //Wait a bit  
            m_screen.wait((double) 3.0);     
        }  
        catch (FindFailed e)  
        {  
            e.printStackTrace();  
        }  
    }  
	
	

	@After
	public void tearDown() throws Exception {
		 //Close Firefox app  
        m_sikscr.closeApp("Google Chrome");  
	}

	//Test case checks if Yahoo logo exists after login  
    @Test  
    public void testLogo() throws Exception   
    {  
        //Make sure Yahoo brand name exists  
        assert(m_screen.exists(m_logo)!=null);  
          
        //Wait a bit  
        m_screen.wait((double) 3.0);  
    }  

}
