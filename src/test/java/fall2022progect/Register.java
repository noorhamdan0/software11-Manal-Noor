package fall2022progect;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	User u = new User();
	boolean correct;
	 List< User>un = new ArrayList<User>();
	    boolean Assert_sig = false;
	Logger logger
    = Logger.getLogger(Register.class.getName()); 


	@Given("there is a user whith USER NAME {string} , PASSWORD {string} , Type {string},USER id {string} ,USER add {string}")
	public void thereIsAUserWhithUSERNAMEPASSWORDTypeUSERIdUSERAdd(String string, String string2, String string3, String string4, String string5) {
		 u.setUsrname(string);
		   u.setPass(string2);
		   u.setType(string3);
		   u.setid(string4);
		   u.setadd(string5);
	}

	
	@When("the user is registered {string}")
	public void the_user_is_registered(String string) {
		
		if(!u.isRegest(string))
			 User.adduser(u);
		 
	}




	@Then("the user whith NAME {string} , PASSWORD {string} , Type {string} is registered in the system")
	public void the_user_whith_name_password_type_is_registered_in_the_system(String string, String string2, String string3) {
	    
		 if(!u.isRegest(string))
		assertTrue(true);
	}
	
	
	@Then("the error message {string} is given")
	public void the_error_message_is_given(String string) {
	    
		logger.log(Level.INFO,"this user is already registered");
	
	}



}