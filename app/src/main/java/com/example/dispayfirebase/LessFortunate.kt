package com.example.dispayfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LessFortunate : AppCompatActivity() {

    lateinit var buttonschol : Button
    lateinit var buttonshelter : Button
    lateinit var buttonjobs : Button
    lateinit var buttonvisitations : Button
    lateinit var buttonback : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_less_fortunate)

        buttonschol = findViewById(R.id.btns)
        buttonshelter = findViewById(R.id.btnshel)
        buttonjobs = findViewById(R.id.btnjobs)
        buttonvisitations = findViewById(R.id.btnvis)
        buttonback = findViewById(R.id.btnbblogin)

        buttonback.setOnClickListener {

            var gotoAnne = Intent(this, Anne::class.java )
            startActivity(gotoAnne)

        }



        buttonschol.setOnClickListener {
            var gotoScholaships = Intent(this, Scholaships::class.java)
            startActivity(gotoScholaships)
        }

        buttonshelter.setOnClickListener {
            var gotoShelter = Intent(this, Shelter::class.java)
            startActivity(gotoShelter)
        }

        buttonjobs.setOnClickListener {
            var gotoJobs = Intent(this, Jobs::class.java)
            startActivity(gotoJobs)
    }


        buttonvisitations.setOnClickListener {
            var gotoVisitations = Intent(this, Visitations::class.java)
            startActivity(gotoVisitations)
        }



}}