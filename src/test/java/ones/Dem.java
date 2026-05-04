package ones;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Dem {

	/*My Task
	 * 
	 * public void clickSpecificTab(String tabName){}
	 * 
	 * */
	public static void clickSpecificTab(String tabName) {
		List<WebElement>ele = driver.findElements(By.xpath("//a[@class='nav-link']"));
		ele.stream().filter(p->p.getText().equals(tabName)).findFirst().ifPresent(WebElement::click);
	}
	public static WebDriver driver;
	@BeforeSuite
	public void start() {
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testName() throws Exception {
		System.out.println(driver.getCurrentUrl());
//		clickSpecificTab("Log in");
//		clickSpecificTab("Contact");
		clickSpecificTab("Sign up");
	}
//	@AfterSuite
	public void close() {
		driver.close();
	}
}
