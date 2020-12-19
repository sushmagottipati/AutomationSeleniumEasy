package com.AutomationSeleniumEasy.Browser;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	Select select = null;

	public WebDriver browserLunch() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.seleniumeasy.com/");

		return driver;			
	}

	public void select_ByVisibleText(WebElement element,String text) {

		select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void select_ByIndex(WebElement element,int index) {

		select = new Select(element);
		select.selectByIndex(index);
	}
	public void select_ByValue(WebElement element,String value) {

		select = new Select(element);
		select.selectByValue(value);
	}
	
	public void alert_Accept()
	{
		driver.switchTo().alert().accept();
	}
	
	public void alert_Dismiss() {
		
		driver.switchTo().alert().dismiss();
	}
	public String alert_GetText() {
		
		String text = driver.switchTo().alert().getText();
		return text;
	}

	public void browserClose() {

		driver.close();
	}

}
