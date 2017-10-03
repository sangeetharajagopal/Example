package com.loginpagesetmore;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.media.sound.InvalidFormatException;

public class ValidationLoginPage {
    //Object creation to read from file
	FileHandle file = new FileHandle();
	//object to access all webelements 
	Loginpage page;
	//launching browser
	setUpBrowser setup = new setUpBrowser();
	
	@BeforeTest
	public void initObject()
	{
		setup.setUp();
	}
	

	@Test(priority = 0)
	public void verifyElement() throws InterruptedException, InvalidFormatException, IOException {
		// get all elements from login page

		
		page = PageFactory.initElements(setup.driver, Loginpage.class);

		Reporter.log("Going to verify the login button<br>");

		Assert.assertEquals(page.verifyLoginButton(), true);

		Reporter.log("Verified login button <br>");

		page.loginSetmoreButton();
		
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void verifyAndValidLoginPage() throws InvalidFormatException, IOException, InterruptedException {

		page = PageFactory.initElements(setup.driver, Loginpage.class);

		Assert.assertEquals(page.verifyUserName(), true);
		Reporter.log("Verified username textbox <br>");

		Assert.assertEquals(page.verifyPassword(), true);
		Reporter.log("Verified password textbox <br>");

		Assert.assertEquals(page.verifySigninButton(), true);
		Reporter.log("verified signup button  <br>");

		file.testValue();

		for (int index = 21; index < file.testData.size(); index++) {

			page.setUserName(file.testData.get(index));
			Reporter.log("Passing the userName:"+"<b>"+file.testData.get(index)+"</b><br>");

			index = ++index;
			page.setPassword(file.testData.get(index));
			Reporter.log("Passing the userName:"+"<b>"+file.testData.get(index)+"</b><br>");
			page.signInButton();
			Thread.sleep(5000);
			if(setup.driver.findElements(By.xpath("//*[@id='headerNav']/h1")).size() != 0)
			{
				Thread.sleep(4000);
				//Assert.assertEquals(page.verifyIconButton(), true);
				//Reporter.log("verified the icon <br>");
				page.clickIconSymbol();
				page.SignOutSetmore();
				String logoutURL = setup.driver.getCurrentUrl();
				Assert.assertEquals(logoutURL, "https://my.setmore.com/logout.do");
				Reporter.log("successfull logout <br>");
				
			}

		}
			
			


		

		
	}
//	Assert.assertEquals(page.verifyGmailClick(), true);
//	Reporter.log("Verified loginwith goole <br>");
//
//	Assert.assertEquals(page.verfiyGmailUserName(), true);
//	Reporter.log("Verified gmail username <br>");
//
//	Assert.assertEquals(page.verifyNextButton(), true);
//	Reporter.log("verified next button  <br>");
//	
//	
	
	@Test(priority = 2)
	public void fbGoogleScenario() throws InterruptedException
	{
		
		//setup.setUpBrowser();
		page = PageFactory.initElements(setup.driver, Loginpage.class);
		//page.loginSetmoreButton();
		
		Assert.assertEquals(page.verifyGmailClick(), true);
		page.signInWithGoogle();
		Reporter.log("Verified loginwith goole <br>");
		
		
		
		Assert.assertEquals(page.verfiyGmailUserName(), true);
		page.setGmailUserName("sangeetha.gopal@a-cti.com");
		Reporter.log("Verified gmail username <br>");
		
		
		Thread.sleep(2000);
		Assert.assertEquals(page.verifyNextButton(), true);
		page.gmailNext();
        Reporter.log("verified next button  <br>");
        Thread.sleep(2000);
        Assert.assertEquals(page.verifyGmailPassword(), true);
		page.gmailPassword("Sangee@vike");
		Reporter.log("verified the gmail password <br>");
		Thread.sleep(2000);
	
		page.nextbuttonpass.click();
		
		
		Thread.sleep(25000);
		
//		WebDriverWait wait = new WebDriverWait(setup.driver, 600000);

		//wait.until(ExpectedConditions.invisibilityOfElementLocated());
		
		
		page.clickIconSymbol();
		//page.clickIconSymbol();
		Thread.sleep(2000);
        page.SignOutSetmore();
		Thread.sleep(3000);
		
		
		
		Assert.assertEquals(page.verfiyFacebookButton(), true);
		page.facebookLogin();
		Reporter.log("Verified the login with facebook button <br>");
		
		
		
		Assert.assertEquals(page.verifyGetCredentails(), true);
		page.facebookEmail("sangeetha.gopal@a-cti.com");
		Reporter.log("Verified facebook email fiel <br>");
		
		Assert.assertEquals(page.verifyPasswordFb(), true);
		page. facebookPassword("sangeesasi");
		Reporter.log("Verified facebook password field <br>");
		
		Assert.assertEquals(page.verifyFbLogin(), true);
		page.facebookLoginClick();
	    Reporter.log("successful login through fb <br>");
		
		Thread.sleep(20000);
		page.clickIconSymbol();
		Thread.sleep(2000);
		page.SignOutSetmore();
		
		Thread.sleep(2000);
		//setup.driver.get("file:///Users/sangeetha/Documents/workspace/PageFactory/test-output/index.html");
		//setup.driver.navigate().to(setup.driver.getCurrentUrl());
		
		
	}

	
	

}
