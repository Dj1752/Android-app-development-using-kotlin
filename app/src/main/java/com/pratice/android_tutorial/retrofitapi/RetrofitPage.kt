package com.pratice.android_tutorial.retrofitapi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pratice.android_tutorial.R
import com.pratice.android_tutorial.retrofitapi.adapters.UserAdapter
import com.pratice.android_tutorial.retrofitapi.model.UserViewModel

class RetrofitPage : AppCompatActivity() {
   private lateinit var userAdapter: UserAdapter
   private val viewModel:UserViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_retrofit_page)
        val recyclerView = findViewById<RecyclerView>(R.id.userRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        userAdapter = UserAdapter(emptyList())
        recyclerView.adapter = userAdapter

        viewModel.users.observe(this) { userList ->
            userAdapter.updateUsers(userList)
        }

    }
}