package com.example.dispayfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Jobs : AppCompatActivity() {

    lateinit var btnback : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jobs2)

        btnback = findViewById(R.id.ntnbackjob)


        btnback.setOnClickListener {

            var gotoLessFortunate = Intent(this, LessFortunate::class.java )
            startActivity(gotoLessFortunate)

        }


    }
}