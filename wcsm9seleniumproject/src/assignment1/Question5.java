package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
public static void main(String[] args) throws InterruptedException
{
	

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://cmsv3-jio.voot.com/#home-app-view");
	driver.findElement(By.id("username")).sendKeys("gore.jayshree1803@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("shivarth2108");
	Thread.sleep(2000);
	driver.findElement(By.id("loginBtn")).click();

}
}
	

