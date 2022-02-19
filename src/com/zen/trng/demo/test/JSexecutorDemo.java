package com.zen.trng.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSexecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/payment-calculator.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		js.executeScript("document.getElementById('cloanamount').value='500000'");
//		WebElement element = driver.findElement(By.linkText("Personal Loan Calculator"));		
//		js.executeScript("arguments[0].scrollIntoView(true);",element); //till one element		
//		js.executeScript("arguments[0].click();", element);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//page scroll
		
		System.out.println("By using Webdriver :"+driver.getTitle());
		
		Thread.sleep(5000);
		driver.quit();
	}
}
