package com.example.recycleviewpokemon.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewpokemon.R
import com.example.recycleviewpokemon.adapter.PokemonAdapter
import com.example.recycleviewpokemon.entities.PokemonRepository
import com.example.recycleviewpokemon.fragments.PokemonViewModel

class PokemonFragment : Fragment() {
    companion object {
        fun newInstance() = PokemonFragment()
    }

    private lateinit var viewModel: PokemonViewModel

    private lateinit var v : View
    private lateinit var recMovie : RecyclerView
    private var repository = PokemonRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v =  inflater.inflate(R.layout.pokemon_list_fragment, container, false)
        recPokemon = v.findViewById(R.id.recPokemon)
        return v
    }

    override fun onStart() {
        super.onStart()

        recMovie.setHasFixedSize(true)

        recMovie.layoutManager  = LinearLayoutManager(context)

        recMovie.adapter = PokemonAdapter(repository.getMovies()){ index ->
            onItemClick(index)
        }

    }

    fun onItemClick (pos : Int){

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PokemonViewModel::class.java)
        // TODO: Use the ViewModel
    }
}