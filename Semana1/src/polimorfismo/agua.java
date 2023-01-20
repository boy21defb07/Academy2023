package polimorfismo;

public class agua extends pokemon {
	//costructor con atributos heredados del padre
		public agua(String nombre, String tipo, int nivel, String debilidad){
				super(nombre,tipo,nivel,debilidad);
			}

		//comportamiento implementado de la interfaz	
		@Override
	public void skillsdetipo() {
			System.out.println("ATAQUES:");
			System.out.println("HIDROBOMBA");
			System.out.println("SURF");
			
		}

		@Override
		public String toString() {
		return "agua [nombre=" + nombre + ", tipo=" + tipo + ", nivel=" + nivel + ", debilidas=" + debilidas + "]";
		}
			
	
	
}
