$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefile/Registration.feature");
formatter.feature({
  "name": "User Registration feature",
  "description": "  As a new user ,I can register",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@signin"
    }
  ]
});
formatter.scenario({
  "name": "Verification of WelcomeScreen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@signin"
    }
  ]
});
formatter.step({
  "name": "the application is launched",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeScreenSteps.the_application_is_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title of the page is",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeScreenSteps.the_title_of_the_page_is()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the JOIN NOW option is present",
  "keyword": "And "
});
formatter.match({
  "location": "HomeScreenSteps.the_JOIN_NOW_option_is_present()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate that a validation message with text ‘This field is required’ appears under the date of birth box",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@signin"
    }
  ]
});
formatter.step({
  "name": "the application is launched",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeScreenSteps.the_application_is_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User navigate to SignIn screen",
  "keyword": "When "
});
formatter.match({
  "location": "HomeScreenSteps.the_User_navigate_to_SignIn_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User select the options for Title",
  "rows": [
    {
      "cells": [
        "Title",
        "TestData.UserData.title"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SignUpSteps.the_User_select_the_options_for_Title(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User select the options for FirstName",
  "rows": [
    {
      "cells": [
        "FirstName",
        "TestData.UserData.firstName"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SignUpSteps.the_User_select_the_options_for_FirstName(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User select the options for Surname",
  "rows": [
    {
      "cells": [
        "Surname",
        "TestData.UserData.surname"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SignUpSteps.the_User_select_the_options_for_Surname(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User accepts terms and condition",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpSteps.the_User_accepts_terms_and_condition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User completes the registration by selecting JOIN NOW",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpSteps.the_User_completes_the_registration_by_selecting_JOIN_NOW()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User should see \"This field is required\" appearing under the date of birth",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpSteps.the_User_should_see_appearing_under_the_date_of_birth(String)"
});
formatter.result({
  "status": "passed"
});
});