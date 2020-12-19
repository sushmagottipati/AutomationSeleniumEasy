package com.AutomateSeleniumEasy.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPageObjects {
	
	@FindBy(xpath = "//a[text()='Alerts & Modals']")
	public WebElement click_Alerts_Modals;
	
	@FindBy(xpath = "(//a[text()='Javascript Alerts'])[2]")
	public WebElement click_Alerts;
	
	@FindBy(xpath = "(//button[text()='Click me!'])[1]")
	public WebElement click_AlertBox;
	
	@FindBy(xpath = "(//button[text()='Click me!'])[2]")
	public WebElement click_ConfirmBox;
	
	@FindBy(xpath = "//button[text()='Click for Prompt Box']")
	public WebElement click_PromptBox;
	
	

}
