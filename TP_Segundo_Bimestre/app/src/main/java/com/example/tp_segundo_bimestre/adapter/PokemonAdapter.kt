package com.example.tp_segundo_bimestre.adapter

import com.example.tp_segundo_bimestre.entities.Pokemon
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tp_segundo_bimestre.adapter.PokemonViewHolder

class PokemonAdapter(val pokemonList:List<Pokemon>) : RecyclerView.Adapter<PokemonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {

    }

    override fun getItemCount(): Int = pokemonList.size

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
    }

}