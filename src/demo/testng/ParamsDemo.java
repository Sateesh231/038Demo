package demo.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamsDemo {
	
	@Test
	@Parameters({"x","y"})
	public void sum(int a, int b) {
		System.out.println("The sum of the given numbers is : "+ (a+b));
	}
	
}
