package com.zen.trng.demo.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.zen.trng.demo.pageClasses.LoginPAgeClass;

public class ReuseableMethods {
	
	public void login(WebDriver driver) {
		String un = "Admin";// call read excel method to get un // external source
		String pwd = "admin123";
//		driver.findElement(By.id("txtUsername")).sendKeys(un);//comment
//		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
//		driver.findElement(By.id("btnLogin")).click();
		
		LoginPAgeClass loginpage = new LoginPAgeClass(driver);
//		loginpage.typeUserName(un);
//		loginpage.typePassword(pwd);
//		loginpage.clickLogin();
		loginpage.login(un, pwd);
	}	

	// open application method with validation
	//close application
}
