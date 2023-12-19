package com.example.viewmodelandlivedata11092023

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MyLiveData {
    private var numberLiveData: MutableLiveData<Int> = MutableLiveData()

    fun getNumberLiveData(): LiveData<Int> {
        return numberLiveData
    }

    fun setNumberLiveData(number: Int) {
        CoroutineScope(Dispatchers.IO).launch {
            delay(2000)
            numberLiveData.postValue(number)
        }
    }
}