package com.example.recycleviewpokemon.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewpokemon.R
import com.example.recycleviewpokemon.entities.Pokemon

class PokemonAdapter (
    var pokemonList : MutableList <Pokemon>,
    var onClick : (Int) -> Unit
) : RecyclerView.Adapter<PokemonAdapter.PokemonHolder>() {
    class PokemonHolder (v: View) : RecyclerView.ViewHolder(v) {
        private var view: View
        init {
            this.view = v
        }
        fun setTitle (title : String){
            var txtTitle : TextView = view.findViewById(R.id.txtTitleMovie)
            txtTitle.text = title
        }

        fun getCardView () : CardView {
            return view.findViewById(R.id.cardMovie)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_pokemon,parent,false)
        return (PokemonHolder(view))
    }

    override fun onBindViewHolder(holder: PokemonHolder, position: Int) {
        holder.setTitle(pokemonList[position].name)
        holder.getCardView().setOnClickListener {
            onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }
}