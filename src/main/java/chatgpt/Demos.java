package chatgpt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demos {

	public WebDriver driver;
	@BeforeSuite
	public void suite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeTest
	public void initiates() {
		driver.get("https://chatgpt.com/");
	}
	
	
}
