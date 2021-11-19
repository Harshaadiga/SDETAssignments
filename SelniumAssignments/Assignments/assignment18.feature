Feature: Validating the OrangeHRP Application

@SmokeTest @Background
Scenario: Login to OrangeHRP Application
Given I am on OrangeHRP Application
Then Login to Application
When Dashboard page is avaliable
And Click on Admin Menu
Then Close the Browser

@SmokeTest @RegressionalTest
Scenario: Validating Admin Menu
Given I am on OrangeHRP Application
Then Login to Application
And Click on Admin Menu
Then Click on Job
And validate text on Job Title
Then Close the Browser

@RegressionalTest
Scenario: Validating PIM Menu
Given I am on OrangeHRP Application
Then Login to Application
Then Click on PIM menu
And validate user on PIM Menu
Then Close the Browser

@SmokeTest
Scenario: Validating Time Menu
Given I am on OrangeHRP Application
Then Login to Application
Then Click on Time menu
And validate user on Time Menu
Then Close the Browser
