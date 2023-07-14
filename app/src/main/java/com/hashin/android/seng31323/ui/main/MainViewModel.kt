package com.hashin.android.seng31323.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var result = MutableLiveData<Double>(0.0)

    fun add (number1: Double, number2: Double){
        result.value = number1.plus(number2)
    }

    fun minus(number1: Double,number2: Double){
        result.value = number1-number2
    }

    fun multi(number1: Double,number2: Double){
        result.value = number1*number2
    }

    fun divide(number1: Double,number2: Double){
        result.value = number1/number2
    }

}