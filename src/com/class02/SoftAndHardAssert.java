package com.class02;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssert {

	
	@Test
	public void soft()
	{
		SoftAssert soft=new SoftAssert();
		System.out.println("Before soft assert");
		
		soft.assertTrue(false);
		System.out.println("After soft assert");
		
	}
	
	@Test
	public void hard()
	{
		System.out.println("Before hard assert");
		
		Assert.assertTrue(false);
		System.out.println("After hard assert");
	}
}
