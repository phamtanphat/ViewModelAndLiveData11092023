package com.example.viewmodelandlivedata11092023

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel(private var context: Context): ViewModel() {
    private val numberLiveData: MutableLiveData<Int> = MutableLiveData()

    fun getNumberLiveData(): LiveData<Int> {
        return numberLiveData
    }

    fun setNumber(number: Int) {
        numberLiveData.value = number
    }

    fun showToast() {
        Toast.makeText(context, "Show", Toast.LENGTH_SHORT).show()
    }
}