package com.pratice.android_tutorial

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val linearLayoutbtn: Button = findViewById(R.id.Linearlayoutbt)
        val RelativelLayoutbtn: Button = findViewById(R.id.Relativelayoutbt)
        val ConstraintLayouts: Button = findViewById(R.id.constraintlayoutbt)
        val FrameLayouts: Button = findViewById(R.id.framelayoutbt)
        val viewElementlayoutbt: Button = findViewById(R.id.viewElementlayoutbt)
        val implicitbt: Button = findViewById(R.id.implicitbt)
        val ListViewbt: Button = findViewById(R.id.ListViewbt)
        val CustListViewbt: Button = findViewById(R.id.CustListViewbt)


        linearLayoutbtn.setOnClickListener{
         val intent = Intent(this,LinearLayouts::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        RelativelLayoutbtn.setOnClickListener{
         val intent = Intent(this,RelativelLayouts::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        ConstraintLayouts.setOnClickListener{
         val intent = Intent(this,ConstraintLayout::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        FrameLayouts.setOnClickListener{
         val intent = Intent(this,FrameLayout::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        viewElementlayoutbt.setOnClickListener{
         val intent = Intent(this,ViewElements::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        ListViewbt.setOnClickListener{
         val intent = Intent(this,ListViewfile::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        CustListViewbt.setOnClickListener{
         val intent = Intent(this,CustomListView::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }

        implicitbt.setOnClickListener{
            val url = "https://www.geeksforgeeks.org/implicit-and-explicit-intents-in-android-with-examples/"
         val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))//Implicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }


    }

}