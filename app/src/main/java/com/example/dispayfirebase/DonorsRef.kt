package com.example.dispayfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DonorsRef : AppCompatActivity() {

    lateinit var btnback : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donors_ref)

        btnback = findViewById(R.id.btndonref)


        btnback.setOnClickListener {

            var gotoRefugees = Intent(this, Refugees::class.java )
            startActivity(gotoRefugees)

    }
}}