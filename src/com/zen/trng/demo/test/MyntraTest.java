package com.zen.trng.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");	
		driver.manage().window().maximize();
		Actions actions = new  Actions(driver);
		WebElement menuele = driver.findElement(By.xpath("//a[@class='desktop-main'][contains(text(),'Home & Living')]"));
		 
		WebElement giftLink = driver.findElement(By.xpath("//a[contains(text(),'Home Gift Sets')]"));
		
		actions.moveToElement(menuele).perform();
		actions.moveToElement(giftLink).click().perform();
		
		driver.findElement(By.xpath("//label[contains(text(),'30% and above')]")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
