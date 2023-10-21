package methodsOfwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Navigation nav=driver.navigate();
		nav.to("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		nav.back();
		nav.forward();
		nav.refresh();

	}

}
