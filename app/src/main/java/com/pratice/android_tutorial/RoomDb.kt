package com.pratice.android_tutorial

import android.os.Bundle
import android.provider.Settings.Global
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Room
import androidx.room.RoomDatabase
import com.pratice.android_tutorial.roomdb.Contact
import com.pratice.android_tutorial.roomdb.ContactDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RoomDb : AppCompatActivity() {
    lateinit var database: ContactDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_room_db)
        database = Room.databaseBuilder(applicationContext,
            ContactDatabase::class.java,
            "contactDb").build()

        GlobalScope.launch {
            database.contactDao().insertContact(Contact(0,"Deepak","998876"))
        }

    }

     fun roomclick(view: View){
        database.contactDao().getContact().observe(this,{
            Log.d("deepak", it.toString())
        })
    }

}