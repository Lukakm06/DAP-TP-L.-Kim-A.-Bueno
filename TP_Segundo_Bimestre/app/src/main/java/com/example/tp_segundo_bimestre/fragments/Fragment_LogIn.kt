package com.example.tp_segundo_bimestre.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tp_segundo_bimestre.FragmentLogInViewModel
import com.example.tp_segundo_bimestre.R

class Fragment_LogIn : Fragment() {

    companion object {
        fun newInstance() = Fragment_LogIn()
    }

    private lateinit var viewModel: FragmentLogInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment__log_in, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentLogInViewModel::class.java)
        // TODO: Use the ViewModel
    }

}