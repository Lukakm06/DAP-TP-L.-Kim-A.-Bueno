package com.example.logueoconfragmentsynavegacion

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/*

En el sharedViewModel se crean todas las variables y/o elementos que se quieran compartir.
En este caso, como se quiere compartir la lista de usuarios entre el fragment de login y el de register,
se coloca en este archivo. Lo mismo pasa con el usuario que selogea, dato compartido entre el fragment
de login y el de welcome.

*/



class sharedViewModel: ViewModel() {


    var listaCliente: MutableList<client> = mutableListOf(

        client("a", "a"),
        client("rape", "doc"),
        client("santi", "eul"),
        client("ariel", "slon"),


        )

    var usuarioLogeado: String = ""

}