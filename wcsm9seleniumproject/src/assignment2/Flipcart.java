package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		driver.findElement(By.name("")).click();
		//driver.findElement(By.name("q")).
		
	}

}
