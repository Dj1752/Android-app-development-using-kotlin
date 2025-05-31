package com.pratice.android_tutorial.retrofitapi.model

import androidx.lifecycle.ViewModel
import com.pratice.android_tutorial.retrofitapi.repository.UserRepository

class UserViewModel:ViewModel() {
    private val repository=UserRepository()
            val users =repository.users

    init {
        repository.fetchUsers()
    }
}