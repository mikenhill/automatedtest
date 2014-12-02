package cucumber.features.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinitions {

	WebDriver driver = null;
	
	@Given("^theGiven_cc$")
	public void thegiven_cc() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp");
	}

	@When("^theThat_cc \"([^\"]*)\"$")
	public void thethat_cc(String page) throws Throwable {
		driver.findElement(By.id(page)).click();
		
	}

	@Then("^theThen_cc \"([^\"]*)\"$")
	public void thethen_cc(String title) throws Throwable {
	    Assert.assertTrue(driver.getTitle().contains(title));
	}	
	
	
}
