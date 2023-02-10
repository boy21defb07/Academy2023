import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddPokemonComponent } from './pages/add-pokemon/add-pokemon.component';
import { PokemonsTableComponent } from './pages/pokemons-table/pokemons-table.component';

const routes: Routes = [
  {
    path: '',
    component: PokemonsTableComponent
  },
  {
    path: 'add',
    component: AddPokemonComponent
  },
{
  path:'**',
  redirectTo: ''
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
  
  


