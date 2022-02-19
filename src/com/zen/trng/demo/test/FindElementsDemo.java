package com.zen.trng.demo.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.zen.trng.demo.util.ExcelWrite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
//		Iterator<WebElement> hnItr = allLinks.iterator();		
//		int i = 0;
//		while (hnItr.hasNext()) {
//			WebElement ob = hnItr.next();			
//			arr.add(ob.getText());
//			i++;
//		}		
		
		
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
			arr1.add(link.getText());
			arr2.add(link.getText());
		}
		
		ExcelWrite.writeExcel(arr1,arr2);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
