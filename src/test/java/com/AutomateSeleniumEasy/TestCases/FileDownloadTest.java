package com.AutomateSeleniumEasy.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AutomationSeleniumEasy.Browser.Base;
import com.AutomationSeleniumEasy.Script.AlertsScript;
import com.AutomationSeleniumEasy.Script.FileDownloadScript;
import com.AutomationSeleniumEasy.Script.InputFormSubmitScript;

public class FileDownloadTest extends Base{
	
	FileDownloadScript filedownloadscript = null;
	
	InputFormSubmitScript inputformsubmitscript = null;
	
	AlertsScript alertsscript = null;
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void prequities()
	{
		driver = browserLunch();
		
		inputformsubmitscript = new InputFormSubmitScript(driver);
		alertsscript = new AlertsScript(driver);
		filedownloadscript = new FileDownloadScript(driver);
	}
	@Test
	public void TC_001_FileDownload() {
		
		inputformsubmitscript.click_DemoSite();
		inputformsubmitscript.click_CrossMark();
		alertsscript.click_Alert_Modals();
		filedownloadscript.click_FileDownload();
		filedownloadscript.text();
		filedownloadscript.file_Generate();
		boolean act = filedownloadscript.click_LinkToDownload();
		Assert.assertEquals(act, true, "file doesn't download");
		
		Thread.currentThread().getId();

	}
	@Test
	public void TC_002_VerifyFileDownload() {
		
		boolean act = filedownloadscript.verify_FileDownload();
		Assert.assertEquals(act, true, "file doesn't exist");
	}
	@AfterMethod
	public void tearDown() {
		
		//browserClose();
	}
	

}
