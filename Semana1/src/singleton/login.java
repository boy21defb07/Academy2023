package singleton;

public class login {
	
	//variables de  clase
	static private String user;
	static private String password;
	static login insesion ;
	static String sesion;
	
	login(){
		
	}
	//Metodo que crea la instancia login.
	static login getInstance() {
	if ( insesion == null ) {
			insesion = new login();   
	}
		return insesion;
	}
	//metodo para regresar los usuarios que iniciaron sesio.
	public void dataSesion() {
		System.out.println("Sesion iniciada"+":"+user);
	}
	//metodo set para asigarnle un valor a la variable user debido a que esta es privada.
	public void setUser(String user) {
		this.user = user;
	}
	//metodo set para asignarle un valor a la variable password debido a que esta es privada.
	public void setPassword(String password) {
		this.password = password;
	}
		
	}
	
		   

