package com.pratice.android_tutorial.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imagefromurl")
fun ImageView.imagefromurl(url:String){
    Glide.with(this.context).load(url).into(this)
}