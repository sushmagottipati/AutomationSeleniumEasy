package com.AutomateSeleniumEasy.TestCases;

import org.apache.commons.math3.analysis.function.Add;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AutomationSeleniumEasy.Browser.Base;
import com.AutomationSeleniumEasy.Script.AddToKartScript;
import com.AutomationSeleniumEasy.Script.InputFormSubmitScript;

public class AddToKartTest extends Base {
	
	AddToKartScript addtokartscript = null;
	
	@BeforeTest
	public void prerequsities_BrowserLunch() {
		
		driver = browserLunch();
		 addtokartscript = new AddToKartScript(driver);			
	}
	@Test
	public void TC_001_AddToKart() throws Throwable {
		
		addtokartscript.click_Women();	
		addtokartscript.click_Flats();
		addtokartscript.click_OnSelectFootwear();
		addtokartscript.click_OnSize();
		boolean act = addtokartscript.click_OnAddToKart();
		Assert.assertEquals(act, true, "item not to be  add in Add to kart ");
	}
	@AfterTest
	public void tearDown() {
		
		//browserClose();
	}

	

}
