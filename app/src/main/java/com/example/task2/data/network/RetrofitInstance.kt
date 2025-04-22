package com.example.task2.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: YourApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://your-api.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(YourApiService::class.java)
    }
}
