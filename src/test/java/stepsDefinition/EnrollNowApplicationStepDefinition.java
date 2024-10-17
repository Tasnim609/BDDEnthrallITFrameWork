package stepsDefinition;

import baseUtil.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnrollNowApplicationStepDefinition extends BaseClass{
	@Given("User is on the Enthrall It DashBoard Page")
	public void user_is_on_the_enthrall_it_dash_board_page() {
enrollNowApplicationPage.userIsOnTheEnthrallITDashBoard();

	}

	@When("User click on logIn Button and put the credential")
	public void user_click_on_log_in_button_and_put_the_credential() {
		enrollNowApplicationPage.userClickOnLogInButtonAndPutTheCredential();
	}

	@Then("User navigate to DashBoard")
	public void user_navigate_to_dash_board() {
	    enrollNowApplicationPage.userWillBeNavigateToEnthrallITDashbord();
	}

	@When("User click on Automation")
	public void user_click_on_automation() {
	   enrollNowApplicationPage.userclicOnkAutomation(); 
	}

	@Then("User navigate to EnrollNow Automation page")
	public void user_navigate_to_enroll_now_automation_page() {
	   enrollNowApplicationPage.userNavigateToEnrollNowAutomationPage();
	}

	@When("User click on EnrollNow")
	public void user_click_on_enroll_now() {
	    enrollNowApplicationPage.userclickOnEnrollNowButton();
	}

	@Then("User navigate to Enroll Application page")
	public void user_navigate_to_enroll_application_page() {
	    enrollNowApplicationPage.userNavigateToEnrollApplicationPage();
	}

	@When("User complete all process and click on Submit Button")
	public void user_complete_all_process_and_click_on_submit_button() {
	    enrollNowApplicationPage.userCompleteAllProcessAndClickOnSubmitButton();
	}

	@Then("User will navigate to successfull page")
	public void user_will_navigate_to_successfull_page() {
	    enrollNowApplicationPage.userWillNavigateToSuccessfullPage();
	}



}
