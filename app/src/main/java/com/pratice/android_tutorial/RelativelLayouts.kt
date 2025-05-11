package com.pratice.android_tutorial

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RelativelLayouts : AppCompatActivity() {
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_relativel_layout)
        textView1 = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)
        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        button = findViewById(R.id.button)

        button.setOnClickListener {

        }
    }
}