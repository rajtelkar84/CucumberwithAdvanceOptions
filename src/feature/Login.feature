@Login
Feature: To Login to Email

//Then feature name followed with scenario tag name
@User1

#Scenario1:
Scenario Outline: Navigate and logon to gmail application

Given User launches gmail application
When User updates emailID <emailID>
And User updates pwd <pwd>    
Then User clicks on Login Button


Examples: 
  | emailID    | pwd |
  | a@gmail.com| 123 | 


@User2

#Scenario2:
Scenario Outline: Navigate and logon to facebook application

Given User launches fb application
When User updates emailID <emailID>
And User updates pwd <pwd>    
Then User clicks on Login Button


Examples: 
  | emailID    | pwd |
  | a@fb.com| 123 | 