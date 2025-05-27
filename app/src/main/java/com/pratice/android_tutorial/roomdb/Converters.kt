package com.pratice.android_tutorial.roomdb
/*
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.util.Date
/*
why we use convertors
in sql we online same the predefined type data like(null,Integer,Real,text and blob)
if i want to save the data other then above datatype we have to use converter for that
 */
class Converters {
    @TypeConverter
    fun fromDateToLong(value: Date): Long{
        return value.time
    }
    @TypeConverter
    fun fromLongtoDate(value: Long):Date{
        return Date(value)
    }
}

 */