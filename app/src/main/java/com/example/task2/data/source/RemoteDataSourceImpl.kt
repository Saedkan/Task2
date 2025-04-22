package com.example.task2.data.source

import com.example.task2.domain.model.User

class RemoteDataSourceImpl : RemoteDataSource {
    override fun fetchUser(): User {
        // Заглушка, можешь подключить реальный API
        return User(id = 1, name = "Test", email = "test@example.com")
    }
}