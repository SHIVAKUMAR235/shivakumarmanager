package madubabu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageclasses.Logout;
import pageclasses.pageClass1;

public class Stepdef1 
{
	public SharedClass sh;
 public Stepdef1(SharedClass sh)
 {
	 this.sh=sh;
 }
 
 
 @Given("open browser {string}")
 public void method1(String string) 
 {
     WebDriverManager.chromedriver().setup();
      sh.driver=new ChromeDriver(); 
      sh.obj1=new pageClass1(sh.driver);
      
      //run
      sh.obj2=new Logout(sh.driver);
      sh.driver.manage().window().maximize();
      
 }

 @When("launch site {string}")
 public void method2(String url) 
 {
    sh.driver.get(url); 
 }



 @When("click on login button and use this ud {string} and pw {string}")
 public void method3(String x,String y) throws Exception
 {
   sh.obj1.FillMoblie(x);  
   sh.obj1.FillPassword(y);
   sh.obj1.clickLogin();
 }
 
 @Then("homepage should be displayed")
 public void method4()
 {
  String x=sh.driver.findElement(By.xpath("//img[@title='Flipkart']")).getAttribute("title");
     if(x.equals("Flipkart"))
     {
    	System.out.println("Home page is displyed");
    
     }
     else
     {
    	 System.out.println("Home page is not displyed");
     
     }
 }
 
 @When("click on logout")
 public void method5() throws Exception
 {
	WebElement e=sh.driver.findElement(By.xpath("//div[text()='My Account']"));
	Actions a=new Actions(sh.driver);
	a.moveToElement(e).perform();
	Thread.sleep(2000);
	 sh.obj2.clickLogout();
 }
 
 @When("close browser")
 public void method6()
 {
	 sh.driver.quit();
 }
 
}
