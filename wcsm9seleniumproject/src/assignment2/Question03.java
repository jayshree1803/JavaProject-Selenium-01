package assignment2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question03
	{
				public static void main(String[] args) throws InterruptedException {
				WebDriver driver=new ChromeDriver();
				driver.get("http://omayo.blogspot.com/");
				Thread.sleep(2000);
				driver.findElement(By.partialLinkText("Open a popup window")).click();
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();

			}


	}


