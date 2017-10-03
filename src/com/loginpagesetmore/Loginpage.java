package com.loginpagesetmore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	setUpBrowser setup = new setUpBrowser();
	
	static WebDriver driver;
	//First login button
	@FindBy(xpath="//a[@id='button-login']")
	WebElement Loginbutton;
	
	//Enter the user email address
	@FindBy(xpath="//input[@type='text']")
	WebElement Username;
	
	//Enter the user password
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	//Click on sign in button
	@FindBy(xpath="//input[@class='global_btn2_rt signin_btn']")
	WebElement Signupbutton;
	
    //check for the sign out button(man symbol)
	@FindBy(xpath="//a[@class='right_nav_holder-loginid']")
	WebElement clickicon;
	
	//Path for sign out 
	@FindBy(xpath="//h3[text()='Sign Out']")
	WebElement signoutbutton;
	
	//Path for google button
	@FindBy(xpath="//div[@class='google_signin_btn']")
	WebElement googleclick;
	
	//path for googleemail
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement googleemail;
	
	//path for next button
	@FindBy(xpath="//div[@id='identifierNext']")
	WebElement nextbuttonemail;
	
	//path for gmailpassword
	@FindBy(xpath="//input[@name='password']")
	WebElement gmailpassword;
	
	//path for nextbutton after password
	@FindBy(xpath="//div[@id='passwordNext']")
	WebElement nextbuttonpass;
	
	//Click on sign with facebook
	@FindBy(xpath="//div[@class='facebook_signin_btn']")
	WebElement facebookclick;
	
	//path for facebook user name
	@FindBy(xpath="//input[@id='email']")
	WebElement facebookemail;
	
	//path for facebook password
	@FindBy(xpath="//input[@name='pass']")
	WebElement facebookpassword;
	
	//path for facbooklogin
	@FindBy(xpath="//button[@id='loginbutton']")
	WebElement facebookClicklogin;
	
	
	
	public Loginpage(WebDriver driver) {
        setUpBrowser.driver = driver;
        PageFactory.initElements(driver, this); // Initialization all webelements  
    }
	
    // To verify the login button
	public boolean  verifyLoginButton()
	{
		boolean checkLoginButton = Loginbutton.isDisplayed();
		
		return checkLoginButton;
		
	}
	
	public void loginSetmoreButton()
	{
	Loginbutton.click();
	}
	
	
	// To verify the user name text box
		public boolean verifyUserName()
		{
			boolean checkUserName = Username.isDisplayed();
			return checkUserName;
		}
		
   // created method for username		
	public void setUserName(String getfromuser)
	{
     	Username.clear();
		Username.sendKeys(getfromuser);
		
	}

	//To verify the password text box
	
    public boolean verifyPassword()
    {
    	boolean checkUserPassword = Password.isDisplayed();
    	return checkUserPassword;
    }
    //created method for password
	public void setPassword(String getpass)
	{
		Password.clear();
		Password.sendKeys(getpass);
		
	}
	// To verify the sign in button
    public boolean verifySigninButton()
    {
    	boolean checkSignINButton = Signupbutton.isDisplayed();
    	return checkSignINButton;
    }
    //created method for signin button
    public void signInButton()
    {
		Signupbutton.click();
	}
	  //verify the man icon button
	public boolean verifyIconButton()
	{
		boolean checkIconButton=clickicon.isDisplayed();
		return checkIconButton;
	}
	 public void clickIconSymbol(){
		 clickicon.click();
	    }
   //verfiy the singoutbutton under man icon
    public boolean verifySingOutButton(){
    	boolean checkSignOutButton = signoutbutton.isDisplayed();
    	return checkSignOutButton;
    }
    
    //method for click
    public void SignOutSetmore()
    {
  
    	signoutbutton.click();
    }
    //verify the googlelogin click
    public boolean verifyGmailClick(){
    	boolean checkbutton= googleclick.isDisplayed();
		return checkbutton;
    }
    //method for gmail click button
    
    public void signInWithGoogle(){
    	googleclick.click();
    	
    }
    //verfiy the gmail username
    public boolean verfiyGmailUserName(){
    boolean checkGmail = googleemail.isDisplayed();
		
		return checkGmail;
		
    }
   
    //method for gmail user name
     public void setGmailUserName(String getGmailFromUser)
     {
    	 googleemail.sendKeys(getGmailFromUser);
     }
     
     //verfiy gmail next button
     public boolean verifyNextButton(){
    	boolean checkbutton= nextbuttonemail.isDisplayed();
		return checkbutton;
    	 
     }
     //method for gmail next click button after email.
     public void gmailNext()
     {
    	 nextbuttonemail.click();
    	 
     }
     //verify gmail password
     public boolean verifyGmailPassword(){
    	 boolean checkpassowrd=gmailpassword.isDisplayed();
		return checkpassowrd;
    	 
    	 
     }
     //method for password field in gmail
     public void gmailPassword(String getGmailPassword){
    	 gmailpassword.sendKeys(getGmailPassword);
     }
     //verify facebook button
     public boolean verfiyFacebookButton(){
    	boolean checkclickfb=facebookclick.isDisplayed();
		return checkclickfb;	 
     }
     
     //method for facebooklogin
     public void facebookLogin(){
    	 facebookclick.click();
     }
    	 
     
     //verify to get user email for facebook login
     public boolean verifyGetCredentails(){
    	 boolean checkfbemail=facebookemail.isDisplayed();
		return checkfbemail; 
     }
     
     //method to get email
     public void facebookEmail(String getUserEmail){
    	 facebookemail.sendKeys(getUserEmail);
     }
     //verify to get password from user
     public boolean verifyPasswordFb(){
    	 
    	boolean checkfbpassword= facebookpassword.isDisplayed();
		return checkfbpassword;
     }
     //method to get password in fb
     public void facebookPassword(String getPass){
    	 facebookpassword.sendKeys(getPass);
     }
     //verify submitlogin
     public boolean verifyFbLogin(){
    	 boolean checkloginfacebook=facebookClicklogin.isDisplayed();
		return checkloginfacebook;
    	 
     }
     //method for fb login
     public void facebookLoginClick(){
    	 facebookClicklogin.click();
     }
     
     
     
     
    }


	
	
    

