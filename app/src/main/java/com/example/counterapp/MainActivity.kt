package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    var counter = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val increaseButton = findViewById<FloatingActionButton>(R.id.increaseButton)
        val decreaseButton = findViewById<FloatingActionButton>(R.id.decreaseButton)
        val counterText = findViewById<TextView>(R.id.countText)


        increaseButton.setOnClickListener{
           counterText.text = increaseCounter().toString()

        }

        decreaseButton.setOnClickListener{
           counterText.text = decreaseCounter().toString()
        }
    }

    private fun increaseCounter() : Int{
        counter++
        return counter;
    }

   private fun decreaseCounter():Int{
        counter--
        return counter
    }


}