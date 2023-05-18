package fall2022progect;

import java.util.ArrayList;
import java.util.List;

public class invoice {
	String invid;
	String deladd;
	String price;
	String cid;
	String date;
	
	protected static List<invoice> inv0 =new ArrayList<invoice>();
	
	public invoice () {
		
		 invoice.inv0.add(new invoice("1","nablus","60","123","29/3"));
		 invoice.inv0.add(new invoice("2","nablus","65","156","28/3"));
	}
	
	public invoice(String id ,String deladd, String price,String cid,String date){
    	this. date= date;
    	this .deladd=deladd;
    	this.cid =cid;
    	this.price=price;
    	this.invid=id;
    	

}

public void setinvid(String string) {
	
	this.invid=string;
}
public void setpri(String string0) {
	
	this.price=string0;
}
public void setdate(String string1) {
    this.date=string1;
	
}
public void setcid(String string2) {
	this.cid=string2;
	
}
public void setadd(String string2) {
	this.deladd=string2;
	
}



public static void addinv(invoice a) {
	

		inv0.add(a);
	}

}
