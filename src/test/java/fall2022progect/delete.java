package fall2022progect;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class delete {

	User user =new User();
	Prod p = new Prod();
	
	String cid;
	String pid;
	@Given("there is coustumer with {string}")
	public void thereIsCoustumerWith(String string) {
	  
	   cid = string ;
	   
	}
	
	@When("the user selects a customer to delete")
	public void theUserSelectsACustomerToDelete() {
		  
		
	}
	
	@Then("the customer is removed from the database")
	public void theCustomerIsRemovedFromTheDatabase() {
		user.delete(cid);
		
	}
	@Then("a success message is displayed")
	public void aSuccessMessageIsDisplayed() {
		System .out.print("the user "+cid+"deleteed");
	    
	}
	
	//************************************************************************************************

	@Given("there is product with {string}")
	public void thereIsProductWith(String string) {
 
		  pid = string ;
		
	}
	
	@When("the user selects a product to delete")
	public void theUserSelectsAProductToDelete() {
	   
	}
	
	@Then("the product is removed from the database")
	public void theProductIsRemovedFromTheDatabase() {
	  
		p.delete(pid);
	}
	
	@Then("a success message is displayede")
	public void aSuccessMessageIsDisplayede() {
		System .out.print("the product "+pid+"deleteed");
	}

	
	
}
