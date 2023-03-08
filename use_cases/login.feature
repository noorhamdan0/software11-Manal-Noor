
@tag
Feature: login 
The user wants to access his personal account

 Background: 
 
Given table
|username|password     |phone     |addres
|noor    |n            |0594407281|jenin
|manar   |m            |0594404444|nabluse


  @tag1
  Scenario: login successfully
  
    Given  that the user is not logged in
    And  The user has entered all the data correctly  "email" , "Pass"
  	Then the user is logged in successfully

  Scenario: username error
  Given that the user is not logged in
	And "Usrname" is not in the database
	Then Show "The username entered is incorrect" message.
	
@tag3
Scenario: password error
  Given that the user is not logged in
	And the "Pass" not in database
	Then Show masseg "The password entered is incorrect" 

 