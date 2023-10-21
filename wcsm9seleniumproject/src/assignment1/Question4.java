package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://student.qspiders.com/login");
			driver.findElement(By.name("email")).sendKeys("gore.jayshree1803@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("shivarth2108");
			Thread.sleep(2000); 
		//	driver.findElement(By.className(")).click();


	}

}
