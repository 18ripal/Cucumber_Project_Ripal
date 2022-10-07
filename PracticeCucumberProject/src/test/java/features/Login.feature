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



Feature: Facebook Login page

Scenario: Facebook Login Test with Wrong credentials

#Given user is already on Login Page
When title of login page is "Facebook - log in or sign up"
Then user enters "dsffrhgfwetredsfd" and "grehgdsgsdfsFstgrgr"
Then user clicks on login button
Then user get error for email
#Then user quit