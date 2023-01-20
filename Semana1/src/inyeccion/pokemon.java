package inyeccion;

public  class pokemon {
	
		//Variables de instancia de clase.
		String nombre ;
		Tipos tipo;
		int nivel;
		String debilidas;
		
		//Constructor de pokemons
		public pokemon(String nombre, int nivel, String debilidad) {
			super();
			this.nombre = nombre;
			this.nivel = nivel;
			this.debilidas = debilidad;
		}
		//Metodo para saber los ataques
		public void skillsdetipo() {
			tipo.skillsdetipo();
			
		}

		@Override
		public String toString() {
			return "pokemon [nombre=" + nombre + ", tipo=" + tipo + ", nivel=" + nivel + ", debilidas=" + debilidas+ "]";
		}

	//abstract void skillsdetipo();
	
	
		
	
	
	
}



