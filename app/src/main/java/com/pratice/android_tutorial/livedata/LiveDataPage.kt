package com.pratice.android_tutorial.livedata

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pratice.android_tutorial.R

class LiveDataPage : AppCompatActivity() {
    lateinit var mainLiveViewModel: MainLiveViewModel
    private val factsdatalive:TextView
        get() = findViewById(R.id.factslivedata)
    private val factsdatalivebt:Button
        get() = findViewById(R.id.factslivedatabt)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_live_data_page)
        mainLiveViewModel = ViewModelProvider(this).get(MainLiveViewModel::class.java)

        mainLiveViewModel.factLiveData.observe(this, Observer {
           factsdatalive.text = it
        })

        factsdatalivebt.setOnClickListener{
            mainLiveViewModel.updatedata()
        }
    }
}