Feature: Manage Address Functionality

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
Scenario: Manage address functionality with valid data
When user click on manage addresses
When user click on add addresses
When user enter "Ravikiran Shinde" as name
When user enter "8208266976" as mobile number
When user enter "414001" as pincode
When user enter "Ahmednagar" as locality
When user enter "Pump House Road, Bhingar, Ahmednagar" as Address
When user select Home as address type
When user click on SAVE button
Then Application shows new address added successfully
