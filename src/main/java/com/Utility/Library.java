package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

public class Library {
public static ExtentTest test;
	public static void custom_sendkeys(WebElement element,String value,String fieldname) {
		try {
		element.sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void custom_click(WebElement element,String fieldname) {
		try {
			element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
