package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
static {
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		robot r = new robot();
		
	}

}
