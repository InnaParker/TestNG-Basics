package com.class02;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.CommonMethods;

public class SoftAndHardAssertDemo extends CommonMethods{
	
	@BeforeClass
	public void setUp()
	{
		setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void login()
	{
		String title = driver.getTitle();
		String expextedTitle="OrangeHRM";
		
	//	Assert.assertEquals(title, expextedTitle);
	//	System.out.println("After hard assert");
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(title, expextedTitle);
		System.out.println("After soft assert");
	}
	
	@Test
	public void logo()
	{
	boolean logo=driver.findElement(By.xpath("//img[contains(@src,'logo.png')]")).isDisplayed();
	SoftAssert soft2=new SoftAssert();
	soft2.assertTrue(logo);
	System.out.println("Soft assert");
	
//	Assert.assertTrue(logo);
//	System.out.println("After hard assert");
	}

}
