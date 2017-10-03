package com.signup;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.signup.NewTest;
import com.loginpagesetmore.setUpBrowser;

@Test
public class CreateAccountSetMore extends NewTest{
	
	
	
	SignUppage signPage;
	setUpBrowser setup = new setUpBrowser();
	
	@Test
	public void signUp()
	{
		//setup.setUp();
		setup.driver.get("https://www.setmore.com/");
		  signPage = PageFactory.initElements(setup.driver, SignUppage.class);
			Assert.assertEquals(signPage.verifyFirstSignup(), true);

		signPage.singUpButton();

		Reporter.log("Verified signup button <br>");
	}
	
	
	
	@Test(dataProvider = "getData")
	 public void f(String name, String email, String setpass) throws InterruptedException {
	  System.out.println(" you have provided your username as:: "+name);
	  	System.out.println("you have provided the email address as:: "+email);
	  System.out.println("your password is: "+setpass);
	  signPage = PageFactory.initElements(setup.driver, SignUppage.class);
	  Assert.assertEquals(signPage.verifyUserNameField(), true); 
		signPage.enterName(name);
		Reporter.log("Verified username field <br>");
		
		Assert.assertEquals(signPage.verifyEmail(), true);
		signPage.enterEmail(email);
		Reporter.log("Verified email field<br>");
		
		Assert.assertEquals(signPage.verifyPass(), true);
		signPage.enterPassword(setpass);
	   Reporter.log("Verified password field <br>");
        
		
		Assert.assertEquals(signPage.verifyOkbutton(), true);
		signPage.okButton();
        Reporter.log("Verified the sign up button <br>");
		
	    Thread.sleep(4000);
	 
	 
//		
////		@Test(dataProvider="getData")
//		
//		
 }

	
//	public void createAccount()
//	{
//		setup.setUp();
//		signPage = PageFactory.initElements(setup.driver, SignUppage.class);
////		@Test(dataProvider="getData")
//		
//		signPage.singUpButton();
//		signPage.enterName("qwertyuioplkjhgfdsazxcvbnm,.");
//		signPage.enterEmail("sa@gmail.com");
//		signPage.enterPassword("sangeethaqwertyuiop");
//		signPage.okButton();
//	
//	
//		
//		
//		
//		
//	}
//	
//	
	
	
	
	

}
