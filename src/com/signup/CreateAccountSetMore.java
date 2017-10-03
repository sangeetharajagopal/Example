package com.signup;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.signup.NewTest;
import com.loginpagesetmore.setUpBrowser;

@Test
public class CreateAccountSetMore extends NewTest {

	SignUppage signPage;
	setUpBrowser setup = new setUpBrowser();
	
	static
	{
		setUpBrowser.setUp();
	}
	
	@BeforeMethod
	public void signUp() throws InterruptedException {
		
		


		setUpBrowser.driver.get("https://www.setmore.com/");
		signPage = PageFactory.initElements(setUpBrowser.driver, SignUppage.class);

		Assert.assertEquals(signPage.verifyFirstSignup(), true);

		signPage.singUpButton();

		Reporter.log("Verified signup button <br>");
		Thread.sleep(2000);
	}

	@Test(dataProvider = "getData")
	public void f(String name, String email, String setpass) throws InterruptedException {
		System.out.println(" you have provided your username as:: " + name);
		System.out.println("you have provided the email address as:: " + email);
		System.out.println("your password is: " + setpass);

		signPage = PageFactory.initElements(setUpBrowser.driver, SignUppage.class);
		Thread.sleep(2000);

		Assert.assertEquals(signPage.verifyUserNameField(), true);
		signPage.enterName(name);
		Reporter.log("Verified username field <br>");

		Thread.sleep(2000);

		Assert.assertEquals(signPage.verifyEmail(), true);
		signPage.enterEmail(email);
		Reporter.log("Verified email field<br>");

		Thread.sleep(2000);

		Assert.assertEquals(signPage.verifyPass(), true);
		signPage.enterPassword(setpass);
		Reporter.log("Verified password field <br>");

		Thread.sleep(2000);

		Assert.assertEquals(signPage.verifyOkbutton(), true);
		signPage.okButton();
		Reporter.log("Verified the sign up button <br>");

		Thread.sleep(20000);
			
//		
//		if(setup.driver.getCurrentUrl().contains("https://my.setmore.com/calendar#weekly")){
//		setup.driver.quit();
			
	if(setUpBrowser.driver.getCurrentUrl().equals("https://my.setmore.com/calendar#company"))
	{   
		Assert.assertEquals(signPage.verifyinitialSetup(), true);
		signPage.initialSetUp("Beauty");
		Reporter.log("Verified the business name text box");
		
		
	
	Thread.sleep(10000);
		Assert.assertEquals(signPage.verifyIndustry(), true);
		signPage.createIndustry();
		Reporter.log("Verified the industry click");
		
		Thread.sleep(2000);
		
		Assert.assertEquals(signPage.verifyCreateIndustry(), true);
		signPage.clickfromdropdown();
		Reporter.log("Verified the create industry dropdown");
		
		Thread.sleep(2000);
		Assert.assertEquals(signPage.verifyPhoneNumber(), true);
		signPage.businessPhone("12333");
		Reporter.log("Verified the phone number");
		
		Thread.sleep(2000);
		Assert.assertEquals(signPage.VerifyfirstNext(), true);
		signPage.nextbuttonFrist();
		Reporter.log("Verified the next button");
		
		Thread.sleep(3000);
		
		Assert.assertEquals(signPage.verifyTimeZone(), true);
		signPage.selectTimeZoneOption();
		Reporter.log("Verified the click on timezone");
		Thread.sleep(2000);
		
		
		Assert.assertEquals(signPage.verifyArrow(), true);
		signPage.clickArrow1();
		Reporter.log("Verified the arrow on timezone");
		
		Thread.sleep(2000);
		
		Assert.assertEquals(signPage.verifyDropDown(), true);
		signPage.selectdropdown();
		Reporter.log("verified the dropdown");
		Thread.sleep(2000);
		
		Assert.assertEquals(signPage.verifySaveChanges(), true);
		signPage.saveChanges();
		Reporter.log("Verified the save changes button");
		
		Thread.sleep(2000);
		
		Assert.assertEquals(signPage.verifyButton(),true );
		signPage.enableButton();
		Reporter.log("Verified the toggle button");
		
		Thread.sleep(2000);
		
		Assert.assertEquals(signPage.verifySatButton(), true);
		signPage.enableButtonSat();
		Reporter.log("Verified the toggleenable button");
		
		Thread.sleep(2000);
		

		signPage.timeArrowdrop();
		Thread.sleep(3000);
		signPage.clickonTimeTo();
		Thread.sleep(3000);
		signPage.timeArrowdropFrom();
		Thread.sleep(2000);
		signPage.clickonTimeFrom();
		Thread.sleep(3000);
		signPage.timeNext();
		Thread.sleep(3000);
		signPage.addStaff1("newteststaff");
		Thread.sleep(3000);
		signPage.addEmail1("teststaff@gmail.com");
		Thread.sleep(3000);
		signPage.addEnterStaff();
		Thread.sleep(3000);
		signPage.staffNextButton();
		Thread.sleep(3000);
		signPage.createService("facial");
		Thread.sleep(3000);
		signPage.createServiceDuration("20");
		Thread.sleep(3000);
		signPage.createServiceCost("10");
		Thread.sleep(3000);
		signPage.clickonSelectStaff();
		Thread.sleep(1000);
		signPage.clickOnAllStaff();
		Thread.sleep(2000);
        signPage.addServiceStaff();
        Thread.sleep(2000);
	    signPage.lastNextButton();
	    Thread.sleep(2000);
	    signPage.continuedashboard();
	    Thread.sleep(2000);
	    signPage.continueCalendar();
	    Thread.sleep(2000);
	    signPage.continueProfile();
	    Thread.sleep(2000);
	    signPage.continueSettings();
		Thread.sleep(2000);
		signPage.tourlast();
		
		Thread.sleep(7000);
		 Assert.assertEquals(signPage.verifyCalendarlogo(),true);
		 setUpBrowser.driver.quit();
	}
	
	}

	
	
	
	
	
	
	
	
//	 public void createAccount()
//	 {
//	 
//	 signPage = PageFactory.initElements(setup.driver, SignUppage.class);
//	// @Test(dataProvider="getData")
//	
//	 signPage.singUpButton();
//	 signPage.enter("qwertyuioplkjhgfdsazxcvbnm,.");
//	 signPage.enterEmail("sa@gmail.com");
//	 signPage.enterPassword("sangeethaqwertyuiop");
//	 signPage.okButton();

//	 }
	

}
