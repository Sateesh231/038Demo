package com.zen.trng.demo.test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.timeout.TimeoutException;

public class OrangeHRMdemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
	//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		// Wait methods-- implicit(default time -->5) / explicit ( webdriverwait and fluent wait)
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));		
//		WebElement logoutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class)
				.ignoring(TimeoutException.class)
				.pollingEvery(Duration.ofMillis(100));
				
		WebElement logoutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))); // custom functions
				
		//driver.findElement(By.linkText("Logout")).click();
		logoutLink.click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
