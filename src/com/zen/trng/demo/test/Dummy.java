package com.zen.trng.demo.test;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.zen.trng.demo.util.Calculator;

public class Dummy {
	
	@Test
	public void test1() {		//login
		Calculator calc = new Calculator();
		int sum = calc.add(10, 20);		
		Assert.assertEquals(sum,30);
		System.out.println(sum);
	}
	@Test
	public void test2() {		// book a ticket
		Calculator calc = new Calculator();
		int product = calc.multiply(10, 20);		
		Assert.assertEquals(product, 200);
		System.out.println(product);
	}

}
