package com.pratice.android_tutorial.mvvm.roomdbquote

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuoteDao {
    @Query("SELECT * FROM quote")
    fun geQuotes() :LiveData<List<Quote>>

    @Insert
   suspend fun insertQuote(quote: Quote)
}