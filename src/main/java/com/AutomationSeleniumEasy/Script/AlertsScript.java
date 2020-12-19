package com.AutomationSeleniumEasy.Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.AutomateSeleniumEasy.PageObjects.AlertsPageObjects;
import com.AutomateSeleniumEasy.PageObjects.InputFormSubmitPageObject;
import com.AutomationSeleniumEasy.Browser.Base;

public class AlertsScript {
	
	AlertsPageObjects alertpageobjects = new AlertsPageObjects();
	
	//InputFormSubmitPageObject inputformsubmitpageobject = new InputFormSubmitPageObject();
	
	Base base = new Base();
	
	public AlertsScript(WebDriver driver)
	{
		
		alertpageobjects = PageFactory.initElements(driver, AlertsPageObjects.class);
	}
	
	public void click_Alert_Modals()
	{
		//inputformsubmitpageobject.click_DemoSite.click();
		//inputformsubmitpageobject.click_CrossMark.click();
		alertpageobjects.click_Alerts_Modals.click();
	}
	public void click_Alert() {
		
		alertpageobjects.click_Alerts.click();
	}
	
	public boolean click_AlertBox() {
		boolean accept=false;
		alertpageobjects.click_AlertBox.click();
		base.alert_Accept();
		accept = true;
		return accept;
				
	}
	public boolean click_ConfirmBox() {
		boolean accept = false;
		alertpageobjects.click_ConfirmBox.click();
		base.alert_Dismiss();
		accept = true;
		return accept;
	}
	public void click_PromptBox() {
		
		alertpageobjects.click_PromptBox.click();
		 String text = base.alert_GetText();
		 System.out.println(text);
	
	}
	

}
