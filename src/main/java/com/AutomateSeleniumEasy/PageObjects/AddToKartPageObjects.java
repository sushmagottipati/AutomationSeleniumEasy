package com.AutomateSeleniumEasy.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToKartPageObjects {
	
	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	public WebElement click_CrossMark;
	
	@FindBy(xpath = "//span[text()='Women']")
	public WebElement click_Women;
	
	@FindBy(xpath = "//a[text()='Flats']")
	public WebElement click_Women_Flats;
	
	@FindBy(xpath = "//div[@class='E2-pcE _3zjXRo']/div[2]/div[4]/div[1]/div[4]")
	public WebElement click_OnSelectFootwear;
	
	@FindBy(xpath = "//a[text()='7']")
	public WebElement click_Size;
	
	@FindBy(css = "._2KpZ6l._2U9uOA._3v1-ww")
	public WebElement click_OnAddToKart;
	
	//*[@id="container"]/div/div[3]/div[2]/div[1]/div[2]/div[5]/div/div[2]/div/a/div[1]/div/div/div/img
	

}
