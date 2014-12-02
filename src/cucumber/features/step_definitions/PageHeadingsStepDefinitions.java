package cucumber.features.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PageHeadingsStepDefinitions {

	WebDriver driver = null;
	
	@Given("^I am on the test site2$")
	public void navigateToSite() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp");
	}

	@When("^I click on ([^\"]*)$")
	public void thethat_cc(String page) throws Throwable {
		driver.findElement(By.id(page)).click();
		
	}

	@Then("^I check I am on ([^\"]*)$")
	public void thethen_cc(String title) throws Throwable {
	    Assert.assertTrue(driver.getTitle().contains(title));
	}	
	
	@And("^I close the browser$")
	public void closeBrowser() throws Throwable {
	    driver.close();
	}
	
}
