package com.bookingpage;


import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.loginpagesetmore.setUpBrowser;

@Test
public class BookingPage {

	BookingpageElements bookingelements;

	@Test
	public void bookingPageLaunch() throws Throwable {
		setUpBrowser.setUp();
		bookingelements = PageFactory.initElements(setUpBrowser.driver, BookingpageElements.class);
		setUpBrowser.driver.get("https://sangee1.setmore.com/");

		Thread.sleep(10000);

		Random random = new Random();

	    int selectRandomService =1+ random.nextInt(bookingelements.service.size());

		System.out.println("//ul[@class='last']/li" + "[" + selectRandomService + "]/div/b");
		setUpBrowser.driver.findElement(By.xpath("//ul[@class='last']/li" + "[" + selectRandomService + "]/div/b"))
					.click();

		int selectRandomStaff =1+ random.nextInt(bookingelements.staff.size());

			System.out.println("//li[@class='last'][" + selectRandomStaff + "]/div/b");
			setUpBrowser.driver.findElement(By.xpath("//li[@class='last'][" + selectRandomStaff + "]/div/b")).click();

		

			
		
		
		
		

		Thread.sleep(4000);

		bookingelements.multipleServices();
		Thread.sleep(4000);

//		bookingelements.nextButtonCalendar();
//		Thread.sleep(4000);

		bookingelements.selectDate();
		Thread.sleep(4000);

		//bookingelements.selectSlots();
		
		
		if(setUpBrowser.driver.findElements(By.xpath("//div[@id='timesheet']/ul[1]/li[2]")).size() != 0)
		{
			System.out.println("morning");
			bookingelements.selectSlots();
			
		}
		else if(setUpBrowser.driver.findElements(By.xpath("//div[@id='timesheet']/ul[2]/li[2]")).size() != 0)
		{
			System.out.println("afternoon");
			bookingelements.selectSlots();

		}
		else if(setUpBrowser.driver.findElements(By.xpath("//div[@id='timesheet']/ul[3]/li[2]")).size() != 0)
		{
			System.out.println("evening");
			bookingelements.selectSlots();

		}
		else{
			System.out.println("No slots available");
		}
			
		Thread.sleep(4000);

		bookingelements.skipLogin();
		Thread.sleep(4000);

		bookingelements.getName("sangeetha");
		// System.out.println("My name is:"+getfirstname);

		Thread.sleep(4000);
		bookingelements.getEmail("sangee234@gmail.com");
		// System.out.println("My name is:"+getfirstname);
		Thread.sleep(4000);
		bookingelements.getPhoneNumber("123456789");
		Thread.sleep(4000);
		bookingelements.getAdress("No:21cross street avadi");
		Thread.sleep(4000);

		bookingelements.city("chennai");
		Thread.sleep(4000);

		bookingelements.state("TN");
		Thread.sleep(4000);

		bookingelements.zip("1234567");
		Thread.sleep(3000);
		bookingelements.contButon();
		bookingelements.confirmappointments();

	}

}
