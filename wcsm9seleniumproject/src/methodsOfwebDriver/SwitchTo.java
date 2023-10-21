package methodsOfwebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("selenium.dev",Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		

	}

}
