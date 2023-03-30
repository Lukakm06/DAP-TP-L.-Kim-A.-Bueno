package com.ort.loginact

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var pass: EditText
    private lateinit var btnLogIn: Button
    private lateinit var txtView: TextView
    var userValue : String
    private var emailList : MutableList<String> = mutableListOf()
    private var passList : MutableList<String> = mutableListOf()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.EmailAdress)
        pass = findViewById(R.id.TextPassword)
        btnLogIn = findViewById(R.id.buttonLogIn)
        txtView = findViewById(R.id.textView)

        emailList.add("numero1")
        emailList.add("numero2")
        emailList.add("numero3")

        passList.add("pass1")
        passList.add("pass2")
        passList.add("pass2")

        btnLogIn.setOnClickListener {
            val checkEmail : String = email.toString()
            val emailExists = emailList.contains(checkEmail)
            if (emailExists){
                txtView.text = "Hola"

            }
        }
    }
}