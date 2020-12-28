package com.AutomateSeleniumEasy.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownloadPageObjects {
	
	@FindBy(xpath = "(//a[text()='File Download'])[2]")
	public WebElement click_FileDownload;
	
	@FindBy(id = "textbox")
	public WebElement text;
	
	@FindBy(css = "#create")
	public WebElement click_FileGenerate;
	
	@FindBy(id="link-to-download")
	public WebElement click_LinkTODownload;

}
