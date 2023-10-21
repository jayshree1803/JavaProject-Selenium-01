package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsMethodFlipcart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@class,'-dOa_b L_FVxe')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Flights')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@title,'Dropdown with more help links')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//[contains(@')]")).click();
		Thread.sleep(2000);

}

}
