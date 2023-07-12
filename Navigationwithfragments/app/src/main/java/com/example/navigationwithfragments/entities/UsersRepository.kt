package com.example.navigationwithfragments.entities

class UsersRepository {
    companion object{
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