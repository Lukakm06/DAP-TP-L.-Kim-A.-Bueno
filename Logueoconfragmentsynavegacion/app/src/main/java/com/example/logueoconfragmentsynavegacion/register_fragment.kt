package com.example.logueoconfragmentsynavegacion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar


class register_fragment : Fragment() {

    val viewModel: sharedViewModel by activityViewModels() //Linea que conecta el sharedViewModel con este fragment.


    companion object {
        fun newInstance() = register_fragment()
    }



    private lateinit var usuario: EditText
    private lateinit var contrasena: EditText
    private lateinit var botonRegistro: Button
    private lateinit var botonInicio: Button
    lateinit var textoUser: String
    lateinit var textoPass: String


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_register, container, false)

        usuario = view.findViewById(R.id.gapEmail)
        contrasena = view.findViewById(R.id.gapPassword)
        botonRegistro = view.findViewById(R.id.botonRegister)
        botonInicio = view.findViewById(R.id.botonInicio)

        botonRegistro.setOnClickListener {


            textoUser = usuario.text.toString() //Convertimos a una string lo que se encuentra dentro del gap, al momento de presionar el boton.
            textoPass = contrasena.text.toString()


            if (textoUser == "" || textoPass == "") {
                Snackbar.make(it, "Complete los campos", Snackbar.LENGTH_SHORT).show()
            }

            else if (textoUser in viewModel.listaCliente.map { it.users }) { //Pregunta si el texto en el gap se encuentra en la liosta de usuarios ya registrados.
                Snackbar.make(it, "Usuario no disponible", Snackbar.LENGTH_SHORT).show()
            }

            else if (textoUser !in viewModel.listaCliente.map { it.users } && textoUser != "" && textoPass != "") {

                viewModel.listaCliente.add(client(textoUser, textoPass))
                findNavController().navigate(R.id.action_register2_to_login2)
            }
        }

        botonInicio.setOnClickListener {
            findNavController().navigate(R.id.action_register2_to_login2)
        }


        return view

    }

}
