package com.AutomateSeleniumEasy.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.AutomationSeleniumEasy.Browser.Base;
import com.AutomationSeleniumEasy.Script.AlertsScript;
import com.AutomationSeleniumEasy.Script.InputFormSubmitScript;

public class AlertsTest extends Base {
	
	AlertsScript alertsscript = null;
	InputFormSubmitScript inputformsubmitscript = null;
	WebDriver driver = null;
	SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void prerequities() {
		
		driver = browserLunch();
		alertsscript = new AlertsScript(driver);
		inputformsubmitscript = new InputFormSubmitScript(driver);
	}
	@Test(enabled = false)
	public void TC001_AlertBox() {
		
		inputformsubmitscript.click_DemoSite();
		inputformsubmitscript.click_CrossMark();
		alertsscript.click_Alert_Modals();
		alertsscript.click_Alert();
		boolean act = alertsscript.click_AlertBox();
		softassert.assertEquals(act, true, "popup is getting failed");
		softassert.assertAll();
		
	}
	@Test(enabled = false)
	public void TC002_ConfirmBox() {
		
		inputformsubmitscript.click_DemoSite();
		inputformsubmitscript.click_CrossMark();
		alertsscript.click_Alert_Modals();
		alertsscript.click_Alert();
		alertsscript.click_ConfirmBox();
		boolean act = alertsscript.click_AlertBox();
		softassert.assertEquals(act, true, "popup is getting failed");
		softassert.assertAll();
		
	}
	@Test(enabled = true)
	public void TC003_PromptBox() {
		
		inputformsubmitscript.click_DemoSite();
		inputformsubmitscript.click_CrossMark();
		alertsscript.click_Alert_Modals();
		alertsscript.click_Alert();
		alertsscript.click_PromptBox();
	}
	
	@AfterMethod
	public void tearDown() {
		
		//browserClose();
	}
	
}
