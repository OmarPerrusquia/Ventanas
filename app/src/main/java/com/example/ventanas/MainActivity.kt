package com.example.ventanas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1:Button=findViewById(R.id.boton1)


        boton1.setOnClickListener {//BOTON 1 CUADRADO
            var v1: Intent=Intent(this,Ventana2::class.java)
            startActivity(v1)


        }





    }
}