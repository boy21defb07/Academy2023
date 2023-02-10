package rest.restpokemon.rest;

public class PokemonNotFoundException extends RuntimeException{
	
	public PokemonNotFoundException() {
	}

	public PokemonNotFoundException(String message) {
		super(message);
	}

	public PokemonNotFoundException(Throwable cause) {
		super(cause);
	}

	public PokemonNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public PokemonNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}


}
