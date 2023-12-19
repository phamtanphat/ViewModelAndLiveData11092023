package com.example.viewmodelandlivedata11092023

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyLiveData {
    private var numberLiveData: MutableLiveData<Int> = MutableLiveData()

    fun getNumberLiveData(): LiveData<Int> {
        return numberLiveData
    }

    fun setNumberLiveData(number: Int) {
        numberLiveData.value = number
    }
}