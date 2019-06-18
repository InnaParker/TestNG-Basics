package com.class03;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsDemo {

	@BeforeGroups ({"Smoke","Regression"})
	public void beforeGroup()
	{
		System.out.println("Before Groups");
	}
	
	
	@Test (groups = "Smoke")
	public void one()
	{
	System.out.println("Test 1");	
	}
	
	@Test (groups = "Regression")
	public void two()
	{
		System.out.println("Test 2");
	}
	
	@Test (groups = "Smoke")
	public void three()
	{
		System.out.println("Test 3");
	}
	
	@Test (groups = "Regression")
	public void four()
	{
		System.out.println("Test 4");
	}
	
	@AfterGroups()
	public void afterGroup()
	{
	System.out.println("After Groups");	
	}
}
