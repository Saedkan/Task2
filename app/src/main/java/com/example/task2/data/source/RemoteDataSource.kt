package com.example.task2.data.source

import com.example.task2.domain.model.User

interface RemoteDataSource {
    fun fetchUser(): User
}