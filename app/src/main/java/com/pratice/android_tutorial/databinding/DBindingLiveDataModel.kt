package com.pratice.android_tutorial.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DBindingLiveDataModel:ViewModel() {

    val databindingLive = MutableLiveData<String>("Data Binding with liveData")

    fun updateDataBinding(){
        databindingLive.value = "Another Data Binding With live Data"
    }
}