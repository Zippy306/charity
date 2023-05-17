package com.example.dispayfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Helping : AppCompatActivity() {

    private lateinit var buttonhelp: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helping)

        buttonhelp = findViewById(R.id.mhelp)
        val webSettings = buttonhelp.settings
        webSettings.javaScriptEnabled = true
        buttonhelp.loadUrl("https://youtu.be/jqOwwmpK4yA")


    }
}