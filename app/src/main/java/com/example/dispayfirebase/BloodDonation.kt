package com.example.dispayfirebase

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class BloodDonation : AppCompatActivity() {

    lateinit var editnem: EditText
    lateinit var editage : EditText
    lateinit var editgroup : EditText
    lateinit var editphone : EditText
    lateinit var editlocation : EditText
    lateinit var buttonreceiver : Button
    lateinit var buttondonor : Button
    lateinit var buttonback : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blood_donation)

        editnem = findViewById(R.id.edtnamerd)
        editage = findViewById(R.id.edtagerd)
        editgroup = findViewById(R.id.edtblooggrouprd)
        editphone = findViewById(R.id.edtphone)
        editlocation = findViewById(R.id.edtloc)
        buttonreceiver = findViewById(R.id.btnreceiver)
        buttondonor = findViewById(R.id.btndonor)
        buttonback = findViewById(R.id.btnbackblood)


        buttonback.setOnClickListener {

            var gotoAnne = Intent(this, Anne::class.java )
            startActivity(gotoAnne)

        }



        buttondonor.setOnClickListener {

            var name = editnem.text.toString().trim()
            var age = editgroup.text.toString().trim()
            var group = editgroup.text.toString().trim()
            var phone = editphone.text.toString().trim()
            var location = editlocation.text.toString().trim()
            var time_id = System.currentTimeMillis().toString()

            //progress bar
            var progress = ProgressDialog(this)
            progress.setTitle("Saving Data")
            progress.setMessage("Please Wait")

            if (name.isEmpty() || age.isEmpty() || group.isEmpty() || phone.isEmpty() || location.isEmpty()) {

                Toast.makeText(this, "Cannot Submit an empty field", Toast.LENGTH_SHORT).show()
            }  else {

                var my_child = FirebaseDatabase.getInstance().reference.child("Names/" + time_id)
                var user_data = UserReceiver(name, age, group, phone, location,  time_id)

                //show progress
                progress.show()

                my_child.setValue(user_data).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Data Uploaded", Toast.LENGTH_SHORT).show()

                        //navigate
                        var gotoview = Intent(this, ViewUsersReceivers::class.java)
                        startActivity(gotoview)

                    } else {

                        Toast.makeText(this, "Failed to Upload Data", Toast.LENGTH_SHORT).show()

                    }


                }





            }

        }

        buttonreceiver.setOnClickListener {

            var name = editnem.text.toString().trim()
            var age = editgroup.text.toString().trim()
            var group = editgroup.text.toString().trim()
            var phone = editphone.text.toString().trim()
            var location = editlocation.text.toString().trim()
            var time_id = System.currentTimeMillis().toString()

            //progress bar
            var progress = ProgressDialog(this)
            progress.setTitle("Saving Data")
            progress.setMessage("Please Wait")

//validate

            if (name.isEmpty() || age.isEmpty() || group.isEmpty() || phone.isEmpty() || location.isEmpty()) {

                Toast.makeText(this, "Cannot Submit an empty field", Toast.LENGTH_SHORT).show()
            }  else {

                var my_child = FirebaseDatabase.getInstance().reference.child("Names/" + time_id)
                var user_data = UserReceiver(name, age, group, phone, location,  time_id)

                //show progress
                progress.show()

                my_child.setValue(user_data).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Data Uploaded", Toast.LENGTH_SHORT).show()

                        //navigate
                        var gotoview = Intent(this, ViewUsersReceivers::class.java)
                        startActivity(gotoview)

                    } else {

                        Toast.makeText(this, "Failed to Upload Data", Toast.LENGTH_SHORT).show()

                    }


                }





            }}}}



