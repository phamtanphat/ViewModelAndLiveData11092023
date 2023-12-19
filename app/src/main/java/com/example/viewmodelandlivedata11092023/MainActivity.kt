package com.example.viewmodelandlivedata11092023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myInstance = MyLiveData()

        // Get value from Live data
        myInstance.getNumberLiveData().observe(this) {
            Log.d("pphat", it.toString())
        }

        Handler(Looper.getMainLooper()).postDelayed({
            myInstance.setNumberLiveData(Random.nextInt(10))
        }, 2000)
    }
}