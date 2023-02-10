package rest.restpokemon.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import rest.restpokemon.entity.Pokemon;

@Repository
public class PokemonDAOimpl implements PokemonDAO {
	
	private EntityManager entityManager;
	
	
	@Autowired
	public PokemonDAOimpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Pokemon> findAll() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query
		Query<Pokemon> theQuery =
				currentSession.createQuery("from Pokemon", Pokemon.class);
		
		// execute query and get result list
		List<Pokemon> pokemon = theQuery.getResultList();
		
		// return the results		
		return pokemon;
		
	}

	@Override
	public Pokemon findById(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		// get the employee
		Pokemon thePokemon =
				currentSession.get(Pokemon.class, theId);
		// return the employee
		return thePokemon;
	}

	@Override
	public void save(Pokemon thePokemon) {
		// TODO Auto-generated method stub
		// get the current hibernate session
				Session currentSession = entityManager.unwrap(Session.class);
				
				// save employee
				currentSession.saveOrUpdate(thePokemon);
			}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery(
						"delete from Pokemon where id=:pokeId");
		theQuery.setParameter("pokeId", theId);
		
		theQuery.executeUpdate();
		
	}

}
