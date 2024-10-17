package stepsDefinition;

import baseUtil.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepsDefinition extends BaseClass{
	@Given("user is on the Enthrall IT homepage URL")
	public void user_is_on_the_enthrall_it_homepage_url() {
	  logIn.userIsOnTheEnthrallITHomepageURL();
	}

	@When("User click in Login Button")
	public void user_click_in_login_button() {
	   logIn.UserlicknLoginButton();
	}

	@Then("User will be navigate to Login page")
	public void user_will_be_navigate_to_login_page() {
	   logIn.UserWillBeNavigateToLoginPage();
	}

	

	@When("User input  Email in the UserId field")
	public void user_input_email_in_the_user_id_field() {
	    logIn.UserInputEmailInTheUserIdField();
	}

	@When("User input Password in the password field")
	public void user_input_password_in_the_password_field() {
	    logIn.UserInputPasswordInThePasswordField();
	}

	@When("User finally click on Login Button")
	public void user_finally_click_on_login_button() {
	   logIn.UserFinallyClickOnLoginButton();
	}

	@Then("user will be navigate to Enthrall IT Dashbord")
	public void user_will_be_navigate_to_enthrall_it_dashbord() {
	    logIn.userWillBeNavigateToEnthrallITDashbord();
	}
	@When("User enter UserId as {string}")
	public void user_enter_user_id_as(String string) {
	    logIn.UserInputEmailInTheUserIdField(string);
	}

	@When("User enter Password as {string}")
	public void user_enter_password_as(String string) {
	   logIn.UserInputPasswordInThePasswordField(string); 
	}

}
