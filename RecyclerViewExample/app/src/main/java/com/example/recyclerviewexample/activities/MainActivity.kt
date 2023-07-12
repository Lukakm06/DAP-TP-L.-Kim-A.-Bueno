package com.example.recyclerviewexample.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.adapter.PokemonAdapter
import com.example.recyclerviewexample.databinding.ActivityMainBinding
import com.example.recyclerviewexample.entities.Pokemon
import com.example.recyclerviewexample.entities.PokemonRepository

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this,manager.orientation)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerPokemon)
        binding.recyclerPokemon.layoutManager = manager
        binding.recyclerPokemon.adapter = PokemonAdapter(PokemonRepository.pokemonList) { pokemon ->
            onItemSelected(
                pokemon
            )
        }
        binding.recyclerPokemon.addItemDecoration(decoration)
    }

    fun onItemSelected(pokemon: Pokemon){
        Toast.makeText(this,pokemon.pokeName, Toast.LENGTH_SHORT).show()
    }
}