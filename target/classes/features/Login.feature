Feature: Login 
@SmokeTest
Scenario: Login with standar user
Given user visits saucedemo page 
And enters valid credentials
And user add the first item to the cart
When user completes checkout
Then User is able to see Thank you for your order message





