package inyeccion;


public class Injecdep {
	//creacion de instacia tipo
  static Tipos tipo1  = new fire("Fuego");	
  static Tipos tipo2  = new agua("Agua");	
	
	//Metodo para inyectar independencia   
	static Tipos injectipo(pokemon pokemon1 , String tipo) {
			if(tipo=="Fuego") {
				return pokemon1.tipo = tipo1; //variable de referencia 
			}else {
				return  pokemon1.tipo = tipo2;
			}
		
	}
	
}
