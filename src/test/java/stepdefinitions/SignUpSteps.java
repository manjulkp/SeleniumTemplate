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
		
		signUpPage.selectTitle(config);
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
		signUpPage.populateSurNameData(config);
	}
	
	@When("the User select the options for DateOfBirth")
	public void the_User_select_the_options_for_DateOfBirth(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		config.setDateOfBirth(FeatureFileRunner.testDataDetails.get(data.get(0).get(1)));
	    signUpPage.selectDateOfBirth(config);
	}
	
	@When("the User select the options for Email")
	public void the_User_select_the_options_for_Email(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		config.setEmailAddress(FeatureFileRunner.testDataDetails.get(data.get(0).get(1)));
	    signUpPage.selectEmail(config); 
	}
	
	@When("the User select the options for Address")
	public void the_User_select_the_options_for_Address(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		config.setAddress(FeatureFileRunner.testDataDetails.get(data.get(0).get(1)));
		config.setPostcode(FeatureFileRunner.testDataDetails.get(data.get(1).get(1)));
		signUpPage.populateAddressData(config);
	}
	
	@When("the User select the options to create password along with security question")
	public void the_User_select_the_options_to_create_password_along_with_security_question(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		config.setPassword(FeatureFileRunner.testDataDetails.get(data.get(0).get(1)));
		config.setSecurityQuestion1(FeatureFileRunner.testDataDetails.get(data.get(1).get(1)));
		config.setAnswer1(FeatureFileRunner.testDataDetails.get(data.get(2).get(1)));
		signUpPage.populateAccountData(config);
	}
	
	@When("the User select the options to set the preference for notification with completing user registration")
	public void the_User_select_the_options_to_set_the_preference_for_notification_with_completing_user_registration() {
		signUpPage.selectPreference();
	}


}
