package com.example.task2.domain.usecase

import com.example.task2.domain.repository.UserRepository

// Пример пути: domain/usecase/GetUserUseCase.kt
class GetUserUseCase(private val repository: UserRepository) {
    operator fun invoke() = repository.getUser()
}
