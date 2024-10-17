#Author: tasnimchowdhury.qa@gmail.com
#Date: 10/02/2024
@sanaty
Feature: Enthrall IT
  As an user I want to login with my valid credentials to Enthrall IT 
  In ordre to get access of the Application

  Background: user navigate to Application URL
    Given user is on the Enthrall IT homepage URL

  Scenario: Login with valid credentials
    When User click in Login Button
    Then User will be navigate to Login page
    When User input  Email in the UserId field
    And User input Password in the password field
    And User finally click on Login Button
    Then user will be navigate to Enthrall IT Dashbord
 @login
 Scenario: Login with fixed valid credential
     When User click in Login Button 
     When User enter UserId as 'Kaylith1@gmail.com'
     And User enter Password as 'Abc12345%'
    And User finally click on Login Button
    Then user will be navigate to Enthrall IT Dashbord
 
 
 
 
    
# @tag2
 # Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
    #Then I verify the <status> in step

   # Examples: 
     # | name  | value | status  |
     # | name1 |     5 | success |
    #  | name2 |     7 | Fail    |
