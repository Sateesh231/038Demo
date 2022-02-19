package com.zen.trng.demo.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicmethods {

	public static void main(String[] args) throws InterruptedException {
		
	//	WebDriverManager.firefoxdriver().setup();
	//	WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		
	//	WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.calculator.net/loan-calculator.html");
		String headerTxt = driver.findElement(By.tagName("h1")).getText();		
		System.out.println("The header of the page is : "+headerTxt);
		
		WebElement eleLoanAmt = driver.findElement(By.id("cloanamount"));
		eleLoanAmt.clear();
		eleLoanAmt.sendKeys("200000");
		
		WebElement eleCInt = driver.findElement(By.id("ccompound"));
		Select objSele = new Select(eleCInt);
		//objSele.selectByIndex(0); //first value
		//objSele.selectByValue("monthly");
		
		List<WebElement> allOptions = objSele.getOptions();
		System.out.println(allOptions.size());
		for (WebElement options : allOptions) {
			System.out.println(options.getText());
		}
		
		objSele.selectByVisibleText("Weekly");
		
		//driver.findElement(By.id("bluebtn")).isDisplayed();
		Thread.sleep(3000);
		driver.quit();

	}

}
