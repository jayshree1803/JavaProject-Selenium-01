package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsMethodInstagram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]")).sendKeys("gore.jayshree1803@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("asdfghjkl");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(2000);
	}

}
