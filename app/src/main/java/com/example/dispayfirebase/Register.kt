package com.example.dispayfirebase

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class Register : AppCompatActivity() {

    lateinit var editname: EditText
    lateinit var editemail : EditText
    lateinit var editpass : EditText
    lateinit var buttonsregister : Button
    lateinit var txtalready : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        editname = findViewById(R.id.edtnameregnew)
        editemail = findViewById(R.id.edtmailregnew)
        editpass = findViewById(R.id.edtpassworgregnew)
        buttonsregister = findViewById(R.id.btnregnew)
        txtalready = findViewById(R.id.txtredy)


        txtalready.setOnClickListener {
            var gotoLogin = Intent(this, Login::class.java )
            startActivity(gotoLogin)
        }

        buttonsregister.setOnClickListener {



                var gotoLogin = Intent(this, Login::class.java )
            startActivity(gotoLogin)
        }

    }
}