Feature: Profile Information Functionality

Background: User is on Flipkart main page and mouse over login window
Given user open "Chrome" browser
Given user enter url as
Given user click on cancle button
Given user move on Login DropDown
Given user click on My Profile
Given user enter "8208266976" as username
Given user enter "Shinde@0987" as password
Given user click on Login button

@SmokeTest
Scenario: Profile Inforamtion functionality with valid data
When user click on Profile Information 
When user enters "Ravikiran" as First Name
When user enters "Shinde" as Last Name
When user select Male as Gender
When user click on Save Button
Then application shows Profile Information added Successfully