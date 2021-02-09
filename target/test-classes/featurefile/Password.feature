
#Feature: Password Length Validation
  #Happy Flow and Error Handling of Password Length acceptance criteria
  #
  #Scenario Outline: Password criteria - must be at least 6 characters long with at least one number and at least one special character 
  #Given I am on the Sign Up page
  #And I populate all fileds with valid values
  #But I enter <value> for the password field  
  #When I click on Join Now! button
  #Then An inline error message <error-message> should be displayed
  #
    #
  #Examples: 
    #| ivalue        | error-message                                          | 
    #|      	        | This field is required                                 |
    #| a      	      | The minimum length is 6 characters                     |     
    #| aaaaaa*       | Password should contain at least one number            |
    #| aaaaaa1       | Password should contain at least one special character |
    #| aaaaaa1£$     | No Error Message                                       |
    #| aa5%a         | The minimum length is 6 characters                     |
    #| aa5%aa        | No Error Message                                       |
    #| abcdefghijklmnopqrstuvwxyz1234567890!@£$%^&            |   Error Message                                       |
    #| _abcdefghijklmnopqrstuvwxyz1234567890!@£$%^&           |   Error Message                                       |
#


#Scenario: Validate that a user create an account in application
  #Given the application is launched
  #When the User navigate to Open Account screen
  #And the User select the options for Title
   #|Title            |TestData.UserData.title|
  #And the User select the options for FirstName
  #|FirstName            |TestData.UserData.firstName|
  #And the User select the options for Surname
  #|Surname            |TestData.UserData.lastName|
  #And the User select the options for DateOfBirth
  #|DateOfBirth            |TestData.UserData.dateOfBirth|
  #And the User select the options for Email
  #|Email            |TestData.UserData.emailAddress|
  #And the User select the options for Address
  #|Address            |TestData.UserData.address|
  #|Postcode           |TestData.UserData.postcode|
  #And the User select the options to create password along with security question
  #|Password           |TestData.UserData.password|
  #|Question           |TestData.UserData.securityQuestion1|
  #|Answer             |TestData.UserData.answer1|
  #And the User select the options to set the preference for notification with completing user registration
  #
  #
  #
  #
  #
  #
  
 

 
  

  

  
  
  
  

