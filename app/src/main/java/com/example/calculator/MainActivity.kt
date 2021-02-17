package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addition()

    }

    private fun addition() {

        val calculateButton: Button = findViewById(R.id.calculate_button)
        val num1: EditText = findViewById(R.id.etNum1)
        val num2: EditText = findViewById(R.id.etNum2)
        val result: TextView = findViewById(R.id.tvAnswer)

        calculateButton.setOnClickListener {
            result.text = (num1.text.toString() + num2.text.toString())
            Toast.makeText(this, result.text, Toast.LENGTH_LONG).show()
        }

    }
}//onMainActivity