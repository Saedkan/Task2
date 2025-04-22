package com.example.task2.di

import com.example.task2.data.repository.UserRepositoryImpl
import com.example.task2.domain.repository.UserRepository
import com.example.task2.presentation.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    single<UserRepository> { UserRepositoryImpl(get(), get()) }
    viewModel { UserViewModel(get()) }
}
