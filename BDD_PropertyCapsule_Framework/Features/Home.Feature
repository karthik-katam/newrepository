Feature: Verify the functionality for HomePage.Feature

Background: verify the functionality of navigate to Propertycapsule site
Given User should navigate to propertycapsule site "https://www.propertycapsule.com/"
Then User  verify the homepage of the title 

@home
Scenario Outline: TC01_Verify Login functionality
When user click on Deal Marcker signup/login button
And User click on Linkedin tab to enter login details
When User enter the email address "<email>"
And User enter the password "<password>"
And User Click on SignIn
And User close the browser
 Examples:
 | email                      | password |
 | katamkarthikkumar@gmail.com| Karthik8612@|
 
 #===============================================================
 #===============================================================
 
 @home
 Scenario: TC02_Extract all links from the Homepage
 When User verify to get all links
 And User close the browser
 #==================================================================
 #=================================================================
 
 @home
 Scenario: TC03_Verify See for Yourself functionality
 When User click on See for yourself button
 Then User verify the Contact us popup is displayed 
 And User enters First Name as "Karthik Kumar Reddy"
 And User enters Last Name as "Katam"
 And User enters Email address "karthik@trulytravel.tech"
 And User click on Submit button
 Then User Verify the Thank you popup is displayed
 And User close the browser
 
 #===================================================================
 #==================================================================
 @home
 Scenario: TC04_Verify Product announcement Section
 Then User Verify Product announcement section is displayed
 And User close the browser
 #================================================================
 #====================================================================
  @home
 Scenario: TC05_Verify Product announcement Section
 Then User Verify Product announcement section is not displayed
 And User close the browser
 