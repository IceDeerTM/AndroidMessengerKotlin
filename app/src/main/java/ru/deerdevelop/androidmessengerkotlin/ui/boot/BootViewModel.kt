package ru.deerdevelop.androidmessengerkotlin.ui.boot

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BootViewModel : ViewModel() {
    var signInActive = MutableLiveData<Boolean>(false)
    var error = MutableLiveData<Boolean>(false)

    fun launch() {

    }
}