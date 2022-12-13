Feature: PPW Login Page

Scenario: Login with correct creds
Given user has to enter correct uname and pw
Then click on login 
Then verify user landed to home page

Scenario: Term of service link click
Given user has to click on Term of service link
Then verify user landed on Term of service page