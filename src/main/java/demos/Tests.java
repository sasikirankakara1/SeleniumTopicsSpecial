package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tests {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com");
//		driver.findElement(By.xpath("(//*[@class='hrefch'])[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='hrefch'])[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn btn-success btn-lg']"))).click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		
	}
}
