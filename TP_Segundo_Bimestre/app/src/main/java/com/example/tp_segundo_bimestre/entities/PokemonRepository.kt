package com.example.tp_segundo_bimestre.entities

class PokemonRepository {
    private var pokemonList : MutableList<Pokemon> = mutableListOf()

    init{
        pokemonList.add(Pokemon(1,"Bulbasaur","Grass","Poison"))
        pokemonList.add(Pokemon(2,"Ivysaur","Grass","Poison"))
        pokemonList.add(Pokemon(3,"Venusaur","Grass","Poison"))
        pokemonList.add(Pokemon(4,"Charmander","Fire","None"))
        pokemonList.add(Pokemon(5,"Charmeleon","Fire","None"))
        pokemonList.add(Pokemon(6,"Charizard","Fire","Flying"))
        pokemonList.add(Pokemon(7,"Squirtle","Water","None"))
        pokemonList.add(Pokemon(8,"Wartortle","Water","None"))
        pokemonList.add(Pokemon(9,"Blastoise","Water","None"))

    }

    fun getMovies () : MutableList<Pokemon>{
        return pokemonList
    }
}