package com.example.dispayfirebase

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    lateinit var editname: EditText
    lateinit var editemail : EditText
    lateinit var editpass : EditText
    lateinit var buttonsubmitdata : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editname = findViewById(R.id.edtnamereg)
        editemail = findViewById(R.id.edtmail)
        editpass = findViewById(R.id.edtpassreg)
        buttonsubmitdata = findViewById(R.id.btnreg)

        buttonsubmitdata.setOnClickListener {

            var name = editname.text.toString().trim()
            var email = editemail.text.toString().trim()
            var pass = editpass.text.toString().trim()
            var time_id = System.currentTimeMillis().toString()

            //progress bar
            var progress = ProgressDialog(this)
            progress.setTitle("Saving Data")
            progress.setMessage("Please Wait")

//validate

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty()) {

                Toast.makeText(this, "Cannot Submit an empty field", Toast.LENGTH_SHORT).show()
            }  else {

                var my_child = FirebaseDatabase.getInstance().reference.child("Names/" + time_id)
                var user_data = User(name, email, pass, time_id)

                //show progress
                progress.show()

                my_child.setValue(user_data).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Data Uploaded", Toast.LENGTH_SHORT).show()

                        //navigate
                        var gotoview = Intent(this, ViewUsers::class.java)
                        startActivity(gotoview)

                    } else {

                        Toast.makeText(this, "Failed to Upload Data", Toast.LENGTH_SHORT).show()

                    }


                }





            }}}}
