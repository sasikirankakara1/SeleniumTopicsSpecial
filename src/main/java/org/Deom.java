package org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deom {

	public static void main(String[] args) throws InterruptedException {
		
		/*Iam trying to perform open a google page and after that i will try to print title and url within the console*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/webhp?authuser=1");
		System.out.println("Title of the Page:"+driver.getTitle());
		System.out.println("Current URL:"+driver.getCurrentUrl());
		/*Maximize screen, full screen , minimize screen*/
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
//		driver.manage().window().minimize();
//		Thread.sleep(500);
//		driver.findElement(By.id("APjFqb")).sendKeys("Hello",Keys.ENTER);
//		driver.findElement(By.xpath("//input[@value='radio2']")).click();
//		driver.findElement(By.linkText("Gmail")).click();
//		driver.findElement(By.partialLinkText("ges")).click();
		/*ID*/
//		driver.findElement(By.id("APjFqb")).sendKeys("Hellos",Keys.ENTER);
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("MSD",Keys.ENTER);
//		driver.findElement(By.xpath("(//*[@class='MV3Tnb'])[2]")).click();
//		driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("ou")).click();
		
	}
}
