package com.pratice.android_tutorial

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pratice.android_tutorial.adapter.RecycleViewAdapter
import com.pratice.android_tutorial.model.RecycleViewModel

class RecycleViewPage : AppCompatActivity() {
    private lateinit var recycleViewPage: RecyclerView
    private lateinit var arrayList: ArrayList<RecycleViewModel>
    private lateinit var ImageList:Array<Int>
    private lateinit var Title:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        ImageList = arrayOf(
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground
        )
        Title = arrayOf(
            "Text1",
            "Text2",
            "Text3",
            "Text4",
            "Text5",
            "Text6",
            "Text7",
            "Text8",
        )
        recycleViewPage = findViewById(R.id.recycleview)
        recycleViewPage.layoutManager = LinearLayoutManager(this)
        recycleViewPage.setHasFixedSize(true)
        arrayList = arrayListOf<RecycleViewModel>()
        getData()

    }
    private fun getData(){
        for (i in ImageList.indices){
            val dataclass = RecycleViewModel(ImageList[i],Title[i])
            arrayList.add(dataclass)
        }
        recycleViewPage.adapter = RecycleViewAdapter(arrayList)
    }
}