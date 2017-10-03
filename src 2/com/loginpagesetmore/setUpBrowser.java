package com.loginpagesetmore;

import java.awt.Toolkit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class setUpBrowser {
	
	
	public WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "/Users/sangeetha/Downloads/chromedriver");

	}
	
	@BeforeTest
	public void setUp()
	{
		//To disable the Chrome options
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-infobars");
		//To manage the size of the window using toolkit
		Toolkit tool= Toolkit.getDefaultToolkit();
		int width= (int) tool.getScreenSize().getWidth();
		int height=(int) tool.getScreenSize().getHeight();
		Reporter.log("Launching the Brower <br>");
		
		driver=new ChromeDriver(options);
		//Size specified for the window.
		
		driver.manage().window().setPosition(new Point(0,0));
		driver.manage().window().setSize(new Dimension(width,height));
		Reporter.log("Maximise the browser as per system screen<br>");
		
		//Launch the URL
		driver.get("https://www.setmore.com");
		
		//To get the Title of the page
		String PageTitle = driver.getTitle();
		
		Reporter.log("PageTitle : "+PageTitle+"<br>");
		
		
	}
	
	
//	@AfterTest
//	public void endTest(){
//	driver.quit();


	
	
	}

