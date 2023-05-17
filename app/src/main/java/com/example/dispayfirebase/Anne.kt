package com.example.dispayfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Anne : AppCompatActivity() {

    lateinit var buttonless : Button
    lateinit var buttonrefugees : Button
    lateinit var buttonblood : Button
    lateinit var buttonback : Button
    lateinit var buttonvideos : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anne)

        buttonless = findViewById(R.id.btnless)
        buttonrefugees = findViewById(R.id.btnref)
        buttonblood = findViewById(R.id.btnblood)
        buttonback = findViewById(R.id.btnbacktologinpage)
        buttonvideos = findViewById(R.id.btnvideos)


        buttonvideos.setOnClickListener {

            var gotoVideos = Intent(this, Videos::class.java )
            startActivity(gotoVideos)

        }



        buttonback.setOnClickListener {

            var gotoLogin = Intent(this, Login::class.java )
            startActivity(gotoLogin)

        }


        buttonless.setOnClickListener {

            var gotoLessFortunate = Intent(this, LessFortunate::class.java )
            startActivity(gotoLessFortunate)

        }

        buttonrefugees.setOnClickListener {

            var gotoRefugees = Intent(this, Refugees::class.java )
            startActivity(gotoRefugees)

        }


        buttonblood.setOnClickListener {

            var gotoBloodDonation = Intent(this, BloodDonation::class.java )
            startActivity(gotoBloodDonation)

        }


        }


    }
