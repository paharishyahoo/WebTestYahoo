package group1.webTest1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstWebTest {
	
	@Test
	public void openHomePage(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.made.com");
		String title = driver.getTitle();
		System.out.println("Page Title is : " + title );
		
		driver.manage().window().maximize();
		driver.quit();
	}

}
