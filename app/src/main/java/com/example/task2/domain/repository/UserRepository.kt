package com.example.task2.domain.repository

import com.example.task2.domain.model.User

interface UserRepository {
    fun getUser(): User
    fun saveUser(user: User)
}