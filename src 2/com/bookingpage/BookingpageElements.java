package com.bookingpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import com.loginpagesetmore.setUpBrowser;

public class BookingpageElements {
//	//First popup 
//	@FindBy(xpath="//a[text()='Okay']")
//	WebElement popup;
	//services
	@FindBy(xpath="//b[text()='Book- Mind set']")
	WebElement service;
	//To select staff
	@FindBy(xpath="//b[text()='sangeetha']")
    WebElement staff;
	//To select more than one service
	@FindBy(xpath="//a[text()='Skip']")
	WebElement skipoption;
	//Got to next month button;
	@FindBy(xpath="//th[@class='datepickerGoNext']")
	WebElement nextarrow;
	//To select date
	@FindBy(xpath="//span[text()='30']")
	WebElement choosedate;
	//To select slots.
	@FindBy(xpath="//a[text()='8:00']")
	WebElement chooseslots;
	//To select login.
	@FindBy(xpath="//div[@class='skip_step']")
	WebElement skiplogin;
	//enter name
	@FindBy(name="firstName")
	WebElement storename;
	//enter email
	@FindBy(name="email")
	WebElement storeemail;
	//enter mobile num
	@FindBy(name="phone_num")
	WebElement storephonenumer;
	//enter address
	@FindBy(name="address")
	WebElement storeaddress;
	//Enter city
	@FindBy(name="city")
	WebElement storecity;
	//Enter state
	@FindBy(name="state")
	WebElement storestate;
	//Enter zip
	@FindBy(name="zip")
	WebElement storezip;
	@FindBy(xpath="//div[@id='cust-continue']")
	WebElement continuebutton;
	
//	//creating a method for popup 
//	public void popUp(){
//		popup.click();
//	}
	//creating a method to click on services
	public void services()
	{
		service.click();
	}
	//creating a method to click on staff
	public void staffs()
	{
		staff.click();
	
	}
	// to choose multiple services
	public void multipleServices(){
		 skipoption.click();
	}
	//next arrown in calendar slots
	public void nextButtonCalendar(){
		nextarrow.click();
	}
	//to select the dates
	public void selectDate(){
		choosedate.click();
	}
	//to check and available time slots
	public void selectSlots(){
		chooseslots.click();
		
	}
	//to skip the login process
	public void skipLogin(){
		skiplogin.click();
	}
	//enter user name
	public void getName(String getfirstname){
		storename.sendKeys(getfirstname);
		
	}
	//enter useremail
	public void getEmail(String getemail){
		storeemail.sendKeys(getemail);
	}
	//enter usernumber
	public void getPhoneNumber(String getphonenum)
	{
		storephonenumer.sendKeys(getphonenum);
	}
	//eneter address details
    public void getAdress(String getaddress)
    {
    	storeaddress.sendKeys(getaddress);
    }
    //enter the address details 
    public void city(String getcity){
    	storecity.sendKeys(getcity);
    }
    public void state(String getstate){
    	storestate.sendKeys(getstate);
    }
	
	public void zip(String getzip){
		storezip.sendKeys(getzip);
	}
	//to click on the continue button
	public void contButoon(){
		continuebutton.click();
		
	}
	
	

}
