package com.example.logueoconfragmentsynavegacion

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.RecyclerAdapter



class welcome_fragment : Fragment() {

    val viewModel: sharedViewModel by activityViewModels()

    companion object {
        fun newInstance() = welcome_fragment()
    }

    lateinit var texto: TextView
    lateinit var botonMenu: Button
    lateinit var botonRecycler: Button




    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        texto = view.findViewById(R.id.muestrauser)

        botonMenu = view.findViewById(R.id.botonMenu)
        botonRecycler = view.findViewById(R.id.botonRecycler)
        texto.text = viewModel.usuarioLogeado

        botonMenu.setOnClickListener {


            findNavController().navigate(R.id.action_welcome_to_login2)

        }

        botonRecycler.setOnClickListener {


            findNavController().navigate(R.id.action_welcome_to_recyclerView2)

        }




        return view
    }

}





