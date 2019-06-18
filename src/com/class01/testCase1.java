package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class testCase1 extends CommonMethods{
	/*
	 * TC 1: Swag Lab Title and Login Verification. 
	 * @ BeforeMethod should contain navigation to the URL and title verification. 
	 * @ Test should contain steps to login and “Product” word verification. 
	 * @ AfterMethod should logOut from the application and close the browser
	 */
	

	@BeforeMethod
	public void setUP()
	{
		setUpDriver("chrome", "https://www.saucedemo.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		String expextedTitle="Swag Labs";
		if (title.equalsIgnoreCase(expextedTitle)) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct");
		}
		
	}
	
	@Test
	public void login()
	{
		WebElement login=driver.findElement(By.cssSelector("input[id='user-name']"));
		
		sendText(driver.findElement(By.id("password")), "secret_sauce");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		String expectedText="Products";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(""), "Products"));
		
		WebElement text=driver.findElement(By.xpath("//div[text()='Products']"));
		
		if (text.getText().equalsIgnoreCase(expectedText)) {
			System.out.println(expectedText+ "is present");
			
		} else {
			System.out.println(expectedText+" is not present");
		}
	}
	
	@AfterMethod
	public void close()
	{
		String logoutButton="//button[text()='Open Menu']";
		driver.findElement(By.xpath(logoutButton)).click();
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		driver.findElement(By.linkText("Logout")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("")));
		
		
		driver.close();
	}
}
