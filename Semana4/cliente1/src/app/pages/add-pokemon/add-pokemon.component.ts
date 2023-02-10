import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { switchMap } from 'rxjs/operators';
import { Pokemon } from 'src/app/interface/pokemon';
import { PokemonService } from '../pokemon.service';


@Component({
  selector: 'app-add-pokemon',
  templateUrl: './add-pokemon.component.html',
  styleUrls: ['./add-pokemon.component.css']
})
export class AddPokemonComponent implements OnInit {

  pokemon: Pokemon={
    id :0,
    nombre: '',
    tipo: '',
    region: ''


  }

 
  constructor(private PokemonService:PokemonService , private router: Router ,private activatedRoute: ActivatedRoute,) { }

  ngOnInit(): void {
    this.activatedRoute.params
      .pipe(
        switchMap( ({id}) => this.PokemonService.getPokemonPorId( id ) )
      )
      .subscribe( pokemon => this.pokemon = pokemon );

  }

  submitData(thePokemon: Pokemon) {


    if(this.pokemon.id){
      // Actualizar
this.PokemonService.actualizarPokemon( thePokemon)
.subscribe( thePokemon =>{
    this.router.navigate(['/lista']);
    console.log(thePokemon);
  });
 }else{

 // Crear
    this.PokemonService.agregarPokemon( thePokemon )
    .subscribe( elpokemon => {
      this.router.navigate(['/lista', elpokemon.id ]);
    })
    console.log(thePokemon);

 }
    // Crear
    // this.PokemonService.agregarPokemon( thePokemon )
    // .subscribe( elpokemon => {
    //   this.router.navigate(['/lista', elpokemon.id ]);
    // })
   
     

  
  }

}
