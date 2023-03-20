package com.example.feb28

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GoToContactos()
    }
    fun GoToContactos(){
        val buttonCountries = findViewById<ImageButton>(R.id.ContactosButton)
        buttonCountries.setOnClickListener {
            val intent = Intent(this, Contactos::class.java)
            startActivity(intent)
        }
    }
}