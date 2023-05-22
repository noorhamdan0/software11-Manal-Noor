package fall2022progect;

import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;

public class Prod {

	String prodname ;
	String picture ;
	String dis;
	String req;
	String state;
	String userid;
	static Logger logger = Logger.getLogger(User.class.getName());
	User user =new User();
	
	protected static List<Prod> prod0 =new ArrayList<Prod>();
	
	 public Prod(){
		 Prod.prod0.add(new Prod("119","c","123","t","waiting"));
		 Prod.prod0.add(new Prod("118","s","1234s","t","waiting"));
		 Prod.prod0.add(new Prod("117","f","1234","s","waiting"));
		 Prod.prod0.add(new Prod("116","sd","1234","s","waiting"));	
	    	
	    }
	
	public Prod(String id ,String prodname, String picture,String dis,String s){
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
	
	public static void addprod(Prod a) {
		
	
			prod0.add(a);
		}

 void setuserid(String string, String string2) {
		for (int i=0; i<prod0.size();i++) {
			if(prod0.get(i).getprodname().equals(string)) {
			prod0.get(i).userid=string2;
		}}
		
	}

public void delete(String pid) {
	
	
}
	}