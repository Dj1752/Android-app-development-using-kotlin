package com.pratice.android_tutorial.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.pratice.android_tutorial.R

class DataBindingPage : AppCompatActivity() {
   lateinit var binding: ActivityDataBindingBinding
   lateinit var dataModel: DBindingLiveDataModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding)
        dataModel = ViewModelProvider(this).get(DBindingLiveDataModel::class.java)


    //with hardcoded data
//        binding.titletxt.text = "Win the Battle with your mind"
//        binding.authortxt.text = "Reeta Gupta"
 //with data model
        val dataBindingModel = DataBindingModel("Win the Battle with your mind","Reeta Gupta",
            "https://ichef.bbci.co.uk/ace/standard/976/cpsprodpb/14235/production/_100058428_mediaitem100058424.jpg.webp")
        binding.dbm = dataBindingModel
     /// live data binding
//        binding.databinding = dataModel
//        binding.lifecycleOwner=this
    }
}