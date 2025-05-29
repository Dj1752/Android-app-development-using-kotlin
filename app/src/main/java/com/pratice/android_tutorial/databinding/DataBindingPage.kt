package com.pratice.android_tutorial.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pratice.android_tutorial.R

class DataBindingPage : AppCompatActivity() {
   lateinit var binding: ActivityDataBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding)
       //with hardcoded data
//        binding.titletxt.text = "Win the Battle with your mind"
//        binding.authortxt.text = "Reeta Gupta"
// with data model
        val dataBindingModel = DataBindingModel("Win the Battle with your mind","Reeta Gupta")
        binding.dbm = dataBindingModel
    }
}