package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Google {

	WebDriver driver;
	
	@Test
	public void test() {
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
