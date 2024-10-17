package pages;

import static common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
WebDriver driver;

public LogIn(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id="login-link")
WebElement logInFromTollber;
@FindBy(xpath = "//input[@name='username']")
WebElement userId;

@FindBy(xpath = "//input[@id='password']")
WebElement passWord;

@FindBy(xpath = "//input[@type='submit']")
WebElement logInButton;
@FindBy(xpath = "//span[text()='Automation']")
WebElement automation;


public void userIsOnTheEnthrallITHomepageURL() {
	pause(3000);
	verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/?next=/");
	verifyTitle(driver, "Enthrall IT");
	
	}
public void UserlicknLoginButton() {
	pause(3000);
	elementEnabled(logInFromTollber);
	clickElement(logInFromTollber);
}
public void UserWillBeNavigateToLoginPage() {
	pause(3000);
	verifyTitle(driver, "Enthrall IT");
	verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
}
public void UserInputEmailInTheUserIdField() {
	pause(3000);
	elementDisplayed(userId);
	userId.sendKeys("tasnimchowdhury.qa@gmail.com");
}

public void UserInputEmailInTheUserIdField(String string) {
	pause(3000);
	elementDisplayed(userId);
	userId.sendKeys(string);
}

	public void UserInputPasswordInThePasswordField() {
		pause(4000);
		elementDisplayed(passWord);
	inputText(passWord, "Darimee2010");
}
	public void UserInputPasswordInThePasswordField(String string) {
		pause(4000);
		elementDisplayed(passWord);
	inputText(passWord, string);
}
public void UserFinallyClickOnLoginButton() {
	elementEnabled(logInButton);
	//verifyTextOfTheWebElement(logInButton, "Log in");
	pause(3000);
	clickElement(logInButton);
}
public void userWillBeNavigateToEnthrallITDashbord() {
	pause(3000);
	verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
	pause(3000);
	verifyTitle(driver, "Enthrall IT - Dashboard");
}
public void clickAutomation() {
	pause(3000);
	elementEnabled(automation);
	clickElement(automation);
}
}
