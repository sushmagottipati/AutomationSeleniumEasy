package com.AutomationSeleniumEasy.Browser;

	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Base {

		public static WebDriver driver = null;

		Select select = null;

		public WebDriver browserLunch() {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


			//driver.get("https://www.seleniumeasy.com/");
			driver.get("https://www.flipkart.com/");
			
			return driver;		
		}

		public void visibleText(WebElement element,String text)

		{
			select = new Select(element);
			select.selectByVisibleText(text);
		}

		public void selectDropDown_Value(WebElement element,String value) {

			select = new Select(element);
			select.selectByValue(value);
		}

		public void selectDropDown_Index(WebElement element,int index) {

			select = new Select(element);
			select.selectByIndex(index);
		}
		public List<WebElement> selectDropDown_GetOPtions(WebElement element) {

			select = new Select(element);
			List<WebElement> select_DropDownValues = select.getOptions();
			return select_DropDownValues;

		}
		public List<WebElement> selectDropDown_AllSelectedOptions(WebElement element) {

			select = new Select(element);
			List<WebElement> getAll_SelectedOptions = select.getAllSelectedOptions();
			return getAll_SelectedOptions;
		}
		public WebElement selectDropDown_FirstSelectedOption(WebElement element) {

			select = new Select(element);
			WebElement firstSelected_DropDwon = select.getFirstSelectedOption();
			return firstSelected_DropDwon;
		}

		public void move_ToElement(WebElement element){
			
			Actions actions = new Actions(driver);
			actions.moveToElement(element).build().perform();
		}
		public void context_Click(WebElement element) throws AWTException {
			
			Actions actions = new Actions(driver);
			actions.contextClick(element).build().perform();
			
			Robot robot = new Robot();
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		public void drag_And_Drop(WebElement source,WebElement target) {

			Actions actions = new Actions(driver);
			actions.dragAndDrop(source, target).build().perform();
			//actions.clickAndHold(source).moveToElement(target).release().build().perform();
		}

		public void frame(WebElement element)
		{
			driver.switchTo().frame(element);
		}

		public void alert_Accept() {

			driver.switchTo().alert().accept();
		}

		public void alert_Dismiss() {

			driver.switchTo().alert().dismiss();
		}
		
		public String alert_GetText() {
			
		 return driver.switchTo().alert().getText();
					
		}
		public void verify_File_Download(String path) {
			
			File file = new File(path);
			
			if(file.exists()) {
				
				System.out.println("file is exist");
			}else {
				
				System.out.println("file doesnot exist");
			}
					
		}

		public void switchTOWindow()
		{
			String parentWindow_Id = driver.getWindowHandle();

			Set<String> window = driver.getWindowHandles();

			for (String eachwindowid : window) {

				if(!eachwindowid.equalsIgnoreCase(parentWindow_Id))
				{
					driver.switchTo().window(eachwindowid);
				}

			}

		}
		public String getCurrenturl() {
			
			String currenturl = driver.getCurrentUrl();
			return currenturl;
		}
		
		public String getTitle() {
			
			String title = driver.getTitle(); 
			
			return title;
		}
		public void browserClose() {

			driver.close();
		}

	}


