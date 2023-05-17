package com.example.dispayfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Refugees : AppCompatActivity() {

    lateinit var buttonrefdonor : Button
    lateinit var buttonvol : Button
    lateinit var buttonback : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refugees)


        buttonrefdonor = findViewById(R.id.btnrefd)
        buttonvol = findViewById(R.id.btnrefvol)
        buttonback = findViewById(R.id.btnbacktoanne)

        buttonrefdonor.setOnClickListener {
            var gotoDonorsRef = Intent(this, DonorsRef::class.java)
            startActivity(gotoDonorsRef)

        }

        buttonback.setOnClickListener {
            var gotoAnne = Intent(this, Anne::class.java)
            startActivity(gotoAnne)

        }

        buttonvol.setOnClickListener {
            var gotoVolunteers = Intent(this, Volunteers::class.java)
            startActivity(gotoVolunteers)

        }


    }
}