package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.LoginConfiguration;

public class SignUpPage extends BasePage {

	private static final String TERMS_AND_CONDITION_LABEL = "map(terms)";
	private static final String DATE_OF_BIRTH_LABEL = "dob";

	@FindBy(id = "form_title")
	private WebElement title;

	@FindBy(id = "form_firstName")
	private WebElement firstName;

	@FindBy(id = "form_lastName")
	private WebElement surname;

	@FindBy(id = "form_dateOfBirth_day")
	private WebElement birthDay;

	@FindBy(id = "form_dateOfBirth_month")
	private WebElement birthMonth;

	@FindBy(id = "form_dateOfBirth_year")
	private WebElement birthYear;

	@FindBy(id = "form_emailAddress")
	private WebElement emailAddress;
	
	@FindBy(id = "form_emailAddressConfirm")
	private WebElement confirmEmailAddress;

	@FindBy(id = "form_house")
	private WebElement addressLine;

	@FindBy(id = "form_postCode")
	private WebElement postcode;
	
	@FindBy(name = "journey_save")
	private WebElement nextButton;

	@FindBy(id = "form_password")
	private WebElement password;

	@FindBy(name = "securityQuestionId")
	private WebElement securityQuestion1;

	@FindBy(id = "form_form_security_answer")
	private WebElement answer1;

	@FindBy(id = "form_communications_no")
	private WebElement preference_No;

	@FindBy(id = "policy_link")
	private WebElement policyLink;

	@FindBy(id = "journey_save")
	private WebElement createAccount;

	public SignUpPage(WebDriver webDriver) {
		super(webDriver);
	}

	public void populateFirstNameData(LoginConfiguration user) {
		populateField(firstName, user.getFirstName());
	}

	public void populateSurNameData(LoginConfiguration user) {
		populateField(surname, user.getSurname()+randomCharacters());
	}

	public void selectDateOfBirth(LoginConfiguration user) {
		String[] dateOfBirthArray = splitDateOfBirth(user.getDateOfBirth());
		selectFromDropdownByText(birthDay, dateOfBirthArray[0]);
		selectFromDropdownByText(birthMonth, dateOfBirthArray[1]);
		selectFromDropdownByText(birthYear, dateOfBirthArray[2]);
	}

	private String[] splitDateOfBirth(String dateOfBirth) {
		return dateOfBirth.split("-");
	}
	
	public void selectEmail(LoginConfiguration user) {
		String email = user.getEmailAddress()+gen()+"@gmail.com";
		user.setEmailAddress(email);
		populateField(emailAddress, user.getEmailAddress());
		populateField(confirmEmailAddress, user.getEmailAddress());
	}

	public void populateAddressData(LoginConfiguration user) {
		populateField(addressLine, user.getAddress());
		populateField(postcode, user.getPostcode());
		click(nextButton);
//		waitElement(nextButton);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(nextButton);
	}

	public void populateAccountData(LoginConfiguration user) {
		populateField(password, user.getPassword());
		selectFromDropdownByValue(securityQuestion1, user.getSecurityQuestion1());
		populateField(answer1, user.getAnswer1());
	}

	public void selectPreference() {
		click(preference_No);
		scroll(policyLink);
		click(createAccount);
	}

	public void selectTitle(LoginConfiguration user) {
		selectFromDropdownByValue(title, user.getTitle());
	}


	public String getTermsAndConditionErrorMessage() {
		return getFieldInlineErrorMessage(TERMS_AND_CONDITION_LABEL);
	}

	public String getDateOfBirthErrorMessage() {
		return getFieldInlineErrorMessage(DATE_OF_BIRTH_LABEL);
	}

	private String getFieldInlineErrorMessage(String labelFor) {
		WebElement label = webDriver.findElement(By.xpath(String.format("//fieldset/label[@for='%s']", labelFor)));
		return label.getText();
	}
	
	private int gen() {
	    Random r = new Random( System.currentTimeMillis() );
	    return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
	}
	
	private static String randomCharacters() {
		// create a string of all characters
	    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    // create random string builder
	    StringBuilder sb = new StringBuilder();
	    // create an object of Random class
	    Random random = new Random();
	    // specify length of random string
	    int length = 7;
	    for(int i = 0; i < length; i++) {
	      // generate random index number
	      int index = random.nextInt(alphabet.length());
	      // get character specified by index
	      // from the string
	      char randomChar = alphabet.charAt(index);
	      // append the character to string builder
	      sb.append(randomChar);
	    }

	   return sb.toString().toLowerCase();
	    
	}
}
