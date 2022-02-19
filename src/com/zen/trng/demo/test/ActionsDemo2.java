package com.zen.trng.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("start-maximized");
		options.addArguments("disable-notifications");
		options.addArguments("--incognito");
		options.addArguments("disable-infobars");
//		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.goindigo.in/");	
	//	driver.manage().window().maximize();
		Actions actions = new  Actions(driver);
		WebElement manageLink = driver.findElement(By.partialLinkText("Manage"));
	
		actions.moveToElement(manageLink).perform();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Excess Baggage")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
