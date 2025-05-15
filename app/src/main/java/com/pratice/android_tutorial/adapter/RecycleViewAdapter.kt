package com.pratice.android_tutorial.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.pratice.android_tutorial.R
import com.pratice.android_tutorial.model.RecycleViewModel

class RecycleViewAdapter(private val datalist:ArrayList<RecycleViewModel>):RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =LayoutInflater.from(parent.context).inflate(R.layout.item_view_rv,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = datalist[position]
        holder.rvImage.setImageResource(currentItem.Image)
        holder.rvtitle.setText(currentItem.datatitle)
    }
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val rvImage:ImageView = itemView.findViewById(R.id.imageView)
        val rvtitle:TextView = itemView.findViewById(R.id.textView1)

    }
}