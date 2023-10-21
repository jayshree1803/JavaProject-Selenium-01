package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Firefox is open");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Firefox is close");
		

	}

}
