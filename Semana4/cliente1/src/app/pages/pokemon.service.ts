import { Injectable } from '@angular/core';
import { HttpClient } from'@angular/common/http';
import { Observable } from 'rxjs';
import { Pokemon } from '../interface/pokemon';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PokemonService {
  
  private baseUrl: string = environment.baseUrl;

  constructor( private http:HttpClient) { }


  getPokemons():Observable<Pokemon[]>{
      return this.http.get<Pokemon[]>(`${this.baseUrl}`);
}

getPokemonPorId( id: number ):Observable<Pokemon> {
  return this.http.get<Pokemon>(`${ this.baseUrl }/${ id }`);
}

agregarPokemon( pokemon: Pokemon ): Observable<Pokemon> {
  return this.http.post<Pokemon>(`${ this.baseUrl }/`, pokemon );
}

actualizarPokemon( pokemon: Pokemon ): Observable<Pokemon> {
  return this.http.put<Pokemon>(`${ this.baseUrl }/`,pokemon);
}

borrarPokemon( id: number ): Observable<String> {
  return this.http.delete(`${ this.baseUrl }/${ id }`,{ responseType: 'text' });
}

}
