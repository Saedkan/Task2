package com.example.task2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.task2.domain.repository.UserRepository
import com.example.task2.domain.model.User

class UserViewModel(
    private val userRepository: UserRepository
) : ViewModel() {

    val users = mutableListOf<User>()

    fun loadUsers() {
        viewModelScope.launch {
            users.clear()
            users.addAll(listOf(userRepository.getUser()))
        }
    }
}
