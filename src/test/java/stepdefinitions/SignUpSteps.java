package stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignUpPage;
import runner.FeatureFileRunner;
import utilities.LoginConfiguration;

public class SignUpSteps {
	private SignUpPage signUpPage = new SignUpPage(FeatureFileRunner.getDriver());
	private LoginConfiguration config = new LoginConfiguration();

	@When("the User select the options for Title")
	public void the_User_select_the_options_for_Title(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		config.setTitle(FeatureFileRunner.testDataDetails.get(data.get(0).get(1)));
		signUpPage.populateTitleData(config);
	}

	@When("the User select the options for FirstName")
	public void the_User_select_the_options_for_FirstName(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		config.setFirstName(FeatureFileRunner.testDataDetails.get(data.get(0).get(1)));
		signUpPage.populateFirstNameData(config);

	}

	@When("the User select the options for Surname")
	public void the_User_select_the_options_for_Surname(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		config.setSurname(FeatureFileRunner.testDataDetails.get(data.get(0).get(1)));
		signUpPage.populateFirstNameData(config);
	}

	@When("the User accepts terms and condition")
	public void the_User_accepts_terms_and_condition() {
		signUpPage.checkTemrsAndCondition();
	}

	@When("the User completes the registration by selecting JOIN NOW")
	public void the_User_completes_the_registration_by_selecting_JOIN_NOW() {
		signUpPage.clickJoinNow();
	}

	@Then("the User should see {string} appearing under the date of birth")
	public void the_User_should_see_appearing_under_the_date_of_birth(String inlineText) {
		String actual = signUpPage.getDateOfBirthErrorMessage();
		String expected = "This field is required";
		assertThat(actual).isEqualTo(expected);
	}

}
