@TestBackground
Feature: Test Background feature in Cucumber
	@Background
  Background: User is logged in application
    Given I am in OrangeHRP Application
    When Login to Application

  @Directory @smoke
  Scenario: Validate Directory Functionality
  When Click on Job - Job Titles
	And Validate the text - Job Titles
  
  @JobGrades
  Scenario: Validate Job Grades Functionality
  When Click on Job - Pay Grades
	And Validate the text - Pay Grades
