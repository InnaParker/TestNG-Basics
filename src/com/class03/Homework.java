package com.class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.CommonMethods;

public class Homework extends CommonMethods{

@BeforeClass
    
    public void setUp() {
        setUpDriver("chrome","https://opensource-demo.orangehrmlive.com/");
    }
    
    
    
    @Test
    public void title() {
        final String actual=driver.getTitle();
        final String expected="OrangeHRM";
        Assert.assertTrue(actual.equals(expected), "title is not correct");
        System.out.println("title is correct");
    
    }
    
    @Test(priority=1)
    public void logIn() {
        
        sendText(driver.findElement(By.cssSelector("input#txtUsername")), "Admin");
        sendText(driver.findElement(By.cssSelector("input#txtPassword")), "admin123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
                
        Assert.assertTrue(driver.findElement(By.cssSelector("a#welcome")).isDisplayed(), "User did not logIn");
        System.out.println("User logIn");
    }
    
    
    @Test(priority=2)
    public void addEmployee() {
            
        //boolean pim=driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).isDisplayed();
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).isDisplayed(), "Pim button is not displayed on a page");
        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
        soft.assertAll();
        
    
        soft.assertTrue(driver.findElement(By.cssSelector("input#btnAdd")).isDisplayed());
        driver.findElement(By.cssSelector("input#btnAdd")).click();
        soft.assertAll();
        
        String firstName="John";
        String lastName="Snow";
        
        String ID="0002";
        
        sendText(driver.findElement(By.cssSelector("input#firstName")),firstName);

        sendText(driver.findElement(By.cssSelector("input#lastName")),lastName);
        sendText(driver.findElement(By.cssSelector("input#employeeId")),ID);
        driver.findElement(By.cssSelector("input#btnSave")).click();
        
        String actual=driver.findElement(By.cssSelector("input#personal_txtEmpFirstName")).getText();
        soft.assertSame(firstName, actual);
        System.out.println("firstName match");
                
        actual=driver.findElement(By.cssSelector("input#personal_txtEmpLastName")).getText();
        soft.assertSame(lastName, actual);
        System.out.println("lastName match");
        
        actual=driver.findElement(By.cssSelector("input#personal_txtEmployeeId")).getText();
        soft.assertSame(ID, actual);
        System.out.println("ID match");
        
        
        
    }
    
    @Test(priority=3)
    public void employeeDetailsVerification() {
        String firstName="John";
        String lastName="Smith";
        
        String ID="0002";
        
        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
        driver.findElement(By.cssSelector("a#menu_pim_viewEmployeeList")).click();
        
        List<WebElement>table=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td"));
        
     //   tableCompareEachCell(table, firstName);
     //  tableCompareEachCell(table, lastName);
    
     // tableCompareEachCell(table, ID);
        
    }
        
    
    
    @AfterClass
    
    public void Close() {
        driver.close();
    } 
}
