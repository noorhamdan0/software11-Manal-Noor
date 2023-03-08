package fall2022progect;

import java.util.logging.*;
import java.util.ArrayList;
import java.util.List;

public class User {
	static Logger logger = Logger.getLogger(User.class.getName());
	
	String Usrname;
	String Pass;
	boolean loginstat;
	
	protected static List<User> users0 =new ArrayList<User>();

	public User(String name, String pass){
    	this.Usrname=(name);
    	this.Pass=(pass);
    	}
	
	public User () {
		loginstat = false;	
	}


	public void setUsrname(String string) {
		
		Usrname=string;
		
	}
public String getusername() {
		
		return Usrname;
	}

	public void setPass(String string2) {
		
		Pass=string2;
	}
public String getpass() {
		
		return Pass;
	}

	public void setloginstat(boolean b) {
		
		this.loginstat = b;
	}

public boolean getlog() {
		
		return loginstat;
	}


public boolean  loginCH(String string, String string2) {
	
	if(string.equals(Usrname) && string2.equals(Pass)) {
		loginstat = true;
	}
	
	else loginstat = false;
	
	setloginstat(loginstat);
	return loginstat;
}

public boolean isRegest(String string) {
	
	for (int i = 0 ; i<users0.size();i++) {
		if (users0.get(i).getusername().equals(string))
			return true;
	}
	return false;
}

public static void adduser(User a) {
	User u = new User();
	if(u.getlog()) {
		users0.add(a);
	}
	else
		logger.log(Level.INFO,"you Should login first");
}
}



