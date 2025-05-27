package com.pratice.android_tutorial.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainLiveViewModel:ViewModel() {
    val factLiveData = MutableLiveData<String>("This is live Data")

    fun updatedata(){
        factLiveData.value="Another Live Data"
    }
}