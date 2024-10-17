package pages;



import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Attribute;
import static common.CommonActions.*;
import static common.CommonWaits.*;

public class EnrollNowApplicationPage {
	WebDriver driver;
	WebDriverWait wait;

	public EnrollNowApplicationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

//WebElement logo of EnthrollIt
	@FindBy(xpath = "(//img[@alt='Enthrall IT'])[1]")
	WebElement logo;

	@FindBy(id = "login-link")
	WebElement logInFromTollber;

	// h2[normalize-space(text()=' Login into your account ') ]
	@FindBy(xpath = "//h2[normalize-space(text()='Login into  your account') ]")
	WebElement headerOfLogin;

	@FindBy(xpath = "//input[@name='username']")
	WebElement userId;

	@FindBy(xpath = "//input[@id='password']")
	WebElement passWord;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement logInButton;
	@FindBy(xpath = "//h1[text()='Dashboard']")
	WebElement headerOfDashboard;
	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automation;

	@FindBy(xpath = "//h1[text()='Automation']")
	WebElement headerOfAutomation;
	@FindBy(partialLinkText = "Enroll")
	WebElement enrollNow;

	@FindBy(xpath = "//input[@name='f_name']")
	WebElement fName;
	@FindBy(xpath = "//input[@id='id_m_name']")
	WebElement mName;
	@FindBy(xpath = "//input[@id='id_l_name']")
	WebElement lName;
	@FindBy(xpath = "//select[@name='i_am']")
	WebElement iM;
	@FindBy(xpath = "//select[@name='i_am']/option")
	List<WebElement> iMList;
	@FindBy(xpath = "//small[@id='i_am_error']")
	WebElement imErrorMassage;
	@FindBy(xpath = "//select[@id='id_course_wish_to_enroll']")
	WebElement course;
	@FindBy(xpath = "//select[@id='id_course_wish_to_enroll']/option")
	List<WebElement> courseOfList;

