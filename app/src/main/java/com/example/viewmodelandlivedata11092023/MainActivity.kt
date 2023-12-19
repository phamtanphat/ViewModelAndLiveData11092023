package com.example.viewmodelandlivedata11092023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var btnGetText: Button
    private lateinit var editTextInput: EditText
    private lateinit var txtViewOutput: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetText = findViewById(R.id.button_get_text)
        editTextInput = findViewById(R.id.edit_text_input)
        txtViewOutput = findViewById(R.id.text_view_output)

        btnGetText.setOnClickListener {
            val input = editTextInput.text.toString()
            txtViewOutput.text = input
        }

    }
}