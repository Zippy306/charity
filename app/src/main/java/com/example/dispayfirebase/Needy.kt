package com.example.dispayfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Needy : AppCompatActivity() {

    private lateinit var buttonneedy: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_needy)

        buttonneedy = findViewById(R.id.btnneedy)
        val webSettings = buttonneedy.settings
        webSettings.javaScriptEnabled = true
        buttonneedy.loadUrl("https://youtu.be/lrBEHrhGqlI")



    }
}