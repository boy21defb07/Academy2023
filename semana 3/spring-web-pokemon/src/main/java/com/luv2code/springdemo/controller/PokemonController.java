package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Pokemon;
import com.luv2code.springdemo.service.PokemonService;

@Controller
@RequestMapping("/pokemon")
public class PokemonController {

	// need to inject our customer service
	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("/list")
	public String listPokemons(Model theModel) {
		
		// get customers from the service
		List<Pokemon> thePokemons = pokemonService.getPokemons();
				
		// add the customers to the model
		theModel.addAttribute("pokemons", thePokemons);
		
		return "list-pokemon";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Pokemon thePokemon = new Pokemon();
		
		theModel.addAttribute("pokemon", thePokemon);
		
		return "pokemon-form";
	}
	
	@PostMapping("/savePokemon")
	public String savePokemon(@ModelAttribute("pokemon") Pokemon thePokemons) {
		
		// save the customer using our service
		pokemonService.savePokemon(thePokemons);	
		
		return "redirect:/pokemon/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("pokeId") int theId,
									Model theModel) {
		
		// get the customer from our service
		Pokemon thePokemon = pokemonService.getPokemon(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("pokemon", thePokemon);
		
		// send over to our form		
		return "pokemon-form";
	}
	
	@GetMapping("/delete")
	public String deletePokemon(@RequestParam("pokeId") int theId) {
		
		// delete the customer
		pokemonService.deletePokemon(theId);
		
		return "redirect:/pokemon/list";
	}
}










