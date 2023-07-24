package CICDTestMaven.CICDTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cicdTest {
	
	
	@Test
	public void cicd()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Tool\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
	}

}
	