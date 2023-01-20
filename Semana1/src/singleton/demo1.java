package singleton;

public class demo1 {

	public static void main(String[] args) {
		//obtenemos la instancia login
		login ses1 = login.getInstance();
			ses1.setUser("daniel");
			ses1.setPassword("Hola1234");
			ses1.dataSesion();
			//ses1.getObject();
		login ses2 = login.getInstance();
				ses2.setUser("alejandra");
				ses2.setPassword("adios1234");
				ses2.dataSesion();
			//ses2.getObject();
		
				login ses3 = login.getInstance();
				ses2.setUser("ruben");
				ses2.setPassword("Dinorey123");
				ses2.dataSesion();		
				
			//System.out.println(ses3.toString());demo.login@15db9742
				
	}

}
