package methodsOfwebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		String ParentHandle=driver.getWindowHandle();
		System.out.println("Add Parent Browser"+ParentHandle);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Set<String>allHandles=driver.getWindowHandles();
		for(String wh:allHandles)
		{
			if(!ParentHandle.equals(wh))
			{
				System.out.println("Address of child window"+wh);
				
			}
			else
			{
				System.out.println("Address of Parent Window"+wh);
			}
		}
	}

}
