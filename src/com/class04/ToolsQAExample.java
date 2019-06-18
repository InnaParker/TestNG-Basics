package com.class04;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class ToolsQAExample extends CommonMethods{
	
	@BeforeMethod(alwaysRun=true)
	@DataProvider()
	public Object [] []setupData()
	{
		Object [][] data=new Object[4][3];
		
		data [0][0]="Tim";
		data [0][1]="Jones";
		data [0][2]="00-000";
		
		data [1][0]="Billy";
		data [1][1]="Jones";
		data [1][2]="00-001";
		
		data [2][0]="Will";
		data [2][1]="Smith";
		data [2][2]="00-000";
		
		return data;
	}
	
	@Test(dataProvider="setUpData")
	public void getData(String first, String last, String date)
	{
		findByCSS("input[name='firstname']").sendKeys(first);
		findByCSS("input[name='lastname']").sendKeys(last);
		findByCSS("input[id='datepicker']").sendKeys(date);
		
	}
}
