package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(xpath = "//a[contains(text(),'Open account')]")
	private WebElement openAccountButton;

	@FindBy(xpath = "//a[contains(text(),' Accept All Cookies ')]")
	private WebElement acceptTermsAndConditionButton;

	@FindBy(id = "com_cookie_policy_close")
	private WebElement closeCookieButton;

	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}

	public SignUpPage navigateToSignUpPage() {
		click(openAccountButton);
		return new SignUpPage(webDriver);
	}

	public String getTitle() {
		return webDriver.getTitle();
	}

	public boolean isHomeScreenlaunched() {
		return isPresent(openAccountButton);
	}

	public void acceptCookies() {
		if (isPresent(acceptTermsAndConditionButton)) {
			click(acceptTermsAndConditionButton);
			click(closeCookieButton);
		}
	}

}
