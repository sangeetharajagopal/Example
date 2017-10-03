package com.signup;


import java.util.Random;

import org.testng.annotations.DataProvider;

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
		//object- stores every type of data type. data type which can accept any string, int or double 

		Object[][] data = new Object[8][3];

		// 1st row //email already exists
		data[0][0] = "sangee";
		data[0][1] = "sangeetha.gopal@a-cti.com";
		data[0][2] = "sangeetha";

		// 2nd row//password should have min 6 charbookingelements.selectSlots();
		data[1][0] = "s";

		data[1][1] = "sangeetha@gmail.com";

		data[1][2] = "san";
		// 3rd row//invalid email
		data[2][0] = "test3";
		data[2][1] = "huaiuuifiaiih";
		data[2][2] = "check password";

		// //4th row //invalid email
		data[3][0] = "       ";
		data[3][1] = "1234568@gmail.";
		data[3][2] = "sangee";
		// 5th row name should not be empty
		data[4][0] = "";
		data[4][1] = "sangee@gmail.com";
		data[4][2] = "sangeetha";
		// 6th row// email should not be empty
		data[5][0] = "game123";
		data[5][1] = "";
		data[5][2] = "sangeetha";

		// 7th row password should not be empty
		data[6][0] = "hfuaiuuieuau";
		data[6][1] = "sangeetha@yahoo.com";
		data[6][2] = "";
	

		Random randomGenerator = new Random();
		int randomInt =1+ randomGenerator.nextInt(1000);

		// email.sendKeys("username"+ randomInt +"@gmail.com");
		data[7][0] = "test124";
		data[7][1] = "sangeeth" + randomInt + "@gmail.com";
		data[7][2] = "Testrandom password";

		// System.out.println(username + randomInt + "@gmail.com");

		// }

		return data;

		//
		// data.add("sangee");
		// data.add("sangeetha@a-cti.com");
		// data.add("sangeetha");
		// return data;

	}

}
