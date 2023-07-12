package com.example.logueoconfragmentsynavegacion

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.RecyclerAdapter



class recyclerView : Fragment() {

    companion object {
        fun newInstance() = welcome_fragment()
    }


    private lateinit var viewModel: RecyclerViewViewModel



    private lateinit var recyclerView: RecyclerView
    private lateinit var botonMenu: Button


    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_recycler_view, container, false)


        recyclerView = view.findViewById(R.id.recyclerView)
        botonMenu = view.findViewById(R.id.botonMenu)

        botonMenu.setOnClickListener {

            findNavController().navigate(R.id.action_recyclerView2_to_login2)

        }
        return view
    }



    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = RecyclerAdapter()


    }

}

