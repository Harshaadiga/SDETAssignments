@Login
Feature: Login Feature Testing
  @ValidCredLogin @Background
  Scenario: Test Login Functionality with Valid Credentials
    Given I am in OrangeHRP Application
    Then Login to Application
    When Dashboard page is available
    And click on admin menu
    Then should be logged in successfully
