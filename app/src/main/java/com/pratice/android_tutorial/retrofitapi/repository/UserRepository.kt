package com.pratice.android_tutorial.retrofitapi.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

import com.pratice.android_tutorial.retrofitapi.api.RetrofitClient
import com.pratice.android_tutorial.retrofitapi.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class UserRepository {


    private val _users = MutableLiveData<List<User>>()

    val users:LiveData<List<User>> = _users

    fun fetchUsers(){
        RetrofitClient.apiService.getUsers().enqueue(object : Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                if (response.isSuccessful) {
                    _users.postValue(response.body())
                }
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
               _users.postValue(emptyList())
            }

        })
    }
}