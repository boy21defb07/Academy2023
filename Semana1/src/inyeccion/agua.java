package inyeccion;

public class agua extends Tipos {
	//Variables de clase.
	 static String tipo;
	//costructor.
		public agua( String tipo){
				this.tipo = tipo;
			}

		//Metodo de habilidades cambia su comportamiento segun el tipo de pokemon	
	public void skillsdetipo() {
			System.out.println("ATAQUES:");
			System.out.println("HIDROBOMBA");
			System.out.println("SURF");
			
		}

		@Override
		public String toString() {
		return  tipo;
		}
			
	
	
}
