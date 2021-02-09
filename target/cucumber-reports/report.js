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
  "name": "the Open Account option is present",
  "keyword": "And "
});
formatter.match({
  "location": "HomeScreenSteps.the_Open_Account_option_is_present()"
});
formatter.result({
  "status": "passed"
});
});