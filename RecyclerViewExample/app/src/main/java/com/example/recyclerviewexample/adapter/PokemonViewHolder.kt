package com.example.recyclerviewexample.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.databinding.ItemPokemonBinding
import com.example.recyclerviewexample.entities.Pokemon

class PokemonViewHolder (view: View):RecyclerView.ViewHolder(view){

    private val binding = ItemPokemonBinding.bind(view)

    fun render(pokemonModel : Pokemon, onClickListener:(Pokemon) -> Unit) {
        binding.tvPokeNum.text = pokemonModel.pokeNum
        binding.tvPokeName.text = pokemonModel.pokeName
        binding.tvPokeType1.text = pokemonModel.pokeType1
        binding.tvPokeType2.text = pokemonModel.pokeType2
        binding.cardPokemon.setOnClickListener{
            onClickListener(pokemonModel)
        }

        itemView.setOnClickListener{
            Toast.makeText(
                binding.tvPokeName.context,
                pokemonModel.pokeName,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}