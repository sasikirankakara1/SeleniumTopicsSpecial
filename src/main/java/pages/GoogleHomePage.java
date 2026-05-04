package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

	public WebDriver driver;
	public GoogleHomePage(final WebDriver driver) {
		this.driver=driver;
	}
	By aboutBtn = By.xpath("(//a[@class='MV3Tnb'])[1]");
	public void performAction() {
		driver.findElement(aboutBtn).click();
//		driver.findElement(By.xpath("")).clli();
	}
	
	
	
}
