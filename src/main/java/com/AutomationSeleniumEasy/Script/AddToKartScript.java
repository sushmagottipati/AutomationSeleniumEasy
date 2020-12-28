package com.AutomationSeleniumEasy.Script;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.AutomateSeleniumEasy.PageObjects.AddToKartPageObjects;
import com.AutomationSeleniumEasy.Browser.Base;

public class AddToKartScript {
	
	AddToKartPageObjects addtokartpageobjects = new AddToKartPageObjects();
	
	Base base = new Base();
	
	public AddToKartScript(WebDriver driver) {
		
		addtokartpageobjects = PageFactory.initElements(driver, AddToKartPageObjects.class);
	}
	
	public void click_Women() {
		
		addtokartpageobjects.click_CrossMark.click();
		base.move_ToElement(addtokartpageobjects.click_Women);	
	}
	public void click_Flats() throws Throwable {
		
		base.context_Click(addtokartpageobjects.click_Women_Flats);
		Thread.sleep(3000);
		base.switchTOWindow();
	}
	
	public void click_OnSelectFootwear() {
		
		addtokartpageobjects.click_OnSelectFootwear.click();	
		base.switchTOWindow();
	}
	
	public void click_OnSize()
	{
		addtokartpageobjects.click_Size.click();
	}
	
	public boolean click_OnAddToKart() throws InterruptedException {
		
		boolean addtokart = false;
		
		addtokartpageobjects.click_OnAddToKart.click();
		
		Thread.sleep(3000);

		
		String text = "Shopping Cart";
		
		//https://www.flipkart.com/viewcart?otracker=PP_GoToCart
		
		if(base.getTitle().contains(text))
		{
		
		addtokart = true;
		}
		else
		{
			addtokart = false;
		}
		return addtokart;
	}	
}
