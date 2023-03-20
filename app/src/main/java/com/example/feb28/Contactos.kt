package com.example.feb28

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.graphics.Color
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
val MY_PERM_READ_CONT=0
class Contactos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactos)
        CheckPerm()
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_CONTACTS),MY_PERM_READ_CONT)
    }
    fun CheckPerm(){
        val Check=ContextCompat.checkSelfPermission(this,Manifest.permission.READ_CONTACTS)
        if(Check==PackageManager.PERMISSION_GRANTED){
            val result=findViewById<TextView>(R.id.Resultado)
            result.setText("Access Granted")
            result.setTextColor(Color.GREEN)
            Toast.makeText(this,"Gracias",Toast.LENGTH_SHORT).show()
        }
        else{
            val result=findViewById<TextView>(R.id.Resultado)
            result.setText("Access Denied")
            result.setTextColor(Color.RED)
            Toast.makeText(this,"K",Toast.LENGTH_SHORT).show()
        }
    }
}