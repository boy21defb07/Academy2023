package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.PokemonDAO;
import com.luv2code.springdemo.entity.Pokemon;

@Service
public class PokemonServiceImpl implements PokemonService {

	// need to inject customer dao
	@Autowired
	
	@Qualifier("pokemonDAOImpljdbc")
	//@Qualifier("pokemonDAOImpl")
	private PokemonDAO pokemonDAO;
	
	
	@Override
	@Transactional
	public List<Pokemon> getPokemons() {
		return pokemonDAO.getPokemons();
	}

	@Override
	@Transactional
	public void savePokemon(Pokemon thePokemon) {

		pokemonDAO.savePokemon(thePokemon);
	}

	@Override
	@Transactional
	public Pokemon getPokemon(int theId) {
		
		return pokemonDAO.getPokemon(theId);
	}

	@Override
	@Transactional
	public void deletePokemon(int theId) {
		
		pokemonDAO.deletePokemon(theId);
	}
}





