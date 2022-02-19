package com.zen.trng.demo.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");		
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		System.out.println(driver.getCurrentUrl());
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> childWindows = driver.getWindowHandles();
		System.out.println(childWindows.size());//2 one parent and other is child
//		 Iterator<String> iterator = childWindows.iterator();
//		while (iterator.hasNext()) {
//			  String childWindow = iterator.next();
//			
//		}
//		String w1 = iterator.next();
		
		for (String childW : childWindows) {
			//any condition
			driver.switchTo().window(childW);
		}		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("FREE TRIAL")).click();
		driver.close(); //it closes the newly opened window/tab
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getTitle()); // orangehrm
		Thread.sleep(3000);
		driver.quit();
	}
}
