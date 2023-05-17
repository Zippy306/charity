package com.example.dispayfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Shelter : AppCompatActivity() {

    lateinit var btnback : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shelter)

        btnback = findViewById(R.id.btnbackshelter)


        btnback.setOnClickListener {

            var gotoLessFortunate = Intent(this, LessFortunate::class.java )
            startActivity(gotoLessFortunate)

        }

    }
}