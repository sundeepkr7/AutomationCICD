package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGenderRadio {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	int y1=driver.findElement(By.xpath("//label[@for='u_m_4_u2']")).getLocation().getY();
	int y2=driver.findElement(By.xpath("//label[@for='u_m_5_yJ']")).getLocation().getY();
	int y3=driver.findElement(By.xpath("//label[@for='u_m_6_k']")).getLocation().getY();
	
	System.out.println(y1);
	System.out.println(y2);
	System.out.println(y3);
	driver.close();
	
	
	

	}

}
