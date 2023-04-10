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
	int userid;
	static Logger logger = Logger.getLogger(User.class.getName());
	User user =new User();
	
	protected static List<prod> prod0 =new ArrayList<prod>();
	
	 public prod(){
		 prod.prod0.add(new prod("c","123","t","waiting"));
		 prod.prod0.add(new prod("s","1234s","t","waiting"));
		 prod.prod0.add(new prod("f","1234","s","waiting"));
		 prod.prod0.add(new prod("sd","1234","s","waiting"));	
	    	
	    }
	
	public prod(String prodname, String picture,String dis,String s){
    	this.prodname=prodname;
    	this.picture=picture;
    	this.dis=dis;
    	this.state=s;
    	//this.req=req;
    	//this.userid= user.getid();
    	
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
	
	public static void addprod(prod a) {
		
	
			prod0.add(a);
		}
//		else
//			logger.log(Level.INFO,"you Should login first");
 void setuserid(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	}