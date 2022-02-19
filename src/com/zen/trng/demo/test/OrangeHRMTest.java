package com.zen.trng.demo.test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zen.trng.demo.util.BrowserSetup;
import com.zen.trng.demo.util.CaptureScreenClass;
import com.zen.trng.demo.util.ReuseableMethods;

public class OrangeHRMTest {
	public static WebDriver driver;
	
//	public static void main(String[] args) throws InterruptedException, IOException {
	
	@BeforeTest
	public void openApplication() {
		BrowserSetup br = new BrowserSetup();
		driver = br.driverSetup("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Reporter.log("Application is launched");
	}
	@AfterTest
	public void closeApp() {
		driver.quit();
	}
	
	@Test
	public void orangeHRMLoginTest1() throws IOException {		
		
		CaptureScreenClass scr = new CaptureScreenClass();
		ReuseableMethods re = new ReuseableMethods();			
		re.login(driver);	
		Reporter.log("Logged in");
		scr.captureScreen(driver);
	}
}
