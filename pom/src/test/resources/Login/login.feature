@Login
Feature: Login features
This feature includes scenario that would validate the following features
1. Login as Admin
2. Login as Linda.anderson
3. Login with negative data 

Background:
Given I am able to navigate onto the login page

#
#Scenario: Login as Admin
#When I enter the username as "Admin"
#And I enter the password as "admin123"
#And I click on the login button
#Then I should see the user name as "Welcome Test"
#Scenario: Login as Linda.anderson
#When I enter the username as "linda.anderson"
#And I enter the password as "linda.anderson"
#And I click on the login button
#Then I should see the user name as "Welcome Linda"
#Scenario: Login with Negative data
#When I enter the username as "sneha"
#And I enter the password as "sneha"
#And I click on the login button
#Then I should see an error message as "Invalid Credentials"


Scenario Outline: Login with different user
When I enter the username as "<user>"
And I enter the password as "<pwd>"
And I click on the login button
Then I should see the user name as "<name>"


Examples:
|user |pwd |name |
|Admin|admin123|Welcome Linda|
|linda.anderson|linda.anderson|Welcome Linda|

@negative
Scenario: Login with Negative data
When I enter the username as "sneha"
And I enter the password as "sneha"
And I click on the login button
Then I should see an error message as "Invalid Credentials"

