package com.pratice.android_tutorial

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val linearLayoutbtn: Button = findViewById(R.id.Linearlayoutbt)
        val RelativelLayoutbtn: Button = findViewById(R.id.Relativelayoutbt)
        val ConstraintLayout: Button = findViewById(R.id.constraintlayoutbt)
        linearLayoutbtn.setOnClickListener{
         val intent = Intent(this,LinearLayouts::class.java)
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        RelativelLayoutbtn.setOnClickListener{
         val intent = Intent(this,RelativelLayouts::class.java)
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        ConstraintLayout.setOnClickListener{
         val intent = Intent(this,ConstraintLayout::class.java)
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}