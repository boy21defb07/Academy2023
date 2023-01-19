package herenciademo;

public class agua extends pokemon {
		
		public agua(String nombre, String tipo, int nivel, String debilidad){
				super(nombre,tipo,nivel,debilidad);
			}

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
