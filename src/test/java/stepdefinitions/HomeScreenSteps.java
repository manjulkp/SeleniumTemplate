package stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import runner.FeatureFileRunner;



public class HomeScreenSteps  {
	private HomePage homePage = new HomePage(FeatureFileRunner.getDriver());
	

	@Given("the application is launched")
	public void the_application_is_launched() {
	   homePage.acceptCookies();
       assertThat(homePage.isHomeScreenlaunched()).isTrue();
	}

	@Then("the title of the page is")
	public void the_title_of_the_page_is() {
		String actual = homePage.getTitle();
		String expected = "Home | The National Lottery";
		assertThat(actual).isEqualTo(expected);
	}
	
	@Then("the Open Account option is present")
	public void the_Open_Account_option_is_present() {
		assertThat(homePage.isHomeScreenlaunched()).isTrue(); 
	}
	
	@When("the User navigate to Open Account screen")
	public void the_User_navigate_to_SignIn_screen() {
	   homePage.navigateToSignUpPage();
	}

}
