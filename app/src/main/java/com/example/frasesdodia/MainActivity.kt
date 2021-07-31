package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var message: TextView
    val sentences = arrayOf(
        "Quando chover, busque pelo arco-íris. Quando escurecer, busque pelas estrelas.",
        "Seja o piloto de suas histórias e voe o mais alto que conseguir.",
        "Nenhum mar calmo torna um marinheiro especialista em navegação.",
        "Quem tem luz própria jamais ficará na escuridão."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message = findViewById(R.id.message) as TextView
    }

    fun generateMessage(view: View){
        val totalIntensArray = sentences.size
        val sentence = Random().nextInt(totalIntensArray)

        message.setText(sentences[sentence])
    }
}