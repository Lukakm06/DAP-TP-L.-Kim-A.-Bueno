package com.example.tp_segundo_bimestre.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tp_segundo_bimestre.viewmodels.FragmentRegisterViewModel
import com.example.tp_segundo_bimestre.R

class Fragment_Register : Fragment() {

    companion object {
        fun newInstance() = Fragment_Register()
    }

    private lateinit var viewModel: FragmentRegisterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment__register, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentRegisterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}