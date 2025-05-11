package com.pratice.android_tutorial

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val linearLayoutbtn: Button = findViewById(R.id.Linearlayoutbt)
        linearLayoutbtn.setOnClickListener{
         val intent = Intent(this,LinearLayout::class.java)
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}