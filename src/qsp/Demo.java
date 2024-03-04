package qsp;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) 
	{
			
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");//setproperty is static method present in system cls
		// to tell the systemi.e eclipse from where we are importing 
		ChromeDriver driver = new ChromeDriver();
		//get() method is use to enter the url
		// close() method is use to close the browser
		//there is no method to open the browser,so we have to create an object of chrome browser(i.e.new ChromeDriver)
		}

	}



