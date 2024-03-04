package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {
	static{
		  System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
	  }

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.get("http://rmgtestingserver/domain/");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("(//span[.='Open Application'])[2]")).click();
     Thread.sleep(3000);
     driver.close();
	}

}
