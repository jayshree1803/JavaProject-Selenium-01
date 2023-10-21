package methodsOfwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?affid=affsiteplug&affExtParam1=4fed2b5af92885ade543b170d0d34449&affExtParam2=73938");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}

}
