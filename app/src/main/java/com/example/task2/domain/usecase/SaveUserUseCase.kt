package com.example.task2.domain.usecase

import com.example.task2.domain.repository.UserRepository

class SaveUserUseCase(private val repository: UserRepository) {
    operator fun invoke() = repository.getUser()
}