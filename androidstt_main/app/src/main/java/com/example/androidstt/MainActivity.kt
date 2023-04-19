package com.example.androidstt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActbutton = findViewById<Button>(R.id.menustt)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this, Menustt::class.java)
            startActivity(Intent)
        }
    }
}