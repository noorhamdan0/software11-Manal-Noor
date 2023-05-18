package fall2022progect;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class inv {
	invoice inv = new invoice();

	@Given("there is a invoice whith  {string} , DELIVERY ADDRESS {string} ,ORDER PRICE {string} ,CUSTMER ID {string}")
	public void thereIsAInvoiceWhithDELIVERYADDRESSORDERPRICECUSTMERID(String string, String string2, String string3, String string4) {
	   inv.setcid(string);
	   inv.setadd(string2);
	   inv.setpri(string3);
	   inv.setcid(string4);
	   
	}
	
	@When("the order has been completed and delivered to the customer")
	public void theOrderHasBeenCompletedAndDeliveredToTheCustomer() {
		
	    }
	
	@Then("an invoice should be generated with {string}")
public void anInvoiceShouldBeGeneratedWith(String string) {
  inv.setdate(string);
  invoice.addinv(inv);
		
}

	
}
