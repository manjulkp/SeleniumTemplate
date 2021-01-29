@signin
Feature: User Registration feature
  As a new user ,I can register
  
  Scenario: Verification of WelcomeScreen
  Given the application is launched
  Then the title of the page is 
  And the JOIN NOW option is present

  Scenario: Validate that a validation message with text ‘This field is required’ appears under the date of birth box
  Given the application is launched
  When the User navigate to SignIn screen
  And the User select the options for Title
  |Title            |TestData.UserData.title|
  And the User select the options for FirstName
  |FirstName            |TestData.UserData.firstName|
  And the User select the options for Surname
  |Surname            |TestData.UserData.surname|
  And the User accepts terms and condition
  And the User completes the registration by selecting JOIN NOW
  Then the User should see "This field is required" appearing under the date of birth
  
  #Scenario Outline: Password criteria - must be at least 6 characters long with at least one number and at least one special character 
  #Given I am on the Sign Up page
  #And I populate all fileds with valid values
  #But I enter <invalid-value> for the password field  
  #When I click on Join Now! button
  #Then An inline error message <error-message> should be displayed
    #
  #Examples: 
    #| invalid-value | error-message                                          | 
    #|      	        | This field is required                                 |
    #| a      	      | The minimum length is 6 characters                     |     
    #| aaaaaa*       | Password should contain at least one number            |
    #| aaaaaa1       | Password should contain at least one special character |
    #| aaaaaa1£$     | No Error Message                                       |
    #| aa5%a         | The minimum length is 6 characters                     |
    #| aa5%aa        | No Error Message                                       |
    #| abcdefghijklmnopqrstuvwxyz1234567890!@£$%^&*()_"?></|      |   Error Message                                       |
    #| _abcdefghijklmnopqrstuvwxyz1234567890!@£$%^&*()_           |   Error Message                                       |
#
#
#Password field should accept all numbers
#Password field should accept all letters
#Password field should accept a combination of letters & numbers
#Boundary Condition Check
#Need to verify with Product Owner for maximum Length Possible

  
  
  
  
  
  
  
 

 
  

  

  
  
  
  

