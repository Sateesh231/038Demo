package demo.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamswithDP {

	
	@Test(dataProvider = "data1")
	public void login(String un, String pwd) {
		System.out.println("The username is : "+ un);
		System.out.println("The password is : "+ pwd);
	}
	
	
	@DataProvider(name = "data1")
	public Object[][] testdata() {
		//data: get it from excel or define here
		Object[][] data = new Object[3][2]; // call read excel method
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[2][0] = "username3";
		data[2][1] = "password3";
		
		return data;		
	}
}
