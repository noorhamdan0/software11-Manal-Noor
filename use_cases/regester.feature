Feature: Register user



  @tag1
Scenario: Register user successful 
	
  Given there is a user whith USER NAME "usre name" ,user id "user id ", PASSWORD "pass " 
	When the user is registered "user name"
	Then the user whith NAME "usre name " , PASSWORD "pass "  is registered in the system
	
	@tag2
Scenario: a user that is already registered 
	
  Given there is a user whith USER NAME "usre name" , PASSWORD "pass " 
	When the user is registered "user name"
	Then the error message "this user is already registered" is given
	
	