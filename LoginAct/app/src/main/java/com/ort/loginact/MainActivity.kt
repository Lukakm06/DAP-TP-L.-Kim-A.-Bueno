package com.ort.loginact

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
    private var checkMail: String = "hola"
    private var checkPass: String = "hola"
    private var inputTextMail: String = ""
    private var inputTextPass: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogIn.setOnClickListener() {
            inputTextMail = email.text.toString()
            inputTextPass = pass.text.toString()
            if (inputTextMail == checkMail && inputTextPass == checkPass) {
                txtView.text = "Ingresado Correctamente"
            }
            else {
                txtView.text = "E-mail o Contraseña Incorrecta"
            }
        }
    }
}