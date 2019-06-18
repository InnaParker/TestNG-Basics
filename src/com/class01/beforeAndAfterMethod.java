package com.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeAndAfterMethod {
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void testMethodOne() 
	{
		System.out.println("TestMethodOne");
	}
	
	@Test
	public void testMethodTwo()
	{
		System.out.println("TestMethodTwo");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}

}
