package demo.testng;

import org.testng.annotations.Test;

public class Demo3 {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
    public void testexception() {
           int a = 10;
           int b = 0;
           a = a / b;
    }
	@Test(timeOut = 5000)
	public void timeout() throws InterruptedException {
        System.out.println("Hi");
        Thread.sleep(2000); // db is slow taking 2 sec
 }


}
