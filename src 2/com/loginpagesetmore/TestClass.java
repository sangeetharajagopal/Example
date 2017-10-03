package com.loginpagesetmore;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.signup.SignUppage;

public class TestClass {
	
	SignUppage signPage;
	setUpBrowser setup = new setUpBrowser();
	
	
	@Test
	public void signUp()
	{
		//setup.setUp();
		  signPage = PageFactory.initElements(setup.driver, SignUppage.class);
			setup.driver.get("https://www.setmore.com/");

			Assert.assertEquals(signPage.verifyFirstSignup(), true);

		signPage.singUpButton();

		Reporter.log("Verified signup button <br>");
	}
	

	
	

}
