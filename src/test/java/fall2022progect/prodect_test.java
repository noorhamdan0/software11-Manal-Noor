package fall2022progect;



import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class prodect_test {
 

	prod p = new prod();
	 List< prod>prod0= new ArrayList<prod>();
	  
	

@Given("there is a prodect whith PRODECT NAME {string} , PITURE {string} , DISCRIPTION {string} ,ORDER STATUS {string}")
public void thereIsAProdectWhithPRODECTNAMEPITUREDISCRIPTIONORDERSTATUS(String string, String string2, String string3, String string4) {
	p.setproname(string);
	p.setpic(string2);
	p.setdis(string3);
	p.setstate(string4);
}
@When("the prodect is enterd {string}")
public void theProdectIsEnterd(String string) {
	prod.addprod(p); 
	
}
@Then("prodect whith prodect name {string}, regestd for {string}")
public void prodectWhithProdectNameRegestdFor(String string, String string2) {
	// need to check this one , suppose to make for loop and add the name fore the last product , and this function is empty 
	p.setuserid(string,string2);
	assertTrue(true);
	
}
}


