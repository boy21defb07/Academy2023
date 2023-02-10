package rest.restpokemon.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class PokemonRestExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<PokemonErrorResponse> handleException(PokemonNotFoundException exc) {
		
		
		PokemonErrorResponse error = new PokemonErrorResponse(
											HttpStatus.NOT_FOUND.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		// return ResponseEntity
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	

	@ExceptionHandler
	public ResponseEntity<PokemonErrorResponse> handleException(Exception exc) {
		
		// create CustomerErrorResponse
		
		PokemonErrorResponse error = new PokemonErrorResponse(
											HttpStatus.BAD_REQUEST.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		// return ResponseEntity
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
}
