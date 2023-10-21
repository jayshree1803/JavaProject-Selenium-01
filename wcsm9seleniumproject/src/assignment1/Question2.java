package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();

	}

}
