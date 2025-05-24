package com.pratice.android_tutorial.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [Contact::class], version = 2)
@TypeConverters(Converters::class)
abstract class ContactDatabase: RoomDatabase() {

    abstract fun contactDao():ContactDAO
 /*

  */

    //singleton it is thread safe if my memory runs multiple threads then also it will create on Instance
    companion object{

        val migration_1_2=object:Migration(1,2){
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("ALTER TABLE contact ADD COLUMN inActive INTEGER NOT NULL DEFAULT(1)")
            }

        }
        @Volatile
        private var INSTANCE: ContactDatabase ?= null

        fun getDataBase(context: Context):ContactDatabase{
            if (INSTANCE == null){
               synchronized(this) {
                   INSTANCE = Room.databaseBuilder(
                       context,
                       ContactDatabase::class.java,
                       "contactDb"
                   ).addMigrations(migration_1_2)
                       .build()
               }
            }
            return INSTANCE!!
        }
    }
}