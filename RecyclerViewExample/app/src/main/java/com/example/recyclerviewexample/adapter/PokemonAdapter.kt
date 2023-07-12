package com.example.recyclerviewexample.adapter

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.entities.Pokemon

class PokemonAdapter(private val pokemonList:List<Pokemon>, private val onClickListener:(Pokemon) -> Unit) : RecyclerView.Adapter<PokemonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PokemonViewHolder(layoutInflater.inflate(R.layout.item_pokemon, parent, false))
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val item = pokemonList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = pokemonList.size
}