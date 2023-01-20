package inyeccion;

public class fire extends Tipos {
	//Variables de clase.
	static String tipo;
	
	//costructor.
	public fire(String tipo){
			this.tipo = tipo;
		}

	//Metodo de habilidades cambia su comportamiento segun el tipo de pokemon
	public void skillsdetipo() {
	System.out.println("ATAQUES:");
	System.out.println("LANZALLAMAS");
	System.out.println("ASCUA");
		
}
	
@Override
public String toString() {
	return tipo ;
	}
	

}
