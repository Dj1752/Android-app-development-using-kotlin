package com.pratice.android_tutorial

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SharePreference : AppCompatActivity() {
   private lateinit var nameEdit:EditText
   private lateinit var ageEdit:EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_share_preference)

        nameEdit = findViewById(R.id.edit1)
        ageEdit = findViewById(R.id.edit2)
    }

    override fun onResume() {
        super.onResume()

        val sharePreference = getSharedPreferences("UserPreference", MODE_PRIVATE)
        val savedname = sharePreference.getString("user_name","")
        val savedage = sharePreference.getInt("user_age",0)
        nameEdit.setText(savedname)
        ageEdit.setText(if (savedage > 0) savedage.toString() else "")
    }

    override fun onPause() {
        super.onPause()
        val sharePreference = getSharedPreferences("UserPreference", MODE_PRIVATE)
        val editor = sharePreference.edit()

        editor.putString("user_name",nameEdit.text.toString())
        val ageInput = ageEdit.text.toString()
        val userAge = if (ageInput.isEmpty()) 0 else ageInput.toInt()
        editor.putInt("user_age", userAge)
        editor.apply()
    }
}