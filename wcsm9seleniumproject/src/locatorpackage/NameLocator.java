package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\shree\\Desktop\\wcsm9html\\radio.html");
		Thread.sleep(2000);
		driver.findElement(By.name("name4")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name1")).click();
		Thread.sleep(2000);


	}

}
