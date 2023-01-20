package polimorfismo;

public class fire extends pokemon {
	
				
	//costructor con atributos heredados del padre
public fire(String nombre, String tipo, int nivel, String debilidad){
		super(nombre,tipo,nivel,debilidad);
	}
//comportamiento implementado de la interfaz
@Override
	public void skillsdetipo() {
	System.out.println("ATAQUES:");
	System.out.println("LANZALLAMAS");
	System.out.println("ASCUA");
	
}
	
@Override
public String toString() {
	return "fuego [nombre=" + nombre + ", tipo=" + tipo + ", nivel=" + nivel + ", debilidas=" + debilidas + "]";
}
	

}
