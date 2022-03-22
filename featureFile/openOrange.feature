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
Feature: Checking the openOrange url
  I want to use this template for my feature file

  @tag1
  Scenario: Verifying the openOrange url by correct userId and password
    Given I want to the verify the openOrangeUrl 
    When I want to enter the valid credentials below credentials
    |Admin|admin123|
    When click the submit the button
    Then verify the webpage
    