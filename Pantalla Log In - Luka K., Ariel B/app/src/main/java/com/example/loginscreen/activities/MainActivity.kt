package com.example.loginscreen.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.loginscreen.R
import com.example.loginscreen.entities.User
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userEditText: EditText = findViewById(R.id.txtEditUser)
        val passEditText: EditText = findViewById(R.id.txtEditPass)
        val loginButton: Button = findViewById(R.id.buttonLogIn)

        loginButton.setOnClickListener {
            val username: String = userEditText.text.toString()
            val password: String = passEditText.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                showSnackbar("Inserte su nombre de usuario y contraseña por favor")
            } else {
                val isValidUser = checkUserCredentials(username, password)
                if (isValidUser) {
                    showSnackbar("Has Iniciado Sesión")
                } else {
                    showSnackbar("Usuario y/o contraseña incorrectos")
                }
            }
        }
    }

    private fun checkUserCredentials(username: String, password: String): Boolean {
        for (user in userList) {
            if (user.username == username && user.pass == password) {
                return true
            }
        }
        return false
    }

    private fun showSnackbar(message: String) {
        val snackbar = Snackbar.make(
            findViewById<View>(android.R.id.content),
            message,
            Snackbar.LENGTH_SHORT
        )
        snackbar.show()
    }

}