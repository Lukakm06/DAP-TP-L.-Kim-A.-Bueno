package com.example.trabajoprcticodaplogin_recyclerview.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.trabajoprcticodaplogin_recyclerview.R
import com.example.trabajoprcticodaplogin_recyclerview.viewmodels.FragmentEditInfoViewModel

class FragmentEditInfo : Fragment() {

    private lateinit var confirmButton : Button
    private lateinit var v : View
    companion object {
        fun newInstance() = FragmentEditInfo()
    }

    private lateinit var viewModel: FragmentEditInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment_edit_info, container, false)
        v = inflater.inflate(R.layout.fragment_fragment_more_options, container, false)
        confirmButton = v.findViewById(R.id.confitmButton)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentEditInfoViewModel::class.java)
        confirmButton.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_fragmentEditInfo_to_fragmentMoreOptions)
        }
    }

}