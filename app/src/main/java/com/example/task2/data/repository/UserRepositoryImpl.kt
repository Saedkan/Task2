package com.example.task2.data.repository

// data/repository/UserRepositoryImpl.kt

import com.example.task2.data.source.RemoteDataSource
import com.example.task2.data.source.LocalDataSource
import com.example.task2.domain.repository.UserRepository
import com.example.task2.domain.model.User

class UserRepositoryImpl(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
) : UserRepository {
    override fun getUser(): User {
        return remoteDataSource.fetchUser()
    }

    override fun saveUser(user: User) {
        localDataSource.save(user)
    }
}
