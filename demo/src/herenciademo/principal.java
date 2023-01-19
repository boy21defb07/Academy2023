package herenciademo;

public class principal {

	public static void main(String[] args) {
		System.out.println("Mis Pokemon");
		
		pokemon pok1 = new fire("Charmander","Fuego",99,"agua");
		pokemon pok2 = new agua("Squirtle","Agua",90,"Electrisidad");
		
		
		pok1.skillsdetipo();
		pok2.skillsdetipo();
		
		System.out.println(pok1.toString());
		System.out.println(pok2.toString());
		
		
	}
	
	
	
	

}
