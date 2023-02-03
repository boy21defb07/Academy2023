package com.luv2code.springdemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Pokemon;

@Repository
public class PokemonDAOImpljdbc implements PokemonDAO {

	@Autowired
	DataSource dataSource;
	
	@Override
	public List<Pokemon> getPokemons() {
		
List<Pokemon> pokemons = new ArrayList<>();
		
		
		String sql = "select * from pokemon order by tipo";
		
		try(Connection myConn = dataSource.getConnection();
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery(sql);	) {
			// get a connection
			// create sql statement
			// execute query
			// process result set
			while (myRs.next()) {
				
				// retrieve data from result set row
				int id = myRs.getInt("id");
				String nombre = myRs.getString("nombre");
				String tipo = myRs.getString("tipo");
				String region = myRs.getString("region");
				
				// create new student object
				Pokemon tempPok = new Pokemon(id, nombre, tipo, region);
				
				// add it to the list of students
				pokemons.add(tempPok);	
				
			}
			
			return pokemons;		
		}
		catch (Exception e) {
			e.printStackTrace();
			return pokemons;
		}
	}

		

	@Override
	public void savePokemon(Pokemon thePokemon) {
		if (thePokemon.getId()==0) {
			
			String sql = "insert into pokemon "
					   + "(nombre, tipo, region) "
					   + "values (?, ?, ?)";
			try(Connection myConn = dataSource.getConnection();
				PreparedStatement myStmt = myConn.prepareStatement(sql);) {
		
				// set the param values for the student
				myStmt.setString(1, thePokemon.getNombre());
				myStmt.setString(2, thePokemon.getTipo());
				myStmt.setString(3, thePokemon.getRegion());
				
				// execute sql insert
				myStmt.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else {
			
			String sql = "update pokemon "
					+ "set nombre=?, tipo=?, region=? "
					+ "where id=?";
			try(Connection myConn = dataSource.getConnection(); 
				PreparedStatement myStmt = myConn.prepareStatement(sql);	) {
			
				
				// set params
				myStmt.setString(1, thePokemon.getNombre());
				myStmt.setString(2, thePokemon.getTipo());
				myStmt.setString(3, thePokemon.getRegion());
				myStmt.setInt(4, thePokemon.getId());
				
				// execute SQL statement
				myStmt.execute();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public Pokemon getPokemon(int theId) {
		
		Pokemon thePokemon = null;
		String sql = "select * from pokemon where id=?";
		try( Connection myConn = dataSource.getConnection();
			 PreparedStatement myStmt = myConn.prepareStatement(sql);	
			 ) {
			// convert student id to int
			 int PokemonId = theId;
			// set params
			myStmt.setInt(1, PokemonId);
			
			// retrieve data from result set row
			try (ResultSet myRs = myStmt.executeQuery();){
			if (myRs.next()) {
				String nombre = myRs.getString("nombre");
				String tipo = myRs.getString("tipo");
				String region = myRs.getString("region");
				
				// use the studentId during construction
				thePokemon = new Pokemon(PokemonId, nombre, tipo, region);
			}
			else {
				throw new Exception("No se encontro al pokemon id: " + theId);
				
			}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			return thePokemon;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return thePokemon;
		
	}

	@Override
	public void deletePokemon(int theId) {
		
		String sql = "delete from pokemon where id=?";
		try(Connection myConn = dataSource.getConnection();
			PreparedStatement myStmt = myConn.prepareStatement(sql);) {
			// convert student id to int
			int pokemonId = theId;
			// set params
			myStmt.setInt(1, pokemonId);
			
			// execute sql statement
			myStmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}











