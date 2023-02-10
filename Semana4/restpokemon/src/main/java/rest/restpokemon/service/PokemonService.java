package rest.restpokemon.service;

import java.util.List;

import rest.restpokemon.entity.Pokemon;


public interface PokemonService {
	
public List<Pokemon> findAll();
	
	public Pokemon findById(int theId);
	
	public void save(Pokemon thePokemon);
	
	public void deleteById(int theId);
	

}
