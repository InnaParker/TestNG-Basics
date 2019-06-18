package com.class02;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class task1 extends CommonMethods{
	
	/*
	 * 1: OrangeHRM Title Validation
	 * 2: OrangeHRM successful login
	 * Make sure follow annotations @BeforeMethod @Test @AfterMethod
	 */
	
	@BeforeMethod
	public void setUp()
	{
		setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@Test(priority=1)
	public void loginTitle()
	{
		String title = driver.getTitle();
		String expextedTitle="OrangeHRM";
		
		if (title.equals(expextedTitle)) {
			System.out.println("This is the right title");
		}else{
			System.out.println("This is not the right title");
		}
	}
	
	@Test(priority=2)
	public void login()
	{
	sendText(driver.findElement(By.cssSelector("input#txtUsername")), "Admin");
	sendText(driver.findElement(By.cssSelector("input#txtPassword")), "admin123");
	driver.findElement(By.cssSelector("input#btnLogin")).click();
	
	}
	
	
	@AfterMethod
	public void closePage()
	{
		driver.close();
	}

}
