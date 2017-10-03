          package com.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.loginpagesetmore.setUpBrowser;

public class SignUppage {
      
	setUpBrowser setup = new setUpBrowser();

	
	//static WebDriver driver;
      //First signup button
      @FindBy(xpath="//a[@id='button-signup']")
      WebElement signup;
      //name field
      @FindBy(xpath="//input[@id='name']")
      WebElement name;
      //email field
      @FindBy(xpath="//input[@id='email']")
      WebElement email;
      //password field
      @FindBy(xpath="//input[@id='password']")
      WebElement password;
      //signup for free button
      @FindBy(xpath="//a[@id='signup-now']")
      WebElement signUpFree;
//      @FindBy(xpath="//input[@class='capitalize']")
//      WebElement businessname;
//      @FindBy(xpath="//input[@id='industry-type']")
//      WebElement industry;
//     // To choose the drop down in industry
//      @FindBy(xpath="//li[contains(text(),'Other')]")
//      WebElement other;
//      @FindBy(xpath="//input[@id='setup-phoneNo']")
//      WebElement businessnumber;
//      @FindBy(xpath="//button[@id='setup-welcome-continue']")
//       WebElement nextbutton;
//      // next page set businees hours.
//      // To choose time zone.
//      @FindBy(xpath= "//a[@class='setup-timezone']")
//      WebElement timezone;
//      @FindBy(xpath="//a[@class='btn dropdown-toggle timezoneContainValue']")
//      WebElement timezoneclick;
//      @FindBy(xpath="//a[text()='(GMT -10:00) Hawaii Time - Honolulu']")
//      WebElement selectTimeZone;
//      @FindBy(xpath="//button[text()=' Save Changes ']")
//      WebElement clickNextButton;
//      
     
      

      //verfiy the signup button
      public boolean verifyFirstSignup(){
    	  boolean checkfirst=signup.isDisplayed();
		return checkfirst;
    	  
      }
      //method for the initial login page
     public void singUpButton(){
    	 signup.click();
     }
     //verify username
     public boolean verifyUserNameField(){
    	 boolean checkusername= name.isDisplayed();
		return checkusername;
     }
     //method to get user name
     public void enterName(String getname){
    	 name.clear();
    	 name.sendKeys(getname);
     }
     //verify the email field
     public boolean verifyEmail(){
    	 boolean checkemail=email.isDisplayed();
		return checkemail;
    	 
     }
     //method to get email 
     public void enterEmail(String getemail){
    	 email.clear();
    	 email.sendKeys(getemail);
    	 
     }
     //verify the password field
     public boolean verifyPass(){
    	 boolean checkgetpass=password.isDisplayed();
		return checkgetpass;
    	 
     }
     //method to get userpassword from user
      public void enterPassword(String getpassword){
    	  password.clear();
    	 password.sendKeys(getpassword);
      }
      //verify the ok button
      public boolean verifyOkbutton(){
    	  boolean checksignupbutton=signUpFree.isDisplayed();
		return checksignupbutton;
      }
      //method to click okbuton
      public void okButton(){
    	  signUpFree.click();
      }
//      public void initialSetUp(String getbussiness){
//    	  businessname.sendKeys(getbussiness);
//      }
//      public void createIndustry(){
//    	  industry.click();
//      }
//      public void businessPhone(String getbuinessnumber){
//    	  businessnumber.sendKeys(getbuinessnumber);
//    	  
//      }
      
      }
    
      
     
      
    