package com.ort.loginconalgomas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import Package.Drink

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var newDrink: Drink = Drink(1,"CocaCola",20.0,1.5)

        val userWritten: EditText = findViewById(R.id.editUser)
        val passWritten: EditText = findViewById(R.id.editPass)
        val confirmButton: Button = findViewById(R.id.loginButton)



        confirmButton.setOnClickListener {
            val username: String = userWritten.text.toString()
            val password: String = passWritten.text.toString()

            if (username == "admin" && password == "admin") {
                showSnackbar("Login successful!")
            } else {
                showSnackbar("Login unsuccessful")
            }
            if(username.isEmpty() && password.isEmpty()){
                showSnackbar("Please insert your Username and Password")
            }
        }
    }

    fun showSnackbar(message: String) {
        val snackbar = Snackbar.make(
            findViewById<View>(android.R.id.content),
            message,
            Snackbar.LENGTH_SHORT
        )
        snackbar.show()
    }
}