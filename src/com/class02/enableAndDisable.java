package com.class02;

import org.testng.annotations.Test;

public class enableAndDisable {
	
	@Test(enabled=false)
	public void first() 
	{
		System.out.println("This is first test annotation");
	}
	
	@Test(enabled=true, priority=1)
	public void second() 
	{
		System.out.println("This is second test annotation");
	}
	
	@Test(enabled=false)
	public void third() 
	{
		System.out.println("This is third test annotation");
	}
	
	@Test(enabled=true, priority=2)
	public void fourth() 
	{
		System.out.println("This is fourth test annotation");
	}

}
