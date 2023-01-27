package com.luv2code.web.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/pokeControllerServlet")
public class pokeControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private pokeDbUtil pokeDbUtil;
	
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		// create our student db util ... and pass in the conn pool / datasource
		try {
			pokeDbUtil = new pokeDbUtil(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			// read the "command" parameter
			String theCommand = request.getParameter("command");
			
			// if the command is missing, then default to listing students
			if (theCommand == null) {
				theCommand = "LIST";
			}
			
			// route to the appropriate method
			switch (theCommand) {
			
			case "LIST":
				listPokemons(request, response);
				break;
				
			case "ADD":
				addPokemon(request, response);
				break;
				
			case "LOAD":
				loadPokemon(request, response);
				break;
				
			case "UPDATE":
				updatePokemon(request, response);
				break;
			
			case "DELETE":
				deletePokemon(request, response);
				break;
				
			default:
				listPokemons(request, response);
			}
				
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
		
	}

	private void deletePokemon(HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		// read student id from form data
		String thePokemonId = request.getParameter("pokeId");
		
		// delete student from database
		pokeDbUtil.deletePokemon(thePokemonId);
		
		// send them back to "list students" page
		listPokemons(request, response);
	}

	private void updatePokemon(HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		// read student info from form data
		int id = Integer.parseInt(request.getParameter("pokeId"));
		String nombre = request.getParameter("nombre");
		String tipo = request.getParameter("tipo");
		String region = request.getParameter("region");
		
		// create a new student object
		
		Pokemon thePokemon = new Pokemon(id, nombre, tipo, region);
		
		// perform update on database
		pokeDbUtil.updatePokemon(thePokemon);
		
		// send them back to the "list students" page
		listPokemons(request, response);
		
	}

	private void loadPokemon(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// read student id from form data
		String thePokemonId = request.getParameter("pokeId");
		
		// get student from database (db util)
		Pokemon thePokemon = pokeDbUtil.getPokemons(thePokemonId);
		
		// place student in the request attribute
		request.setAttribute("THE_POKEMON", thePokemon);
		
		// send to jsp page: update-student-form.jsp
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/update-pokemon.jsp");
		dispatcher.forward(request, response);		
	}

	private void addPokemon(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student info from form data
		String nombre = request.getParameter("nombre");
		String tipo = request.getParameter("tipo");
		String region = request.getParameter("region");		
		
		// create a new student object
		Pokemon thePokemon = new Pokemon(nombre, tipo, region);
		
		// add the student to the database
		pokeDbUtil.addPokemon(thePokemon);
				
		// send back to main page (the student list)
		listPokemons(request, response);
	}

	private void listPokemons(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// get students from db util
		List<Pokemon> pokemons = pokeDbUtil.getPokemons();
		
		// add students to the request
		request.setAttribute("THE_POKEMON", pokemons);
				
		// send to JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-pokemon.jsp");
		dispatcher.forward(request, response);
	}

}













