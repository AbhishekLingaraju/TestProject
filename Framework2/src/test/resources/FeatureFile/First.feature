#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
 @tag

     Feature: Basic functionality of selenium 
  
    @tag1
    Scenario: Verify login functionality
    Given user is on "Outlook" application
    And user click on "Sign in" button
    When user enters "Username" "Password" on "Login" screen
    And user click on "" button

    @mail1
  Scenario: Outlook login using sendkey value
  Given user is on "Outlook" 
  And user click on "Sign in" button
  