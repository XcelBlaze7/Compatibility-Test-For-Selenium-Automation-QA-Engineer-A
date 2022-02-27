package com.JabaTalks.Utilities;

import org.openqa.selenium.By;

public class PageObjectModel {
	
	/*****************Dropdown Elements*****************/
	public static final By DropdownView=(By.id("language"));
	public static final By FirstDropdownElement=(By.xpath("(//*[@class='ng-binding ng-scope'])[3]"));
	public static final By SecondDropdownElement=(By.xpath("(//*[@class='ng-binding ng-scope'])[4]"));
	
	/*****************General Elements*****************/
	public static final By nameElement=(By.id("name"));
	public static final By organizationNameElement=(By.id("orgName"));
	public static final By emailElement=(By.id("singUpEmail"));
	public static final By checkbox_TermsConditions=(By.xpath("//*[@class='ui-checkbox']/span"));
	public static final By submitButton=(By.xpath("//div[@class=\"form-group custom-form-group\"]"));

}
