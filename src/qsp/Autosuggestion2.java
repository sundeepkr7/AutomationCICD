package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion2 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//go to google.com
		driver.get("https://www.google.com/");
		
		//type the qspiders in search text box
        driver.findElement(By.name("q")).sendKeys("qspiders");
        Thread.sleep(3000);
        
        //capture all the autosuggestions and print it on the console
        List<WebElement> allsugg =driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
        int count = allsugg.size();
        
        System.out.println(count);
       
        
        for (WebElement i : allsugg) 
        {
           System.out.println(i.getText());
        }
		/*for(int i=0;i<count;i++)
		{
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}
		
		allsugg.get(count-1).click();*/
	}

}
