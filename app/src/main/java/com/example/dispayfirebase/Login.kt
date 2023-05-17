package com.example.dispayfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {

    lateinit var editusername : EditText
    lateinit var editpass1 : EditText
    lateinit var buttonlogin : Button
    lateinit var txtsignup : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        editusername = findViewById(R.id.edtusername)
        editpass1 = findViewById(R.id.edtlgpass)
        buttonlogin = findViewById(R.id.btnlogin)
        txtsignup = findViewById(R.id.txtttsn)


        buttonlogin.setOnClickListener {

            var gotoanne = Intent(this, Anne::class.java )
            startActivity(gotoanne)

        }

        txtsignup.setOnClickListener {
            var gotoRegister = Intent(this, Register::class.java )
            startActivity(gotoRegister)
        }


    }
}