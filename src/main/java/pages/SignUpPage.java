package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.LoginConfiguration;



public class SignUpPage extends BasePage{
	
	private static final String TERMS_AND_CONDITION_LABEL = "map(terms)";
	private static final String DATE_OF_BIRTH_LABEL = "dob";

	@FindBy(name = "map(title)")
	private WebElement title;
	
	@FindBy(id = "forename")
	private WebElement firstName;
	
	@FindBy(name = "map(lastName)")
	private WebElement surname;
	
	@FindBy(name = "map(dobDay)")
	private WebElement birthDay;
	
	@FindBy(name = "map(dobMonth)")
	private WebElement birthMonth;
	
	@FindBy(name = "map(dobYear)")
	private WebElement birthYear;
	
	@FindBy(name = "map(email)")
	private WebElement emailAddress;
	
	@FindBy(name = "map(phone)")
	private WebElement telephone;
	
	@FindBy(name = "map(mobile)")
	private WebElement mobile;
	
	@FindBy(name = "map(address1)")
	private WebElement addressLine1;
	
	@FindBy(name = "map(addressCity)")
	private WebElement city;
	
	@FindBy(name = "map(stateProv)")
	private WebElement country;
	
	@FindBy(name = "map(postCode)")
	private WebElement postcode;
	
	@FindBy(name = "map(countryCode)")
	private WebElement countryCode;
	
	@FindBy(name = "map(userName)")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(name = "map(passwordConfirm)")
	private WebElement retypePassword;
	
	@FindBy(name = "map(securityQuestionOne)")
	private WebElement securityQuestion1;
	
	@FindBy(name = "map(securityAnswerOne)")
	private WebElement answer1;
	
	@FindBy(name = "map(securityQuestionTwo)")
	private WebElement securityQuestion2;
	
	@FindBy(name = "map(securityAnswerTwo)")
	private WebElement answer2;
	
	@FindBy(name = "map(currency)")
	private WebElement currency;
	
	@FindBy(name = "map(terms)")
	private WebElement termsAndConditions;
	
	@FindBy(id = "form")
	private WebElement joinNowButton;
	
	public SignUpPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	public void populateTitleData(LoginConfiguration user) {
		populateField(title, user.getTitle());
	}
	
	public void populateFirstNameData(LoginConfiguration user) {
		populateField(firstName, user.getFirstName());
	}
	
	public void populateSurNameData(LoginConfiguration user) {
		populateField(surname, user.getSurname());
	}
	
	public void populateAddressData(LoginConfiguration user) {
		populateField(addressLine1, user.getAddress());
		populateField(city, user.getCity());
		populateField(country, user.getCountry());
		populateField(postcode, user.getPostcode() );
	}
	
	public void populateAccountData(LoginConfiguration user) {
		populateField(username, user.getUsername());
		populateField(password, user.getPassword());
		populateField(retypePassword, user.getPassword());
		selectFromDropdownByValue(securityQuestion1, user.getSecurityQuestion1());
		populateField(answer1, user.getAnswer1());
		selectFromDropdownByValue(securityQuestion2, user.getSecurityQuestion2());
		populateField(answer2, user.getAnswer2());
	}
	
	public void selectCurrency(String value) {
		selectFromDropdownByValue(currency, value);
	}
	
	public void checkTemrsAndCondition() {
		selectCheckbox(termsAndConditions);
	}
	
	public void clickJoinNow() {
		click(joinNowButton);
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
}
