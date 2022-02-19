package com.zen.trng.demo.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEmoWschools {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_prompt");
		
		String textLeft = driver.findElement(By.xpath("//span[contains(text(),'JavaScript Prompt')]")).getTagName();
		System.out.println("Tagname from Left box : "+textLeft);		
		driver.switchTo().frame("iframeResult");		
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		Alert objAlert = driver.switchTo().alert();
		
		System.out.println(objAlert.getText()); // get the text from popup
//		objAlert.dismiss();                      // to click on "Cancel" button in popup			
		objAlert.sendKeys("Sateesh");		
		objAlert.accept();					// to click on "ok" button in popup		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		driver.quit();
	}

}
