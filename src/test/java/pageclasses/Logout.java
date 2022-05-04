package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout 
{
	//locating elements on the page
	@FindBy(xpath="//div[text()='Logout']") public WebElement logout;
	
	public Logout(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout() 
	{
		logout.click();
	}

}
