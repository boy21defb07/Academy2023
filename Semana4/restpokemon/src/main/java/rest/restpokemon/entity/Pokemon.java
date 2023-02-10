package rest.restpokemon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="pokemon")
public class Pokemon {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String Nombre;
	
	@Column(name="tipo")
	private String Tipo;
	
	@Column(name="region")
	private String Region;
	
	public Pokemon() {
		
	}

	public Pokemon(String nombre, String tipo, String region) {
		Nombre = nombre;
		Tipo = tipo;
		Region = region;
	}
	

	

	
		
}