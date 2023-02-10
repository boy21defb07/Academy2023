package rest.restpokemon.dao;

import java.util.List;

import rest.restpokemon.entity.Pokemon;


public interface PokemonDAO {

public List<Pokemon> findAll();
	
	public Pokemon findById(int theId);
	
	public void save(Pokemon thePokemon);
	
	public void deleteById(int theId);

}
