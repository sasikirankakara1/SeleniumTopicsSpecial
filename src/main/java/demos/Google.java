package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google {

	protected WebDriver driver;
	By aboutBtn = By.xpath("(//a[@class=\"w5hRs\"])[1]");
	public Google(WebDriver driver) {
		this.driver = driver;
	}
	public void aboutClick() {
		driver.findElement(aboutBtn).click();
//		driver.findElement(By.xpath("")).click();
	}
}
