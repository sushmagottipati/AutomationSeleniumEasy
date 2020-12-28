package com.AutomationSeleniumEasy.Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.AutomateSeleniumEasy.PageObjects.FileDownloadPageObjects;
import com.AutomationSelenium.DataSet.FileDownloadDataSet;
import com.AutomationSeleniumEasy.Browser.Base;

public class FileDownloadScript {
	
	FileDownloadPageObjects filedownloadpageobjects = new FileDownloadPageObjects();
	
	Base base = new Base();
	public FileDownloadScript(WebDriver driver) {
		
		
		filedownloadpageobjects = PageFactory.initElements(driver, FileDownloadPageObjects.class);
	}
	
	public void click_FileDownload() {
		
		filedownloadpageobjects.click_FileDownload.click();
	}
	public void text() {
		
		String text = FileDownloadDataSet.text;
		
		filedownloadpageobjects.text.sendKeys(text);
	}
	public void file_Generate() {
		
		filedownloadpageobjects.click_FileGenerate.click();
	}
	
	public boolean click_LinkToDownload() {
		
		boolean filedownload = false;
		filedownloadpageobjects.click_LinkTODownload.click();
		filedownload = true;
		return filedownload;
		
	}
	
	public boolean verify_FileDownload() {
		
		boolean filepath = false;
		String path = FileDownloadDataSet.filepath;
		base.verify_File_Download(path);
		filepath = true;
		return filepath;
		
				
	}

}
