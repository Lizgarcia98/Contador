package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
        //Declaracion de Variables
        var contador = 0

        lateinit var btnIncrementar:Button
        lateinit var btnDecrementar:Button
        lateinit var btnAtras:Button
        lateinit var tvContador:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        //Inicializacion de Variables

        btnIncrementar = findViewById(R.id.btnIncrementar)
        btnDecrementar = findViewById(R.id.btnDecrementar)
        btnAtras = findViewById(R.id.btnAtras)
        tvContador = findViewById(R.id.tvNumero)

        btnAtras.setOnClickListener {
            val miIntent3 = Intent(this,MainActivity::class.java)
            startActivity(miIntent3)
        }

        btnIncrementar.setOnClickListener {
            if (contador<10){
                contador++
            }else{
                btnIncrementar.isEnabled = false
            }
            tvContador.text = "$contador"
        }
        btnDecrementar.setOnClickListener {
        if (contador>1){
            contador--
        }else{
            btnDecrementar.isEnabled = true
        }
            tvContador.text = "$contador"
        }
    }


}