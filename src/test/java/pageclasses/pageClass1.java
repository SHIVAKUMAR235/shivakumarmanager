package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageClass1
{
	@FindBy(xpath="(//input[@type='text'])[2]") public WebElement mobile;
	@FindBy(xpath="//input[@type='password']") public WebElement password;
	@FindBy(xpath="(//span[text()='Login'])[2]/parent::button") public WebElement login;
	
	public pageClass1(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void FillMoblie(String x)
	{
		mobile.sendKeys(x);
	}
	public void FillPassword(String x)
	{
		password.sendKeys(x);
	}
	public void clickLogin() throws Exception
	{
		login.click();
		Thread.sleep(5000);
	}

}
