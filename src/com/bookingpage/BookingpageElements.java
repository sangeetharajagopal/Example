package com.bookingpage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

//import com.loginpagesetmore.setUpBrowser;

public class BookingpageElements {
	// //First popup
	// @FindBy(xpath="//a[text()='Okay']")
	// WebElement popup;
	// services
	@FindBy(xpath = "//ul[@class='last']/li")
	List<WebElement> service;
	// To select staff
	@FindBy(xpath = "//b[text()='sangeetha']")
	List<WebElement> staff;
	// To select more than one service
	@FindBy(xpath = "//a[text()='Skip']")
	WebElement skipoption;
	// Got to next month button;
	@FindBy(xpath = "//th[@class='datepickerGoNext']")
	WebElement nextarrow;
	// To select date
	@FindBy(xpath = "//tbody[@class='datepickerDays']/tr[4]/td[2]")
	WebElement choosedate;
	// To select slots.
	@FindBy(xpath = "//div[@id='timesheet']/ul[1]/li[2]")
	WebElement chooseslots;
	// To select login.
	@FindBy(xpath = "//div[@class='skip_step']")
	WebElement skiplogin;
	// enter name
	@FindBy(id = "cust-IName")
	WebElement storename;
	// enter email
	@FindBy(id = "cust-IEmailId")
	WebElement storeemail;
	// enter mobile num
	@FindBy(id = "cust-PhoneNo")
	WebElement storephonenumer;
	// enter address
	@FindBy(id = "cust-Address")
	WebElement storeaddress;
	// Enter city
	@FindBy(id = "cust-City")
	WebElement storecity;
	// Enter state
	@FindBy(id = "cust-State")
	WebElement storestate;
	// Enter zip
	@FindBy(id = "cust-Zip")
	WebElement storezip;
	@FindBy(xpath = "//div[@id='cust-continue']")
	WebElement continuebutton;
	@FindBy(xpath="//span[@class='global_btn2_rt']")
	WebElement bookappointment;

	

	// to choose multiple services
	public void multipleServices() {
		skipoption.click();
	}

	// next arrown in calendar slots
	public void nextButtonCalendar() {
		nextarrow.click();
	}

	// to select the dates
	public void selectDate() {
		choosedate.click();
	}

	// to check and available time slots
	public void selectSlots() {
		chooseslots.click();

	}

	// to skip the login process
	public void skipLogin() {
		skiplogin.click();
	}

	// enter user name
	public void getName(String getfirstname) {
		storename.sendKeys(getfirstname);

	}

	// enter useremail
	public void getEmail(String getemail) {
		storeemail.sendKeys(getemail);
	}

	// enter usernumber
	public void getPhoneNumber(String getphonenum) {
		storephonenumer.sendKeys(getphonenum);
	}

	// eneter address details
	public void getAdress(String getaddress) {
		storeaddress.sendKeys(getaddress);
	}

	// enter the address details
	public void city(String getcity) {
		storecity.sendKeys(getcity);
	}

	public void state(String getstate) {
		storestate.sendKeys(getstate);
	}

	public void zip(String getzip) {
		storezip.sendKeys(getzip);
	}

	// to click on the continue button
	public void contButon() {
		continuebutton.click();
		

	}
	public void confirmappointments(){
		bookappointment.click();
		
	}

}
