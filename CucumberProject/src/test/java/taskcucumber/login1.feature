Feature: Login1 functionality

Scenario: user should be able to login with valid credentials

Given open browser
And Go to url
When user enter data in uname and password
And click on login button
Then user should redirect on home page