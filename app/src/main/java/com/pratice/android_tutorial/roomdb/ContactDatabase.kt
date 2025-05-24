package com.pratice.android_tutorial.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Contact::class], version = 1)
@TypeConverters(Converters::class)
abstract class ContactDatabase: RoomDatabase() {

    abstract fun contactDao():ContactDAO

    //singleton it is thread safe if my memory runs multiple threads then also it will create on Instance
    companion object{
        @Volatile
        private var INSTANCE: ContactDatabase ?= null

        fun getDataBase(context: Context):ContactDatabase{
            if (INSTANCE == null){
               synchronized(this) {
                   INSTANCE = Room.databaseBuilder(
                       context,
                       ContactDatabase::class.java,
                       "contactDb"
                   ).build()
               }
            }
            return INSTANCE!!
        }
    }
}