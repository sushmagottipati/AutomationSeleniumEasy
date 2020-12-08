package com.AutomateSeleniumEasy.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputFormSubmitPageObject {
	
	@FindBy(linkText="Demo Website!")
	public WebElement click_DemoSite;
	
	@FindBy(xpath = "//a[text()='×']")
	public WebElement click_CrossMark;
	
	@FindBy(linkText="Input Forms")
	public WebElement click_InputForms;
	
	@FindBy(linkText="Input Form Submit")
	public WebElement click_InputFormSubmit;
	
	@FindBy(name="first_name")
	public WebElement click_InputFormSubmit_FirstName;
	
	@FindBy(name="last_name")
	public WebElement click_InputFormubmit_LastName;
	
	@FindBy(name="email")
	public WebElement click_InputFormubmit_Email;
	
	@FindBy(name="phone")
	public WebElement click_InputFormubmit_Phone;
	
	@FindBy(xpath = "//input[@name='address']")
	public WebElement click_InputFormubmit_address;
	
	@FindBy(xpath = "//input[@name='city']")
	public WebElement click_InputFormubmit_city;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement click_InputFormubmit_state;
	
	@FindBy(xpath = "//input[@name='zip']")
	public WebElement click_InputFormsubmit_zip;
	
	@FindBy(xpath = "//input[@value='no']")
	public WebElement click_InputFormsubmit_radio;
	
	@FindBy(xpath = "//button[text()='Send ']")
	public WebElement click_InputFormubmit_submitbutton;

}
