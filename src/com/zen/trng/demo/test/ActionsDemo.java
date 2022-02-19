package com.zen.trng.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");		
		
		WebElement dragElement = driver.findElement(By.id("draggable"));
		WebElement dropElement = driver.findElement(By.id("droppable"));
		
		Actions actions = new  Actions(driver);
	//	actions.dragAndDrop(dragElement, dropElement).perform();
//		actions.clickAndHold(dragElement);
//		actions.moveToElement(dropElement);
//		actions.release();
//		actions.build().perform();
		
		actions.clickAndHold(dragElement).moveToElement(dropElement).release().build().perform();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
