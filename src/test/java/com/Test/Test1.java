package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.Library;
import com.pageObject.LoginPOM;

public class Test1 extends BaseClass {
public static LoginPOM login;
	
	@Test()
	public void Loginfb_verify() {
	    login=PageFactory.initElements(driver, LoginPOM.class);
//	    login.getTxt_email().sendKeys("abc@123");
//		login.getTxt_password().sendKeys("12345");
//		login.getButtn().click();
		Library.custom_sendkeys(login.getTxt_email(),"abc@123","email id field");
		Library.custom_sendkeys(login.getTxt_password(), "12345","passwordfield");
		Library.custom_click(login.getButtn(),"buttonfield");
		//verify tital
		String tital=driver.getTitle();//actual result
		System.out.println("tital of page="+tital);
		Assert.assertEquals(tital, "Facebook � log in or sign up");

}
}