	@FindBy(xpath = "//input[@id='id_phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@id='id_email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement passwordApplicationPage;
	@FindBy(xpath = "//small[text()='Phone Number must be exactly 10 digits.']")
	WebElement PhoneNumberMustBeExactly10Digits;
	@FindBy(xpath = "//select[@id='id_gender']")
	WebElement gender;
	@FindBy(xpath = "//input[@name='image']")
	WebElement personalImage;
	@FindBy(xpath = "//input[@name='photo_id']")
	WebElement photoId;
	@FindBy(xpath = "//select[@id='id_birth_year']")
	WebElement birthYear;
	@FindBy(xpath = "//select[@id='id_birth_month']")
	WebElement birthMonth;
	@FindBy(xpath = "//select[@id='id_birth_date']")
	WebElement birthDate;
	// input[@name='home_address_line_1']
	@FindBy(xpath = "//input[@name='home_address_line_1']")
	WebElement homeAddres1;
	// input[@name='home_address_line_2']
	@FindBy(xpath = "//input[@name='home_address_line_2']")
	WebElement homeAddres2;
	// input[@name='city']
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	@FindBy(xpath = "//select[@name='state']")
	WebElement state;
	// input[@name='zip_code']
	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement zipCode;
	@FindBy(xpath = "//select[@id='id_immigration_status']")
	WebElement imergencyStatus;
	// input[@id='id_know_us']
	@FindBy(xpath = "//input[@id='id_know_us']")
	WebElement HowDidYouKnow;
	// input[@id='id_arrival_date']
	@FindBy(xpath = "//input[@id='id_arrival_date']")
	WebElement dateOfArrival;
	// select[@id='id_highest_education']
	@FindBy(xpath = "//input[@name='emergency_contact']")
	WebElement imergencyContact;
	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement higherEducation;

	@FindBy(xpath = "//select[@class='form-control' and @name='country_of_origin']")
	WebElement country;

	@FindBy(xpath = "//select[@class='form-control' and @name='country_of_origin']/option")
	List<WebElement> setOfCountry;
	// input[@id='is_agree']

	@FindBy(xpath = "//input[@id='is_agree']")
	WebElement checkBoxIagree;

	@FindBy(xpath = "//input[@name='sign_by_name']")
	WebElement signature;

	@FindBy(css = "select#id_primary_language")
	WebElement language;
	@FindBy(xpath = "//select[@id='id_primary_language']/option")
	List<WebElement> listOfLanguage;
	@FindBy(xpath = "//button[@id='submit_button']")
	WebElement submit;

	@FindBy(xpath = "//small[text()='First Name is a required field.']")
	WebElement FirstNameErrorMassage;
	@FindBy(xpath = "//small[@id='f_name_error']")
	WebElement FirstNameMustAlphabeticCharecterErrorMassage;
	// small[@id='f_name_error']
	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement lastNameOfErrorMassageLastNameIsARequiredField;
	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement lNameErrorMustBeAlphabeticCharacters;
	@FindBy(xpath = "//small[@id='i_am_error']")
	WebElement iAmOfErrorMassage;

	@FindBy(xpath = "//small[text()='Course Wish to Enroll is a required field.']")

	WebElement courseOfErrorMassage;

	@FindBy(xpath = "//small[text()='Phone Number is a required field.']")
	WebElement phoneNumberIsARequiredField;

	@FindBy(xpath = "//small[text()='Email Address is a required field.']")
	WebElement emailAddressOfErrorMassage;

	@FindBy(xpath = "//span[text()='Password is a required field.']")
	WebElement passwordOfErrorMassage;

	@FindBy(xpath = "//span[text()='Photo Id is a required field.']")
	WebElement photoIdOfErrorMassage;
	@FindBy(xpath = "//span[text()='Must contain a minimum of 8 characters.']")
	WebElement passWordMustContainAMinimumOf8Characters;
	@FindBy(xpath = "//span[text()='Personal Image is a required field.']")
	WebElement personalImageOfErrorMassage;

	@FindBy(xpath = "//span[text()='Birth Year is a required field.']")
	WebElement birthYearOfErrorMassage;

	@FindBy(xpath = "//span[text()='Birth Month is a required field.']")
	WebElement birthMonthOfErrorMassage;

	@FindBy(xpath = "//span[text()='Birth Date is a required field.']")
	WebElement birthDateOfErrorMassage;

	@FindBy(xpath = "//span[text()='Home Address Line 1 is a required field.']")
	WebElement homeAdressOfErrorMassage;

	@FindBy(xpath = "//span[text()='City is a required field.']")
	WebElement cityOfErrorMassage;

	@FindBy(xpath = "//span[text()='Must be alphabetic characters.']")
	WebElement howDidYouKnowOfErrorMassage;

	@FindBy(xpath = "//span[@id='stateerror']")
	WebElement stateOfErrorMassage;

	@FindBy(xpath = "//span[@id='zip_code_error']")
	WebElement zipCodeOfErrorMassage;

	@FindBy(xpath = "//span[text()='Signature is a required field.']")
	WebElement signatureOfErrorMassage;

	@FindBy(xpath = "//a[text()='Back']")
	WebElement backButton;

	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement cancelButton;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;
	
	public void userIsOnTheEnthrallITDashBoard() {
		pause(3000);
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/?next=/");
		verifyTitle(driver, "Enthrall IT");
		pause(3000);
		elementEnabled(logInFromTollber);
		clickElement(logInFromTollber);
		}
	public void userClickOnLogInButtonAndPutTheCredential() {
		pause(3000);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		pause(3000);
		elementDisplayed(userId);
		userId.sendKeys("tasnimchowdhury.qa@gmail.com");
		pause(4000);
		elementDisplayed(passWord);
	inputText(passWord, "Darimee2010");
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
	public void userclicOnkAutomation() {
		pause(3000);
		elementEnabled(automation);
		clickElement(automation);
	}
public void userNavigateToEnrollNowAutomationPage() {
	pause(3000);
	verifyTitle(driver, "Enthrall IT - Dashboard");
}
	public void userclickOnEnrollNowButton() {
		
		pause(3000);
		clickElement(enrollNow);
		pause(3000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("AllwindowHandles" + allWindowHandles);
		System.err.println("AllwindowHandles" + allWindowHandles);
		// Extract Parent and child window from all window handles
		String parent = (String) allWindowHandles.toArray()[0];
		String child = (String) allWindowHandles.toArray()[1];
		driver.switchTo().window(child);
		pause(3000);
		// switching 1stwindow to 2nd window
//		 for (String eachWin : AllWindowHandles) {
//			System.out.println("eachWin");
		// driver.switchTo().window(eachWin);
//		pause(3000);
//		inputText(fName, "Tasnim");
//		pause(3000);
//		inputText(imergencyContact, "6092332201");
	}
public void userNavigateToEnrollApplicationPage() {
	verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enrolls/");
	pause(3000);
}
	public void userCompleteAllProcessAndClickOnSubmitButton() {
		//pause(3000);
		//driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		inputText(fName, "Tasnim");
		pause(4000);
		inputText(mName, "");
		pause(4000);
		inputText(lName, "Chowdhury");
		// selectElelementFromDropdownOnebyOne(iM, iMList);
		pause(3000);
		selectDropdown(iM, "a Student");
		pause(3000);
		// selectElelementFromDropdownOnebyOne(course, courseOfList);
		pause(300);
		selectDropdown(course, "Python");
		pause(3000);
		inputText(phone, "6092332201");
		pause(3000);
		inputText(email, "tasnim5223@gmail.com");
		pause(5000);
		inputText(passwordApplicationPage, "Password@123");
		pause(3000);
		selectDropdown(gender, "Female");
		pause(3000);

		//uploadPhotoImage(personalImage, "./image/personal.png");
		File file = new File("./image/personal.jpg");	
		personalImage.sendKeys(file.getAbsolutePath());
		pause(4000);
		
		uploadPhotoImage(photoId, "./image/photoID.png");
		pause(3000);
		selectDropdown(birthYear, "1982");
		pause(3000);
		selectDropdown(birthMonth, "October");
		pause(3000);
		selectDropdown(birthDate, "6");
		pause(3000);
		inputText(homeAddres1, "1648 Busleton Pike ");
		inputTextThenClickEnter(homeAddres2, "");

		inputText(city, "festerville");
		inputText(state, "Pennsylvania");
		inputText(zipCode, "19053");
		inputText(imergencyStatus, "Citizen");
		inputText(dateOfArrival, "2/2/2020");
		inputText(HowDidYouKnow, "Friend");
		selectDropdown(higherEducation, "Other");
		inputText(imergencyContact, "6092672201");
		pause(4000);
		selectDropdown(country, "Bangladesh");

		pause(4000);
		selectDropdown(language, "English");
		pause(4000);
		selectElelementFromDropdownOnebyOne(language, listOfLanguage);
		pause(3000);
		selectDropdown(language, "Bengali");
		pause(3000);
		// waitUntilConditionThenClick(driver, submit);
		inputText(signature, "Tasnim Chowdhury");
		clickElement(checkBoxIagree);
		pause(3000);
		clickElement(submitButton);
	}
public void userWillNavigateToSuccessfullPage() {
	pause(3000);
	verifyCurrentUrl(driver, "https://enthrallit.com/course/enroll/success/");
}
	
}
