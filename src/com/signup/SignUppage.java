package com.signup;

import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.loginpagesetmore.setUpBrowser;

public class SignUppage {

	setUpBrowser setup = new setUpBrowser();

	// static WebDriver driver;
	// First signup button
	@FindBy(xpath = "//a[@id='button-signup']")
	WebElement signup;
	// name field
	@FindBy(xpath = "//input[@id='name']")
	WebElement name;
	// email field
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	// password field
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	// signup for free button
	@FindBy(xpath = "//a[@id='signup-now']")
	WebElement signUpFree;

	@FindBy(xpath = "//input[@id='setup-companyname']")
	WebElement businessname;
	@FindBy(xpath = "//input[@id='industry-type']")
	WebElement industry;
	// To choose the drop down in industry
	@FindBy(xpath = "//ul[@id='industry-types-list']/li[1]")
	WebElement selectFirst;

	@FindBy(xpath = "//input[@id='setup-phoneNo']")
	WebElement businessnumber;

	@FindBy(xpath = "//button[@id='setup-welcome-continue']")
	WebElement nextbutton;

	@FindBy(xpath = "//a[@class='setup-timezone']")
	WebElement clicktimezone;

	@FindBy(xpath = "//span[@class='icon-angle-down pull-right']")
	WebElement clickarrow;

	@FindBy(xpath = "//ul[@class='dropdown-menu currencyUL timezoneUL']/li[2]")
	WebElement selectarrow;
	@FindBy(xpath = "//button[contains(text(),' Save Changes ')]")
	WebElement savechangesbutton;

	@FindBy(xpath = "//li[@id='setup-business-we']/span[2]/div/span[contains(text(), ' ON ')]")
	WebElement togglebuttonwedon;

	@FindBy(xpath = "//li[@id='setup-business-we']/span[2]/div/span[contains(text(), ' OFF')]")
	WebElement disabletogglebuttweoff;

	@FindBy(xpath = "//li[@id='setup-business-sa']/span[2]/div/span[contains(text(), ' ON')]")
	WebElement enabletogglebuttonsat;

	@FindBy(xpath = "//li[@id='setup-business-sa']/span[2]/div/span[contains(text(), ' OFF')]")
	WebElement disabletogglebuttonsat;

	@FindBy(xpath = "//li[@id='setup-business-sa']/div[1]/div[1]/a/span[@class='icon-angle-down']")
	WebElement changeslotsTo;

	@FindBy(xpath = "//li[@id='setup-business-sa']/div[@class='business-hours-drpdwn-holder fl']/div[1]/ul[@class='dropdown-menu']/li[8]")
	WebElement saturdaydropdownfromchange;

	@FindBy(xpath = "//li[@id='setup-business-sa']/div[1]/div[2]/a/span[@class='icon-angle-down']")
	WebElement changefromslots;

	@FindBy(xpath = "//li[@id='setup-business-sa']/div[@class='business-hours-drpdwn-holder fl']/div[2]/ul[@class='dropdown-menu']/li[20]")
	WebElement staurdaydropdowntochange;

	@FindBy(xpath = "//button[@id='setup-hours-continue']")
	WebElement nextbusinesbutton;
	// Add staff setup
	@FindBy(xpath = "//input[@id='setup-staffname']")
	WebElement staffname;

	@FindBy(xpath = "//input[@id='setup-staffemail']")
	WebElement staffemail;

	@FindBy(xpath = "//button[@id='setupAddNewStaff']")
	WebElement addbutton;

	@FindBy(xpath = "//button[@id='setup-staff-continue']")
	WebElement thridnextbutton;

	// Add service details
	@FindBy(xpath = "//input[@id='setup-service-name']")
	WebElement addservice;

	@FindBy(xpath = "//input[@id='setup-service-duration']")
	WebElement serviceduration;

	@FindBy(xpath = "//input[@id='setup-service-cost']")
	WebElement servicecost;

	@FindBy(xpath = ".//div[@id='setup-service-staff']")
	WebElement selectstaffdropdown;

	@FindBy(xpath = "//div[@class='staff-select-dropdown']/ul/li[2]/input[contains(@class, 'staff-list-item')]")
	WebElement clickonstaffdropdownbox;

	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement addbuttonstaff;

	@FindBy(xpath = "//button[@id='setup-service-continue']")
	WebElement nextbuttoncontinue;

	@FindBy(xpath = "//a[@class='button button-green tourcalendar']")
	WebElement dashboardcontinue;

	@FindBy(xpath = "//a[@class='button button-green tourcustomer']")
	WebElement calendarcontinue;
	@FindBy(xpath = "//a[@class='button button-green tourprofile']")
	WebElement profilecontinue;
	@FindBy(xpath = "//a[@class='button button-green toursettings']")
	WebElement settingscontinue;
	@FindBy(xpath = "//a[@class='button button-green tourend']")
	WebElement endtour;
	@FindBy(xpath="//*[@id='headerNav']/h1")
	WebElement verifycalendar;
	
	// verfiy the signup button
	public boolean verifyFirstSignup() {
		boolean checkfirst = signup.isDisplayed();
		return checkfirst;

	}

