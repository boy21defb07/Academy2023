package rest.restpokemon.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import rest.restpokemon.entity.Pokemon;
import rest.restpokemon.service.PokemonService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PokemonController {

	private  PokemonService pokemonservice;
	
	@Autowired
	public PokemonController(PokemonService thepokemonservice) {
		pokemonservice = thepokemonservice;
	}

	@GetMapping("/pokemons")
	public List<Pokemon> findAll() {
		return pokemonservice.findAll();
	}

	@GetMapping("/pokemons/{pokeId}")
	public Pokemon getPokemon(@PathVariable int pokeId) {
		
		Pokemon thePokemon = pokemonservice.findById(pokeId);
		
		if (thePokemon == null) {
			throw new PokemonNotFoundException("Pokemon id not found - " + pokeId);
		}
		return thePokemon;
	}

	@PostMapping("/pokemons")
	public Pokemon savePokemon(@RequestBody Pokemon thePokemon) {
		thePokemon.setId(0);
	
		pokemonservice.save(thePokemon);
	
		return thePokemon;
	}
	
	@PutMapping("/pokemons")
	public Pokemon updatePokemon(@RequestBody Pokemon thePokemon) {
	
		pokemonservice.save(thePokemon);
		return thePokemon;

	}

	@DeleteMapping("/pokemons/{pokeId}")
	public String deletePokemon(@PathVariable int pokeId) {
		
		Pokemon thePokemon = pokemonservice.findById(pokeId);
		
		if (thePokemon == null) {
			throw new PokemonNotFoundException("Pokemon id not found - " + pokeId);
		}
		
		pokemonservice.deleteById(pokeId);
		
//	 return	new ResponseEntity<String>(
//			 "Deleted Pokemon id"+ pokeId,HttpStatus.OK);
		
		return "Deleted Pokemon id - " + pokeId;
	}
	

}
