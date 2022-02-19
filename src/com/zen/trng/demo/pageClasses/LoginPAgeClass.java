package com.zen.trng.demo.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPAgeClass {
	WebDriver driver;	
//	By userName = By.id("txtUsername");
//	By password = By.id("txtPassword");
//	By loginButton = By.id("btnLogin");	
	@FindBy(id = "txtUsername") WebElement webeleUserName;
	@FindBy(id = "txtPassword") WebElement webelePassword;
	@FindBy(id = "btnLogin") WebElement webeleLoginButton;	
	
	public LoginPAgeClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	public void login(String un, String pwd) {		
		webeleUserName.sendKeys(un);
		webelePassword.sendKeys(pwd);
		webeleLoginButton.click();
	}	
//	public void typeUserName(String un) {
//		driver.findElement(userName).sendKeys(un);
//	}
//	public void typePassword(String pwd) {
//		driver.findElement(password).sendKeys(pwd);		
//	}
//	public void clickLogin() {
//		driver.findElement(loginButton).click();
//	}	
}
