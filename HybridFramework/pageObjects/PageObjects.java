package pageObjects;

import org.openqa.selenium.WebDriver;
import applicationUtilities.ApplicationUtilities;
import generalUtilities.ReadXl;


public class PageObjects
{
	WebDriver driver;
	ApplicationUtilities util;	
	ReadXl myXl;
	
	public PageObjects(WebDriver driver)
	{
       
		this.driver= driver;
		this.util= new ApplicationUtilities(driver);
		this.myXl= new ReadXl("TestData.xls");
	}
	
	public void launch()
	{
		driver.navigate().to(myXl.getCellData("Sheet1", 0, 0));
	}
	
	
}
