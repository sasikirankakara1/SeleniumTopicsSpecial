package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePages {

	/*
	 * 
	 * Page object model:
	 * 
	 * click()=> alert()=> sendkeys()=>
	 * 
	 * By referenceName = By.xpath(""); GoogleHomepage(webdriver driver){
	 * this.driver = driver; } public void performClick(String text){
	 * 
	 * driver.findelment(referenceName).sendkeys(text);
	 * 
	 * } GoogleHomePage page = new GoogleHomePage(driver); page.performCLici();
	 */
	public static WebDriver driver;

	public GoogleHomePages(final WebDriver driver) {
		this.driver = driver;
	}

	By aboutBtn = By.xpath("//button[@class='btn btn-danger']");
	By searchFiled = By.cssSelector("textarea#APjFqb");
	public void performClick() {
		driver.findElement(aboutBtn).click();
	}
	public void handleAlert() {
//		driver.switchTo().alert().accept();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	}
	public void sendData(String text) {
		driver.findElement(searchFiled).sendKeys(text,Keys.ENTER);
	}
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		GoogleHomePages googleHomePages = new GoogleHomePages(driver);
//		googleHomePages.performClick();
//		googleHomePages.handleAlert();
		googleHomePages.sendData("hello");
	}

}
