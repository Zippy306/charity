package com.example.dispayfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Scholaships : AppCompatActivity() {

    lateinit var btnback : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scholaships)

        btnback = findViewById(R.id.btnbackschol)


        btnback.setOnClickListener {

            var gotoLessFortunate = Intent(this, LessFortunate::class.java )
            startActivity(gotoLessFortunate)

        }

    }
}