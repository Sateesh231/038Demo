package com.zen.trng.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SW\\selenium\\Chrome\\98\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.calculator.net/"); // open the application
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("BMI Calculator")).click();		 //by using linktext
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.co.in/");
		
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();

		Thread.sleep(3000);
		driver.quit();
	}

}
