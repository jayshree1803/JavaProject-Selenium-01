package assignment2;
import java.util.Set;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Question02{

		public static void main(String[] args) throws InterruptedException 
			{
			WebDriver driver=new ChromeDriver();
			driver.get("http://omayo.blogspot.com/");
			Thread.sleep(2000);
			String ParentHandle=driver.getWindowHandle();
			driver.findElement(By.partialLinkText("Open a popup window")).click();
			Thread.sleep(2000);
			Set<String>allHandles=driver.getWindowHandles();
			for(String wh:allHandles)
			{
				if(!ParentHandle.equals(wh))
				{
					driver.switchTo().window(wh).close();

				}
				driver.switchTo().window(wh).close();
			
			}
	}
	}