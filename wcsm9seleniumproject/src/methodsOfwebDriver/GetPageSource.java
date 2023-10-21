package methodsOfwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetPageSource {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-nt35em5/login.do");
		driver.manage().window().maximize();
		String loginpageSourceCode=driver.getPageSource();
		System.out.println(loginpageSourceCode);
	}

}
