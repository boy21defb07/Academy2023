package rest.restpokemon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rest.restpokemon.dao.PokemonDAO;
import rest.restpokemon.entity.Pokemon;

@Service
public class PokemonServiceimpl implements PokemonService {
	
	
	private PokemonDAO pokemonDAO;
	
	@Autowired
	public PokemonServiceimpl(PokemonDAO thePokemonDAO) {
		pokemonDAO =  thePokemonDAO;
	}

	@Override
	@Transactional
	public List<Pokemon> findAll() {
		return pokemonDAO.findAll();
	}

	@Override
	@Transactional
	public Pokemon findById(int theId) {
		// TODO Auto-generated method stub
		return pokemonDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Pokemon thePokemon) {
		// TODO Auto-generated method stub
		pokemonDAO.save(thePokemon);
		
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		pokemonDAO.deleteById(theId);
	}

}
