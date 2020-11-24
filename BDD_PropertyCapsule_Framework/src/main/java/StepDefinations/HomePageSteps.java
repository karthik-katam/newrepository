package StepDefinations;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
	
	public HomePage homepage;

	@Given("^User should navigate to propertycapsule site \"([^\"]*)\"$")
	public void user_should_navigate_to_propertycapsule_site(String arg1) throws Throwable {
		homepage=new HomePage();
		homepage.browserInit();
	    
	}

	@Then("^User  verify the homepage of the title$")
	public void user_verify_the_homepage_of_the_title() throws Throwable {
		Thread.sleep(2000);
	    homepage.verifyTitle();
	}

	@When("^user click on Deal Marcker signup/login button$")
	public void user_click_on_Deal_Marcker_signup_login_button() throws Throwable {
		Thread.sleep(2000);
	    homepage.clickOnSignup();
	}

	
	@When("^User click on Linkedin tab to enter login details$")
	public void user_click_on_Linkedin_tab_to_enter_login_details() throws Throwable {
		Thread.sleep(2000);
	   homepage.clickOnLinkedInTab();
	}

	@When("^User enter the email address \"([^\"]*)\"$")
	public void user_enter_the_email_address(String email) throws Throwable {
	    homepage.enterEmail(email);
	}

	@When("^User enter the password \"([^\"]*)\"$")
	public void user_enter_the_password(String pass) throws Throwable {
	    homepage.enterPassword(pass);
	}
	@When("^User Click on SignIn$")
	public void user_Click_on_SignIn() throws Throwable {
	    homepage.clickLinkedInSignIn();
	}
	
	@When("^User click on See for yourself button$")
	public void user_click_on_See_for_yourself_button() throws Throwable {
	    homepage.clickSeeYourself();
	}

	@Then("^User verify the Contact us popup is displayed$")
	public void user_verify_the_Contact_us_popup_is_displayed() throws Throwable {
		homepage.termsPopup();
	}

	@Then("^User enters First Name as \"([^\"]*)\"$")
	public void user_enters_First_Name_as(String arg1) throws Throwable {
	   homepage.enterFirstName(arg1);
	}

	@Then("^User enters Last Name as \"([^\"]*)\"$")
	public void user_enters_Last_Name_as(String arg1) throws Throwable {
	 homepage.enterLastName(arg1);
	}

	@Then("^User enters Email address \"([^\"]*)\"$")
	public void user_enters_Email_address(String arg1) throws Throwable {
	   homepage.enterWorkEmail(arg1);
	}

	@Then("^User click on Submit button$")
	public void user_click_on_Submit_button() throws Throwable {
	    homepage.clickLinkedInSignIn();
	}

	@Then("^User Verify the Thank you popup is displayed$")
	public void user_Verify_the_Thank_you_popup_is_displayed() throws Throwable {
	    homepage.verifyThanksPopup();
	}
	@Then("^User Verify Product announcement section is displayed$")
	public void user_Verify_Product_announcement_section_is_displayed() throws Throwable {
	   homepage.verifyProductAnnouncement();
	}
	@When("^User verify to get all links$")
	public void user_verify_to_get_all_links() throws Throwable {
	    homepage.getAllLinks();
	}


	@When("^User close the browser$")
	public void user_close_the_browser() throws Throwable {
		Thread.sleep(2000);
	    homepage.closeBrowser();
	}

}
