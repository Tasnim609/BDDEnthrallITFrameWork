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
@enrollApplication
Feature: As an user
  I want to enroll as a new user to Enthrall It 
  In order to get access of the application feature

  Background: User navigates to Application URl
    Given User is on the Enthrall It DashBoard Page

  @sanity
  Scenario: user click on the enrollHome page submit button
    By putting value in each field to see the enrollment successful message

    When User click on logIn Button and put the credential
    Then User navigate to DashBoard
    When User click on Automation
    Then User navigate to EnrollNow Automation page
    When User click on EnrollNow
    Then User navigate to Enroll Application page
    When User complete all process and click on Submit Button
    Then User will navigate to successfull page

 # @tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

    #Examples: 
      #| name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
