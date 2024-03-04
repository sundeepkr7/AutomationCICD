package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleFinance {
  static{
	  System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
  }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("google finance");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'google finance')]")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Google Finance - Stock Market')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Most followed on Google']"));
        int y = driver.findElement(By.xpath("//div[text()='Most followed on Google']")).getLocation().getY();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,"+y+")");
        String cname = driver.findElement(By.xpath("//div[text()='Infosys Ltd']")).getText();
        String cshare = driver.findElement(By.xpath("//div[contains(text(),'Infosys Ltd')]/../../../div[2]")).getText();
        System.out.println(cname+ " : " +cshare);
	}

}

