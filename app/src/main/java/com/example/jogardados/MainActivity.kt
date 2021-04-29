package com.example.jogardados

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoJogarDado: Button = findViewById(R.id.botaoJogarDado)
        botaoJogarDado.setOnClickListener { jogarDado() }

        jogarDado()
    }

    private fun jogarDado() {
        val dado = Dado(6)
        val valorSorteado = dado.jogar()
        val imageViewDado: ImageView = findViewById(R.id.imageViewDado)
        val imgDado = when (valorSorteado) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imageViewDado.setImageResource(imgDado)
    }
}

class Dado (val lados: Int) {
    fun jogar(): Int {
        return (1..lados).random()
    }
}