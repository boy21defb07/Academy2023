package demosingleton;

public class login {
	
	//
	static private String user;
	static private String password;
	
	static login insesion ;
	
	static String sesion;
	
	login(){
		
	}

	static login getInstance() {
	if ( insesion == null ) {
			insesion = new login();   
	}
		return insesion;
	}
	
	public void dataSesion() {
		sesion = "Sesion iniciada"+":"+user;
		System.out.println(sesion);
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
	}
	
		   