	// method for the initial login page
	public void singUpButton() {
		signup.click();
	}

	// verify username
	public boolean verifyUserNameField() {
		boolean checkusername = name.isDisplayed();
		return checkusername;
	}

	// method to get user name
	public void enterName(String getname) {
		name.clear();
		name.sendKeys(getname);
	}

	// verify the email field
	public boolean verifyEmail() {
		boolean checkemail = email.isDisplayed();
		return checkemail;

	}

	// method to get email
	public void enterEmail(String getemail) {
		email.clear();
		email.sendKeys(getemail);
	}

	// verify the password field
	public boolean verifyPass() {
		boolean checkgetpass = password.isDisplayed();
		return checkgetpass;

	}

	// method to get userpassword from user
	public void enterPassword(String getpassword) {
		password.clear();
		password.sendKeys(getpassword);
	}

	// verify the ok button
	public boolean verifyOkbutton() {
		boolean checksignupbutton = signUpFree.isDisplayed();
		return checksignupbutton;
	}

	// method to click okbuton
	public void okButton() {
		signUpFree.click();
	}

	// to verify the initial setup
	public boolean verifyinitialSetup() {
		boolean checkinitialsetup = businessname.isDisplayed();
		return checkinitialsetup;
	}

	// Method to click on bussiness
	public void initialSetUp(String getbussiness) {
		businessname.sendKeys(getbussiness);
	}

	// to verify the createIndustry()
	public boolean verifyIndustry() {
		boolean checkindustry = industry.isDisplayed();
		return checkindustry;
	}

	// Method to click on create industry
	public void createIndustry() {
		industry.click();
	}

	// to verify the industry dropdown
	public boolean verifyCreateIndustry() {
		boolean checkselectfirst = selectFirst.isDisplayed();
		return checkselectfirst;
	}

	// Method to select from dropdown
	public void clickfromdropdown() {
		selectFirst.click();

	}

	// To verify the buinsessmobile num
	public boolean verifyPhoneNumber() {
		boolean checknumber = businessnumber.isDisplayed();
		return checknumber;

	}

	// Mtehod to send the mobile numbers
	public void businessPhone(String getbuinessnumber) {
		businessnumber.sendKeys(getbuinessnumber);
	}

	// verify the firstnext button
	public boolean VerifyfirstNext() {
		boolean checkfirstbutton = nextbutton.isDisplayed();
		return checkfirstbutton;
	}

	// Method to click on next button
	public void nextbuttonFrist() {
		nextbutton.click();

	}

	// verify the time zone option
	public boolean verifyTimeZone() {
		boolean checktimezone = clicktimezone.isDisplayed();
		return checktimezone;
	}

	// Method to click on time zone
	public void selectTimeZoneOption() {
		clicktimezone.click();
	}

	// verify the arrow in timezone option
	public boolean verifyArrow() {
		boolean checkarrow = clickarrow.isDisplayed();
		return checkarrow;

	}

	// Method to click on the arrow on time zone
	public void clickArrow1() {
		clickarrow.click();
	}

	// verify the drop down in the time zone
	public boolean verifyDropDown() {
		boolean checkdropdowntimezone = selectarrow.isDisplayed();
		return checkdropdowntimezone;
	}

	// Method to click on the dropdown
	public void selectdropdown() {
		selectarrow.click();
	}

	// verify the save changes button
	public boolean verifySaveChanges() {
		boolean checksavechanges = savechangesbutton.isDisplayed();
		return checksavechanges;
	}

	// method to click on savechanges
	public void saveChanges() {
		savechangesbutton.click();
	}

	// verify the enable button in working hours
	public boolean verifyButton() {
		boolean checkenablebutton = togglebuttonwedon.isDisplayed();
		return checkenablebutton;

	}

	// Method to disaable the butotn
	public void enableButton() {
		togglebuttonwedon.click();
	}

	// verify the button on saturday
	public boolean verifySatButton() {
		boolean checksatbutton = disabletogglebuttonsat.isDisplayed();
		return checksatbutton;
	}

	// Method to enable the button on saturday
	public void enableButtonSat() {
		disabletogglebuttonsat.click();
	}

	// verify the arrow on time
	public boolean verifytimeArrow() {
		boolean checktimearrow = changeslotsTo.isDisplayed();
		return checktimearrow;
	}

	// Method to click on the arrow
	public void timeArrowdrop() {
		changeslotsTo.click();
	}

	// verify the time on the dropdown
	public boolean verifyclickOnTime() {
		boolean checksaturdaytime = saturdaydropdownfromchange.isDisplayed();
		return checksaturdaytime;
	}

	// Method to select the time from dropdown
	public void clickonTimeTo() {
		saturdaydropdownfromchange.click();
	}

	// verify the drop to click on the arrow drop
	public boolean verifytimearrowdropdown() {
		boolean checkfromtime = changefromslots.isDisplayed();
		return checkfromtime;
	}

	// Method to click arrow on from box
	public void timeArrowdropFrom() {
		changefromslots.click();
	}

