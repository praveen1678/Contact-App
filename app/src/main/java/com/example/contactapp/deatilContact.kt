package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class deatilContact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deatil_contact)
        val userprofile = findViewById<ImageView>(R.id.userprofileimage)
        val username = findViewById<TextView>(R.id.username)
        val usernumber = findViewById<TextView>(R.id.contactNumber)

        val userProfile  = intent.getIntExtra("profileImage",R.drawable.image1)
        val userName  = intent.getStringExtra("name")
        val userNumber = intent.getStringExtra("number")

        userprofile.setImageResource(userProfile)
        username.text= userName
        usernumber.text=userNumber

    }
}