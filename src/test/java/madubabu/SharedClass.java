package madubabu;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class SharedClass
{

	RemoteWebDriver driver;
	pageClass1 obj1; 
	Logout obj2;
	Scenario s;
	
	@Before
	public void method(Scenario x)
	
   {

		s=x;
	}
	
	
}
