package demo.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamsDemo2 {
	

	@Test
	@Parameters({"x","y"})
	public void mult(int a, int b) {
		System.out.println("The sum of the given numbers is : "+ (a*b));
	}
	
}
