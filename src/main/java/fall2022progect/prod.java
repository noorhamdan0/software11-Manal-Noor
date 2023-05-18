package fall2022progect;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class prod {

	String prodname ;
	String picture ;
	String dis;
	String req;
	String state;
	String userid;
	static Logger logger = Logger.getLogger(User.class.getName());
	User user =new User();
	
	protected static List<prod> prod0 =new ArrayList<prod>();
	
	 public prod(){
		 prod.prod0.add(new prod("119","c","123","t","waiting"));
		 prod.prod0.add(new prod("118","s","1234s","t","waiting"));
		 prod.prod0.add(new prod("117","f","1234","s","waiting"));
		 prod.prod0.add(new prod("116","sd","1234","s","waiting"));	
	    	
	    }
	
	public prod(String id ,String prodname, String picture,String dis,String s){
    	this.prodname=prodname;
    	this.picture=picture;
    	this.dis=dis;
    	this.state=s;
    	
    	this.userid= id;
    	
    	}
	
	public void setproname(String string) {
		
		this.prodname=string;
	}
	public void setpic(String string0) {
		
		this.picture=string0;
	}
	public void setdis(String string1) {
	    this.dis=string1;
		
	}
	public void setreq(String string2) {
		//this.req=req;
		
	}
	public void setstate(String string2) {
		state=string2;
		
	}
	
	public String getprodname() {
		return this.prodname;
		
	}
	public String getuserid() {
		return this.userid;
		
	}
	
	public static void addprod(prod a) {
		
	
			prod0.add(a);
		}

 void setuserid(String string, String string2) {
		for (int i=0; i<prod0.size();i++) {
			if(prod0.get(i).getprodname().equals(string)) {
			prod0.get(i).userid=string2;
		}}
		
	}

public void delete(String pid) {
	// TODO Auto-generated method stub
	
}
	}