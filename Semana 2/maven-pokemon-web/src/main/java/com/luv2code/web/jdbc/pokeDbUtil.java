package com.luv2code.web.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class pokeDbUtil {

	private DataSource dataSource;

	public pokeDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	public List<Pokemon> getPokemons() throws Exception {
		
		List<Pokemon> pokemons = new ArrayList<>();
		
		
		String sql = "select * from student order by last_name";
		
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
				String nombre = myRs.getString("first_name");
				String tipo = myRs.getString("last_name");
				String region = myRs.getString("email");
				
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

	public void addPokemon(Pokemon thePokemon) throws Exception {

		
		String sql = "insert into student "
				   + "(first_name, last_name, email) "
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
		
	}

	public Pokemon getPokemons(String thePokemonId) throws Exception {

		Pokemon thePokemon = null;
		String sql = "select * from student where id=?";
		try( Connection myConn = dataSource.getConnection();
			 PreparedStatement myStmt = myConn.prepareStatement(sql);	
			 ) {
			// convert student id to int
			 int PokemonId = Integer.parseInt(thePokemonId);
			// set params
			myStmt.setInt(1, PokemonId);
			
			// retrieve data from result set row
			try (ResultSet myRs = myStmt.executeQuery();){
			if (myRs.next()) {
				String nombre = myRs.getString("first_name");
				String tipo = myRs.getString("last_name");
				String region = myRs.getString("email");
				
				// use the studentId during construction
				thePokemon = new Pokemon(PokemonId, nombre, tipo, region);
			}
			else {
				throw new Exception("No se encontro al pokemon id: " + thePokemonId);
				
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

	public void updatePokemon(Pokemon thePokemon) throws Exception {
		
		String sql = "update student "
				+ "set first_name=?, last_name=?, email=? "
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

	public void deletePokemon(String thePokemonId) throws Exception {

		
		String sql = "delete from student where id=?";
		try(Connection myConn = dataSource.getConnection();
			PreparedStatement myStmt = myConn.prepareStatement(sql);) {
			// convert student id to int
			int pokemonId = Integer.parseInt(thePokemonId);
			// set params
			myStmt.setInt(1, pokemonId);
			
			// execute sql statement
			myStmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}















