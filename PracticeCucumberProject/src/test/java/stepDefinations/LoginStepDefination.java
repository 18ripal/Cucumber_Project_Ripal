package stepDefinations;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginStepDefination {

	WebDriver driver;

	LoginPage lp = new LoginPage();

	@Before
	public void user_is_already_on_Login_Page() throws Throwable {
		System.out.println("Navigate to Page");
		lp.openLoginpage();
	}

	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String title) throws Throwable {
		System.out.println("Verify Title");
		Assert.assertEquals(title, lp.verifytitle());
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String a, String b) throws Throwable {
		System.out.println("Enter Email id and Password");
		lp.Login();
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		System.out.println("Click on Login Button");
		lp.signin();

	}

	@Then("^user get error for email$")
	public void user_get_error_for_email() throws Throwable {
		System.out.println("Verify Error message");
		String expectedError = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
		Assert.assertEquals(expectedError, lp.readError());

	}

	@After
	public void user_quit() throws Throwable {
		System.out.println("Close Browser");
		lp.closebrowser();

	}

}
