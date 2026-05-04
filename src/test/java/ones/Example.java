package ones;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import pages.GoogleHomePage;

public class Example {

	public WebDriver driver;
	public GoogleHomePage googleHomePage;
	@BeforeSuite
	public void start() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		googleHomePage = new GoogleHomePage(driver);
	}
}
