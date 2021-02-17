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

        val calculateButton: Button = findViewById(R.id.calculate_button)
        calculateButton.setOnClickListener{ addition() }

        val num1: EditText = findViewById(R.id.etNum1)
        val num2: EditText = findViewById(R.id.etNum2)
        val result: TextView = findViewById(R.id.tvAnswer)



    }//onCreate

    private fun addition(){

        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        Log.i("DEMO", getString(R.string.Calculate_Message_1))



    }
}//onMainActivity