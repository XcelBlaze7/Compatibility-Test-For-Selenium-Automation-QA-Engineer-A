package com.JabaTalks.TestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.JabaTalks.BaseClass.Useable_Classes;
import com.JabaTalks.Utilities.ExcelConfig;
import com.JabaTalks.Utilities.PageObjectModel;

public class TestCases {

	static Logger log = LogManager.getLogger(TestCases.class.getName());
	static WebDriver driver = Useable_Classes.drv();
	static String s[] = new String[10];
	public static ExcelConfig exe = new ExcelConfig();

	@BeforeClass
	public void Open_Browser() throws Exception 
	{
		// Invoking driver
		Useable_Classes.getDriver();

		// Hitting URL
		driver = Useable_Classes.homepage();
	}
	
	//Automation code for JabaTalks HomePage
	@Test(priority=1)
	//Function to validate dropdown values
	public void validateDropdownValues() throws Exception 
	{		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(PageObjectModel.DropdownView).click();
		WebElement dropdownElement_1 = driver.findElement(PageObjectModel.FirstDropdownElement);
		Assert.assertEquals(dropdownElement_1.getText(), "English", "English dropdown value verified");
		
		WebElement dropdownElement_2 = driver.findElement(PageObjectModel.SecondDropdownElement);
		Assert.assertEquals(dropdownElement_2.getText(), "Dutch", "Dutch dropdown value verified");
		
	}
	
	@Test(priority=2)
	//Function to fill up the form fields with values 
	public void formFillup() {
		
		try {
			//Read excel and fetch the data into String array
			s = exe.readExcel();

			//Name element locate
			WebElement nameElement = driver.findElement(PageObjectModel.nameElement);
			nameElement.sendKeys(s[0]);
			
			//OrganizantionName element locate
			WebElement organizationNameElement = driver.findElement(PageObjectModel.organizationNameElement);
			organizationNameElement.sendKeys(s[1]);
			
			//Email element locate
			WebElement emailElement = driver.findElement(PageObjectModel.emailElement);
			emailElement.sendKeys(s[2]);
			
			//Check the Terms&Conditions Checkbox
			driver.findElement(PageObjectModel.checkbox_TermsConditions).click();
			
			//Click on Submit Button
			driver.findElement(PageObjectModel.submitButton).click();
			
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@AfterClass
	public void Close_Browser() 
	{
		//Calls the close browser function
		Useable_Classes.closeBrowser();

	}
	
}
