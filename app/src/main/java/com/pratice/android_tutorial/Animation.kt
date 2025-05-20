package com.pratice.android_tutorial

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Animation : AppCompatActivity() {
    // Declare variables for ImageView and Buttons
    private lateinit var imageView: ImageView
    private lateinit var blink: Button
    private lateinit var rotate: Button
    private lateinit var fade: Button
    private lateinit var move: Button
    private lateinit var slide: Button
    private lateinit var zoom: Button
    private lateinit var stop: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_animation)
        imageView = findViewById(R.id.imageview)
        blink = findViewById(R.id.blink)
        rotate = findViewById(R.id.rotate)
        fade = findViewById(R.id.fade)
        move = findViewById(R.id.move)
        slide = findViewById(R.id.slide)
        zoom = findViewById(R.id.zoom)
        stop = findViewById(R.id.stop)

        createAnimation(blink, R.anim.blink)
        createAnimation(rotate, R.anim.rotate)
        createAnimation(fade, R.anim.fade)
        createAnimation(move, R.anim.move)
        createAnimation(slide, R.anim.slide)
        createAnimation(zoom, R.anim.zoom)

        stop.setOnClickListener {
            imageView.clearAnimation()
        }

    }
    // Function to set up an animation for a given view and animation resource ID
    private fun createAnimation(view: View, animResId: Int) {
        view.setOnClickListener {
            // Load the animation from the specified resource ID
            val animation = AnimationUtils.loadAnimation(this, animResId)
            // Start the animation on the ImageView
            imageView.startAnimation(animation)
        }
    }
}