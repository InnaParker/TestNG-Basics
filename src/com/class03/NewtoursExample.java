package com.class03;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class NewtoursExample extends CommonMethods{
	
	@BeforeMethod
	public void setUP()
	{
	setUpDriver("chrome", "http://newtours.demoaut.com/");
	driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
	
	}
	
	@Test
	public void userInformation()
	{
		driver.findElement(By.cssSelector("")).sendKeys("");
	}
	
	@Test (groups = "Regression")
	public void contactInformation ()
	{
		
	}
	
	@Test
	public void mailingInformation ()
	{
		
	}
	@AfterClass 
	public void tearDown()
	{
		driver.close();
	}

}
