package com.pratice.android_tutorial.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.pratice.android_tutorial.R
import com.pratice.android_tutorial.model.CustomListViewModel

class CustomListViewAdapter(context: Context, private val custlist: ArrayList<CustomListViewModel?>)
    :ArrayAdapter<CustomListViewModel>(context,R.layout.list_item_custom,custlist) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
       var itemView = convertView
       val custpos = getItem(position)
        if (itemView == null){
            itemView = LayoutInflater.from(context).inflate(R.layout.list_item_custom, parent, false)
        }
        val listImage = itemView!!.findViewById<ImageView>(R.id.imageView)
        val listtextView1 = itemView.findViewById<TextView>(R.id.textView1)
        val listtextView2 = itemView.findViewById<TextView>(R.id.textView2)

        listImage.setImageResource(custpos!!.numbersImageId)
        listtextView1.text = custpos.numberInDigit
        listtextView2.text = custpos.numbersInText

        return itemView

    }
}