package com.bookingpage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.loginpagesetmore.setUpBrowser;
@Test
public class BookingPage {
	
	setUpBrowser setup = new setUpBrowser();
	BookingpageElements bookingelements;

	@Test
	public void bookingPageLaunch()
	{
		setup.setUp();
		bookingelements=PageFactory.initElements(setup.driver,BookingpageElements.class );
		setup.driver.get("https://sangee1.setmore.com/");
//		bookingelements.popUp();
		bookingelements.services();
//		bookingelements.staffs();
//		bookingelements.multipleServices();
//		bookingelements.nextButtonCalendar();
//		bookingelements.selectDate();
//		bookingelements.selectSlots();
//		bookingelements.skipLogin();
	}

}

