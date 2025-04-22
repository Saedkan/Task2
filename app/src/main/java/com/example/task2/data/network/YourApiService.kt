package com.example.task2.data.network

import retrofit2.http.GET
import com.example.task2.domain.model.User

interface YourApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}
