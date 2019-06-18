package com.class03;

import org.testng.annotations.Test;

public class DependsOnMethods {

	
	@Test
	public void one ()
	{
		System.out.println("Test one");
	}
	
	@Test (dependsOnMethods = "one")
	public void two ()
	{
		System.out.println("Test two");
	}
	
	@Test (dependsOnMethods = "two")
	public void three ()
	{
		System.out.println("Test three");
	}
	
}
