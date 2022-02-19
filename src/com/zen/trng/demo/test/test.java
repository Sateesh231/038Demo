package com.zen.trng.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	static WebDriver driver;
	private static String url = "https://www.calculator.net/math-calculator.html";
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();	
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//	assertEquals("Addition Javascript Test!", 20L,
		//			js.executeScript("return (arguments[0]+arguments[1]);", 10, 10));	
		//alertPopUpWindow
		js.executeScript("alert('math calculator');");
		driver.switchTo().alert().accept();	
		//getTitle			
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);	
		//refreshBrowser
		js.executeScript("history.go(0);");	
		//scrollDownUntilAnElementDisplayed
		WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/table[4]/tbody/tr/td/div[8]/a"));

		js.executeScript("arguments[0].scrollIntoView(true);",element);
		// getURL
		String currentUrl= (String) js.executeScript("return document.URL;");
		System.out.println(currentUrl);
		//highLightAnElement
		WebElement sevenButton = driver.findElement(By.xpath("//span[contains(text(),'7')]"));
		js.executeScript("arguments[0].style.border='3px dotted blue'", sevenButton);
		//hideAndShowElement
		//Hide an element
	//	js.executeScript("document.getElementById('csalaryincome').style.display='none'");
		//Show an element
	//	js.executeScript("document.getElementById('csalaryincome2').style.color='blue'");
		// createAnAnonymousFunction
		//Change title with JavascriptExecutor
		js.executeScript("document.title='Hello World';");
		System.out.println(driver.getTitle());
		//navigateToPage
		js.executeScript("window.location = 'https://www.calculator.net/marriage-calculator.html'");
		driver.quit();
	}
}

