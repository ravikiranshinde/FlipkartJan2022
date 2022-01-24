Feature: Login feature

Background: user is successfully logged in
Given user open "Chrome" browser
Given user enter url as

@SmokeTest
Scenario: Login Functionality with valid credentials
When user click on cancle button
When user move on Login DropDown
When user click on My Profile
When user enter "8208266976" as username
When user enter "Shinde@0987" as password
When user click on Login button
Then Application shows user profile to user











