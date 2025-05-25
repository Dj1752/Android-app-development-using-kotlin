package com.pratice.android_tutorial.mvvm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import com.pratice.android_tutorial.R
import com.pratice.android_tutorial.databinding.ActivityQuoteAppUsingMvvmBinding

class QuoteAppUsingMVVM : AppCompatActivity() {
    lateinit var binding: ActivityQuoteAppUsingMvvmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
     binding= DataBindingUtil.setContentView(this,R.layout.activity_quote_app_using_mvvm)
        binding.btnAddQuote.setOnClickListener{

        }

    }
}