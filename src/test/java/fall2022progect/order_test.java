package fall2022progect;


import java.util.ArrayList;
import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class order_test {
	
	prod p = new prod();
	 List< prod>prod0= new ArrayList<prod>();


	 @Given("there is prodect with ORDER STATUS {string}")
	 public void thereIsProdectWithORDERSTATUS(String string) {
		 p.state="wating";
	    
	 }
	 @When("the order its just  orderd now")
	 public void theOrderItsJustOrderdNow() {
		 p.state="wating";  
	 }
	 @Then("the order status should be wating")
	 public void theOrderStatusShouldBeWating() {
	    p.state="wating";
	 }


	 @Given("there is an order with {string}")
	 public void thereIsAnOrderWith(String string) {
	   
	 }
	 @When("the order state is changed")
	 public void theOrderStateIsChanged() {
	     
	 }
	 @Then("the order with {string} status should be {string}")
	 public void theOrderWithStatusShouldBe(String string, String string2) {
		 for(int i=0; i<prod0.size();i++) {
				
				if ( prod0.get(i).prodname.equals(string)) {
		
					prod0.get(i).state=string2;
				}
				
			}
	 }



	
	
}