
package fall2022progect;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Invoice  {
	
	
	String add ;
	int price;
	String date; 
	
	prod p = new prod();
	protected static  List< Invoice>inv0= new ArrayList<Invoice>();
	
	 
	
	
	
	
	
	 public Invoice(){
		 Invoice.inv0.add(new Invoice(prod.prod0.get(0),"123","t",12));
		 Invoice.inv0.add(new Invoice(prod.prod0.get(1),"1234s","t",12));
		 Invoice.inv0.add(new Invoice(prod.prod0.get(3),"1234","s",13));
		 Invoice.inv0.add(new Invoice(prod.prod0.get(2),"1234","s",14));	
	    	
	    }
	 public  Invoice(prod pp , String date,String add ,int price){
       p= pp; 
	   this. add= add;
	   this.price=price;
	   this.date=date;
	    
	    	}
	
	public void setaddres(String string2) {
		
		add=string2;
	}
	public void setprice(int string3) {
		
		price=string3;
	}
	
	public static void addinv(Invoice a) {
		
		inv0.add(a);
	}
	public void setdate(String s) {
		this.date=s;
	}
	public void setuserid(String st,String st2) {
//		for (int i=0; i<inv0.size();i++) {
//			if(inv0.get(i).p.getuserid().equals(st)) {
//			inv0.get(i).setdate(st2);
//		}}
		setdate(st2);
	}
}
