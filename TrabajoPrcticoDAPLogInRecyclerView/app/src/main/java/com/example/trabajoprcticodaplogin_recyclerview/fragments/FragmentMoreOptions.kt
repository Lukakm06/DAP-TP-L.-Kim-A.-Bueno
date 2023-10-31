package com.example.trabajoprcticodaplogin_recyclerview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.trabajoprcticodaplogin_recyclerview.R
import com.example.trabajoprcticodaplogin_recyclerview.viewmodels.FragmentListViewModel
import com.example.trabajoprcticodaplogin_recyclerview.viewmodels.FragmentLogInViewModel
import com.example.trabajoprcticodaplogin_recyclerview.viewmodels.FragmentMoreOptionsViewModel

class FragmentMoreOptions : Fragment() {

    companion object;

    private lateinit var viewModelMoreOpt: FragmentMoreOptionsViewModel
    private lateinit var viewModelList: FragmentListViewModel
    private lateinit var v : View
    private lateinit var number : TextView
    private lateinit var name : TextView
    private lateinit var type1 : TextView
    private lateinit var type2 : TextView
    private lateinit var weight : TextView
    private lateinit var height : TextView
    private lateinit var editButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        v = inflater.inflate(R.layout.fragment_fragment_more_options, container, false)
        number = v.findViewById(R.id.tvPokeNumOpt)
        name = v.findViewById(R.id.tvPokeNameOpt)
        type1 = v.findViewById(R.id.tvPokeType1Opt)
        type2 = v.findViewById(R.id.tvPokeType2Opt)
        weight = v.findViewById(R.id.tvPokeWeightOpt)
        height = v.findViewById(R.id.tvPokeHeightOpt)
        editButton = v.findViewById(R.id.editButton)
        return v
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModelMoreOpt = ViewModelProvider(requireActivity())[FragmentMoreOptionsViewModel::class.java]
        viewModelList = ViewModelProvider(requireActivity())[FragmentListViewModel::class.java]

        number.text = viewModelList.pokemonNum
        name.text = viewModelList.pokemonName
        type1.text = viewModelList.pokemonType1
        type2.text = viewModelList.pokemonType2
        weight.text = viewModelList.pokemonWeight
        height.text = viewModelList.pokemonHeight

        editButton.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_fragmentMoreOptions_to_fragmentEditInfo)
        }
    }

}