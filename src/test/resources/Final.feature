@project
Feature: Validate login function in automationpratice 
Scenario: User able to login with valid credential
Given user go to automationpractice webpage
When user click on login button enter valid username password and submit login button
Then user get the home page and verify the website title
And user click on dresses button on upper left corner
Then user print all the prices values in sorted order
And user select the second dress on that list price is changing every minute
And user add the dress to the shopping cart and proceed
Then user on the next page verify the total price with shipping logout and close the browser