package com.example.navigationwithfragments.viewmodels

import androidx.lifecycle.ViewModel
import com.example.navigationwithfragments.entities.Users

class ViewModel : ViewModel() {
    companion object {
        val userList = listOf<Users>(
            Users(
                "luka",
                "12345"
            ),

            Users(
                "ari",
                "Hola"
            ),

            Users(
                "celes",
                "ponce"
            ),

            Users(
                "paula",
                "1000"
            )
        )
    }
}