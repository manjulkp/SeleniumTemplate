
Feature: Password Length Validation
  Happy Flow and Error Handling of Password Length acceptance criteria
  
  Scenario Outline: Password criteria - must be at least 6 characters long with at least one number and at least one special character 
  Given I am on the Sign Up page
  And I populate all fileds with valid values
  But I enter <value> for the password field  
  When I click on Join Now! button
  Then An inline error message <error-message> should be displayed
    
  Examples: 
    | ivalue        | error-message                                          | 
    |      	        | This field is required                                 |
    | a      	      | The minimum length is 6 characters                     |     
    | aaaaaa*       | Password should contain at least one number            |
    | aaaaaa1       | Password should contain at least one special character |
    | aaaaaa1£$     | No Error Message                                       |
    | aa5%a         | The minimum length is 6 characters                     |
    | aa5%aa        | No Error Message                                       |
    | abcdefghijklmnopqrstuvwxyz1234567890!@£$%^&            |   Error Message                                       |
    | _abcdefghijklmnopqrstuvwxyz1234567890!@£$%^&           |   Error Message                                       |


  
  
  
  
  
  
  
 

 
  

  

  
  
  
  

