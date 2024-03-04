package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/food.html");
		
		WebElement mtrlistbox =driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		List<WebElement> allSOptions = s.getOptions();
		int count = allSOptions.size();
		System.out.println(count);
		
		for(WebElement option:allSOptions)//for each loop
		{
			String text = option.getText();
			System.out.println(text);
		}
		/*for(int i=0; i<count; i++)//for loop
		  {
			String text = allSOptions.get(i).getText();
			System.out.println(text);
		}*/
		driver.close();
	}	
}
