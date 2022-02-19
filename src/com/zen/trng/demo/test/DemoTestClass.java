package com.zen.trng.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\SW\\selenium\\Chrome\\98\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.calculator.net/"); // open the application
		//condition for validation
		
		//driver.findElement(By.linkText("BMI Calculator")).click();		 //linktext
		driver.findElement(By.partialLinkText("BMI C")).click();		 //partial linktext
		WebElement age = driver.findElement(By.name("cage")); // name locator
		age.clear();
		age.sendKeys("42");
		//driver.findElement(By.id("csex1")).click(); // id locator
		WebElement elementHt = driver.findElement(By.name("cheightmeter"));
		elementHt.clear();
		elementHt.sendKeys("162");
		WebElement elementWt = driver.findElement(By.name("ckg"));
		elementWt.clear();
		elementWt.sendKeys("62");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[2]/table/tbody/tr/td/table[4]/tbody/tr/td/input[2]")).click();
		String myBMI = driver.findElement(By.cssSelector("#content > div.rightresult > div")).getText();
		System.out.println("My BMI is : "+myBMI);
		Thread.sleep(3000);
		driver.quit();
		
		driver.quit(); // close the application
		

	}

}
