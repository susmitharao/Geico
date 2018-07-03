package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pageObjects.PageObjects;

public class TestcasesTest 
{
	WebDriver driver= new FirefoxDriver();
	PageObjects po=new PageObjects(driver);
	
	@Test
	public void Launch()
	{
		driver.manage().window().maximize();
		po.launch();
		System.out.println("Launched Successfully");
	}
	
}
