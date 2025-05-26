package com.pratice.android_tutorial.mvvm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pratice.android_tutorial.R
import com.pratice.android_tutorial.databinding.ActivityQuoteAppUsingMvvmBinding
import com.pratice.android_tutorial.mvvm.roomdbquote.Quote
import com.pratice.android_tutorial.mvvm.roomdbquote.QuoteDatabase

class QuoteAppUsingMVVM : AppCompatActivity() {
    lateinit var binding: ActivityQuoteAppUsingMvvmBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_quote_app_using_mvvm)
        val dao = QuoteDatabase.getDatabase(applicationContext).quoteDao()
        val repository = QuoteRepository(dao)
        mainViewModel =
            ViewModelProvider(this, MainViewModelFactory(repository)).get(MainViewModel::class.java)
         mainViewModel.getQuotes().observe(this, Observer {
             binding.quotess = it.toString()
         })

        binding.btnAddQuote.setOnClickListener {
          val quote = Quote(0,"Testing","Testing")
            mainViewModel.insertQuote(quote)
        }

    }
}