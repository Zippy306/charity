package com.example.dispayfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class LifeACircle : AppCompatActivity() {

    private lateinit var buttonlifecircle: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_acircle)

        buttonlifecircle = findViewById(R.id.mLifeCircle)
        val webSettings = buttonlifecircle.settings
        webSettings.javaScriptEnabled = true
        buttonlifecircle.loadUrl("https://www.youtube.com/watch?v=ovj5dzMxzmc")



    }
}
