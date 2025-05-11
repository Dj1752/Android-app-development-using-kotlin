package com.pratice.android_tutorial

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LinearLayouts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_linear_layout)
        val showButton: Button = findViewById(R.id.showInput)

        val editText: EditText = findViewById(R.id.editText)

        val textView: TextView = findViewById(R.id.txtVw)
    }
}