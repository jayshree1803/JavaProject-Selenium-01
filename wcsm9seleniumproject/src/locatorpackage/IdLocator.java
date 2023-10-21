package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\shree\\Desktop\\wcsm9html\\simplelogin.html");
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		

		

	}

}
