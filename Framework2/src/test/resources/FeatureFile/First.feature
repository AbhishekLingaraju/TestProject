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

  @Test1
  Scenario: to verify all webElement presence on home screen
    Given user is on "KaptureKM"
    And user verifies "Home" menu button is displayed on "Homepage" screen
    And user verifies "Solution" menu button is displayed on "Homepage" screen
    And user verifies "Company" menu button is displayed on "Homepage" screen
    And user verifies "Resources" menu button is displayed on "Homepage" screen
    And user verifies "ContactUs" menu button is displayed on "Homepage" screen
    And user verifies "Try Now" menu button is displayed on "Homepage" screen
    
    @Test2
    Scenario: to verify each webElement functionality on home screen
    Given user is on "KaptureKM"
    And user verifies "Home" menu button is displayed on "Homepage" screen
    When user clicks "Solution" menu button on  "Homepage" screen
    #Then user verifies "Platform" "Features" "Integrations" options should display
    Then user verifies "Platform" option is displayed under "Solution" dropdown
    Then user verifies "Features" option is displayed under "Solution" dropdown
    Then user verifies "Integration" option is displayed under "Solution" dropdown
    When user clicks "Resources" menu button on  "Homepage" screen
    Then user verifies "Articles" option is displayed under "Resources" dropdown
    Then user verifies "Infographics" option is displayed under "Resources" dropdown
    Then user verifies "Videos" option is displayed under "Resources" dropdown
    Then user verifies "Reviews" option is displayed under "Resources" dropdown
    Then user verifies "Events" option is displayed under "Resources" dropdown
    
