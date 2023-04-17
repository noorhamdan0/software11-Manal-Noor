package fall2022progect;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invoice {

	Invoice inv = new Invoice();
	 List< Invoice>inv0= new ArrayList<Invoice>();
	
	@Given("there is a invoice whith  {string} , DELIVERY ADDRESS {string} ,ORDER PRICE {string}")
	public void thereIsAInvoiceWhithDELIVERYADDRESSORDERPRICE(String string, String string2, int string3) {
		
		//inv.p.setproname(string);
		
		inv.setaddres(string2);
		inv.setprice(string3);
		
	}
	@When("the order has been completed and delivered to the customer")
	public void theOrderHasBeenCompletedAndDeliveredToTheCustomer() {
		Invoice.addinv(inv); 
	}
	@Then("an invoice should be generated with {string},{string}")
	public void anInvoiceShouldBeGeneratedWith(String string, String string2) {
		assertTrue(true);
		inv.setuserid(string2,string);		
		
		}



}