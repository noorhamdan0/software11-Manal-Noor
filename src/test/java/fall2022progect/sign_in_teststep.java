package fall2022progect;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.logging.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class sign_in_teststep {
     User u = new User();
    
     Logger logger
     = Logger.getLogger(sign_in_teststep.class.getName());		
	
     
     @Given("table")
  	
  	public void table(io.cucumber.datatable.DataTable dataTable) {
  		
  	}
     
      
	@Given("that the user is not logged in")
	public void thatTheUserIsNotLoggedIn() {
	 
		
		boolean f = u.getlog();
		assertFalse(f);
		
		
	}
	
	// the first scenario: log in succ
	@Given("The user has entered all the data correctly  {string} , {string}")
	public void theUserHasEnteredAllTheDataCorrectlyEmailPassword(String string, String string2) {
		
		u.setUsrname(string);
		u.setPass(string2);
		u.loginCH(string, string2);
		
	}
	@Then("the user is logged in successfully")
	public void theUserIsLoggedInSuccessfully() {
		 u.setloginstat(true);
		    assertTrue( u.getlog());
	}
	
	// the second scenario: log in filed not in database
	
	@Given("<username> is not in the database")
	public void usernameIsNotInTheDatabase(String s) {
	    
		if (!User.users0.equals(s)) {
			 
			 u.setloginstat(false);
		}
		 assertFalse(u.getlog());
	}
	
	@Then("Show {string} message.")
	public void showMessage(String string) {
		
		 string="the password is wrong";
		 logger.log(Level.INFO,string);
		   
	}



	
}
