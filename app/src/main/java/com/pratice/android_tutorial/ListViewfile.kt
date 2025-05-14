package com.pratice.android_tutorial

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ListViewfile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        val listViews = findViewById<ListView>(R.id.listViews)
        val list = arrayOf("Reading book","complete the pending task", "pay the bill", "meeting with client")
        val listAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,list)
         listViews.adapter= listAdapter

        listViews.setOnItemClickListener{parent,view,position,id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this,"the item has selected is $selectedItem",Toast.LENGTH_SHORT).show()
        }
    }
}