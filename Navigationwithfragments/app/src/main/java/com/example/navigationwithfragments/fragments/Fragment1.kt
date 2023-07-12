package com.example.navigationwithfragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.navigationwithfragments.R
import com.example.navigationwithfragments.entities.UsersRepository

class Fragment1 : Fragment() {

    val viewModel: ViewModel by activityViewModels()

    companion object {
        fun newInstance() = Fragment1()
    }

    lateinit var email : EditText
    lateinit var password : EditText
    lateinit var logInButton : Button
    lateinit var registerButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        logInButton.setOnClickListener {
            val view = inflater.inflate(R.layout.fragment_1, container, false)
            val button = view.findViewById<Button>(R.id.RegisterButton)
            email = view.findViewById(R.id.EditTextEmail)
            password = view.findViewById(R.id.EditTextPass)
            logInButton = view.findViewById(R.id.LogInButton)
            registerButton = button
        }

        registerButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }
        return view
    }

    private fun checkUserCredentials(username: String, password: String): Boolean {
        for (user in userList) {
            if (user.username == username && user.pass == password) {
                return true
            }
        }
        return false
    }
}