package com.AutomateSeleniumEasy.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AutomationSeleniumEasy.Browser.Base;
import com.AutomationSeleniumEasy.Script.InputFormSubmitScript;

public class InputFormSubmitTest extends Base{
	
	InputFormSubmitScript inputformsubmitscript = null;
	
	@BeforeTest
	public void prerequsities_BrowserLunch() {
		
		driver = browserLunch();
		
		inputformsubmitscript = new InputFormSubmitScript(driver);		
	}
	
	@Test
	public void TC_001_InputFOrmSubmit() {
		
		inputformsubmitscript.click_DemoSite();
		inputformsubmitscript.click_CrossMark();
		inputformsubmitscript.click_InputForms();
		inputformsubmitscript.click_InputFOrmSubmit();
		inputformsubmitscript.click_InputFormSubmit_FirstName();
		inputformsubmitscript.click_InputFormSubmit_LastName();
		inputformsubmitscript.click_InputFormSubmit_Email();
		inputformsubmitscript.click_InputFormSubmit_Phone();
		inputformsubmitscript.click_InputFormSubmit_Address();
		inputformsubmitscript.click_IputFormSubmit_City();
		inputformsubmitscript.click_InputFormSubmit_State();
		inputformsubmitscript.click_InputFormSubmit_Zip();
		inputformsubmitscript.click_InputFormsubmit_Radio();
		boolean actual = inputformsubmitscript.click_InputFormSubmit_Button();
		
		Assert.assertEquals(actual, true, "form is not validate");
		
		Thread.currentThread().getId();
		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		//browserClose();
	}

}
