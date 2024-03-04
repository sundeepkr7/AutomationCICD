package qsp;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			//open the browser
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/hp/OneDrive/Desktop/food.html");
			WebElement mtrlistbox = driver.findElement(By.id("mtr"));
			Select s = new Select(mtrlistbox);
			List<WebElement> alloptions = s.getOptions();
			int count = alloptions.size();
			for(int i=0;i<count;i++)
			{
				s.deselectByIndex(i);
				//s.selectByIndex(i);
			}
//			for(int i=count-1; i>0; i--)
//			{
//				s.deselectByIndex(i);
//			}
//			
		}
}
