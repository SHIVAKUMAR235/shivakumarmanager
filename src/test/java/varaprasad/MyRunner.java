package varaprasad;

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/zoomfeature/myfeature.feature",
	glue="madubabu",
	plugin= {"pretty","html:target/myresults"},monochrome=true)

	public class MyRunner 
	{
		

	}


