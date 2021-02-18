package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


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
        val result: EditText = findViewById(R.id.tvAnswer)

        calculateButton.setOnClickListener {
            val val1 = num1.text.toString().toInt().toDouble()
            val val2 = num2.text.toString().toInt().toDouble()
            val val3 = val1 + val2

            result.setText(val3.toString())
        }

    }
}//onMainActivity