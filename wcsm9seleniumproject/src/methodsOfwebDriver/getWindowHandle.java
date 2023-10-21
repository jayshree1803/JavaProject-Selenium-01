package methodsOfwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-nt35em5/login.do");
		driver.manage().window().maximize();
		String ParentHandle=driver.getWindowHandle();
		System.out.println(ParentHandle);

	}

}
