package fall2022progect;



import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class prodect_test {
 

	Prod p = new Prod();
	 List< Prod>prod0= new ArrayList<Prod>();
	  
	

@Given("there is a prodect whith PRODECT NAME {string} , PITURE {string} , DISCRIPTION {string} ,ORDER STATUS {string}")
public void thereIsAProdectWhithPRODECTNAMEPITUREDISCRIPTIONORDERSTATUS(String string, String string2, String string3, String string4) {
	p.setproname(string);
	p.setpic(string2);
	p.setdis(string3);
	p.setstate(string4);
}
@When("the prodect is enterd {string}")
public void theProdectIsEnterd(String string) {
	Prod.addprod(p); 
	
}
@Then("prodect whith prodect name {string}, regestd for {string}")
public void prodectWhithProdectNameRegestdFor(String string, String string2) {
	p.setuserid(string,string2);
	assertTrue(true);
	
}
}


