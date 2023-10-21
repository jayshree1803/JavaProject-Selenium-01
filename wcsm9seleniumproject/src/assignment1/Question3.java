package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 

	{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.name("userLoginId")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("manager");
		Thread.sleep(2000); 
		driver.findElement(By.className("btn login-button btn-submit btn-small")).click();

		

	}
	}


