package cucumber.features.step_definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class SubmitContactStepDefinitions {

	WebDriver driver = null;
	
	@Given("^I am on the test site$")
	public void navigateToTestSite() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp");
	}

	@When("^I navigate to Contact Us$")
	public void navigateToContact() throws Throwable {
		driver.findElement(By.id("contact_link")).click();
		
	}
	
	@And("^I submit the form with valid data$")
	public void submitTheContactForm(DataTable table) throws Throwable {
				
		List<List<String>> data = table.raw(); 
		
		driver.findElement(By.name("name_field")).sendKeys(data.get(1).get(1));
		driver.findElement(By.name("address_field")).sendKeys(data.get(2).get(1));
		driver.findElement(By.name("postcode_field")).sendKeys(data.get(3).get(1));
		driver.findElement(By.name("email_field")).sendKeys(data.get(4).get(1));
		
		driver.findElement(By.id("submit_message")).click();
		
	}

	@Then("^I check the form has been submitted$")
	public void checkConfirmationPage() throws Throwable {
	    Assert.assertTrue(driver.getTitle().equals("Contact Confirmation"));
	}	
	
	
}

