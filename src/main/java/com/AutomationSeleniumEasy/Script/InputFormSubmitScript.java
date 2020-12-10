package com.AutomationSeleniumEasy.Script;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.AutomateSeleniumEasy.PageObjects.InputFormSubmitPageObject;
import com.AutomationSelenium.DataSet.InputFormSubmitDataSet;
import com.AutomationSeleniumEasy.Browser.Base;
import com.AutomationSeleniumEasy.Utilities.XlsReader;

public class InputFormSubmitScript {

	InputFormSubmitPageObject inputformsubmitpageobject = new InputFormSubmitPageObject();
	
	XlsReader xlsreader = new XlsReader();
	
	

	Base base = new Base();

	
	
	public InputFormSubmitScript(WebDriver driver)
	{

		inputformsubmitpageobject = PageFactory.initElements(driver, InputFormSubmitPageObject.class);
	}

	public void click_DemoSite() {

		inputformsubmitpageobject.click_DemoSite.click();
	}
	public void click_CrossMark() {
		
		inputformsubmitpageobject.click_CrossMark.click();
	}
	public void click_InputForms() {

		inputformsubmitpageobject.click_InputForms.click();
	}
	public void click_InputFOrmSubmit() {

		inputformsubmitpageobject.click_InputFormSubmit.click();
	}
	public void click_InputFormSubmit_FirstName() {
		
		String firstname = InputFormSubmitDataSet.firstname;
		inputformsubmitpageobject.click_InputFormSubmit_FirstName.sendKeys(firstname);
	}
	public void click_InputFormSubmit_LastName() {
		
		String lastname = InputFormSubmitDataSet.lastname;
		inputformsubmitpageobject.click_InputFormubmit_LastName.sendKeys(lastname);
	}
	public void click_InputFormSubmit_Email() {
		
		String email = InputFormSubmitDataSet.email;
		inputformsubmitpageobject.click_InputFormubmit_Email.sendKeys(email);
	}
	public void click_InputFormSubmit_Phone() {
		
		String phone = InputFormSubmitDataSet.phone;

		inputformsubmitpageobject.click_InputFormubmit_Phone.sendKeys(phone);
	}
	public void click_InputFormSubmit_Address() {
		
		String address = InputFormSubmitDataSet.address;
		
		inputformsubmitpageobject.click_InputFormubmit_address.sendKeys(address);
	}
	public void click_IputFormSubmit_City() {
		
		String city = InputFormSubmitDataSet.city;
		
		inputformsubmitpageobject.click_InputFormubmit_city.sendKeys(city);
	}
	public void click_InputFormSubmit_State() {
		
		String state = InputFormSubmitDataSet.state;
		
		base.select_ByVisibleText(inputformsubmitpageobject.click_InputFormubmit_state, state);		
		
	}
	public void click_InputFormSubmit_Zip() {
		
		String zip = InputFormSubmitDataSet.zip;
		
		inputformsubmitpageobject.click_InputFormsubmit_zip.sendKeys(zip);
	}
	
	public void click_InputFormsubmit_Radio() {
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("arguments[0].click()", inputformsubmitpageobject.click_InputFormsubmit_radio);
		inputformsubmitpageobject.click_InputFormsubmit_radio.click();
			
	}
	public boolean click_InputFormSubmit_Button() {
		
		boolean form = false;
		
		inputformsubmitpageobject.click_InputFormubmit_submitbutton.click();
		
		return true;
		
		
	}


}
