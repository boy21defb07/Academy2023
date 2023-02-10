import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PokemonsTableComponent } from '../pokemons-table/pokemons-table.component';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from 'src/app/app-routing.module';
import { BrowserModule } from '@angular/platform-browser';
import { AddPokemonComponent } from '../add-pokemon/add-pokemon.component';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    PokemonsTableComponent,
    AddPokemonComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    AppRoutingModule,
    BrowserModule,
    FormsModule
    
    
  ],exports:[
    PokemonsTableComponent
    
  ]
})
export class PagesModule { }
