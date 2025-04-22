package com.example.task2.data.source

import com.example.task2.domain.model.User

class LocalDataSourceImpl : LocalDataSource {
    override fun save(user: User) {
        // Заглушка
        println("User saved: $user")
    }
}