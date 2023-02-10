import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Pokemon } from 'src/app/interface/pokemon';
import { PokemonService } from '../pokemon.service';


@Component({
  selector: 'app-pokemons-table',
  templateUrl: './pokemons-table.component.html',
  styleUrls: ['./pokemons-table.component.css']
})

export class PokemonsTableComponent implements OnInit {

  pokemons : Pokemon[] = [];
  

  constructor(private pokemonService: PokemonService,private router: Router ) { }

  ngOnInit(): void {
    this.pokemonService.getPokemons()
    .subscribe((pokemons): Pokemon[] => this.pokemons = pokemons);
    console.log(this.pokemons)

    // this.heroesService.getHeroes()
    // .subscribe( heroes => this.heroes = heroes );




    
  }
  
  deletePokemon( pokemon: Pokemon ):void{
  this.pokemonService.borrarPokemon(pokemon.id)
  .subscribe( resp =>{
    this.router.navigate(['/lista']);
  } );
  this.ngOnInit();
}



}
