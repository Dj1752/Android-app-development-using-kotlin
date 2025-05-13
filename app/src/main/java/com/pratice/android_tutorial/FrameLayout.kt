package com.pratice.android_tutorial

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FrameLayout : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_frame_layout)
        textView = findViewById(R.id.textView)
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
    }
}