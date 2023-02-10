package rest.restpokemon.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PokemonErrorResponse {

	private int status;
	private String message;
	private long timeStamp;
	
	
	
}
