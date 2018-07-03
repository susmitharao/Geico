package applicationUtilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplicationUtilities
{
	WebDriver driver;
	WebElement myElement;
	List<WebElement> myElements;	

	public ApplicationUtilities(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement returnWebelement(String propType,String propValue)
	 {
		 if(propType.trim().equals("id"))
			 myElement=driver.findElement(By.id(propValue));
		 else if(propType.trim().equals("name"))
			 myElement=driver.findElement(By.name(propValue));
		 else if(propType.trim().equals("className"))
			 myElement=driver.findElement(By.className(propValue));
		 else if(propType.trim().equals("tagName"))
			 myElement=driver.findElement(By.tagName(propValue));
		 else if(propType.trim().equals("cssSelector"))
			 myElement=driver.findElement(By.cssSelector(propValue));
		 else if(propType.trim().equals("linktext"))
			 myElement=driver.findElement(By.linkText(propValue));
		 else if(propType.trim().equals("partialLinkText"))
			 myElement=driver.findElement(By.partialLinkText(propValue));
		 else if(propType.trim().equals("xpath"))
			 myElement=driver.findElement(By.xpath	(propValue));
		if(myElement.isEnabled())
		 return myElement;
		else 
			return null;
	 }
	 
	 public List<WebElement> returnWebelements(String propType,String propValue)
	 {
		 if(propType.trim().equals("id"))
			 myElement=driver.findElement(By.id(propValue));
		 else if(propType.trim().equals("name"))
			 myElement=driver.findElement(By.name(propValue));
		 else if(propType.trim().equals("className"))
			 myElement=driver.findElement(By.className(propValue));
		 else if(propType.trim().equals("tagName"))
			 myElement=driver.findElement(By.tagName(propValue));
		 else if(propType.trim().equals("cssSelector"))
			 myElement=driver.findElement(By.cssSelector(propValue));
		 else if(propType.trim().equals("linktext"))
			 myElement=driver.findElement(By.linkText(propValue));
		 else if(propType.trim().equals("partialLinkText"))
			 myElement=driver.findElement(By.partialLinkText(propValue));
		 else if(propType.trim().equals("xpath"))
			 myElement=driver.findElement(By.xpath	(propValue));
		if(myElement.isEnabled())
		 return myElements;
		else 
			return null;
	 }
}
