package com.class03;

import org.testng.annotations.Test;

public class DependsOnGroups {

	@Test (groups = "Smoke1")
	public void one ()
	{
		System.out.println("Test one");
	}
	
	@Test (groups = "Smoke2", dependsOnMethods = "Smoke1")
	public void two ()
	{
		System.out.println("Test two");
	}
	
	@Test (groups = "Smoke3", dependsOnMethods = "Smoke2")
	public void three ()
	{
		System.out.println("Test three");
	}
	
}
