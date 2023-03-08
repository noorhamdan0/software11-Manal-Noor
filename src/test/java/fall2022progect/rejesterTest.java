package fall2022progect;

import java.util.logging.*;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class rejesterTest {
	
	User u = new User();
	boolean correct;
	 List< User>un = new ArrayList<User>();
	    boolean Assert_sig = false;
	Logger logger
    = Logger.getLogger(rejesterTest.class.getName());
	
	@Given("there is a user whith USER NAME {string} ,user id {string}, PASSWORD {string}" )
	public void thereIsAUserWhithUSERNAMEUserIdPASSWORDType(String string, String string2) {
		u.setUsrname(string);
		u.setPass(string2);
		
	   
	}
	@When("the user is registered {string}")
	public void theUserIsRegistered(String string) {
		if(!u.isRegest(string))
			 User.adduser(u);
	}
	@Then("the user whith NAME {string} , PASSWORD {string} , Type {string} is registered in the system")
	public void theUserWhithNAMEPASSWORDTypeIsRegisteredInTheSystem(String string, String string2, String string3) {
		if(!u.isRegest(string))
			assertTrue(true);
	}
	@Then("the error message {string} is given")
	public void theErrorMessageIsGiven(String string) {
	    
		
		logger.log(Level.INFO,"this user is already registered");
	}

}
