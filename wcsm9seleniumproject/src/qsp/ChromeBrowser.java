package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		System.out.println("Chrome Is Open");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Chrome is close");
	}

}
