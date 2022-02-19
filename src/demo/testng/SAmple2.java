package demo.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SAmple2 {
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("====================This is before Suite setup");
	}
	@AfterSuite
	void afterSuite() {
		System.out.println("====================This is After Suite setup");
	}
	@AfterTest
	void AfterTest() {
		System.out.println("====================This is After Test setup");
	}
	@BeforeTest
	void beforeTest() {
		System.out.println("====================This is before Test setup");
	}
	@BeforeMethod
	void beforeMethod() {
		System.out.println("====================This is before method code");
	}
	@AfterMethod
	void AfterMethod() {
		System.out.println("====================This is After method code");
	}
	
	@Test
	public void test1() {
		System.out.println("====================This is my Test1");
		//login
	}
	@Test
	public void test2() {
		System.out.println("====================This is my Test2");
		// products
	}
	@Test
	public void test3() {
		System.out.println("====================This is my Test3");
		//checkout
	}

}
