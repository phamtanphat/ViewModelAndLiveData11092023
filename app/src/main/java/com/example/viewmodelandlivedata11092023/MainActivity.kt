package com.example.viewmodelandlivedata11092023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myInstance = MyLiveData()

        // Get value from Live data
        myInstance.getNumberLiveData().observe(this) {
            Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
        }

//        Handler(Looper.getMainLooper()).postDelayed({
//            myInstance.setNumberLiveData(Random.nextInt(10))
//        }, 2000)

        myInstance.setNumberLiveData(20)
    }
}