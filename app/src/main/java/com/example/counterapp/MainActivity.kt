package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val increaseButton = findViewById<FloatingActionButton>(R.id.increaseButton)
        val decreaseButton = findViewById<FloatingActionButton>(R.id.decreaseButton)
        val counterText = findViewById<TextView>(R.id.countText)

        var counter = 0;

        increaseButton.setOnClickListener{
           counter = counterText.text.toString().toInt()
            counter.inc()

        }

        decreaseButton.setOnClickListener{
            counter = counterText.text.toString().toInt()
            counter.dec()
        }
    }
}