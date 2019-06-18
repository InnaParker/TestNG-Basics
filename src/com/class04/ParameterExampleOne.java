package com.class04;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class ParameterExampleOne {
	
//	@Parameters({"userName1","userName3","userName2"})
	@Test
	public void userNames(String user1, String user2, String user3) {
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
	}
	

}