	public boolean verifypickslots() {
		boolean checkpickslots = staurdaydropdowntochange.isDisplayed();
		return checkpickslots;
	}

	// Method to click time on dropdown
	public void clickonTimeFrom() {
		staurdaydropdowntochange.click();
	}

	// verify the timezone next button
	public boolean verifytimeNext() {
		boolean checknexttimezonebutton = nextbusinesbutton.isDisplayed();
		return checknexttimezonebutton;
	}

	// Method to click on next button
	public void timeNext() {
		nextbusinesbutton.click();
	}

	// verify the staffname textbox
	public boolean verifyaddStaff() {
		boolean checkaddstaff = staffname.isDisplayed();
		return checkaddstaff;
	}

	// Method to add staff
	public void addStaff1(String staffone) {
		staffname.sendKeys(staffone);
	}

	// verify the staffemail text field
	public boolean verifyStaffEmail() {
		boolean checkstaffemail = staffemail.isDisplayed();
		return checkstaffemail;
	}

	// Method to add staff email
	public void addEmail1(String staffemailone) {
		staffemail.sendKeys(staffemailone);
	}

	// verify the add button on staff tab
	public boolean verfiyAddButton() {
		boolean checkaddbutton = addbutton.isDisplayed();
		return checkaddbutton;
	}

	// Method to click on add button
	public void addEnterStaff() {
		addbutton.click();
	}
	// verify the next button
	public boolean thirdNextButton(){
		boolean checkthridnextbutton=thridnextbutton.isDisplayed();
		return checkthridnextbutton;
	}

	// Method to click on the third staff button
	public void staffNextButton() {
		thridnextbutton.click();
	}
	//verify the service text box tab
	public boolean verifyServiceTextbox(){
		boolean checkservicebox=addservice.isDisplayed();
		return checkservicebox;
	}
    // Method to click on service text box
	public void createService(String servicename) {
		addservice.sendKeys(servicename);
	}
	//verify the service duration method
	public boolean verifyServiceDuration(){
		boolean checkserviceduration=serviceduration.isDisplayed();
		return checkserviceduration;
	}
	

     //Method to create service duration
	public void createServiceDuration(String serviceduration1) {
		serviceduration.sendKeys(serviceduration1);
	}
     //verify the service cost
	public boolean verifyServiceCost(){
		boolean checkservicecost=servicecost.isDisplayed();
		return checkservicecost;
	}
	//Method to create service cost
	public void createServiceCost(String getcost) {
		servicecost.sendKeys(getcost);
	}
	//verify the slect staff dropdown
	public boolean verifySelectStaff(){
		boolean checkstaffdropdown=selectstaffdropdown.isDisplayed();
		return checkstaffdropdown;
	}
//Method to click on staff arrow
	public void clickonSelectStaff() {
		selectstaffdropdown.click();
	}
//Method to check on staff
	public void clickOnAllStaff() {
		clickonstaffdropdownbox.click();

	}
	//verify the adddetials button
	public boolean verifyServiceStaff(){
		boolean checkverifyaddbutton=addbuttonstaff.isDisplayed();
		return checkverifyaddbutton;
	}
 // Method to add all created staff
	public void addServiceStaff() {
		addbuttonstaff.click();
	}
   //verify the lastnextbutton
	public boolean verifylastNextButton(){
		 boolean checknextbuttonlast=nextbuttoncontinue.isDisplayed();
		return checknextbuttonlast;
	}
	//Method to click on next button
	public void lastNextButton() {
		nextbuttoncontinue.click();
	}
	//verify the continue button
	public boolean verifydashboardButton(){
		boolean checkdashboard=dashboardcontinue.isDisplayed();
		return checkdashboard;
	}
//Method to click dashboard continue
	public void continuedashboard() {
		dashboardcontinue.click();
	}
	//verify the calendar continue button
	public boolean verifycalendarButton(){
		boolean checkcalendarcontinuebutton=calendarcontinue.isDisplayed();
		return checkcalendarcontinuebutton;
		   
	}
    // Method to click on continue button
	public void continueCalendar() {
		calendarcontinue.click();
	}
	//verify the profile
	public boolean verifyProfile(){
		boolean checkprofilebutton=profilecontinue.isDisplayed();
		return checkprofilebutton;
		
	}
    // Method to click on profile button
	public void continueProfile() {
		profilecontinue.click();
	}
  // verify the settings button
	public boolean verifySettingsButton(){
		boolean checkverifybutton=settingscontinue.isDisplayed();
		return checkverifybutton;
	}
	//Method to click on continue button
	public void continueSettings() {
		settingscontinue.click();
	}
  //Verify the end button
	public boolean verifyEndButton(){
		boolean checkendbutton=endtour.isDisplayed();
		return checkendbutton;
	}
	// Method to click on the lastbutton
	public void tourlast() {
		endtour.click();
	}
	//verify the setmore logo button
	public boolean verifyCalendarlogo(){
		boolean checklogo=verifycalendar.isDisplayed();
		return checklogo;
	}
	
	;
//		
//	}

}
