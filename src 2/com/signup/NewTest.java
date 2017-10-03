package com.signup;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;

@Test
public class NewTest {
	// @Test(dataProvider = "getData")
	// public void f(String name, String email, String setpass) {
	// System.out.println(" you have provided your username as:: "+name);
	// System.out.println("you have provided the email address as:: "+email);
	// System.out.println("your password is: "+setpass);
	//
	// }

	@DataProvider
	public Object[][] getData() {
		// ArrayList data= new ArrayList();

		Object[][] data = new Object[8][3];
		//
		// data[0][0]="sangee";
		// data[0][1]="sangeetha.gopal@a-cti.com";
		// data[0][2]="sangeetha";
		//

		// 1st row
		data[0][0] = "sangee";
		data[0][1] = "sangeetha.gopal@a-cti.com";
		data[0][2] = "sangeetha";

		// 2nd row
		data[1][0] = "s";

		data[1][1] = "sanhyrhfhhifh@gmail.com";

		data[1][2] = "san";
		// 3rd row
		data[2][0] = "test3";
		data[2][1] = "huaiuuifiaiih";
		data[2][2] = "hjfguytg";

		// //4th row
		data[3][0] = "sample test";
		data[3][1] = "1234568@gmail.";
		data[3][2] = "sangee";
		// 5th row
		data[4][0] = "";
		data[4][1] = "sangee@gmail.com";
		data[4][2] = "sangeetha";
		// 6th row
		data[5][0] = "game123";
		data[5][1] = "";
		data[5][2] = "sangeetha";

		// 7th row
		data[6][0] = "hfuaiuuieuau";
		data[6][1] = "sangeetha@yahoo.com";
		data[6][2] = "";
		// 8th row
		data[7][0] = "!@#$%^&*()";
		data[7][1] = "sangeetha657@gmail.com";
		data[7][2] = "sample test";

		return data;

		//
		// data.add("sangee");
		// data.add("sangeetha@a-cti.com");
		// data.add("sangeetha");
		// return data;

	}
}
