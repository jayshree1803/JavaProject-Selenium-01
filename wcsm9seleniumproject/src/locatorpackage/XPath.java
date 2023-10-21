package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPath 
{
		public static void main(String[] args) throws InterruptedException
		{
			ChromeOptions co=new ChromeOptions();
		    co.addArguments("--disable-notifications");
		    
	WebDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.airvistara.com/in/en");
	Thread.sleep(2000);
	driver.findElement(By.id("cookieModalCloseBtn")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@aria-label='Search origin']")).sendKeys("pune");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Search destination']")).sendKeys("Mumbai");
	Thread.sleep(2000);
	

	driver.findElement(By.id("departCalendarDiv")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-date='27']")).click();
	driver.findElement(By.xpath("//a[@data-date='30']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='passengers']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//Button[@value='business']")).click();
	//driver.findElement(By.cssSelector("Button[class='bu_btn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//Button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("book-flight-widget")).click();
	
	
}
}