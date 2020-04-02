Feature: Validate login function in OrangeHRM
Scenario: User able to login with valid credential 
Given user go to login page OrangeHRM
And user print the page title OrangeHRM
When user enters a valid user name OrangeHRM
And user enters a valid password OrangeHRM
Then user click on the login button OrangeHRM
And verify demo user page appear OrangeHRM
And user print the page title OrangeHRM
When user click on log out button OrangeHRM
And user print the page title OrangeHRM
And user close the browser OrangeHRM