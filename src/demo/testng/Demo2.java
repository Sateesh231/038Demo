package demo.testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(description = "This is my login Testcase",dependsOnMethods = {"openApplication"}, groups = {"smoke"})
	public void login() {
		System.out.println("====================This is my Login Test");
	//	assertTrue(false);
	}	
	@Test(priority = -1,groups = {"smoke"})
	public void openApplication() {
		System.out.println("====================This is my open appTest");
	}
	@Test(priority = 3,dependsOnMethods = {"login"},groups = {"regression"})
	public void logout() {
		System.out.println("====================This is my Logout Test");
	}
	@Test(priority = 4, alwaysRun = true)
	public void closeApplication() {
		System.out.println("====================This is my close app Test");
	}
	@Test(priority = 1, invocationCount = 3, groups = {"regression"})
	public void sendMail() {
		System.out.println("====================This is my sendmail Test");
	}
	@Test(priority = 2, enabled = false)
	public void deleteMail() {
		System.out.println("====================This is my deletemail Test");
	}
	//data
}
