package com.example.jogardados

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewResultado: TextView = findViewById(R.id.textViewResultado)
        textViewResultado.text = "Clique em Jogar Dado"

        val botaoJogarDado: Button = findViewById(R.id.botaoJogarDado)
        botaoJogarDado.setOnClickListener { jogarDado() }
    }

    private fun jogarDado() {
        val dado = Dado(20)
        val valorSorteado = dado.jogar()
        val textViewResultado: TextView = findViewById(R.id.textViewResultado)
        textViewResultado.text = valorSorteado.toString()
    }
}

class Dado (val lados: Int) {
    fun jogar(): Int {
        return (1..lados).random()
    }
}