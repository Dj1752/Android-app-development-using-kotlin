package com.pratice.android_tutorial.mvvm


import androidx.lifecycle.LiveData
import com.pratice.android_tutorial.mvvm.roomdbquote.Quote
import com.pratice.android_tutorial.mvvm.roomdbquote.QuoteDao

class QuoteRepository(val quoteDao: QuoteDao) {


    fun getQuotes():LiveData<List<Quote>>{
        return quoteDao.geQuotes()
    }

    suspend fun insertQuote(quote: Quote){
        quoteDao.insertQuote(quote)
    }

}