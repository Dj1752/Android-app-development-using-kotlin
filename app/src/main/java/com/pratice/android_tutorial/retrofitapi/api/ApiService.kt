package com.pratice.android_tutorial.retrofitapi.api

import com.pratice.android_tutorial.retrofitapi.model.User
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users")//end point
    fun getUsers(): Call<List<User>>
}