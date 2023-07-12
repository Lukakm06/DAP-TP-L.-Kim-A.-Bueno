package com.example.logueoconfragmentsynavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar


class client (usuario:String,password:String){ //Clase cliente con los atributos de usuario y contraseña.

    var users = usuario
    var passwords = password

}

class login_fragment : Fragment() {

    val viewModel: sharedViewModel by activityViewModels() //Linea que conecta el sharedViewModel con este fragment.

    companion object {
        fun newInstance() = login_fragment()
    }


    lateinit var user: EditText
    lateinit var pass: EditText
    lateinit var loginBoton: Button
    lateinit var registerBoton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_login, container, false)


        user = view.findViewById(R.id.gapEmail)
        pass = view.findViewById(R.id.gapPassword)
        loginBoton = view.findViewById(R.id.botonInicio)
        registerBoton = view.findViewById(R.id.botonRegister)



        loginBoton.setOnClickListener {

            val username: String = .text.toString()
            val password: String = pass.text.toString()

            var userEncontrado: client? = viewModel.listaCliente.find { u -> u.users == username }
            var passEncontrado: client? = viewModel.listaCliente.find { u -> u.passwords == password }

            if ((userEncontrado != null) && (userEncontrado.passwords == password)) {

                viewModel.usuarioLogeado = username

                findNavController().navigate(R.id.action_login2_to_welcome2)

            }



        }

        registerBoton.setOnClickListener {

            findNavController().navigate(R.id.action_login2_to_register2)

        }
        return view
    }

}

