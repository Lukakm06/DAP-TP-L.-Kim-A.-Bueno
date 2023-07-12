package com.example.recyclerviewexample.entities

class PokemonRepository {
        companion object{
        val pokemonList = listOf<Pokemon>(
            Pokemon(
                "1",
                "Bulbasaur",
                "Plant",
                "Poison",
                6.9f,
                0.7f,
                "Overgrow/Chlorophyll"
            ),
            Pokemon(
                "2",
                "Ivysaur",
                "Plant",
                "Poison",
                13.0f,
                1.0f,
                "Overgrow/Chlorophyll"
            ),
            Pokemon(
                "3",
                "Venusaur",
                "Plant",
                "Poison",
                100.0f,
                2.0f,
                "Overgrow/Chlorophyll"
                ),
            Pokemon(
                "4",
                "Charmander",
                "Fire",
                "None",
                8.5f,
                0.6f,
                "Blaze/Solar Power"
            ),
            Pokemon(
                "5",
                "Charmeleon",
                "Fire",
                "None",
                19.0f,
                1.1f,
                "Blaze/Solar Power"
            ),
            Pokemon(
                "6",
                "Charizard",
                "Fire",
                "Flying",
                90.5f,
                1.7f,
                "Blaze/Solar Power"
            ),
            Pokemon(
                "7",
                "Squirtle",
                "Water",
                "None",
                9.0f,
                0.5f,
                "Torrent/Rain Dish"
            ),
            Pokemon(
                "8",
                "Wartortle",
                "Water",
                "None",
                22.5f,
                1.0f,
                "Torrent/Rain Dish"
            ),
            Pokemon(
                "9",
                "Blastoise",
                "Water",
                "None",
                85.5f,
                1.6f,
                "Torrent/Rain Dish"
            )
        )
    }
}