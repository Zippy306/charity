package com.example.dispayfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Videos : AppCompatActivity() {

    private lateinit var lifebutton: Button
    private lateinit var buttonheil: Button
    private lateinit var buttonneedy: Button
    private lateinit var buttonvideo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)

        lifebutton=findViewById(R.id.btnlife)
        buttonheil=findViewById(R.id.bynhelp)
        buttonneedy=findViewById(R.id.btnneedy)
        buttonvideo=findViewById(R.id.btnbackvideos)


        buttonvideo.setOnClickListener {
            val gotowebsite = Intent(this, Anne::class.java)
            startActivity(gotowebsite)
        }

        buttonneedy.setOnClickListener {
            val gotowebsite = Intent(this, Needy::class.java)
            startActivity(gotowebsite)
        }



        buttonheil.setOnClickListener {
            val gotowebsite = Intent(this, Helping::class.java)
            startActivity(gotowebsite)
        }


        lifebutton.setOnClickListener {
            val gotowebsite = Intent(this, LifeACircle::class.java)
            startActivity(gotowebsite)
        }

    }
}