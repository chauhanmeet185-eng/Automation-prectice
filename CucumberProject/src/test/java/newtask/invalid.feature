Feature: Login Functionality

Scenario: Login User with incorrect email and password - invalid Functionality

Given Launch browser
And navigate to 'https:automationexercise.com'
Then verify home page is visible or not
And click on 'Signup & Login button'
Then verify Login to your account is visible or not
And Enter incorrect email and password
And click on 'login' button
Then Verify error 'Your email or password is incorrect!' is visible