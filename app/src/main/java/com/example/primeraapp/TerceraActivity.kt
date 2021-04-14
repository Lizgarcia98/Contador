package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TerceraActivity : AppCompatActivity() {

        lateinit var btnAtras2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)

        btnAtras2 = findViewById(R.id.btnAtras2)

        btnAtras2.setOnClickListener {
            val miIntent4 = Intent(this,MainActivity::class.java)
            startActivity(miIntent4)
        }

    }
}