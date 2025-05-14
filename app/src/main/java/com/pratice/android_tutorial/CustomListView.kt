package com.pratice.android_tutorial

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.pratice.android_tutorial.adapter.CustomListViewAdapter
import com.pratice.android_tutorial.model.CustomListViewModel

class CustomListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_list_view)
        val arrayList = ArrayList<CustomListViewModel?>()

        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "1", "One"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "2", "Two"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "3", "Three"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "4", "Four"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "5", "Five"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "6", "Six"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "7", "Seven"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "8", "Eight"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "9", "Nine"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "10", "Ten"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "11", "Eleven"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "12", "Twelve"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "13", "Thirteen"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "14", "Fourteen"))
        arrayList.add(CustomListViewModel(R.drawable.ic_launcher_foreground, "15", "Fifteen"))

        // Now create the instance of the CustomListViewModelAdapter and pass
        // the context and arrayList created above
        val numbersArrayAdapter = CustomListViewAdapter(this, arrayList)

        // create the instance of the ListView to set the CustomListViewModelAdapter
        val numbersListView = findViewById<ListView>(R.id.listView)

        // set the CustomListViewModelAdapter for ListView
        numbersListView.adapter = numbersArrayAdapter
    }
}