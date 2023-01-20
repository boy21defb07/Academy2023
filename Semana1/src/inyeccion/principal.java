package inyeccion;


public class principal {

	public static void main(String[] args) {
		System.out.println("Mis Pokemon: ");
		
		//main donde se crea la instancia pokemon.
		pokemon pok1 = new pokemon("Charmander",30,"Agua");
		Injecdep.injectipo(pok1,"Fuego");
		System.out.println(pok1.toString());
		pok1.skillsdetipo();
		
		pokemon pok2 = new pokemon("Squirtle",35,"Electricidad");
		Injecdep.injectipo(pok2,"Agua");
		System.out.println(pok2.toString());
		pok2.skillsdetipo();
		
		
	//	System.out.println(pok1.toString());
	//	System.out.println(pok2.toString());
		
		
	}
	
	
	
	

}
